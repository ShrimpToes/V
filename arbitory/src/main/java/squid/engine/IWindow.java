package squid.engine;

public interface IWindow {

    void clear();

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
