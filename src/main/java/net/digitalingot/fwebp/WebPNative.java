package net.digitalingot.fwebp;

final class WebPNative {
    WebPNative() {
    }

    static native boolean isWebP(byte[] var0);

    static native long createDecoder(byte[] var0);

    static native void destroyDecoder(long var0);

    static native WebPAnimInfo decoderGetInfo(long var0);

    static native boolean decoderHasMoreFrames(long var0);

    static native WebPAnimFrame decoderGetNext(long var0);

    static native void decoderReset(long var0);

    static {
        System.loadLibrary("fwebp");
    }
}
