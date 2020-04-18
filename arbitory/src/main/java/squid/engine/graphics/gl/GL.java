package squid.engine.graphics.gl;

public class GL {
    public final GL11 gl11;
    public final GL15 gl15;
    public final GL20 gl20;
    public final GL30 gl30;

    public GL(GL11 gl11, GL15 gl15, GL20 gl20, GL30 gl30) {
        this.gl11 = gl11;
        this.gl15 = gl15;
        this.gl20 = gl20;
        this.gl30 = gl30;
    }
}
