package squid.engine.graphics.gl;

import java.nio.*;

public interface GL15 {
    //inherited from GL13
    int
            GL_TEXTURE0  = 0x84C0,
            GL_TEXTURE1  = 0x84C1,
            GL_TEXTURE2  = 0x84C2,
            GL_TEXTURE3  = 0x84C3,
            GL_TEXTURE4  = 0x84C4,
            GL_TEXTURE5  = 0x84C5,
            GL_TEXTURE6  = 0x84C6,
            GL_TEXTURE7  = 0x84C7,
            GL_TEXTURE8  = 0x84C8,
            GL_TEXTURE9  = 0x84C9,
            GL_TEXTURE10 = 0x84CA,
            GL_TEXTURE11 = 0x84CB,
            GL_TEXTURE12 = 0x84CC,
            GL_TEXTURE13 = 0x84CD,
            GL_TEXTURE14 = 0x84CE,
            GL_TEXTURE15 = 0x84CF,
            GL_TEXTURE16 = 0x84D0,
            GL_TEXTURE17 = 0x84D1,
            GL_TEXTURE18 = 0x84D2,
            GL_TEXTURE19 = 0x84D3,
            GL_TEXTURE20 = 0x84D4,
            GL_TEXTURE21 = 0x84D5,
            GL_TEXTURE22 = 0x84D6,
            GL_TEXTURE23 = 0x84D7,
            GL_TEXTURE24 = 0x84D8,
            GL_TEXTURE25 = 0x84D9,
            GL_TEXTURE26 = 0x84DA,
            GL_TEXTURE27 = 0x84DB,
            GL_TEXTURE28 = 0x84DC,
            GL_TEXTURE29 = 0x84DD,
            GL_TEXTURE30 = 0x84DE,
            GL_TEXTURE31 = 0x84DF;


    int GL_SRC1_ALPHA = 34185;
    int GL_ARRAY_BUFFER = 34962;
    int GL_ELEMENT_ARRAY_BUFFER = 34963;
    int GL_ARRAY_BUFFER_BINDING = 34964;
    int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
    int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
    int GL_STREAM_DRAW = 35040;
    int GL_STREAM_READ = 35041;
    int GL_STREAM_COPY = 35042;
    int GL_STATIC_DRAW = 35044;
    int GL_STATIC_READ = 35045;
    int GL_STATIC_COPY = 35046;
    int GL_DYNAMIC_DRAW = 35048;
    int GL_DYNAMIC_READ = 35049;
    int GL_DYNAMIC_COPY = 35050;
    int GL_READ_ONLY = 35000;
    int GL_WRITE_ONLY = 35001;
    int GL_READ_WRITE = 35002;
    int GL_BUFFER_SIZE = 34660;
    int GL_BUFFER_USAGE = 34661;
    int GL_BUFFER_ACCESS = 35003;
    int GL_BUFFER_MAPPED = 35004;
    int GL_BUFFER_MAP_POINTER = 35005;
    int GL_SAMPLES_PASSED = 35092;
    int GL_QUERY_COUNTER_BITS = 34916;
    int GL_CURRENT_QUERY = 34917;
    int GL_QUERY_RESULT = 34918;
    int GL_QUERY_RESULT_AVAILABLE = 34919;

    void glBindBuffer(int var0, int var1);

    void nglDeleteBuffers(int var0, long var1);

    void glDeleteBuffers(IntBuffer buffers);

    void glDeleteBuffers(int buffer);

    void nglGenBuffers(int var0, long var1);

    void glGenBuffers(IntBuffer buffers);

    int glGenBuffers();

    boolean glIsBuffer(int var0);

    void nglBufferData(int var0, long var1, long var3, int var5);

    void glBufferData(int target, long size, int usage);

    void glBufferData(int target, ByteBuffer data, int usage);

    void glBufferData(int target, ShortBuffer data, int usage);

    void glBufferData(int target, IntBuffer data, int usage);

