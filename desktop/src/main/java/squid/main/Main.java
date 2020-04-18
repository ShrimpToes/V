package squid.main;

import squid.game.DummyGame;
import squid.graphics.Window;
import squid.engine.Game;

public class Main {

    public static final String name = "Arbitory";

    public static void main(String... args) {
        new Game(name, new Window(name, 900, 900), new DummyGame()).start();
    }
}