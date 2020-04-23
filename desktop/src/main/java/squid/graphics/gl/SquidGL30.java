package squid.graphics.gl;

import org.lwjgl.opengl.GL30C;
import org.lwjgl.opengl.GL31C;
import org.lwjgl.opengl.GL33C;
import squid.engine.graphics.gl.GL30;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class SquidGL30 implements GL30 {
    @Override
    public long nglGetStringi(int name, int index) {
        return GL30C.nglGetStringi(name, index);
    }

    @Override
    public String glGetStringi(int name, int index) {
        return GL30C.glGetStringi(name, index);
    }

    @Override
    public void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GL30C.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override
    public void glVertexAttribI1i(int index, int x) {
        GL30C.glVertexAttribI1i(index, x);
    }

    @Override
    public void glVertexAttribI2i(int index, int x, int y) {
        GL30C.glVertexAttribI2i(index, x, y);
    }

    @Override
    public void glVertexAttribI3i(int index, int x, int y, int z) {
        GL30C.glVertexAttribI3i(index, x, y, z);
    }

    @Override
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GL30C.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override
    public void glVertexAttribI1ui(int index, int x) {
        GL30C.glVertexAttribI1ui(index, x);
    }

    @Override
    public void glVertexAttribI2ui(int index, int x, int y) {
        GL30C.glVertexAttribI2ui(index, x, y);
    }

    @Override
    public void glVertexAttribI3ui(int index, int x, int y, int z) {
        GL30C.glVertexAttribI3ui(index, x, y, z);
    }

    @Override
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GL30C.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override
    public void nglVertexAttribI1iv(int index, long v) {
        GL30C.nglVertexAttribI1iv(index, v);
    }

    @Override
    public void glVertexAttribI1iv(int index, IntBuffer v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    @Override
    public void nglVertexAttribI2iv(int index, long v) {
        GL30C.nglVertexAttribI2iv(index, v);
    }

    @Override
    public void glVertexAttribI2iv(int index, IntBuffer v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    @Override
    public void nglVertexAttribI3iv(int index, long v) {
        GL30C.nglVertexAttribI3iv(index, v);
    }

    @Override
    public void glVertexAttribI3iv(int index, IntBuffer v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    @Override
    public void nglVertexAttribI4iv(int index, long v) {
        GL30C.nglVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, IntBuffer v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    @Override
    public void nglVertexAttribI1uiv(int index, long v) {
        GL30C.nglVertexAttribI1uiv(index, v);
    }

    @Override
    public void glVertexAttribI1uiv(int index, IntBuffer v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    @Override
    public void nglVertexAttribI2uiv(int index, long v) {
        GL30C.nglVertexAttribI2uiv(index, v);
    }

    @Override
    public void glVertexAttribI2uiv(int index, IntBuffer v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    @Override
    public void nglVertexAttribI3uiv(int index, long v) {
        GL30C.nglVertexAttribI3uiv(index, v);
    }

    @Override
    public void glVertexAttribI3uiv(int index, IntBuffer v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    @Override
    public void nglVertexAttribI4uiv(int index, long v) {
        GL30C.nglVertexAttribI4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, IntBuffer v) {
        GL30C.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void nglVertexAttribI4bv(int index, long v) {
        GL30C.nglVertexAttribI4bv(index, v);
    }

    @Override
    public void glVertexAttribI4bv(int index, ByteBuffer v) {
        GL30C.glVertexAttribI4bv(index, v);
    }

    @Override
    public void nglVertexAttribI4sv(int index, long v) {
        GL30C.nglVertexAttribI4sv(index, v);
    }

    @Override
    public void glVertexAttribI4sv(int index, ShortBuffer v) {
        GL30C.glVertexAttribI4sv(index, v);
    }

    @Override
    public void nglVertexAttribI4ubv(int index, long v) {
        GL30C.nglVertexAttribI4ubv(index, v);
    }

    @Override
    public void glVertexAttribI4ubv(int index, ByteBuffer v) {
        GL30C.glVertexAttribI4ubv(index, v);
    }

    @Override
    public void nglVertexAttribI4usv(int index, long v) {
        GL30C.nglVertexAttribI4usv(index, v);
    }

    @Override
    public void glVertexAttribI4usv(int index, ShortBuffer v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    @Override
    public void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GL30C.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void nglGetVertexAttribIiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribIi(int index, int pname) {
        return GL30C.glGetVertexAttribIi(index, pname);
    }

    @Override
    public void nglGetVertexAttribIuiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribIui(int index, int pname) {
        return GL30C.glGetVertexAttribIui(index, pname);
    }

    @Override
    public void glUniform1ui(int location, int v0) {
        GL30C.glUniform1ui(location, v0);
    }

    @Override
    public void glUniform2ui(int location, int v0, int v1) {
        GL30C.glUniform2ui(location, v0, v1);
    }

    @Override
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GL30C.glUniform3ui(location, v0, v1, v2);
    }

    @Override
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GL30C.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override
    public void nglUniform1uiv(int location, int count, long value) {
        GL30C.nglUniform1uiv(location, count, value);
    }

    @Override
    public void glUniform1uiv(int location, IntBuffer value) {
        GL30C.glUniform1uiv(location, value);
    }

    @Override
    public void nglUniform2uiv(int location, int count, long value) {
        GL30C.nglUniform2uiv(location, count, value);
    }

    @Override
    public void glUniform2uiv(int location, IntBuffer value) {
        GL30C.glUniform2uiv(location, value);
    }

    @Override
    public void nglUniform3uiv(int location, int count, long value) {
        GL30C.nglUniform3uiv(location, count, value);
    }

    @Override
    public void glUniform3uiv(int location, IntBuffer value) {
        GL30C.glUniform3uiv(location, value);
    }

    @Override
    public void nglUniform4uiv(int location, int count, long value) {
        GL30C.nglUniform4uiv(location, count, value);
    }

    @Override
    public void glUniform4uiv(int location, IntBuffer value) {
        GL30C.glUniform4uiv(location, value);
    }

    @Override
    public void nglGetUniformuiv(int program, int location, long params) {
        GL30C.nglGetUniformuiv(program, location, params);
    }

    @Override
    public void glGetUniformuiv(int program, int location, IntBuffer params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    @Override
    public int glGetUniformui(int program, int location) {
        return GL30C.glGetUniformui(program, location);
    }

    @Override
    public void nglBindFragDataLocation(int program, int colorNumber, long name) {
        GL30C.nglBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public int nglGetFragDataLocation(int program, long name) {
        return GL30C.nglGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, ByteBuffer name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, CharSequence name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    @Override
    public void glBeginConditionalRender(int id, int mode) {
        GL30C.glBeginConditionalRender(id, mode);
    }

    @Override
    public void glEndConditionalRender() {
        GL30C.glEndConditionalRender();
    }

    @Override
    public long nglMapBufferRange(int target, long offset, long length, int access) {
        return GL30C.nglMapBufferRange(target, offset, length, access);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return GL30C.glMapBufferRange(target, offset, length, access);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
        return GL30C.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override
    public void glFlushMappedBufferRange(int target, long offset, long length) {
        GL30C.glFlushMappedBufferRange(target, offset, length);
    }

    @Override
    public void glClampColor(int target, int clamp) {
        GL30C.glClampColor(target, clamp);
    }

    @Override
    public boolean glIsRenderbuffer(int renderbuffer) {
        return GL30C.glIsRenderbuffer(renderbuffer);
    }

    @Override
    public void glBindRenderbuffer(int target, int renderbuffer) {
        GL30C.glBindRenderbuffer(target, renderbuffer);
    }

    @Override
    public void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GL30C.nglDeleteRenderbuffers(n, renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(int renderbuffer) {
        GL30C.glDeleteRenderbuffers(renderbuffer);
    }

    @Override
    public void nglGenRenderbuffers(int n, long renderbuffers) {
        GL30C.nglGenRenderbuffers(n, renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(IntBuffer renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public int glGenRenderbuffers() {
        return GL30C.glGenRenderbuffers();
    }

    @Override
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        GL30C.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override
    public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        GL30C.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override
    public void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GL30C.nglGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        GL30C.glGetRenderbufferParameteri(target, pname);
    }

    @Override
    public int glGetRenderbufferParameteri(int target, int pname) {
        return GL30C.glGetRenderbufferParameteri(target, pname);
    }

    @Override
    public boolean glIsFramebuffer(int framebuffer) {
        return GL30C.glIsFramebuffer(framebuffer);
    }

    @Override
    public void glBindFramebuffer(int target, int framebuffer) {
        GL30C.glBindFramebuffer(target, framebuffer);
    }

    @Override
    public void nglDeleteFramebuffers(int n, long framebuffers) {
        GL30C.nglDeleteFramebuffers(n, framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(IntBuffer framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(int framebuffer) {
        GL30C.glDeleteFramebuffers(framebuffer);
    }

    @Override
    public void nglGenFramebuffers(int n, long framebuffers) {
        GL30C.nglGenFramebuffers(n, framebuffers);
    }

    @Override
    public void glGenFramebuffers(IntBuffer framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    @Override
    public int glGenFramebuffers() {
        return GL30C.glGenFramebuffers();
    }

    @Override
    public int glCheckFramebufferStatus(int target) {
        return GL30C.glCheckFramebufferStatus(target);
    }

    @Override
    public void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
        GL30C.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        GL30C.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
        GL30C.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    @Override
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GL30C.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GL30C.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override
    public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GL30C.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return GL30C.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override
    public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        GL30C.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override
    public void glGenerateMipmap(int target) {
        GL30C.glGenerateMipmap(target);
    }

    @Override
    public void nglTexParameterIiv(int target, int pname, long params) {
        GL30C.nglTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIiv(int target, int pname, IntBuffer params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIi(int target, int pname, int param) {
        GL30C.glTexParameterIi(target, pname, param);
    }

    @Override
    public void nglTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glTexParameterIuiv(int target, int pname, IntBuffer params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glTexParameterIui(int target, int pname, int param) {
        GL30C.glTexParameterIui(target, pname, param);
    }

    @Override
    public void nglGetTexParameterIiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    @Override
    public int glGetTexParameterIi(int target, int pname) {
        return GL30C.glGetTexParameterIi(target, pname);
    }

    @Override
    public void nglGetTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public int glGetTexParameterIui(int target, int pname) {
        return GL30C.glGetTexParameterIui(target, pname);
    }

    @Override
    public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
        GL30C.glColorMaski(buf, r, g, b, a);
    }

    @Override
    public void nglGetBooleani_v(int target, int index, long data) {
        GL30C.nglGetBooleani_v(target, index, data);
    }

    @Override
    public void glGetBooleani_v(int target, int index, ByteBuffer data) {
        GL30C.glGetBooleani_v(target, index, data);
    }

    @Override
    public boolean glGetBooleani(int target, int index) {
        return GL30C.glGetBooleani(target, index);
    }

    @Override
    public void nglGetIntegeri_v(int target, int index, long data) {
        GL30C.nglGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, IntBuffer data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    @Override
    public int glGetIntegeri(int target, int index) {
        return GL30C.glGetIntegeri(target, index);
    }

    @Override
    public void glEnablei(int cap, int index) {
        GL30C.glEnablei(cap, index);
    }

    @Override
    public void glDisablei(int target, int index) {
        GL30C.glDisablei(target, index);
    }

    @Override
    public boolean glIsEnabledi(int target, int index) {
        return GL30C.glIsEnabledi(target, index);
    }

    @Override
    public void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        GL30C.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override
    public void glBindBufferBase(int target, int index, int buffer) {
        GL30C.glBindBufferBase(target, index, buffer);
    }

    @Override
    public void glBeginTransformFeedback(int primitiveMode) {
        GL30C.glBeginTransformFeedback(primitiveMode);
    }

    @Override
    public void glEndTransformFeedback() {
        GL30C.glEndTransformFeedback();
    }

    @Override
    public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        GL30C.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override
    public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        GL30C.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GL30C.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return GL30C.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override
    public void glBindVertexArray(int array) {
        GL30C.glBindVertexArray(array);
    }

    @Override
    public void nglDeleteVertexArrays(int n, long arrays) {
        GL30C.nglDeleteVertexArrays(n, arrays);
    }

    @Override
    public void glDeleteVertexArrays(IntBuffer arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(int array) {
        GL30C.glDeleteVertexArrays(array);
    }

    @Override
    public void nglGenVertexArrays(int n, long arrays) {
        GL30C.nglGenVertexArrays(n, arrays);
    }

    @Override
    public void glGenVertexArrays(IntBuffer arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    @Override
    public int glGenVertexArrays() {
        return GL30C.glGenVertexArrays();
    }

    @Override
    public boolean glIsVertexArray(int array) {
        return GL30C.glIsVertexArray(array);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI1iv(int index, int[] v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    @Override
    public void glVertexAttribI2iv(int index, int[] v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    @Override
    public void glVertexAttribI3iv(int index, int[] v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, int[] v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI1uiv(int index, int[] v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    @Override
    public void glVertexAttribI2uiv(int index, int[] v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    @Override
    public void glVertexAttribI3uiv(int index, int[] v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, int[] v) {
        GL30C.glVertexAttrib4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4sv(int index, short[] v) {
        GL30C.glVertexAttrib4sv(index, v);
    }

    @Override
    public void glVertexAttribI4usv(int index, short[] v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, int[] params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glUniform1uiv(int location, int[] value) {
        GL30C.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform2uiv(int location, int[] value) {
        GL30C.glUniform2uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, int[] value) {
        GL30C.glUniform3uiv(location, value);
    }

    @Override
    public void glUniform4uiv(int location, int[] value) {
        GL30C.glUniform4uiv(location, value);
    }

    @Override
    public void glGetUniformuiv(int program, int location, int[] params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glDeleteRenderbuffers(int[] renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(int[] renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glDeleteFramebuffers(int[] framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glGenFramebuffers(int[] framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glTexParameterIiv(int target, int pname, int[] params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIuiv(int target, int pname, int[] params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIiv(int target, int pname, int[] params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIuiv(int target, int pname, int[] params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, int[] data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public void glDeleteVertexArrays(int[] arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glGenVertexArrays(int[] arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    @Override
    public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        GL31C.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    @Override
    public void glVertexAttribDivisor(int index, int divisor) {
        GL33C.glVertexAttribDivisor(index, divisor);
    }
}
