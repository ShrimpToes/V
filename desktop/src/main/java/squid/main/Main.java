package squid.main;

import squid.engine.graphics.gl.GL;
import squid.game.DummyGame;
import squid.graphics.Window;
import squid.engine.Game;
import squid.graphics.gl.SquidGL11;
import squid.graphics.gl.SquidGL15;
import squid.graphics.gl.SquidGL20;
import squid.graphics.gl.SquidGL30;

public class Main {

    public static final String name = "Arbitory";

    public static void main(String... args) {
        GL gl = new GL(new SquidGL11(), new SquidGL15(), new SquidGL20(), new SquidGL30());

        new Game(name, new Window(name, 900, 900), new DummyGame(), gl).start();
    }
}