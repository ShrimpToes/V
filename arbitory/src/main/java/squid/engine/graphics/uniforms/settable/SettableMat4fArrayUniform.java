package squid.engine.graphics.uniforms.settable;

import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;
import squid.engine.Game;

import java.nio.FloatBuffer;

public class SettableMat4fArrayUniform extends SettableUniform<Matrix4f[]> {
    public SettableMat4fArrayUniform(String name) {
        super(name);
    }

    @Override
    public void set() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            int length = value != null ? value.length : 0;
            FloatBuffer fb = stack.mallocFloat(16 * length);
            for (int i = 0; i < length; i++) {
                value[i].get(16 * i, fb);
            }
            Game.gl.gl20.glUniformMatrix4fv(location, false, fb);
        }
    }
}
