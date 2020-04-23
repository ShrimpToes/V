package squid.engine.graphics.textures;

import squid.engine.Game;
import squid.engine.graphics.gl.GL11;
import squid.engine.graphics.gl.GL30;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static squid.engine.graphics.gl.GL11.*;
import static squid.engine.graphics.gl.GL15.GL_CLAMP_TO_EDGE;

import static org.lwjgl.stb.STBImage.*;
import org.lwjgl.system.MemoryStack;

public class Texture {

    private final int id;
    private final int width;
    private final int height;
    private final String name;
    private int rows, cols = 1;

    private final GL11 gl11 = Game.gl.gl11;
    private final GL30 gl30 = Game.gl.gl30;

    public Texture(String fileName) throws Exception {
        this.name = fileName;
        ByteBuffer buf;

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer w = stack.mallocInt(1);
            IntBuffer h = stack.mallocInt(1);
            IntBuffer channels = stack.mallocInt(1);

            buf = stbi_load(fileName, w, h, channels, 4);
            if (buf == null) {
                throw new Exception("Image file [" + fileName + "] not loaded: " + stbi_failure_reason());
            }

            width = w.get();
            height = h.get();
        }

        this.id = createTexture(buf);
    }

    public Texture(String fileName, int rows, int cols) throws Exception {
        this(fileName);
        this.rows = rows;
        this.cols = cols;
    }

    public Texture(int width, int height, int pixelFormat) throws Exception {
        this.name = "empty_texture";
        this.id = gl11.glGenTextures();
        this.width = width;
        this.height = height;
        gl11.glBindTexture(GL_TEXTURE_2D, this.id);
        gl11.glTexImage2D(GL_TEXTURE_2D, 0, GL_DEPTH_COMPONENT, this.width, this.height,
                0, pixelFormat, GL_FLOAT, (ByteBuffer) null);
        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
    }

    public Texture(ByteBuffer imageBuffer) throws Exception {
        this.name = "imageBuffer";
        ByteBuffer buf;
        // Load Texture file
        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer w = stack.mallocInt(1);
            IntBuffer h = stack.mallocInt(1);
            IntBuffer channels = stack.mallocInt(1);

            buf = stbi_load_from_memory(imageBuffer, w, h, channels, 4);
            if (buf == null) {
                throw new Exception("Image file not loaded: " + stbi_failure_reason());
            }

            width = w.get();
            height = h.get();
        }

        this.id = createTexture(buf);

        stbi_image_free(buf);
    }

    private int createTexture(ByteBuffer buf) {
        // Create a new OpenGL texture
        int textureId = gl11.glGenTextures();
        // Bind the texture
        gl11.glBindTexture(GL_TEXTURE_2D, textureId);

        // Tell OpenGL how to unpack the RGBA bytes. Each component is 1 byte size
        gl11.glPixelStorei(GL_UNPACK_ALIGNMENT, 1);

        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
        gl11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

        // Upload the texture data
        gl11.glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0,
                GL_RGBA, GL_UNSIGNED_BYTE, buf);
        // Generate Mip Map
        gl30.glGenerateMipmap(GL_TEXTURE_2D);

        return textureId;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void cleanup() {
        gl11.glDeleteTextures(id);
    }

}
