package net.digitalingot.fwebp;

import java.nio.ByteBuffer;

public final class WebPAnimFrame {
    private ByteBuffer pixels;
    private int duration;

    private WebPAnimFrame() {
    }

    public ByteBuffer getPixels() {
        return this.pixels;
    }

    public int getDuration() {
        return this.duration;
    }
}
