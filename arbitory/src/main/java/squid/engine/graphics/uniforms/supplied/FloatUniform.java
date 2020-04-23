package squid.engine.graphics.uniforms.supplied;

import squid.engine.Game;

import java.util.function.Supplier;

public class FloatUniform extends SuppliedUniform<Float> {

    public FloatUniform(String name) {
        super(name);
    }

    public FloatUniform(String name, Supplier<Float> supplier) {
        super(name, supplier);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform1f(this.location, value.get());
    }
}
