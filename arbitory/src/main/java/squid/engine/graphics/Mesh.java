package squid.engine.graphics;

import squid.engine.Game;
import squid.engine.graphics.gl.GL15;
import squid.engine.graphics.gl.GL20;
import squid.engine.graphics.gl.GL30;
import squid.engine.graphics.textures.Material;
import squid.engine.graphics.textures.Texture;
import squid.engine.scene.pieces.GamePiece;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import squid.engine.graphics.gl.GL11;

import static squid.engine.graphics.gl.GL11.*;

public class Mesh {

    public static final int MAX_WEIGHTS = 4;
    protected final int vaoId;
    protected final List<Integer> vboList;
    protected final int verticesCount;
    protected Material material;

    protected final GL11 gl11 = Game.gl.gl11;
    protected final GL15 gl15 = Game.gl.gl15;
    protected final GL20 gl20 = Game.gl.gl20;
    protected final GL30 gl30 = Game.gl.gl30;

    public Mesh(float[] vertices, int[] indices, float[] textCoords, float[] normals) {
        this(vertices, indices, textCoords, normals,
                Mesh.createEmptyIntArray(Mesh.MAX_WEIGHTS * vertices.length / 3, 0),
                Mesh.createEmptyFloatArray(Mesh.MAX_WEIGHTS * vertices.length / 3, 0));
    }

    public Mesh(float[] vertices, int[] indices, float[] textCoords, float[] normals, int[] jointIndices, float[] weights) {
        FloatBuffer verticesBuffer = null;
        IntBuffer idxBuffer = null;
        FloatBuffer textCoordsBuffer = null;
        FloatBuffer normalsBuffer = null;
        FloatBuffer weightsBuffer = null;
        IntBuffer jointIndicesBuffer = null;
        vboList = new ArrayList<>();
        try {


            verticesCount = indices.length;

            vaoId = gl30.glGenVertexArrays();
            gl30.glBindVertexArray(vaoId);

            //vertices
            int vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            verticesBuffer = FloatBuffer.allocate(vertices.length);
            verticesBuffer.put(vertices).flip();
            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ARRAY_BUFFER, verticesBuffer, GL15.GL_STATIC_DRAW);
            gl20.glVertexAttribPointer(0, 3, GL_FLOAT, false, 0, 0);

            //indices
            vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            idxBuffer = IntBuffer.allocate(indices.length);
            idxBuffer.put(indices).flip();
            gl15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, idxBuffer, GL15.GL_STATIC_DRAW);

            //texture coordinates
            vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            textCoordsBuffer = FloatBuffer.allocate(textCoords.length);
            textCoordsBuffer.put(textCoords).flip();
            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ARRAY_BUFFER, textCoordsBuffer, GL15.GL_STATIC_DRAW);
            gl20.glVertexAttribPointer(1, 2, GL_FLOAT, false, 0, 0);

            //normals (whatever tf they are)
            vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            normalsBuffer = FloatBuffer.allocate(normals.length);
            if (normalsBuffer.capacity() > 0) {
                normalsBuffer.put(normals).flip();
            } else {
                // Create empty structure
                normalsBuffer = FloatBuffer.allocate(vertices.length);
            }
            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ARRAY_BUFFER, normalsBuffer, GL15.GL_STATIC_DRAW);
            gl20.glVertexAttribPointer(2, 3, GL_FLOAT, false, 0, 0);

            //weights
            vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            weightsBuffer = FloatBuffer.allocate(weights.length);
            weightsBuffer.put(weights).flip();
            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ARRAY_BUFFER, weightsBuffer, GL15.GL_STATIC_DRAW);
            gl20.glVertexAttribPointer(3, 4, GL_FLOAT, false, 0, 0);

            //jointIndices
            vboId = gl15.glGenBuffers();
            vboList.add(vboId);
            jointIndicesBuffer = IntBuffer.allocate(jointIndices.length);
            jointIndicesBuffer.put(jointIndices).flip();
            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vboId);
            gl15.glBufferData(GL15.GL_ARRAY_BUFFER, jointIndicesBuffer, GL15.GL_STATIC_DRAW);
            gl20.glVertexAttribPointer(4, 4, GL_FLOAT, false, 0, 0);


            gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
            gl30.glBindVertexArray(0);
        } finally {
            if (verticesBuffer != null) {
                verticesBuffer.clear();
            }
            if (idxBuffer != null) {
                idxBuffer.clear();
            }
            if (textCoordsBuffer != null) {
                textCoordsBuffer.clear();
            }
            if (jointIndicesBuffer != null) {
                jointIndicesBuffer.clear();
            }
            if (weightsBuffer != null) {
                weightsBuffer.clear();
            }
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getVaoId() {
        return vaoId;
    }

    public int getVertexCount() {
        return verticesCount;
    }

    protected void initRender() {
        Texture texture = material.getTexture();
        if (texture != null) {
            gl20.glActiveTexture(GL15.GL_TEXTURE0);
            gl11.glBindTexture(GL_TEXTURE_2D, texture.getId());
        }
        Texture normalMap = material.getNormalMap();
        if ( normalMap != null ) {
            gl20.glActiveTexture(GL15.GL_TEXTURE1);
            gl11.glBindTexture(GL_TEXTURE_2D, normalMap.getId());
        }
        gl30.glBindVertexArray(getVaoId());
        gl20.glEnableVertexAttribArray(0);
        gl20.glEnableVertexAttribArray(1);
        gl20.glEnableVertexAttribArray(2);
        gl20.glEnableVertexAttribArray(3);
        gl20.glEnableVertexAttribArray(4);



    }

    public void render() {
        initRender();
        drawTriangles();
        finishRender();
    }

    public void drawTriangles() {
        gl11.glDrawElements(GL_TRIANGLES, getVertexCount(), GL_UNSIGNED_INT, 0);
    }

    protected void finishRender() {
        gl30.glBindVertexArray(0);
        gl11.glBindTexture(GL_TEXTURE_2D, 0);
    }

    public void renderList(List<GamePiece> gamePieces, Consumer<GamePiece> consumer) {
        initRender();
        for (GamePiece gamePiece : gamePieces) {
            consumer.accept(gamePiece);
            drawTriangles();
        }
        finishRender();
    }

    public void cleanup() {
        gl20.glDisableVertexAttribArray(0);
        gl20.glDisableVertexAttribArray(1);
        gl20.glDisableVertexAttribArray(2);
        gl20.glDisableVertexAttribArray(3);
        gl20.glDisableVertexAttribArray(4);

        gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);

        for (Integer id : vboList) {
            gl15.glDeleteBuffers(id);
        }

        Texture texture = material.getTexture();
        if (texture != null) {
            texture.cleanup();
        }

        gl30.glBindVertexArray(0);
        gl30.glDeleteVertexArrays(vaoId);
    }

    public void deleteBuffers() {
        gl20.glDisableVertexAttribArray(0);

        // Delete the VBOs
        gl15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        for (int vboId : vboList) {
            gl15.glDeleteBuffers(vboId);
        }

        // Delete the VAO
        gl30.glBindVertexArray(0);
        gl30.glDeleteVertexArrays(vaoId);
    }


    private static float[] createEmptyFloatArray(int length, float defaultValue) {
        float[] result = new float[length];
        Arrays.fill(result, defaultValue);
        return result;
    }

    private static int[] createEmptyIntArray(int length, int defaultValue) {
        int[] result = new int[length];
        Arrays.fill(result, defaultValue);
        return result;
    }
}
