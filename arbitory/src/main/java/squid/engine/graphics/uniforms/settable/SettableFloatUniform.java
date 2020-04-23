package squid.engine.graphics.uniforms.settable;

import squid.engine.Game;

public class SettableFloatUniform extends SettableUniform<Float> {
    public SettableFloatUniform(String name) {
        super(name);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform1f(location, value);
    }
}
