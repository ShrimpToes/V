package squid.graphics.gl;

import org.lwjgl.opengl.GL15C;
import squid.engine.graphics.gl.GL15;

import java.nio.*;

public class SquidGL15 implements GL15 {
    @Override
    public void glBindBuffer(int var0, int var1) {
        GL15C.glBindBuffer(var0, var1);
    }

    @Override
    public void nglDeleteBuffers(int var0, long var1) {
        GL15C.nglDeleteBuffers(var0, var1);
    }

    @Override
    public void glDeleteBuffers(IntBuffer buffers) {
        GL15C.glDeleteBuffers(buffers);
    }

    @Override
    public void glDeleteBuffers(int buffer) {
        GL15C.glDeleteBuffers(buffer);
    }

    @Override
    public void nglGenBuffers(int var0, long var1) {
        GL15C.nglGenBuffers(var0, var1);
    }

    @Override
    public void glGenBuffers(IntBuffer buffers) {
        GL15C.glGenBuffers(buffers);
    }

    @Override
    public int glGenBuffers() {
        return GL15C.glGenBuffers();
    }

    @Override
    public boolean glIsBuffer(int var0) {
        return GL15C.glIsBuffer(var0);
    }

    @Override
    public void nglBufferData(int var0, long var1, long var3, int var5) {
        GL15C.nglBufferData(var0, var1, var3, var5);
    }

    @Override
    public void glBufferData(int target, long size, int usage) {
        GL15C.glBufferData(target, size, usage);
    }

    @Override
    public void glBufferData(int target, ByteBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, ShortBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, IntBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, LongBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, FloatBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, DoubleBuffer data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void nglBufferSubData(int var0, long var1, long var3, long var5) {
        GL15C.nglBufferSubData(var0, var1, var3, var5);
    }

    @Override
    public void glBufferSubData(int target, long offset, ByteBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ShortBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, IntBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, LongBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, FloatBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, DoubleBuffer data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void nglGetBufferSubData(int var0, long var1, long var3, long var5) {
        GL15C.nglGetBufferSubData(var0, var1, var3, var5);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, IntBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, LongBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        GL15C.glGetBufferSubData(target, offset, data);
    }

    @Override
    public long nglMapBuffer(int var0, int var1) {
        return GL15C.nglMapBuffer(var0, var1);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access) {
        return GL15C.glMapBuffer(target, access);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        return GL15C.glMapBuffer(target, access, old_buffer);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        return GL15C.glMapBuffer(target, access, length, old_buffer);
    }

    @Override
    public boolean glUnmapBuffer(int var0) {
        return GL15C.glUnmapBuffer(var0);
    }

    @Override
    public void nglGetBufferParameteriv(int var0, int var1, long var2) {
        GL15C.nglGetBufferParameteriv(var0, var1, var2);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        GL15C.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public int glGetBufferParameteri(int target, int pname) {
        return GL15C.glGetBufferParameteri(target, pname);
    }

    @Override
    public void nglGetBufferPointerv(int var0, int var1, long var2) {
        GL15C.nglGetBufferPointerv(var0, var1, var2);
    }

    @Override
    public long glGetBufferPointer(int target, int pname) {
        return GL15C.glGetBufferPointer(target, pname);
    }

    @Override
    public void nglGenQueries(int var0, long var1) {
        GL15C.nglGenQueries(var0, var1);
    }

    @Override
    public void glGenQueries(IntBuffer ids) {
        GL15C.glGenQueries(ids);
    }

    @Override
    public int glGenQueries() {
        return GL15C.glGenQueries();
    }

    @Override
    public void nglDeleteQueries(int var0, long var1) {
        GL15C.nglDeleteQueries(var0, var1);
    }

    @Override
    public void glDeleteQueries(IntBuffer ids) {
        GL15C.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int id) {
        GL15C.glDeleteQueries(id);
    }

    @Override
    public boolean glIsQuery(int var0) {
        return glIsQuery(var0);
    }

    @Override
    public void glBeginQuery(int var0, int var1) {
        GL15C.glBeginQuery(var0, var1);
    }

    @Override
    public void glEndQuery(int var0) {
        GL15C.glEndQuery(var0);
    }

    @Override
    public void nglGetQueryiv(int var0, int var1, long var2) {
        GL15C.nglGetQueryiv(var0, var1, var2);
    }

    @Override
    public void glGetQueryiv(int target, int pname, IntBuffer params) {
        GL15C.glGetQueryiv(target, pname, params);
    }

    @Override
    public int glGetQueryi(int target, int pname) {
        return GL15C.glGetQueryi(target, pname);
    }

    @Override
    public void nglGetQueryObjectiv(int var0, int var1, long var2) {
        GL15C.nglGetQueryObjectiv(var0, var1, var2);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public int glGetQueryObjecti(int id, int pname) {
        return GL15C.glGetQueryObjecti(id, pname);
    }

    @Override
    public void nglGetQueryObjectuiv(int var0, int var1, long var2) {
        GL15C.nglGetQueryObjectiv(var0, var1, var2);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public int glGetQueryObjectui(int id, int pname) {
        return GL15C.glGetQueryObjectui(id, pname);
    }

    @Override
    public void glDeleteBuffers(int[] buffers) {
        GL15C.glDeleteBuffers(buffers);
    }

    @Override
    public void glGenBuffers(int[] buffers) {
        GL15C.glGenBuffers(buffers);
    }

    @Override
    public void glBufferData(int target, short[] data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, int[] data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, long[] data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, float[] data, int usage) {

    }

    @Override
    public void glBufferData(int target, double[] data, int usage) {
        GL15C.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferSubData(int target, long offset, short[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, int[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, long[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, float[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, double[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, short[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, int[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, long[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, float[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, double[] data) {
        GL15C.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, int[] params) {
        GL15C.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glGenQueries(int[] ids) {
        GL15C.glGenQueries(ids);
    }

    @Override
    public void glDeleteQueries(int[] ids) {
        GL15C.glDeleteQueries(ids);
    }

    @Override
    public void glGetQueryiv(int target, int pname, int[] params) {
        GL15C.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, int[] params) {
        GL15C.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        GL15C.glGetQueryObjectuiv(id, pname, params);
    }
}
