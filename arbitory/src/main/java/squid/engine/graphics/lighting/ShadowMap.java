package squid.engine.graphics.lighting;

import squid.engine.Game;
import squid.engine.graphics.gl.GL11;
import squid.engine.graphics.gl.GL30;
import squid.engine.graphics.textures.Texture;

import static squid.engine.graphics.gl.GL11.*;
import static squid.engine.graphics.gl.GL30.*;

public class ShadowMap {

    public static final int SHADOW_MAP_WIDTH = 1024;

    public static final int SHADOW_MAP_HEIGHT = 1024;

    private final int depthMapFBO;

    private final Texture depthMap;

    private final GL11 gl11 = Game.gl.gl11;
    private final GL30 gl30 = Game.gl.gl30;

    public ShadowMap() throws Exception {

        depthMapFBO = gl30.glGenFramebuffers();

        depthMap = new Texture(SHADOW_MAP_WIDTH, SHADOW_MAP_HEIGHT, GL_DEPTH_COMPONENT);

        gl30.glBindFramebuffer(GL_FRAMEBUFFER, depthMapFBO);
        gl30.glFramebufferTexture2D(GL_FRAMEBUFFER, GL_DEPTH_ATTACHMENT, GL_TEXTURE_2D, depthMap.getId(), 0);

        gl11.glDrawBuffer(GL_NONE);
        gl11.glReadBuffer(GL_NONE);

        if (gl30.glCheckFramebufferStatus(GL_FRAMEBUFFER) != GL_FRAMEBUFFER_COMPLETE) {
            throw new Exception("Could not create FrameBuffer");
        }

        gl30.glBindFramebuffer(GL_FRAMEBUFFER, 0);
    }

    public Texture getDepthMap() {
        return depthMap;
    }

    public int getDepthMapFBO() {
        return depthMapFBO;
    }

    public void cleanup() {
        gl30.glDeleteFramebuffers(depthMapFBO);
        depthMap.cleanup();
    }
}
