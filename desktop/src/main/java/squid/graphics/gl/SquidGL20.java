package squid.graphics.gl;

import org.lwjgl.opengl.GL20C;
import squid.engine.graphics.gl.GL20;

import java.nio.*;

public class SquidGL20 implements GL20 {
    @Override
    public int glCreateProgram() {
        return GL20C.glCreateProgram();
    }

    @Override
    public void glDeleteProgram(int program) {
        GL20C.glDeleteProgram(program);
    }

    @Override
    public boolean glIsProgram(int program) {
        return GL20C.glIsProgram(program);
    }

    @Override
    public int glCreateShader(int type) {
        return GL20C.glCreateShader(type);
    }

    @Override
    public void glDeleteShader(int shader) {
        GL20C.glDeleteShader(shader);
    }

    @Override
    public boolean glIsShader(int shader) {
        return GL20C.glIsShader(shader);
    }

    @Override
    public void glAttachShader(int program, int shader) {
        GL20C.glAttachShader(program, shader);
    }

    @Override
    public void glDetachShader(int program, int shader) {
        GL20C.glDetachShader(program, shader);
    }

    @Override
    public void nglShaderSource(int shader, int count, long strings, long length) {
        GL20C.nglShaderSource(shader, count, strings, length);
    }

    @Override
    public void glShaderSource(int shader, CharSequence... strings) {
        GL20C.glShaderSource(shader, strings);
    }

    @Override
    public void glShaderSource(int shader, CharSequence string) {
        GL20C.glShaderSource(shader, string);
    }

    @Override
    public void glCompileShader(int shader) {
        GL20C.glCompileShader(shader);
    }

    @Override
    public void glLinkProgram(int program) {
        GL20C.glLinkProgram(program);
    }

    @Override
    public void glUseProgram(int program) {
        GL20C.glUseProgram(program);
    }

    @Override
    public void glValidateProgram(int program) {
        GL20C.glValidateProgram(program);
    }

    @Override
    public void glUniform1f(int location, float v0) {
        GL20C.glUniform1f(location, v0);
    }

    @Override
    public void glUniform2f(int location, float v0, float v1) {
        GL20C.glUniform2f(location, v0, v1);
    }

    @Override
    public void glUniform3f(int location, float v0, float v1, float v2) {
        GL20C.glUniform3f(location, v0, v1, v2);
    }

    @Override
    public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        GL20C.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform1i(int location, int v0) {
        GL20C.glUniform1i(location, v0);
    }

    @Override
    public void glUniform2i(int location, int v0, int v1) {
        GL20C.glUniform2i(location, v0, v1);
    }

    @Override
    public void glUniform3i(int location, int v0, int v1, int v2) {
        GL20C.glUniform3i(location, v0, v1, v2);
    }

    @Override
    public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        GL20C.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override
    public void nglUniform1fv(int location, int count, long value) {
        GL20C.nglUniform1fv(location, count, value);
    }

    @Override
    public void glUniform1fv(int location, FloatBuffer value) {
        GL20C.glUniform1fv(location, value);
    }

    @Override
    public void nglUniform2fv(int location, int count, long value) {
        GL20C.nglUniform2fv(location, count, value);
    }

    @Override
    public void glUniform2fv(int location, FloatBuffer value) {
        GL20C.glUniform2fv(location, value);
    }

    @Override
    public void nglUniform3fv(int location, int count, long value) {
        GL20C.nglUniform3fv(location, count, value);
    }

    @Override
    public void glUniform3fv(int location, FloatBuffer value) {
        GL20C.glUniform3fv(location, value);
    }

    @Override
    public void nglUniform4fv(int location, int count, long value) {
        GL20C.nglUniform4fv(location, count, value);
    }

    @Override
    public void glUniform4fv(int location, FloatBuffer value) {
        GL20C.glUniform4fv(location, value);
    }

    @Override
    public void nglUniform1iv(int location, int count, long value) {
        GL20C.nglUniform1iv(location, count, value);
    }

    @Override
    public void glUniform1iv(int location, IntBuffer value) {
        GL20C.glUniform1iv(location, value);
    }

    @Override
    public void nglUniform2iv(int location, int count, long value) {
        GL20C.nglUniform2iv(location, count, value);
    }

