package squid.engine;

import squid.game.DummyGame;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        new Game("game", new Window("game", 900, 900), new DummyGame()).start();

    }
}
