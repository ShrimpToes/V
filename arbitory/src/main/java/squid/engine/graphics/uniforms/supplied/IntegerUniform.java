package squid.engine.graphics.uniforms.supplied;

import squid.engine.Game;

import java.util.function.Supplier;

public class IntegerUniform extends SuppliedUniform<Integer> {

    public IntegerUniform(String name) {
        super(name);
    }

    public IntegerUniform(String name, Supplier<Integer> supplier) {
        super(name, supplier);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform1i(location, value.get());
    }
}
