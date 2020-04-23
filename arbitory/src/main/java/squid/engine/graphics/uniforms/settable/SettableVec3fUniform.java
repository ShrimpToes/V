package squid.engine.graphics.uniforms.settable;

import org.joml.Vector3f;
import squid.engine.Game;

public class SettableVec3fUniform extends SettableUniform<Vector3f> {
    public SettableVec3fUniform(String name) {
        super(name);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform3f(this.location, value.x, value.y, value.z);
    }
}
