package net.digitalingot.fwebp;

import java.util.Iterator;

class WebPAnimDecoder$1
implements Iterator<WebPAnimFrame> {
    WebPAnimDecoder$1() {
    }

    @Override
    public boolean hasNext() {
        return WebPNative.decoderHasMoreFrames(WebPAnimDecoder.this.nativePointer);
    }

    @Override
    public WebPAnimFrame next() {
        return WebPNative.decoderGetNext(WebPAnimDecoder.this.nativePointer);
    }
}
