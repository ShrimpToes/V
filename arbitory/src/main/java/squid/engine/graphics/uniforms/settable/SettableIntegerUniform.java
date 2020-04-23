package squid.engine.graphics.uniforms.settable;

import squid.engine.Game;

public class SettableIntegerUniform extends SettableUniform<Integer> {

    public SettableIntegerUniform(String name) {
        super(name);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform1i(location, value);
    }
}
