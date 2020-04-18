package squid.engine;

import squid.engine.graphics.gl.GL;
import squid.engine.graphics.gl.GL11;
import squid.engine.utils.MouseInput;
import squid.engine.Window;
import squid.engine.IGame;

public class Game implements Runnable{

    public static double msPerFrame = 20d;
    public static double msPerTick = 50d;
    public String name;
    private IWindow window;
    private MouseInput mouseInput;
    private final Thread gameThread;
    private final IGame game;

    public static GL gl;

    public Game(String name, IWindow window, IGame game, GL gl) {
        Game.gl = gl;
        this.name = name;
        this.window = window;
        mouseInput = new MouseInput();
        this.game = game;
        gameThread = new Thread(this, name + "_thread");
    }

    private void init() throws Exception {
        window.init();
        mouseInput.init(window);
        game.init();
    }

    protected void input() {
        mouseInput.input(window);
        game.input(window, mouseInput);
    }

    protected void update(float interval) {
        game.update(interval, mouseInput);
    }

    protected void render() throws Exception {
        game.render(window);
        window.update();
    }

    protected void cleanup() {
        game.cleanup();
    }

    private void exit() {
        window.exit();
    }

    private boolean shouldExit() {
        return window.shouldExit();
    }

    private void loop() throws Exception {

        double prevTime = System.currentTimeMillis();
        double steps = 0d;

        while (!shouldExit()) {
            double loopStart = System.currentTimeMillis();
            double elapsed = loopStart - prevTime;
            prevTime = System.currentTimeMillis();
            steps += elapsed;

            input();

            while (steps >= msPerTick) {
                update((float) msPerTick);
                steps -= msPerTick;
            }

            render();

//            sync(loopStart);
        }
    }

    private static void sync(double loopStartTime) {
        double endTime = loopStartTime + msPerFrame;
        while(System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ie) {}
        }
    }

    public void start() {
        gameThread.start();
    }

    @Override
    public void run() {
        try {
            init();
            loop();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exit();
            cleanup();
        }
    }
}
