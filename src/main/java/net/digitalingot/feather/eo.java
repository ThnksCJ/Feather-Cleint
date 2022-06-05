package net.digitalingot.feather;

import org.jitsi.impl.neomedia.codec.audio.opus.Opus;

import java.io.Closeable;

public class eo
implements Closeable {
    private final long As = Opus.encoder_create((int)24000, (int)1);

    public eo() {
        if (this.As == 0L) {
            throw new IllegalStateException("Error on creating opus encoder");
        }
    }

    public byte[] bu(byte[] byArray) {
        byte[] byArray2 = new byte[1276];
        int n = Opus.encode((long)this.As, (byte[])byArray, (int)0, (int)480, (byte[])byArray2, (int)0, (int)byArray2.length);
        if (n < 0) {
            throw new IllegalStateException("Failed to encode audio data");
        }
        byte[] byArray3 = new byte[n];
        System.arraycopy(byArray2, 0, byArray3, 0, n);
        return byArray3;
    }

    @Override
    public void close() {
        Opus.encoder_destroy((long)this.As);
    }
}
