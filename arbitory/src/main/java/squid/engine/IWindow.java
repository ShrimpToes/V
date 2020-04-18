package squid.engine;

import static org.lwjgl.opengl.GL11C.*;

public interface IWindow {

    static void clear() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    }

    int getWidth();

    int getHeight();

    void init();

    void update();

    void exit();

    boolean shouldExit();

    void setResized(boolean resized);

    boolean isKeyPressed(int keyCode);

    boolean isResized();

    void setClearColor(float r, float g, float b, float alpha);

    long getWindowHandle();
}
