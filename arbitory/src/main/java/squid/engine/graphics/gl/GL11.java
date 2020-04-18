package squid.engine.graphics.gl;

import java.nio.*;

public interface GL11 {
    /** AlphaFunction */
    int GL_NEVER    = 0x200;
    int GL_LESS    = 0x201;
    int GL_EQUAL    = 0x202;
    int GL_LEQUAL   = 0x203;
    int GL_GREATER  = 0x204;
    int GL_NOTEQUAL = 0x205;
    int GL_GEQUAL   = 0x206;
    int GL_ALWAYS   = 0x207;
    /** AttribMask */
    int GL_DEPTH_BUFFER_BIT   = 0x100;
    int GL_STENCIL_BUFFER_BIT = 0x400;
    int GL_COLOR_BUFFER_BIT   = 0x4000;
    /** BeginMode */
    int GL_POINTS        = 0x0;
    int GL_LINES        = 0x1;
    int GL_LINE_LOOP     = 0x2;
    int GL_LINE_STRIP    = 0x3;
    int GL_TRIANGLES     = 0x4;
    int GL_TRIANGLE_STRIP = 0x5;
    int GL_TRIANGLE_FAN   = 0x6;
    int GL_QUADS        = 0x7;
    /** BlendingFactorDest */
    int GL_ZERO             = 0;
    int GL_ONE              = 1;
    int GL_SRC_COLOR         = 0x300;
    int GL_ONE_MINUS_SRC_COLOR = 0x301;
    int GL_SRC_ALPHA         = 0x302;
    int GL_ONE_MINUS_SRC_ALPHA = 0x303;
    int GL_DST_ALPHA         = 0x304;
    int GL_ONE_MINUS_DST_ALPHA = 0x305;
    /** BlendingFactorSrc */
    int GL_DST_COLOR         = 0x306;
    int GL_ONE_MINUS_DST_COLOR = 0x307;
    int GL_SRC_ALPHA_SATURATE  = 0x308;
    /** Boolean */
    int GL_TRUE  = 1;
    int GL_FALSE = 0;
    /** DataType */
    int GL_BYTE         = 0x1400;
    int GL_UNSIGNED_BYTE  = 0x1401;
    int GL_SHORT        = 0x1402;
    int GL_UNSIGNED_SHORT = 0x1403;
    int GL_INT          = 0x1404;
    int GL_UNSIGNED_INT   = 0x1405;
    int GL_FLOAT        = 0x1406;
    int GL_DOUBLE        = 0x140A;
    /** DrawBufferMode */
    int GL_NONE         = 0;
    int GL_FRONT_LEFT    = 0x400;
    int GL_FRONT_RIGHT    = 0x401;
    int GL_BACK_LEFT     = 0x402;
    int GL_BACK_RIGHT    = 0x403;
    int GL_FRONT        = 0x404;
    int GL_BACK         = 0x405;
    int GL_LEFT         = 0x406;
    int GL_RIGHT        = 0x407;
    int GL_FRONT_AND_BACK = 0x408;
    /** ErrorCode */
    int GL_NO_ERROR        = 0;
    int GL_INVALID_ENUM     = 0x500;
    int GL_INVALID_VALUE    = 0x501;
    int GL_INVALID_OPERATION = 0x502;
    int GL_STACK_OVERFLOW    = 0x503;
    int GL_STACK_UNDERFLOW   = 0x504;
    int GL_OUT_OF_MEMORY    = 0x505;
    /** FrontFaceDirection */
    int GL_CW  = 0x900;
    int GL_CCW = 0x901;
    /** GetTarget */
    int GL_POINT_SIZE            = 0xB11;
    int GL_POINT_SIZE_RANGE       = 0xB12;
    int GL_POINT_SIZE_GRANULARITY  = 0xB13;
    int GL_LINE_SMOOTH           = 0xB20;
    int GL_LINE_WIDTH            = 0xB21;
    int GL_LINE_WIDTH_RANGE       = 0xB22;
    int GL_LINE_WIDTH_GRANULARITY  = 0xB23;
    int GL_POLYGON_MODE          = 0xB40;
    int GL_POLYGON_SMOOTH        = 0xB41;
    int GL_CULL_FACE            = 0xB44;
    int GL_CULL_FACE_MODE        = 0xB45;
    int GL_FRONT_FACE            = 0xB46;
    int GL_DEPTH_RANGE           = 0xB70;
    int GL_DEPTH_TEST            = 0xB71;
    int GL_DEPTH_WRITEMASK        = 0xB72;
    int GL_DEPTH_CLEAR_VALUE      = 0xB73;
    int GL_DEPTH_FUNC            = 0xB74;
    int GL_STENCIL_TEST          = 0xB90;
    int GL_STENCIL_CLEAR_VALUE    = 0xB91;
    int GL_STENCIL_FUNC          = 0xB92;
    int GL_STENCIL_VALUE_MASK     = 0xB93;
    int GL_STENCIL_FAIL          = 0xB94;
    int GL_STENCIL_PASS_DEPTH_FAIL = 0xB95;
    int GL_STENCIL_PASS_DEPTH_PASS = 0xB96;
    int GL_STENCIL_REF           = 0xB97;
    int GL_STENCIL_WRITEMASK      = 0xB98;
    int GL_VIEWPORT             = 0xBA2;
    int GL_DITHER               = 0xBD0;
    int GL_BLEND_DST            = 0xBE0;
    int GL_BLEND_SRC            = 0xBE1;
    int GL_BLEND                = 0xBE2;
    int GL_LOGIC_OP_MODE         = 0xBF0;
    int GL_COLOR_LOGIC_OP        = 0xBF2;
    int GL_DRAW_BUFFER           = 0xC01;
    int GL_READ_BUFFER           = 0xC02;
    int GL_SCISSOR_BOX           = 0xC10;
    int GL_SCISSOR_TEST          = 0xC11;
    int GL_COLOR_CLEAR_VALUE      = 0xC22;
    int GL_COLOR_WRITEMASK        = 0xC23;
    int GL_DOUBLEBUFFER          = 0xC32;
    int GL_STEREO               = 0xC33;
    int GL_LINE_SMOOTH_HINT       = 0xC52;
    int GL_POLYGON_SMOOTH_HINT    = 0xC53;
    int GL_UNPACK_SWAP_BYTES      = 0xCF0;
    int GL_UNPACK_LSB_FIRST       = 0xCF1;
    int GL_UNPACK_ROW_LENGTH      = 0xCF2;
    int GL_UNPACK_SKIP_ROWS       = 0xCF3;
    int GL_UNPACK_SKIP_PIXELS     = 0xCF4;
    int GL_UNPACK_ALIGNMENT       = 0xCF5;
    int GL_PACK_SWAP_BYTES        = 0xD00;
    int GL_PACK_LSB_FIRST        = 0xD01;
    int GL_PACK_ROW_LENGTH        = 0xD02;
    int GL_PACK_SKIP_ROWS        = 0xD03;
    int GL_PACK_SKIP_PIXELS       = 0xD04;
    int GL_PACK_ALIGNMENT        = 0xD05;
    int GL_MAX_TEXTURE_SIZE       = 0xD33;
    int GL_MAX_VIEWPORT_DIMS      = 0xD3A;
    int GL_SUBPIXEL_BITS         = 0xD50;
    int GL_TEXTURE_1D            = 0xDE0;
    int GL_TEXTURE_2D            = 0xDE1;
    /** GetTextureParameter */
    int GL_TEXTURE_WIDTH         = 0x1000;
    int GL_TEXTURE_HEIGHT        = 0x1001;
    int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    int GL_TEXTURE_BORDER_COLOR    = 0x1004;
    /** HintMode */
    int GL_DONT_CARE = 0x1100;
    int GL_FASTEST   = 0x1101;
    int GL_NICEST    = 0x1102;
    /** LogicOp */
    int GL_CLEAR        = 0x1500;
    int GL_AND         = 0x1501;
    int GL_AND_REVERSE   = 0x1502;
    int GL_COPY        = 0x1503;
    int GL_AND_INVERTED  = 0x1504;
    int GL_NOOP        = 0x1505;
    int GL_XOR         = 0x1506;
    int GL_OR          = 0x1507;
    int GL_NOR         = 0x1508;
    int GL_EQUIV        = 0x1509;
    int GL_INVERT       = 0x150A;
    int GL_OR_REVERSE    = 0x150B;
    int GL_COPY_INVERTED = 0x150C;
    int GL_OR_INVERTED   = 0x150D;
    int GL_NAND        = 0x150E;
    int GL_SET         = 0x150F;
    /** PixelCopyType */
    int GL_COLOR   = 0x1800;
    int GL_DEPTH   = 0x1801;
    int GL_STENCIL = 0x1802;
    /** PixelFormat */
    int GL_STENCIL_INDEX   = 0x1901;
    int GL_DEPTH_COMPONENT = 0x1902;
    int GL_RED           = 0x1903;
    int GL_GREEN         = 0x1904;
    int GL_BLUE          = 0x1905;
    int GL_ALPHA         = 0x1906;
    int GL_RGB           = 0x1907;
    int GL_RGBA          = 0x1908;
    /** PolygonMode */
    int GL_POINT = 0x1B00;
    int GL_LINE  = 0x1B01;
    int GL_FILL  = 0x1B02;
    /** StencilOp */
    int GL_KEEP    = 0x1E00;
    int GL_REPLACE = 0x1E01;
    int GL_INCR    = 0x1E02;
    int GL_DECR    = 0x1E03;
    /** StringName */
    int GL_VENDOR    = 0x1F00;
    int GL_RENDERER   = 0x1F01;
    int GL_VERSION    = 0x1F02;
    int GL_EXTENSIONS = 0x1F03;
    /** TextureMagFilter */
    int GL_NEAREST = 0x2600;
    int GL_LINEAR  = 0x2601;
    /** TextureMinFilter */
    int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    int GL_LINEAR_MIPMAP_NEAREST  = 0x2701;
    int GL_NEAREST_MIPMAP_LINEAR  = 0x2702;
    int GL_LINEAR_MIPMAP_LINEAR   = 0x2703;
    /** TextureParameterName */
    int GL_TEXTURE_MAG_FILTER = 0x2800;
    int GL_TEXTURE_MIN_FILTER = 0x2801;
    int GL_TEXTURE_WRAP_S    = 0x2802;
    int GL_TEXTURE_WRAP_T    = 0x2803;
    /** TextureWrapMode */
    int GL_REPEAT = 0x2901;
    /** polygon_offset */
    int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    int GL_POLYGON_OFFSET_UNITS  = 0x2A00;
    int GL_POLYGON_OFFSET_POINT  = 0x2A01;
    int GL_POLYGON_OFFSET_LINE   = 0x2A02;
    int GL_POLYGON_OFFSET_FILL   = 0x8037;
    /** texture */
    int GL_R3_G3_B2         = 0x2A10;
    int GL_RGB4            = 0x804F;
    int GL_RGB5            = 0x8050;
    int GL_RGB8            = 0x8051;
    int GL_RGB10            = 0x8052;
    int GL_RGB12            = 0x8053;
    int GL_RGB16            = 0x8054;
    int GL_RGBA2            = 0x8055;
    int GL_RGBA4            = 0x8056;
    int GL_RGB5_A1          = 0x8057;
    int GL_RGBA8            = 0x8058;
    int GL_RGB10_A2         = 0x8059;
    int GL_RGBA12           = 0x805A;
    int GL_RGBA16           = 0x805B;
    int GL_TEXTURE_RED_SIZE   = 0x805C;
    int GL_TEXTURE_GREEN_SIZE = 0x805D;
    int GL_TEXTURE_BLUE_SIZE  = 0x805E;
    int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    int GL_PROXY_TEXTURE_1D   = 0x8063;
    int GL_PROXY_TEXTURE_2D   = 0x8064;
    /** texture_object */
    int GL_TEXTURE_BINDING_1D = 0x8068;
    int GL_TEXTURE_BINDING_2D = 0x8069;
    /** vertex_array */
    int GL_VERTEX_ARRAY = 0x8074;

