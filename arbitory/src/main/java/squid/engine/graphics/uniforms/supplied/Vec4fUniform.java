package squid.engine.graphics.uniforms.supplied;

import org.joml.Vector4f;
import squid.engine.Game;

import java.util.function.Supplier;

public class Vec4fUniform extends SuppliedUniform<Vector4f> {

    public Vec4fUniform(String name) {
        super(name);
    }

    public Vec4fUniform(String name, Supplier<Vector4f> supplier) {
        super(name, supplier);
    }

    @Override
    public void set() {
        Game.gl.gl20.glUniform4f(location, value.get().x, value.get().y, value.get().z, value.get().w);
    }
}
