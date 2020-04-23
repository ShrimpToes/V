package squid.engine.graphics.gl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public interface GL30 {
    /** GetTarget */
    int
        GL_MAJOR_VERSION                       = 0x821B;
    int GL_MINOR_VERSION                       = 0x821C;
    int GL_NUM_EXTENSIONS                      = 0x821D;
    int GL_CONTEXT_FLAGS                       = 0x821E;
    int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;
    /** Renamed tokens. */
    int
        GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    int GL_CLIP_DISTANCE0         = 0x3000;
    int GL_CLIP_DISTANCE1         = 0x3001;
    int GL_CLIP_DISTANCE2         = 0x3002;
    int GL_CLIP_DISTANCE3         = 0x3003;
    int GL_CLIP_DISTANCE4         = 0x3004;
    int GL_CLIP_DISTANCE5         = 0x3005;
    int GL_CLIP_DISTANCE6         = 0x3006;
    int GL_CLIP_DISTANCE7         = 0x3007;
    int GL_MAX_CLIP_DISTANCES     = 0xD32;
    int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv. */
    int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    /** Returned by the {@code type} parameter of GetActiveUniform. */
    int
        GL_SAMPLER_1D_ARRAY              = 0x8DC0;
    int GL_SAMPLER_2D_ARRAY              = 0x8DC1;
    int GL_SAMPLER_1D_ARRAY_SHADOW       = 0x8DC3;
    int GL_SAMPLER_2D_ARRAY_SHADOW       = 0x8DC4;
    int GL_SAMPLER_CUBE_SHADOW           = 0x8DC5;
    int GL_UNSIGNED_INT_VEC2             = 0x8DC6;
    int GL_UNSIGNED_INT_VEC3             = 0x8DC7;
    int GL_UNSIGNED_INT_VEC4             = 0x8DC8;
    int GL_INT_SAMPLER_1D                = 0x8DC9;
    int GL_INT_SAMPLER_2D                = 0x8DCA;
    int GL_INT_SAMPLER_3D                = 0x8DCB;
    int GL_INT_SAMPLER_CUBE              = 0x8DCC;
    int GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE;
    int GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF;
    int GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1;
    int GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2;
    int GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3;
    int GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4;
    int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int
        GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    /** Accepted by the {@code mode} parameter of BeginConditionalRender. */
    int
        GL_QUERY_WAIT              = 0x8E13;
    int GL_QUERY_NO_WAIT           = 0x8E14;
    int GL_QUERY_BY_REGION_WAIT    = 0x8E15;
    int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
    /** Accepted by the {@code access} parameter of MapBufferRange. */
    int
        GL_MAP_READ_BIT              = 0x1;
    int GL_MAP_WRITE_BIT             = 0x2;
    int GL_MAP_INVALIDATE_RANGE_BIT  = 0x4;
    int GL_MAP_INVALIDATE_BUFFER_BIT = 0x8;
    int GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10;
    int GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;
    /** Accepted by the {@code pname} parameter of GetBufferParameteriv. */
    int
        GL_BUFFER_ACCESS_FLAGS = 0x911F;
    int GL_BUFFER_MAP_LENGTH   = 0x9120;
    int GL_BUFFER_MAP_OFFSET   = 0x9121;
    /** Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int GL_CLAMP_READ_COLOR = 0x891C;
    /** Accepted by the {@code clamp} parameter of ClampColor. */
    int GL_FIXED_ONLY = 0x891D;
    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    int
        GL_DEPTH_COMPONENT32F = 0x8CAC;
    int GL_DEPTH32F_STENCIL8  = 0x8CAD;
    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    int
        GL_TEXTURE_RED_TYPE   = 0x8C10;
    int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    int GL_TEXTURE_BLUE_TYPE  = 0x8C12;
    int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
    /** Returned by the {@code params} parameter of GetTexLevelParameter. */
    int GL_UNSIGNED_NORMALIZED = 0x8C17;
    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    int
        GL_RGBA32F = 0x8814;
    int GL_RGB32F  = 0x8815;
    int GL_RGBA16F = 0x881A;
    int GL_RGB16F  = 0x881B;
    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    int GL_R11F_G11F_B10F = 0x8C3A;
    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage. */
    int GL_RGB9_E5 = 0x8C3D;
    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
     * GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
     */
    int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
    /**
     * Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
     * GetFramebufferAttachmentParameteriv.
     */
    int
        GL_FRAMEBUFFER      = 0x8D40;
    int GL_READ_FRAMEBUFFER = 0x8CA8;
    int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    /**
     * Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
     * GetFramebufferAttachmentParameteriv.
     */
    int GL_RENDERBUFFER = 0x8D41;
    /** Accepted by the {@code internalformat} parameter of RenderbufferStorage. */
    int
        GL_STENCIL_INDEX1  = 0x8D46;
    int GL_STENCIL_INDEX4  = 0x8D47;
    int GL_STENCIL_INDEX8  = 0x8D48;
    int GL_STENCIL_INDEX16 = 0x8D49;
    /** Accepted by the {@code pname} parameter of GetRenderbufferParameteriv. */
    int
        GL_RENDERBUFFER_WIDTH           = 0x8D42;
    int GL_RENDERBUFFER_HEIGHT          = 0x8D43;
    int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    int GL_RENDERBUFFER_RED_SIZE        = 0x8D50;
    int GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51;
    int GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52;
    int GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53;
    int GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54;
    int GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55;
    int GL_RENDERBUFFER_SAMPLES         = 0x8CAB;
    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0;
    int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4;
    int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210;
    int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211;
    int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212;
    int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213;
    int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214;
    int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215;
    int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216;
    int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;
    /** Returned in {@code params} by GetFramebufferAttachmentParameteriv. */
    int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    /** Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv. */
    int
        GL_COLOR_ATTACHMENT0        = 0x8CE0;
    int GL_COLOR_ATTACHMENT1        = 0x8CE1;
    int GL_COLOR_ATTACHMENT2        = 0x8CE2;
    int GL_COLOR_ATTACHMENT3        = 0x8CE3;
    int GL_COLOR_ATTACHMENT4        = 0x8CE4;
    int GL_COLOR_ATTACHMENT5        = 0x8CE5;
    int GL_COLOR_ATTACHMENT6        = 0x8CE6;
    int GL_COLOR_ATTACHMENT7        = 0x8CE7;
    int GL_COLOR_ATTACHMENT8        = 0x8CE8;
    int GL_COLOR_ATTACHMENT9        = 0x8CE9;
    int GL_COLOR_ATTACHMENT10       = 0x8CEA;
    int GL_COLOR_ATTACHMENT11       = 0x8CEB;
    int GL_COLOR_ATTACHMENT12       = 0x8CEC;
    int GL_COLOR_ATTACHMENT13       = 0x8CED;
    int GL_COLOR_ATTACHMENT14       = 0x8CEE;
    int GL_COLOR_ATTACHMENT15       = 0x8CEF;
    int GL_COLOR_ATTACHMENT16       = 0x8CF0;
    int GL_COLOR_ATTACHMENT17       = 0x8CF1;
    int GL_COLOR_ATTACHMENT18       = 0x8CF2;
    int GL_COLOR_ATTACHMENT19       = 0x8CF3;
    int GL_COLOR_ATTACHMENT20       = 0x8CF4;
    int GL_COLOR_ATTACHMENT21       = 0x8CF5;
    int GL_COLOR_ATTACHMENT22       = 0x8CF6;
    int GL_COLOR_ATTACHMENT23       = 0x8CF7;
    int GL_COLOR_ATTACHMENT24       = 0x8CF8;
    int GL_COLOR_ATTACHMENT25       = 0x8CF9;
    int GL_COLOR_ATTACHMENT26       = 0x8CFA;
    int GL_COLOR_ATTACHMENT27       = 0x8CFB;
    int GL_COLOR_ATTACHMENT28       = 0x8CFC;
    int GL_COLOR_ATTACHMENT29       = 0x8CFD;
    int GL_COLOR_ATTACHMENT30       = 0x8CFE;
    int GL_COLOR_ATTACHMENT31       = 0x8CFF;
    int GL_DEPTH_ATTACHMENT         = 0x8D00;
    int GL_STENCIL_ATTACHMENT       = 0x8D20;
    int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int GL_MAX_SAMPLES = 0x8D57;
    /** Returned by CheckFramebufferStatus(). */
    int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5;
    int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6;
    int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB;
    int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC;
    int GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD;
    int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56;
    int GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;
    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev. */
    int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6;
    int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    int GL_RENDERBUFFER_BINDING     = 0x8CA7;
    int GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF;
    int GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;
    /** Returned by GetError(). */
    int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;
    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
     * CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    int GL_DEPTH_STENCIL = 0x84F9;
    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    int GL_UNSIGNED_INT_24_8 = 0x84FA;
    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
     */
    int GL_DEPTH24_STENCIL8 = 0x88F0;
    /** Accepted by the {@code value} parameter of GetTexLevelParameter. */
    int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
     * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
     * ColorTable, ColorSubTable, and GetColorTable.
     *
     * <p>Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
     * VertexAttribPointer.</p>
     */
    int GL_HALF_FLOAT = 0x140B;
    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    int
        GL_RGBA32UI = 0x8D70;
    int GL_RGB32UI  = 0x8D71;
    int GL_RGBA16UI = 0x8D76;
    int GL_RGB16UI  = 0x8D77;
    int GL_RGBA8UI  = 0x8D7C;
    int GL_RGB8UI   = 0x8D7D;
    int GL_RGBA32I  = 0x8D82;
    int GL_RGB32I   = 0x8D83;
    int GL_RGBA16I  = 0x8D88;
    int GL_RGB16I   = 0x8D89;
    int GL_RGBA8I   = 0x8D8E;
    int GL_RGB8I    = 0x8D8F;
    /** Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels. */
    int
        GL_RED_INTEGER   = 0x8D94;
    int GL_GREEN_INTEGER = 0x8D95;
    int GL_BLUE_INTEGER  = 0x8D96;
    int GL_RGB_INTEGER   = 0x8D98;
    int GL_RGBA_INTEGER  = 0x8D99;
    int GL_BGR_INTEGER   = 0x8D9A;
    int GL_BGRA_INTEGER  = 0x8D9B;
    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture. */
    int
        GL_TEXTURE_1D_ARRAY = 0x8C18;
    int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D. */
    int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    /**
     * Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
     * CompressedTexSubImage2D.
     */
    int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    int
        GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    /**
     * Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
     * CompressedTexSubImage2D.
     */
    int
        GL_COMPRESSED_RED_RGTC1        = 0x8DBB;
    int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    int GL_COMPRESSED_RG_RGTC2         = 0x8DBD;
    int GL_COMPRESSED_SIGNED_RG_RGTC2  = 0x8DBE;
    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D. */
    int
        GL_R8             = 0x8229;
    int GL_R16            = 0x822A;
    int GL_RG8            = 0x822B;
    int GL_RG16           = 0x822C;
    int GL_R16F           = 0x822D;
    int GL_R32F           = 0x822E;
    int GL_RG16F          = 0x822F;
    int GL_RG32F          = 0x8230;
    int GL_R8I            = 0x8231;
    int GL_R8UI           = 0x8232;
    int GL_R16I           = 0x8233;
    int GL_R16UI          = 0x8234;
    int GL_R32I           = 0x8235;
    int GL_R32UI          = 0x8236;
    int GL_RG8I           = 0x8237;
    int GL_RG8UI          = 0x8238;
    int GL_RG16I          = 0x8239;
    int GL_RG16UI         = 0x823A;
    int GL_RG32I          = 0x823B;
    int GL_RG32UI         = 0x823C;
    int GL_RG             = 0x8227;
    int GL_COMPRESSED_RED = 0x8225;
    int GL_COMPRESSED_RG  = 0x8226;
    /** Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels. */
    int GL_RG_INTEGER = 0x8228;
    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * BindBufferRange, BindBufferOffset and BindBufferBase.
     */
    int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    /** Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v. */
    int
        GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;
    /**
     * Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
     * GetDoublev, GetIntegerv, and GetFloatv.
     */
    int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    /** Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings. */
    int
        GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    int GL_SEPARATE_ATTRIBS    = 0x8C8D;
    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    int
        GL_PRIMITIVES_GENERATED                  = 0x8C87;
    int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    int GL_RASTERIZER_DISCARD = 0x8C89;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B;
    int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;
    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    int
        GL_TRANSFORM_FEEDBACK_VARYINGS           = 0x8C83;
    int GL_TRANSFORM_FEEDBACK_BUFFER_MODE        = 0x8C7F;
    int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    int GL_FRAMEBUFFER_SRGB = 0x8DB9;

    long nglGetStringi(int name, int index);


    String glGetStringi(int name, int index);

    void nglClearBufferiv(int buffer, int drawbuffer, long value);

    void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value);

    void nglClearBufferuiv(int buffer, int drawbuffer, long value);

    void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value);

    void nglClearBufferfv(int buffer, int drawbuffer, long value);

    void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value);

    void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    void glVertexAttribI1i(int index, int x);

    void glVertexAttribI2i(int index, int x, int y);

    void glVertexAttribI3i(int index, int x, int y, int z);

    void glVertexAttribI4i(int index, int x, int y, int z, int w);

    void glVertexAttribI1ui(int index, int x);

    void glVertexAttribI2ui(int index, int x, int y);

    void glVertexAttribI3ui(int index, int x, int y, int z);

    void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    void nglVertexAttribI1iv(int index, long v);

    void glVertexAttribI1iv(int index, IntBuffer v);

    void nglVertexAttribI2iv(int index, long v);

    void glVertexAttribI2iv(int index, IntBuffer v);

    void nglVertexAttribI3iv(int index, long v);

    void glVertexAttribI3iv(int index, IntBuffer v);

    void nglVertexAttribI4iv(int index, long v);

    void glVertexAttribI4iv(int index, IntBuffer v);

    void nglVertexAttribI1uiv(int index, long v);

    void glVertexAttribI1uiv(int index, IntBuffer v);

    void nglVertexAttribI2uiv(int index, long v);

    void glVertexAttribI2uiv(int index, IntBuffer v);

    void nglVertexAttribI3uiv(int index, long v);

    void glVertexAttribI3uiv(int index, IntBuffer v);

    void nglVertexAttribI4uiv(int index, long v);

    void glVertexAttribI4uiv(int index, IntBuffer v);

    void nglVertexAttribI4bv(int index, long v);

    void glVertexAttribI4bv(int index, ByteBuffer v);

    void nglVertexAttribI4sv(int index, long v);

    void glVertexAttribI4sv(int index, ShortBuffer v);

    void nglVertexAttribI4ubv(int index, long v);

    void glVertexAttribI4ubv(int index, ByteBuffer v);

    void nglVertexAttribI4usv(int index, long v);

    void glVertexAttribI4usv(int index, ShortBuffer v);

    void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer);

    void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer);

    void nglGetVertexAttribIiv(int index, int pname, long params);

    void glGetVertexAttribIiv(int index, int pname, IntBuffer params);

    int glGetVertexAttribIi(int index, int pname);

    void nglGetVertexAttribIuiv(int index, int pname, long params);

    void glGetVertexAttribIuiv(int index, int pname, IntBuffer params);

    int glGetVertexAttribIui(int index, int pname);

    void glUniform1ui(int location, int v0);

    void glUniform2ui(int location, int v0, int v1);

    void glUniform3ui(int location, int v0, int v1, int v2);

    void glUniform4ui(int location, int v0, int v1, int v2, int v3);

    void nglUniform1uiv(int location, int count, long value);

    void glUniform1uiv(int location, IntBuffer value);

    void nglUniform2uiv(int location, int count, long value);

    void glUniform2uiv(int location, IntBuffer value);

    void nglUniform3uiv(int location, int count, long value);

    void glUniform3uiv(int location, IntBuffer value);

    void nglUniform4uiv(int location, int count, long value);

    void glUniform4uiv(int location, IntBuffer value);

    void nglGetUniformuiv(int program, int location, long params);

    void glGetUniformuiv(int program, int location, IntBuffer params);

    int glGetUniformui(int program, int location);

    void nglBindFragDataLocation(int program, int colorNumber, long name);

    void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name);

    void glBindFragDataLocation(int program, int colorNumber, CharSequence name);

    int nglGetFragDataLocation(int program, long name);

    int glGetFragDataLocation(int program, ByteBuffer name);

    int glGetFragDataLocation(int program, CharSequence name);

    void glBeginConditionalRender(int id, int mode);

    void glEndConditionalRender();

    long nglMapBufferRange(int target, long offset, long length, int access);


    ByteBuffer glMapBufferRange(int target, long offset, long length, int access);


    ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer);

    void glFlushMappedBufferRange(int target, long offset, long length);

    void glClampColor(int target, int clamp);

    boolean glIsRenderbuffer(int renderbuffer);

    void glBindRenderbuffer(int target, int renderbuffer);

    void nglDeleteRenderbuffers(int n, long renderbuffers);

    void glDeleteRenderbuffers(IntBuffer renderbuffers);

    void glDeleteRenderbuffers(int renderbuffer);

    void nglGenRenderbuffers(int n, long renderbuffers);

    void glGenRenderbuffers(IntBuffer renderbuffers);

    int glGenRenderbuffers();

    void glRenderbufferStorage(int target, int internalformat, int width, int height);

    void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height);

    void nglGetRenderbufferParameteriv(int target, int pname, long params);

    void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params);

    int glGetRenderbufferParameteri(int target, int pname);

    boolean glIsFramebuffer(int framebuffer);

    void glBindFramebuffer(int target, int framebuffer);

    void nglDeleteFramebuffers(int n, long framebuffers);

    void glDeleteFramebuffers(IntBuffer framebuffers);

    void glDeleteFramebuffers(int framebuffer);

    void nglGenFramebuffers(int n, long framebuffers);

    void glGenFramebuffers(IntBuffer framebuffers);

    int glGenFramebuffers();

    int glCheckFramebufferStatus(int target);

    void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level);

    void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer);

    void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);

    void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params);

    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);

    int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname);

    void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter);

    void glGenerateMipmap(int target);

    void nglTexParameterIiv(int target, int pname, long params);

    void glTexParameterIiv(int target, int pname, IntBuffer params);

    void glTexParameterIi(int target, int pname, int param);

    void nglTexParameterIuiv(int target, int pname, long params);

    void glTexParameterIuiv(int target, int pname, IntBuffer params);

    void glTexParameterIui(int target, int pname, int param);

    void nglGetTexParameterIiv(int target, int pname, long params);

    void glGetTexParameterIiv(int target, int pname, IntBuffer params);

    int glGetTexParameterIi(int target, int pname);

    void nglGetTexParameterIuiv(int target, int pname, long params);

    void glGetTexParameterIuiv(int target, int pname, IntBuffer params);

    int glGetTexParameterIui(int target, int pname);

    void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a);

    void nglGetBooleani_v(int target, int index, long data);

    void glGetBooleani_v(int target, int index, ByteBuffer data);

    boolean glGetBooleani(int target, int index);

    void nglGetIntegeri_v(int target, int index, long data);

    void glGetIntegeri_v(int target, int index, IntBuffer data);

    int glGetIntegeri(int target, int index);

    void glEnablei(int cap, int index);

    void glDisablei(int target, int index);

    boolean glIsEnabledi(int target, int index);

    void glBindBufferRange(int target, int index, int buffer, long offset, long size);

    void glBindBufferBase(int target, int index, int buffer);

    void glBeginTransformFeedback(int primitiveMode);

    void glEndTransformFeedback();

    void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode);

    void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode);

    void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode);

    void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

    void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);

    String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type);

    String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type);

    void glBindVertexArray(int array);

    void nglDeleteVertexArrays(int n, long arrays);

    void glDeleteVertexArrays(IntBuffer arrays);

    void glDeleteVertexArrays(int array);

    void nglGenVertexArrays(int n, long arrays);

    void glGenVertexArrays(IntBuffer arrays);

    int glGenVertexArrays();

    boolean glIsVertexArray(int array);

    void glClearBufferiv(int buffer, int drawbuffer, int[] value);

    void glClearBufferuiv(int buffer, int drawbuffer, int[] value);

    void glClearBufferfv(int buffer, int drawbuffer, float[] value);

    void glVertexAttribI1iv(int index, int[] v);

    void glVertexAttribI2iv(int index, int[] v);

    void glVertexAttribI3iv(int index, int[] v);

    void glVertexAttribI4iv(int index, int[] v);

    void glVertexAttribI1uiv(int index, int[] v);

    void glVertexAttribI2uiv(int index, int[] v);

    void glVertexAttribI3uiv(int index, int[] v);

    void glVertexAttribI4uiv(int index, int[] v);

    void glVertexAttribI4sv(int index, short[] v);

    void glVertexAttribI4usv(int index, short[] v);

    void glGetVertexAttribIiv(int index, int pname, int[] params);

    void glGetVertexAttribIuiv(int index, int pname, int[] params);

    void glUniform1uiv(int location, int[] value);

    void glUniform2uiv(int location, int[] value);

    void glUniform3uiv(int location, int[] value);

    void glUniform4uiv(int location, int[] value);

    void glGetUniformuiv(int program, int location, int[] params);

    void glDeleteRenderbuffers(int[] renderbuffers);

    void glGenRenderbuffers(int[] renderbuffers);

    void glGetRenderbufferParameteriv(int target, int pname, int[] params);

    void glDeleteFramebuffers(int[] framebuffers);

    void glGenFramebuffers(int[] framebuffers);

    void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params);

    void glTexParameterIiv(int target, int pname, int[] params);

    void glTexParameterIuiv(int target, int pname, int[] params);

    void glGetTexParameterIiv(int target, int pname, int[] params);

    void glGetTexParameterIuiv(int target, int pname, int[] params);

    void glGetIntegeri_v(int target, int index, int[] data);

    void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name);

    void glDeleteVertexArrays(int[] arrays);

    void glGenVertexArrays(int[] arrays);

    //GL31C
    void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);

    //GL33C
    void glVertexAttribDivisor(int index, int divisor);
}
