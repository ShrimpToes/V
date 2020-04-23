package squid.engine.graphics.uniforms.supplied;

import org.joml.Vector3f;
import squid.engine.Game;

import java.util.function.Supplier;

public class Vec3fUniform extends SuppliedUniform<Vector3f> {

    public Vec3fUniform(String name) {
        super(name);
    }

    public Vec3fUniform(String name, Supplier<Vector3f> supplier) {
        super(name, supplier);
    }

    @Override
    public void set() {
        Vector3f vector = value.get();
        Game.gl.gl20.glUniform3f(this.location, vector.x, vector.y, vector.z);
    }
}
