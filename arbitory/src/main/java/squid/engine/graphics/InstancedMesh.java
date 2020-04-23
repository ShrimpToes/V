package squid.engine.graphics;

import org.joml.Matrix4f;

import squid.engine.graphics.textures.Texture;
import squid.engine.scene.pieces.GamePiece;
import squid.engine.utils.Transformation;

import java.nio.FloatBuffer;
import java.util.List;

import static squid.engine.graphics.gl.GL11.*;
import static squid.engine.graphics.gl.GL15.GL_ARRAY_BUFFER;
import static squid.engine.graphics.gl.GL15.GL_DYNAMIC_DRAW;

public class InstancedMesh extends Mesh {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final int VECTOR4F_SIZE_BYTES = 4 * 4;
    private static final int MATRIX_SIZE_BYTES = 4 * VECTOR4F_SIZE_BYTES;
    private static final int MATRIX_SIZE_FLOATS = 4 * 4;
    private static final int INSTANCE_SIZE_BYTES = MATRIX_SIZE_BYTES * 2 + FLOAT_SIZE_BYTES * 2;
    private static final int INSTANCE_SIZE_FLOATS = MATRIX_SIZE_FLOATS * 2 + 2;

    private final int numInstances;
    private final int instanceDataVBO;
    private FloatBuffer instanceDataBuffer;

    public InstancedMesh(float[] vertices, int[] indices, float[] textCoords, float[] normals, int numInstances) {
        super(vertices, indices, textCoords, normals);
        this.numInstances = numInstances;
        gl30.glBindVertexArray(vaoId);

        instanceDataVBO = gl15.glGenBuffers();
        vboList.add(instanceDataVBO);
        instanceDataBuffer = FloatBuffer.allocate(numInstances * INSTANCE_SIZE_FLOATS);
        gl15.glBindBuffer(GL_ARRAY_BUFFER, instanceDataVBO);
        int start = 5;
        int strideStart = 0;
        for (int i = 0; i < 4; i++) {
            gl20.glVertexAttribPointer(start, 4, GL_FLOAT, false, INSTANCE_SIZE_BYTES, strideStart);
            gl30.glVertexAttribDivisor(start, 1);
            gl20.glEnableVertexAttribArray(start);
            start++;
            strideStart += VECTOR4F_SIZE_BYTES;
        }

        for (int i = 0; i < 4; i++) {
            gl20.glVertexAttribPointer(start, 4, GL_FLOAT, false, INSTANCE_SIZE_BYTES, strideStart);
            gl30.glVertexAttribDivisor(start, 1);
            gl20.glEnableVertexAttribArray(start);
            start++;
            strideStart += VECTOR4F_SIZE_BYTES;
        }

        gl20.glVertexAttribPointer(start, 2, GL_FLOAT, false, INSTANCE_SIZE_BYTES, strideStart);
        gl30.glVertexAttribDivisor(start, 1);
        gl20.glEnableVertexAttribArray(start);

        gl15.glBindBuffer(GL_ARRAY_BUFFER, 0);
        gl30.glBindVertexArray(0);
    }

    @Override
    public void cleanup() {
        super.cleanup();
        if (this.instanceDataBuffer != null) {
            instanceDataBuffer.clear();
        }
    }


    @Override
    protected void initRender() {
        super.initRender();
        int start = 5;
        int numElements = 4 * 2;
        for (int i = 0; i < numElements; i++) {
            gl20.glEnableVertexAttribArray(start + i);
        }
    }

    @Override
    protected void finishRender() {
        int start = 5;
        int numElements = 4 * 2;
        for (int i = 0; i < numElements; i++) {
            gl20.glDisableVertexAttribArray(start + i);
        }
        super.finishRender();
    }

    public void instancedRender(List<GamePiece> gamePieces, Transformation transformation,
                                Matrix4f viewMatrix, Matrix4f lightViewMatrix) {
        instancedRender(gamePieces, false, transformation, viewMatrix, lightViewMatrix);
    }

    public void instancedRender(List<GamePiece> gamePieces, boolean billboard, Transformation transformation,
                                 Matrix4f viewMatrix, Matrix4f lightViewMatrix) {
        initRender();
        int length = gamePieces.size();
        int chunkSize = numInstances;
        for (int i = 0; i < length; i += chunkSize) {
            int end = Math.min(length, i + chunkSize);
            List<GamePiece> subList = gamePieces.subList(i, end);
            renderChunk(subList, billboard, transformation, viewMatrix, lightViewMatrix);
        }
    }

    private void renderChunk(List<GamePiece> gamePieces, boolean billboard, Transformation transformation,
                             Matrix4f viewMatrix, Matrix4f ligthViewMatrix) {
        instanceDataBuffer.clear();

        int i = 0;

        Texture text = getMaterial().getTexture();
        for (GamePiece gamePiece : gamePieces) {
            Matrix4f modelMatrix = transformation.buildModelMatrix(gamePiece);
            if (viewMatrix != null) {
                if (billboard) {
                    viewMatrix.transpose3x3(modelMatrix);
                }
                Matrix4f modelViewMatrix = transformation.buildModelViewMatrix(modelMatrix, viewMatrix);
                if (billboard) {
                    modelViewMatrix.scale(gamePiece.getScale());
                }
                modelViewMatrix.get(INSTANCE_SIZE_FLOATS * i, instanceDataBuffer);
            }
            if (ligthViewMatrix != null) {
                Matrix4f modelLightViewMatrix = transformation.buildModelLightViewMatrix(modelMatrix, ligthViewMatrix);
                modelLightViewMatrix.get(INSTANCE_SIZE_FLOATS * i + MATRIX_SIZE_FLOATS, instanceDataBuffer);
            }
            if (text != null) {
                int col = gamePiece.getTextPos() / text.getCols();
                int row = gamePiece.getTextPos() / text.getRows();
                float textXOffset = (float) col / text.getCols();
                float textYOffset = (float) row / text.getRows();
                int buffPos = INSTANCE_SIZE_FLOATS * i + MATRIX_SIZE_FLOATS * 2;
                this.instanceDataBuffer.put(buffPos, textXOffset);
                this.instanceDataBuffer.put(buffPos + 1, textYOffset);
            }
            i++;
        }
        gl15.glBindBuffer(GL_ARRAY_BUFFER, instanceDataVBO);
        gl15.glBufferData(GL_ARRAY_BUFFER, instanceDataBuffer, GL_DYNAMIC_DRAW);
        gl30.glDrawElementsInstanced(GL_TRIANGLES, getVertexCount(), GL_UNSIGNED_INT, 0, gamePieces.size());
        gl15.glBindBuffer(GL_ARRAY_BUFFER, 0);

    }
}