    @Override
    public void glUniform2iv(int location, IntBuffer value) {
        GL20C.glUniform2iv(location, value);
    }

    @Override
    public void nglUniform3iv(int location, int count, long value) {
        GL20C.nglUniform3iv(location, count, value);
    }

    @Override
    public void glUniform3iv(int location, IntBuffer value) {
        GL20C.glUniform3iv(location, value);
    }

    @Override
    public void nglUniform4iv(int location, int count, long value) {
        GL20C.nglUniform4iv(location, count, value);
    }

    @Override
    public void glUniform4iv(int location, IntBuffer value) {
        GL20C.glUniform4iv(location, value);
    }

    @Override
    public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        GL20C.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        GL20C.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        GL20C.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        GL20C.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void nglGetShaderiv(int shader, int pname, long params) {
        GL20C.nglGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        GL20C.glGetShaderiv(shader, pname, params);
    }

    @Override
    public int glGetShaderi(int shader, int pname) {
        return GL20C.glGetShaderi(shader, pname);
    }

    @Override
    public void nglGetProgramiv(int program, int pname, long params) {
        GL20C.nglGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, IntBuffer params) {
        GL20C.glGetProgramiv(program, pname, params);
    }

    @Override
    public int glGetProgrami(int program, int pname) {
        return GL20C.glGetProgrami(program, pname);
    }

