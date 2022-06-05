package net.digitalingot.fwebp;

public final class WebPImage {
    final byte[] bytes;

    public WebPImage(byte[] bytes) throws WebPException {
        if (bytes == null || !WebPNative.isWebP(bytes)) {
            throw new WebPException("Invalid WebP image data");
        }
        this.bytes = bytes;
    }
}