    void glBufferData(int target, LongBuffer data, int usage);

    void glBufferData(int target, FloatBuffer data, int usage);

    void glBufferData(int target, DoubleBuffer data, int usage);

    void nglBufferSubData(int var0, long var1, long var3, long var5);

    void glBufferSubData(int target, long offset, ByteBuffer data);

    void glBufferSubData(int target, long offset, ShortBuffer data);

    void glBufferSubData(int target, long offset, IntBuffer data);

    void glBufferSubData(int target, long offset, LongBuffer data);

    void glBufferSubData(int target, long offset, FloatBuffer data);

    void glBufferSubData(int target, long offset, DoubleBuffer data);

    void nglGetBufferSubData(int var0, long var1, long var3, long var5);

    void glGetBufferSubData(int target, long offset, ByteBuffer data);

    void glGetBufferSubData(int target, long offset, ShortBuffer data);

    void glGetBufferSubData(int target, long offset, IntBuffer data);

    void glGetBufferSubData(int target, long offset, LongBuffer data);

    void glGetBufferSubData(int target, long offset, FloatBuffer data);

    void glGetBufferSubData(int target, long offset, DoubleBuffer data);

    long nglMapBuffer(int var0, int var1);

    ByteBuffer glMapBuffer(int target, int access);

    ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer);

    ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer);

    boolean glUnmapBuffer(int var0);

    void nglGetBufferParameteriv(int var0, int var1, long var2);

    void glGetBufferParameteriv(int target, int pname, IntBuffer params);

    int glGetBufferParameteri(int target, int pname);

    void nglGetBufferPointerv(int var0, int var1, long var2);

    long glGetBufferPointer(int target, int pname);

    void nglGenQueries(int var0, long var1);

    void glGenQueries(IntBuffer ids);

    int glGenQueries();

    void nglDeleteQueries(int var0, long var1);

    void glDeleteQueries(IntBuffer ids);

    void glDeleteQueries(int id);

    boolean glIsQuery(int var0);

    void glBeginQuery(int var0, int var1);

    void glEndQuery(int var0);

    void nglGetQueryiv(int var0, int var1, long var2);

    void glGetQueryiv(int target, int pname, IntBuffer params);

    int glGetQueryi(int target, int pname);

    void nglGetQueryObjectiv(int var0, int var1, long var2);

    void glGetQueryObjectiv(int id, int pname, IntBuffer params);

    int glGetQueryObjecti(int id, int pname);

    void nglGetQueryObjectuiv(int var0, int var1, long var2);

    void glGetQueryObjectuiv(int id, int pname, IntBuffer params);

    int glGetQueryObjectui(int id, int pname);

    void glDeleteBuffers(int[] buffers);

    void glGenBuffers(int[] buffers);

    void glBufferData(int target, short[] data, int usage);

    void glBufferData(int target, int[] data, int usage);

    void glBufferData(int target, long[] data, int usage);

    void glBufferData(int target, float[] data, int usage);

    void glBufferData(int target, double[] data, int usage);

    void glBufferSubData(int target, long offset, short[] data);

    void glBufferSubData(int target, long offset, int[] data);

    void glBufferSubData(int target, long offset, long[] data);

    void glBufferSubData(int target, long offset, float[] data);

    void glBufferSubData(int target, long offset, double[] data);

    void glGetBufferSubData(int target, long offset, short[] data);

    void glGetBufferSubData(int target, long offset, int[] data);

    void glGetBufferSubData(int target, long offset, long[] data);

    void glGetBufferSubData(int target, long offset, float[] data);

    void glGetBufferSubData(int target, long offset, double[] data);

    void glGetBufferParameteriv(int target, int pname, int[] params);

    void glGenQueries(int[] ids);

    void glDeleteQueries(int[] ids);

    void glGetQueryiv(int target, int pname, int[] params);

    void glGetQueryObjectiv(int id, int pname, int[] params);

    void glGetQueryObjectuiv(int id, int pname, int[] params);
}
