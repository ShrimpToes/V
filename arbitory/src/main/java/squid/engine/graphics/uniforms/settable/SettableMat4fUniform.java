package squid.engine.graphics.uniforms.settable;

import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;
import squid.engine.Game;

import java.nio.FloatBuffer;

public class SettableMat4fUniform extends SettableUniform<Matrix4f> {

    public SettableMat4fUniform(String name) {
        super(name);
    }

    @Override
    public void set() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            FloatBuffer fb = stack.mallocFloat(16);
            value.get(fb);
            Game.gl.gl20.glUniformMatrix4fv(location, false, fb);
        }
    }
}
