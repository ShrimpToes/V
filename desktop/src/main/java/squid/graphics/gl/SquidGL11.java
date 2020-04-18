package squid.graphics.gl;

import org.lwjgl.opengl.GL11C;
import squid.engine.graphics.gl.GL11;

import java.nio.*;

public class SquidGL11 implements GL11 {
    @Override
    public void glEnable(int target) {
        GL11C.glEnable(target);
    }

    @Override
    public void glDisable(int target) {
        GL11C.glDisable(target);
    }

    @Override
    public void glBindTexture(int target, int texture) {
        GL11C.glBindTexture(target, texture);
    }

    @Override
    public void glBlendFunc(int sfactor, int dfactor) {
        GL11C.glBlendFunc(sfactor, dfactor);
    }

    @Override
    public void glClear(int mask) {
        GL11C.glClear(mask);
    }

    @Override
    public void glClearColor(float red, float green, float blue, float alpha) {
        GL11C.glClearColor(red, green, blue, alpha);
    }

    @Override
    public void glClearDepth(double depth) {
        GL11C.glClearDepth(depth);
    }

    @Override
    public void glClearStencil(int s) {
        GL11C.glClearStencil(s);
    }

    @Override
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GL11C.glColorMask(red, green, blue, alpha);
    }

    @Override
    public void glCullFace(int mode) {
        GL11C.glCullFace(mode);
    }

    @Override
    public void glDepthFunc(int func) {
        GL11C.glDepthFunc(func);
    }

    @Override
    public void glDepthMask(boolean flag) {
        GL11C.glDepthMask(flag);
    }

    @Override
    public void glDepthRange(double zNear, double zFar) {
        GL11C.glDepthRange(zNear, zFar);
    }

    @Override
    public void glDrawArrays(int mode, int first, int count) {
        GL11C.glDrawArrays(mode, first, count);
    }

    @Override
    public void glDrawBuffer(int buf) {
        GL11C.glDrawBuffer(buf);
    }

    @Override
    public void nglDrawElements(int mode, int count, int type, long indices) {
        GL11C.nglDrawElements(mode, count, type, indices);
    }

    @Override
    public void glDrawElements(int mode, int count, int type, long indices) {
        GL11C.glDrawElements(mode, count, type, indices);
    }

    @Override
    public void glDrawElements(int mode, int type, ByteBuffer indices) {
        GL11C.glDrawElements(mode, type, indices);
    }

    @Override
    public void glDrawElements(int mode, ByteBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, ShortBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    @Override
    public void glDrawElements(int mode, IntBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    @Override
    public void glFinish() {
        GL11C.glFinish();
    }

    @Override
    public void glFlush() {
        GL11C.glFlush();
    }

    @Override
    public void glFrontFace(int dir) {
        GL11C.glFrontFace(dir);
    }

    @Override
    public void nglGenTextures(int n, long textures) {
        GL11C.nglGenTextures(n, textures);
    }

    @Override
    public void glGenTextures(IntBuffer textures) {
        GL11C.glGenTextures(textures);
    }

    @Override
    public int glGenTextures() {
        return GL11C.glGenTextures();
    }

    @Override
    public void nglDeleteTextures(int n, long textures) {
        GL11C.nglDeleteTextures(n, textures);
    }

    @Override
    public void glDeleteTextures(IntBuffer textures) {
        GL11C.glDeleteTextures(textures);
    }

    @Override
    public void glDeleteTextures(int texture) {
        GL11C.glDeleteTextures(texture);
    }

    @Override
    public void nglGetBooleanv(int pname, long params) {
        GL11C.nglGetBooleanv(pname, params);
    }

    @Override
    public void glGetBooleanv(int pname, ByteBuffer params) {
        GL11C.glGetBooleanv(pname, params);
    }

    @Override
    public boolean glGetBoolean(int pname) {
        return GL11C.glGetBoolean(pname);
    }

    @Override
    public void nglGetFloatv(int pname, long params) {
        GL11C.nglGetFloatv(pname, params);
    }

    @Override
    public void glGetFloatv(int pname, FloatBuffer params) {
        GL11C.glGetFloatv(pname, params);
    }

    @Override
    public float glGetFloat(int pname) {
        return GL11C.glGetFloat(pname);
    }

    @Override
    public void nglGetIntegerv(int pname, long params) {
        GL11C.nglGetIntegerv(pname, params);
    }

    @Override
    public void glGetIntegerv(int pname, IntBuffer params) {
        GL11C.glGetIntegerv(pname, params);
    }

    @Override
    public int glGetInteger(int pname) {
        return GL11C.glGetInteger(pname);
    }

    @Override
    public void nglGetDoublev(int pname, long params) {
        GL11C.nglGetDoublev(pname, params);
    }

    @Override
    public void glGetDoublev(int pname, DoubleBuffer params) {
        GL11C.glGetDoublev(pname, params);
    }

    @Override
    public double glGetDouble(int pname) {
        return GL11C.glGetDouble(pname);
    }

    @Override
    public int glGetError() {
        return GL11C.glGetError();
    }

    @Override
    public void nglGetPointerv(int pname, long params) {
        GL11C.nglGetPointerv(pname, params);
    }

    @Override
    public long glGetPointer(int pname) {
        return GL11C.glGetPointer(pname);
    }

    @Override
    public long nglGetString(int name) {
        return GL11C.nglGetString(name);
    }

    @Override
    public String glGetString(int name) {
        return GL11C.glGetString(name);
    }

    @Override
    public void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        GL11C.nglGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, long pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        GL11C.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override
    public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
        GL11C.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override
    public int glGetTexLevelParameteri(int target, int level, int pname) {
        return GL11C.glGetTexLevelParameteri(target, level, pname);
    }

    @Override
    public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        GL11C.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override
    public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
        GL11C.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override
    public float glGetTexLevelParameterf(int target, int level, int pname) {
        return GL11C.glGetTexLevelParameterf(target, level, pname);
    }

    @Override
    public void nglGetTexParameteriv(int target, int pname, long params) {
        GL11C.nglGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        GL11C.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public int glGetTexParameteri(int target, int pname) {
        return glGetTexParameteri(target, pname);
    }

    @Override
    public void nglGetTexParameterfv(int target, int pname, long params) {
        GL11C.nglGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        GL11C.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public float glGetTexParameterf(int target, int pname) {
        return GL11C.glGetTexParameterf(target, pname);
    }

    @Override
    public void glHint(int target, int hint) {
        GL11C.glHint(target, hint);
    }

    @Override
    public boolean glIsEnabled(int cap) {
        return GL11C.glIsEnabled(cap);
    }

    @Override
    public boolean glIsTexture(int texture) {
        return GL11C.glIsEnabled(texture);
    }

    @Override
    public void glLineWidth(float width) {
        GL11C.glLineWidth(width);
    }

    @Override
    public void glLogicOp(int op) {
        GL11C.glLogicOp(op);
    }

    @Override
    public void glPixelStorei(int pname, int param) {
        GL11C.glPixelStorei(pname, param);
    }

    @Override
    public void glPixelStoref(int pname, float param) {
        GL11C.glPixelStoref(pname, param);
    }

    @Override
    public void glPointSize(float size) {
        GL11C.glPointSize(size);
    }

    @Override
    public void glPolygonMode(int face, int mode) {
        GL11C.glPolygonMode(face, mode);
    }

    @Override
    public void glPolygonOffset(float factor, float units) {
        GL11C.glPolygonOffset(factor, units);
    }

    @Override
    public void glReadBuffer(int src) {
        GL11C.glReadBuffer(src);
    }

    @Override
    public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GL11C.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glScissor(int x, int y, int width, int height) {
        GL11C.glScissor(x, y, width, height);
    }

    @Override
    public void glStencilFunc(int func, int ref, int mask) {
        GL11C.glStencilFunc(func, ref, mask);
    }

    @Override
    public void glStencilMask(int mask) {
        GL11C.glStencilMask(mask);
    }

    @Override
    public void glStencilOp(int sfail, int dpfail, int dppass) {
        GL11C.glStencilOp(sfail, dpfail, dppass);
    }

    @Override
    public void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        GL11C.nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        GL11C.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    @Override
    public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        GL11C.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    @Override
    public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        GL11C.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    @Override
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GL11C.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        GL11C.glTexParameteri(target, pname, param);
    }

    @Override
    public void nglTexParameteriv(int target, int pname, long params) {
        GL11C.nglTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameteriv(int target, int pname, IntBuffer params) {
        GL11C.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameterf(int target, int pname, float param) {
        GL11C.glTexParameterf(target, pname, param);
    }

    @Override
    public void nglTexParameterfv(int target, int pname, long params) {
        GL11C.nglTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        GL11C.glTexParameterfv(target, pname, params);
    }

    @Override
    public void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        GL11C.nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL11C.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glViewport(int x, int y, int w, int h) {
        GL11C.glViewport(x, y, w, h);
    }

    @Override
    public void glGenTextures(int[] textures) {
        GL11C.glGenTextures(textures);
    }

    @Override
    public void glDeleteTextures(int[] textures) {
        GL11C.glDeleteTextures(textures);
    }

    @Override
    public void glGetFloatv(int pname, float[] params) {
        GL11C.glGetFloatv(pname, params);
    }

    @Override
    public void glGetIntegerv(int pname, int[] params) {
        GL11C.glGetIntegerv(pname, params);
    }

    @Override
    public void glGetDoublev(int pname, double[] params) {
        GL11C.glGetDoublev(pname, params);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, short[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, int[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, float[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, double[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    @Override
    public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
        GL11C.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override
    public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
        GL11C.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, int[] params) {
        GL11C.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, float[] params) {
        GL11C.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexParameteriv(int target, int pname, int[] params) {
        GL11C.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameterfv(int target, int pname, float[] params) {
        GL11C.glTexParameterfv(target, pname, params);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }
}
