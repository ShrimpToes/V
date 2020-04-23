package squid.engine.graphics;

import squid.engine.Game;
import squid.engine.graphics.gl.GL20;
import squid.engine.graphics.uniforms.Uniform;

import java.util.List;

import static squid.engine.graphics.gl.GL20.*;

public class Shader {

    private final int programId;

    private int vertexShaderId;

    private int fragmentShaderId;

    private final GL20 gl20 = Game.gl.gl20;


    public Shader() throws Exception {
        programId = gl20.glCreateProgram();


        if (programId == 0) {
            throw new Exception("Could not create Shaders");
        }
    }

    public int getProgramId() {
        return programId;
    }

    public void createVertexShader(String shaderCode) throws Exception {
        vertexShaderId = createShader(shaderCode, GL_VERTEX_SHADER);
    }

    public void createFragmentShader(String shaderCode) throws Exception {
        fragmentShaderId = createShader(shaderCode, GL_FRAGMENT_SHADER);
    }

    public int createShader(String shaderCode, int shaderType) throws Exception {
        int shaderId = gl20.glCreateShader(shaderType);
        if (shaderId == 0) {
            throw new Exception("Error creating shader " + shaderCode + " of type: " + shaderType);
        }

        gl20.glShaderSource(shaderId, shaderCode);
        gl20.glCompileShader(shaderId);

        if (gl20.glGetShaderi(shaderId, GL_COMPILE_STATUS) == 0) {
            throw new Exception("Error compiling Shader code " + gl20.glGetShaderInfoLog(shaderId, 1024));
        }

        gl20.glAttachShader(programId, shaderId);

        return shaderId;
    }

    public void link() throws Exception {
        gl20.glLinkProgram(programId);
        if (gl20.glGetProgrami(programId, GL_LINK_STATUS) == 0) {
            throw new Exception("Error linking Shader code: " + gl20.glGetProgramInfoLog(programId, 1024));
        }

        if (vertexShaderId != 0) {
            gl20.glDetachShader(programId, vertexShaderId);
        }
        if (fragmentShaderId != 0) {
            gl20.glDetachShader(programId, fragmentShaderId);
        }

        gl20.glValidateProgram(programId);
        if (gl20.glGetProgrami(programId, GL_VALIDATE_STATUS) == 0) {
            System.err.println("Warning validating Shader code: " + gl20.glGetProgramInfoLog(programId, 1024));
        }

    }

    public void bind() {
        gl20.glUseProgram(programId);
    }

    public void unbind() {
        gl20.glUseProgram(0);
    }

    public void cleanup() {
        unbind();
        if (programId != 0) {
            gl20.glDeleteProgram(programId);
        }
    }
}
