package net.digitalingot.fwebp;

import java.util.Iterator;

public final class WebPAnimDecoder
implements AutoCloseable,
Iterable<WebPAnimFrame> {
    private long nativePointer;
    private final WebPAnimInfo info;

    public WebPAnimDecoder(WebPImage image) {
        this.nativePointer = WebPNative.createDecoder(image.bytes);
        if (this.nativePointer == 0L) {
            throw new IllegalArgumentException("Invalid WebP image data");
        }
        this.info = WebPNative.decoderGetInfo(this.nativePointer);
    }

    public WebPAnimInfo getInfo() {
        return this.info;
    }

    public void reset() {
        this.checkState();
        WebPNative.decoderReset(this.nativePointer);
    }

    @Override
    public void close() {
        this.checkState();
        WebPNative.destroyDecoder(this.nativePointer);
        this.nativePointer = 0L;
    }

    @Override
    public Iterator<WebPAnimFrame> iterator() {
        this.checkState();
        return new Iterator<WebPAnimFrame>(){

            @Override
            public boolean hasNext() {
                return WebPNative.decoderHasMoreFrames(WebPAnimDecoder.this.nativePointer);
            }

            @Override
            public WebPAnimFrame next() {
                return WebPNative.decoderGetNext(WebPAnimDecoder.this.nativePointer);
            }
        };
    }

    private void checkState() {
        if (this.nativePointer == 0L) {
            throw new IllegalStateException("Decoder is closed");
        }
    }
}
