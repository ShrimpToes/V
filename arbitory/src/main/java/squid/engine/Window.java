package squid.engine;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryStack;

import java.nio.IntBuffer;

import static java.sql.Types.NULL;
import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.opengl.GL.createCapabilities;

public class Window implements IWindow {
    private long window;
    private String name;
    private static int  width = 900;
    private static int height = 900;
    private boolean resized;

    public Window(String name, int width, int height) {
        this.name = name;
        Window.width = width;
        Window.height = height;
        resized = false;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void init() {
        System.out.println("LWJGL " + Version.getVersion());
        GLFWErrorCallback.createPrint(System.err).set();

        if ( !glfwInit() ) throw new IllegalStateException("Unable to initialize GLFW");

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        window = glfwCreateWindow(width, height, name, NULL, NULL);
        if ( window == NULL) throw new RuntimeException("Failed to create the GLFW window");

        glfwSetFramebufferSizeCallback(window, (window, width, height) -> {
            Window.width = width;
            Window.height = height;
            this.setResized(true);
        });

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if ( key == GLFW_KEY_ESCAPE && action == GLFW_PRESS )
                glfwSetWindowShouldClose(window, true);
        });

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer p_width = stack.mallocInt(1);
            IntBuffer p_height = stack.mallocInt(1);

            glfwGetWindowSize(window, p_width, p_height);

            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            glfwSetWindowPos(
                    window,
                    (vidmode.width() - p_width.get(0)) / 2,
                    (vidmode.height() - p_height.get(0)) / 2
            );
        }

        glfwMakeContextCurrent(window);

        glfwSwapInterval(1);

        glfwShowWindow(window);

        createCapabilities();

        glEnable(GL_DEPTH_TEST);
        glEnable(GL_TEXTURE_2D);
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
//        glEnable(GL_CULL_FACE);
        glCullFace(GL_BACK);

        setClearColor(0.5f, 0.5f, 0.5f, 1f);
    }

    @Override
    public void update() {
        glfwSwapBuffers(window);
        glfwPollEvents();
    }

    @Override
    public void exit() {

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    @Override
    public boolean shouldExit() {
        return glfwWindowShouldClose(window);
    }

    @Override
    public void setResized(boolean resized) {
        this.resized = resized;
    }

    @Override
    public boolean isKeyPressed(int keyCode) {
        return glfwGetKey(window, keyCode) == GLFW_PRESS;
    }

    @Override
    public boolean isResized() {
        return resized;
    }

    @Override
    public void setClearColor(float r, float g, float b, float alpha) {
        glClearColor(r, g, b, alpha);
    }

    @Override
    public long getWindowHandle() {
        return window;
    }
}
