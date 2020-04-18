package squid.engine;

import squid.engine.utils.MouseInput;

public interface IGame {
    void init() throws Exception;

    void input(IWindow IWindow, MouseInput mouseInput);

    void update(float interval, MouseInput mouseInput);

    void render(IWindow IWindow) throws Exception;

    void cleanup();
}