    void glEnable(int target);

    void glDisable(int target);

    void glBindTexture(int target, int texture);

    void glBlendFunc(int sfactor, int dfactor);

    void glClear(int mask);

    void glClearColor(float red, float green, float blue, float alpha);

    void glClearDepth(double depth);

    void glClearStencil(int s);

    void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

    void glCullFace(int mode);

    void glDepthFunc(int func);

    void glDepthMask(boolean flag);

    void glDepthRange(double zNear, double zFar);

    void glDrawArrays(int mode, int first, int count);

    void glDrawBuffer(int buf);

    void nglDrawElements(int mode, int count, int type, long indices);

    void glDrawElements(int mode, int count, int type, long indices);

    void glDrawElements(int mode, int type, ByteBuffer indices);

    void glDrawElements(int mode, ByteBuffer indices);

    void glDrawElements(int mode, ShortBuffer indices);

    void glDrawElements(int mode, IntBuffer indices);

    void glFinish();

    void glFlush();

    void glFrontFace(int dir);

    void nglGenTextures(int n, long textures);

    void glGenTextures(IntBuffer textures);

    int glGenTextures();

    void nglDeleteTextures(int n, long textures);

    void glDeleteTextures(IntBuffer textures);

    void glDeleteTextures(int texture);

    /** Unsafe version of: {@link #glGetBooleanv GetBooleanv} */
    void nglGetBooleanv(int pname, long params);