    @Override
    public void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        GL20C.nglGetShaderInfoLog(shader, maxLength, length, infoLog);
    }

    @Override
    public void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        GL20C.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader, int maxLength) {
        return GL20C.glGetShaderInfoLog(shader, maxLength);
    }

    @Override
    public String glGetShaderInfoLog(int shader) {
        return GL20C.glGetShaderInfoLog(shader);
    }

    @Override
    public void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        GL20C.nglGetProgramInfoLog(program, maxLength, length, infoLog);
    }

    @Override
    public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        GL20C.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program, int maxLength) {
        return GL20C.glGetProgramInfoLog(program, maxLength);
    }

    @Override
    public String glGetProgramInfoLog(int program) {
        return GL20C.glGetProgramInfoLog(program);
    }

    @Override
    public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        GL20C.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override
    public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        GL20C.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public int nglGetUniformLocation(int program, long name) {
        return GL20C.nglGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, ByteBuffer name) {
        return GL20C.glGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, CharSequence name) {
        return GL20C.glGetUniformLocation(program, name);
    }

    @Override
    public void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        GL20C.nglGetActiveUniform(program, index, maxLength, length, size, type, name);
    }

    @Override
    public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL20C.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return GL20C.glGetActiveUniform(program, index, maxLength, size, type);
    }

    @Override
    public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return GL20C.glGetActiveUniform(program, index, size, type);
    }

    @Override
    public void nglGetUniformfv(int program, int location, long params) {
        GL20C.nglGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformfv(int program, int location, FloatBuffer params) {
        GL20C.glGetUniformfv(program, location, params);
    }

    @Override
    public float glGetUniformf(int program, int location) {
        return GL20C.glGetUniformf(program, location);
    }

    @Override
    public void nglGetUniformiv(int program, int location, long params) {
        GL20C.nglGetUniformiv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, IntBuffer params) {
        GL20C.glGetUniformiv(program, location, params);
    }

    @Override
    public int glGetUniformi(int program, int location) {
        return GL20C.glGetUniformi(program, location);
    }

    @Override
    public void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        GL20C.nglGetShaderSource(shader, maxLength, length, source);
    }

    @Override
    public void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        GL20C.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader, int maxLength) {
        return GL20C.glGetShaderSource(shader, maxLength);
    }

    @Override
    public String glGetShaderSource(int shader) {
        return GL20C.glGetShaderSource(shader);
    }

    @Override
    public void glVertexAttrib1f(int index, float v0) {
        GL20C.glVertexAttrib1f(index, v0);
    }

    @Override
    public void glVertexAttrib1s(int index, short v0) {
        GL20C.glVertexAttrib1s(index, v0);
    }

    @Override
    public void glVertexAttrib1d(int index, double v0) {
        GL20C.glVertexAttrib1d(index, v0);
    }

    @Override
    public void glVertexAttrib2f(int index, float v0, float v1) {
        GL20C.glVertexAttrib2f(index, v0, v1);
    }

    @Override
    public void glVertexAttrib2s(int index, short v0, short v1) {
        GL20C.glVertexAttrib2s(index, v0, v1);
    }

    @Override
    public void glVertexAttrib2d(int index, double v0, double v1) {
        GL20C.glVertexAttrib2d(index, v0, v1);
    }

    @Override
    public void glVertexAttrib3f(int index, float v0, float v1, float v2) {
        GL20C.glVertexAttrib3f(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib3s(int index, short v0, short v1, short v2) {
        GL20C.glVertexAttrib3s(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib3d(int index, double v0, double v1, double v2) {
        GL20C.glVertexAttrib3d(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
        GL20C.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
        GL20C.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
        GL20C.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        GL20C.glVertexAttrib4Nub(index, x, y, z, w);
    }

    @Override
    public void nglVertexAttrib1fv(int index, long v) {
        GL20C.nglVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1fv(int index, FloatBuffer v) {
        GL20C.glVertexAttrib1fv(index, v);
    }

    @Override
    public void nglVertexAttrib1sv(int index, long v) {
        GL20C.nglVertexAttrib1sv(index, v);
    }

    @Override
    public void glVertexAttrib1sv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib1sv(index, v);
    }

    @Override
    public void nglVertexAttrib1dv(int index, long v) {
        GL20C.nglVertexAttrib1sv(index, v);
    }

    @Override
    public void glVertexAttrib1dv(int index, DoubleBuffer v) {
        GL20C.glVertexAttrib1dv(index, v);
    }

    @Override
    public void nglVertexAttrib2fv(int index, long v) {
        GL20C.nglVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, FloatBuffer v) {
        GL20C.glVertexAttrib2fv(index, v);
    }

    @Override
    public void nglVertexAttrib2sv(int index, long v) {
        GL20C.nglVertexAttrib2sv(index, v);
    }

    @Override
    public void glVertexAttrib2sv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib2sv(index, v);
    }

    @Override
    public void nglVertexAttrib2dv(int index, long v) {
        GL20C.nglVertexAttrib2dv(index, v);
    }

    @Override
    public void glVertexAttrib2dv(int index, DoubleBuffer v) {
        GL20C.glVertexAttrib2dv(index, v);
    }

    @Override
    public void nglVertexAttrib3fv(int index, long v) {
        GL20C.nglVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, FloatBuffer v) {
        GL20C.glVertexAttrib3fv(index, v);
    }

    @Override
    public void nglVertexAttrib3sv(int index, long v) {
        GL20C.nglVertexAttrib3sv(index, v);
    }

    @Override
    public void glVertexAttrib3sv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib3sv(index, v);
    }

    @Override
    public void nglVertexAttrib3dv(int index, long v) {
        GL20C.nglVertexAttrib3dv(index, v);
    }

    @Override
    public void glVertexAttrib3dv(int index, DoubleBuffer v) {
        GL20C.glVertexAttrib3dv(index, v);
    }

    @Override
    public void nglVertexAttrib4fv(int index, long v) {
        GL20C.nglVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, FloatBuffer v) {
        GL20C.glVertexAttrib4fv(index, v);
    }

    @Override
    public void nglVertexAttrib4sv(int index, long v) {
        GL20C.nglVertexAttrib4sv(index, v);
    }

    @Override
    public void glVertexAttrib4sv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib4sv(index, v);
    }

    @Override
    public void nglVertexAttrib4dv(int index, long v) {
        GL20C.nglVertexAttrib4dv(index, v);
    }

    @Override
    public void glVertexAttrib4dv(int index, DoubleBuffer v) {
        GL20C.glVertexAttrib4dv(index, v);
    }

    @Override
    public void nglVertexAttrib4iv(int index, long v) {
        GL20C.nglVertexAttrib4iv(index, v);
    }

    @Override
    public void glVertexAttrib4iv(int index, IntBuffer v) {
        GL20C.glVertexAttrib4iv(index, v);
    }

    @Override
    public void nglVertexAttrib4bv(int index, long v) {
        GL20C.nglVertexAttrib4bv(index, v);
    }

    @Override
    public void glVertexAttrib4bv(int index, ByteBuffer v) {
        GL20C.glVertexAttrib4bv(index, v);
    }

    @Override
    public void nglVertexAttrib4ubv(int index, long v) {
        GL20C.nglVertexAttrib4ubv(index, v);
    }

    @Override
    public void glVertexAttrib4ubv(int index, ByteBuffer v) {
        GL20C.glVertexAttrib4ubv(index, v);
    }

    @Override
    public void nglVertexAttrib4usv(int index, long v) {
        GL20C.nglVertexAttrib4usv(index, v);
    }

    @Override
    public void glVertexAttrib4usv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib4usv(index, v);
    }

    @Override
    public void nglVertexAttrib4uiv(int index, long v) {
        GL20C.nglVertexAttrib4uiv(index, v);
    }

    @Override
    public void glVertexAttrib4uiv(int index, IntBuffer v) {
        GL20C.glVertexAttrib4uiv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nbv(int index, long v) {
        GL20C.nglVertexAttrib4Nbv(index, v);
    }

    @Override
    public void glVertexAttrib4Nbv(int index, ByteBuffer v) {
        GL20C.glVertexAttrib4Nbv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nsv(int index, long v) {
        GL20C.nglVertexAttrib4Nsv(index, v);
    }

    @Override
    public void glVertexAttrib4Nsv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib4Nsv(index, v);
    }

    @Override
    public void nglVertexAttrib4Niv(int index, long v) {
        GL20C.nglVertexAttrib4Niv(index, v);
    }

    @Override
    public void glVertexAttrib4Niv(int index, IntBuffer v) {
        GL20C.glVertexAttrib4Niv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nubv(int index, long v) {
        GL20C.nglVertexAttrib4Nubv(index, v);
    }

    @Override
    public void glVertexAttrib4Nubv(int index, ByteBuffer v) {
        GL20C.glVertexAttrib4Nubv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nusv(int index, long v) {
        GL20C.nglVertexAttrib4Nusv(index, v);
    }

    @Override
    public void glVertexAttrib4Nusv(int index, ShortBuffer v) {
        GL20C.glVertexAttrib4Nusv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nuiv(int index, long v) {
        GL20C.nglVertexAttrib4Nuiv(index, v);
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, IntBuffer v) {
        GL20C.glVertexAttrib4Nuiv(index, v);
    }

    @Override
    public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GL20C.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        GL20C.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glEnableVertexAttribArray(int index) {
        GL20C.glEnableVertexAttribArray(index);
    }

    @Override
    public void glDisableVertexAttribArray(int index) {
        GL20C.glDisableVertexAttribArray(index);
    }

    @Override
    public void nglBindAttribLocation(int program, int index, long name) {
        GL20C.nglBindAttribLocation(program, index, name);
    }

    @Override
    public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        GL20C.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glBindAttribLocation(int program, int index, CharSequence name) {
        GL20C.glBindAttribLocation(program, index, name);
    }

    @Override
    public void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        GL20C.nglGetActiveAttrib(program, index, maxLength, length, size, type, name);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GL20C.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return GL20C.glGetActiveAttrib(program, index, maxLength, size, type);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return GL20C.glGetActiveAttrib(program, index, size, type);
    }

    @Override
    public int nglGetAttribLocation(int program, long name) {
        return GL20C.nglGetAttribLocation(program, name);
    }

    @Override
    public int glGetAttribLocation(int program, ByteBuffer name) {
        return GL20C.glGetAttribLocation(program, name);
    }

    @Override
    public int glGetAttribLocation(int program, CharSequence name) {
        return GL20C.glGetAttribLocation(program, name);
    }

    @Override
    public void nglGetVertexAttribiv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        GL20C.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribi(int index, int pname) {
        return GL20C.glGetVertexAttribi(index, pname);
    }

    @Override
    public void nglGetVertexAttribfv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        GL20C.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void nglGetVertexAttribdv(int index, int pname, long params) {
        GL20C.nglGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
        GL20C.glGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        GL20C.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override
    public long glGetVertexAttribPointer(int index, int pname) {
        return GL20C.glGetVertexAttribPointer(index, pname);
    }

    @Override
    public void nglDrawBuffers(int n, long bufs) {
        GL20C.nglDrawBuffers(n, bufs);
    }

    @Override
    public void glDrawBuffers(IntBuffer bufs) {
        GL20C.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(int buf) {
        GL20C.glDrawBuffers(buf);
    }

    @Override
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        GL20C.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override
    public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        GL20C.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        GL20C.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override
    public void glStencilMaskSeparate(int face, int mask) {
        GL20C.glStencilMaskSeparate(face, mask);
    }

    @Override
    public void glUniform1fv(int location, float[] value) {
        GL20C.glUniform1fv(location, value);
    }

    @Override
    public void glUniform2fv(int location, float[] value) {
        GL20C.glUniform2fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, float[] value) {
        GL20C.glUniform3fv(location, value);
    }

    @Override
    public void glUniform4fv(int location, float[] value) {
        GL20C.glUniform4fv(location, value);
    }

    @Override
    public void glUniform1iv(int location, int[] value) {
        GL20C.glUniform1iv(location, value);
    }

    @Override
    public void glUniform2iv(int location, int[] value) {
        GL20C.glUniform2iv(location, value);
    }

    @Override
    public void glUniform3iv(int location, int[] value) {
        GL20C.glUniform3iv(location, value);
    }

    @Override
    public void glUniform4iv(int location, int[] value) {
        GL20C.glUniform4iv(location, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        GL20C.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        GL20C.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        GL20C.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, int[] params) {
        GL20C.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, int[] params) {
        GL20C.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog) {
        GL20C.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog) {
        GL20C.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public void glGetAttachedShaders(int program, int[] count, int[] shaders) {
        GL20C.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL20C.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public void glGetUniformfv(int program, int location, float[] params) {
        GL20C.glGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, int[] params) {
        GL20C.glGetUniformiv(program, location, params);
    }

    @Override
    public void glGetShaderSource(int shader, int[] length, ByteBuffer source) {
        GL20C.glGetShaderSource(shader, length, source);
    }

    @Override
    public void glVertexAttrib1fv(int index, float[] v) {
        GL20C.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1sv(int index, short[] v) {
        GL20C.glVertexAttrib1sv(index, v);
    }

    @Override
    public void glVertexAttrib1dv(int index, double[] v) {
        GL20C.glVertexAttrib1dv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, float[] v) {
        GL20C.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2sv(int index, short[] v) {
        GL20C.glVertexAttrib2sv(index, v);
    }

    @Override
    public void glVertexAttrib2dv(int index, double[] v) {
        GL20C.glVertexAttrib2dv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, float[] v) {
        GL20C.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3sv(int index, short[] v) {
        GL20C.glVertexAttrib3sv(index, v);
    }

    @Override
    public void glVertexAttrib3dv(int index, double[] v) {
        GL20C.glVertexAttrib3dv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, float[] v) {
        GL20C.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4sv(int index, short[] v) {
        GL20C.glVertexAttrib4sv(index, v);
    }

    @Override
    public void glVertexAttrib4dv(int index, double[] v) {
        GL20C.glVertexAttrib4dv(index, v);
    }

    @Override
    public void glVertexAttrib4iv(int index, int[] v) {
        GL20C.glVertexAttrib4iv(index, v);
    }

    @Override
    public void glVertexAttrib4usv(int index, short[] v) {
        GL20C.glVertexAttrib4usv(index, v);
    }

    @Override
    public void glVertexAttrib4uiv(int index, int[] v) {
        GL20C.glVertexAttrib4uiv(index, v);
    }

    @Override
    public void glVertexAttrib4Nsv(int index, short[] v) {
        GL20C.glVertexAttrib4Nsv(index, v);
    }

    @Override
    public void glVertexAttrib4Niv(int index, int[] v) {
        GL20C.glVertexAttrib4Niv(index, v);
    }

    @Override
    public void glVertexAttrib4Nusv(int index, short[] v) {
        GL20C.glVertexAttrib4Nusv(index, v);
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, int[] v) {
        GL20C.glVertexAttrib4Nuiv(index, v);
    }

    @Override
    public void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GL20C.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, int[] params) {
        GL20C.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, float[] params) {
        GL20C.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribdv(int index, int pname, double[] params) {
        GL20C.glGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void glDrawBuffers(int[] bufs) {
        GL20C.glDrawBuffers(bufs);
    }

    @Override
    public void glActiveTexture(int texture) {
        GL20C.glActiveTexture(texture);
    }
}
