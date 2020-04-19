package squid.main;

import squid.engine.graphics.gl.GL;
import squid.game.DummyGame;
import squid.graphics.Window;
import squid.engine.Game;
import squid.graphics.gl.SquidGL11;

public class Main {

    public static final String name = "Arbitory";

    public static void main(String... args) {
        GL gl = new GL(new SquidGL11(), null, null, null);

        new Game(name, new Window(name, 900, 900), new DummyGame(), gl).start();
    }
}