    void glGetBooleanv(int pname, ByteBuffer params);

    boolean glGetBoolean(int pname);

    /** Unsafe version of: {@link #glGetFloatv GetFloatv} */
    void nglGetFloatv(int pname, long params);

    void glGetFloatv(int pname, FloatBuffer params);

    float glGetFloat(int pname);

    /** Unsafe version of: {@link #glGetIntegerv GetIntegerv} */
    void nglGetIntegerv(int pname, long params);

    void glGetIntegerv(int pname, IntBuffer params);

    int glGetInteger(int pname);

    /** Unsafe version of: {@link #glGetDoublev GetDoublev} */
    void nglGetDoublev(int pname, long params);

    void glGetDoublev(int pname, DoubleBuffer params);
    
    double glGetDouble(int pname);

    int glGetError();

    void nglGetPointerv(int pname, long params);

    long glGetPointer(int pname);

    /** Unsafe version of: {@link #glGetString GetString} */
    long nglGetString(int name);

    String glGetString(int name);

    /** Unsafe version of: {@link #glGetTexImage GetTexImage} */
    void nglGetTexImage(int tex, int level, int format, int type, long pixels);

    void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels);

    void glGetTexImage(int tex, int level, int format, int type, long pixels);

    void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels);

    void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels);

    void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels);

    void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels);

    /** Unsafe version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv} */
    void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

    void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params);

    int glGetTexLevelParameteri(int target, int level, int pname);

    /** Unsafe version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv} */
    void nglGetTexLevelParameterfv(int target, int level, int pname, long params);

    void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params);

    float glGetTexLevelParameterf(int target, int level, int pname);

    /** Unsafe version of: {@link #glGetTexParameteriv GetTexParameteriv} */
    void nglGetTexParameteriv(int target, int pname, long params);

    void glGetTexParameteriv(int target, int pname, IntBuffer params);

    int glGetTexParameteri(int target, int pname);

    /** Unsafe version of: {@link #glGetTexParameterfv GetTexParameterfv} */
    void nglGetTexParameterfv(int target, int pname, long params);

    void glGetTexParameterfv(int target, int pname, FloatBuffer params);

    float glGetTexParameterf(int target, int pname);

    void glHint(int target, int hint);

    boolean glIsEnabled(int cap);

    boolean glIsTexture(int texture);

    void glLineWidth(float width);

    void glLogicOp(int op);

    void glPixelStorei(int pname, int param);

    void glPixelStoref(int pname, float param);

    void glPointSize(float size);

    void glPolygonMode(int face, int mode);

    void glPolygonOffset(float factor, float units);

    void glReadBuffer(int src);

    /** Unsafe version of: {@link #glReadPixels ReadPixels} */
    void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);

    void glScissor(int x, int y, int width, int height);

    void glStencilFunc(int func, int ref, int mask);

    void glStencilMask(int mask);

    void glStencilOp(int sfail, int dpfail, int dppass);

    /** Unsafe version of: {@link #glTexImage1D TexImage1D} */
    void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels);

    /** Unsafe version of: {@link #glTexImage2D TexImage2D} */
    void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels);

    void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);

    void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border);

    void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);

    void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    void glTexParameteri(int target, int pname, int param);

    /** Unsafe version of: {@link #glTexParameteriv TexParameteriv} */
    void nglTexParameteriv(int target, int pname, long params);

    void glTexParameteriv(int target, int pname, IntBuffer params);

    void glTexParameterf(int target, int pname, float param);

    /** Unsafe version of: {@link #glTexParameterfv TexParameterfv} */
    void nglTexParameterfv(int target, int pname, long params);

    void glTexParameterfv(int target, int pname, FloatBuffer params);

    /** Unsafe version of: {@link #glTexSubImage1D TexSubImage1D} */
    void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels);

    /** Unsafe version of: {@link #glTexSubImage2D TexSubImage2D} */
    void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels);

    void glViewport(int x, int y, int w, int h);

    void glGenTextures(int[] textures);

    void glDeleteTextures(int[] textures);

    void glGetFloatv(int pname, float[] params);

    void glGetIntegerv(int pname, int[] params);

    void glGetDoublev(int pname, double[] params);

    void glGetTexImage(int tex, int level, int format, int type, short[] pixels);

    void glGetTexImage(int tex, int level, int format, int type, int[] pixels);

    void glGetTexImage(int tex, int level, int format, int type, float[] pixels);

    void glGetTexImage(int tex, int level, int format, int type, double[] pixels);

    void glGetTexLevelParameteriv(int target, int level, int pname, int[] params);

    void glGetTexLevelParameterfv(int target, int level, int pname, float[] params);

    void glGetTexParameteriv(int target, int pname, int[] params);

    void glGetTexParameterfv(int target, int pname, float[] params);

    void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels);

    void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels);

    void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels);

    void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels);

    void glTexParameteriv(int target, int pname, int[] params);

    void glTexParameterfv(int target, int pname, float[] params);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels);

    void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels);

    void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels);
}
