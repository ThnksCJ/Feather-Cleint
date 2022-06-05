package net.digitalingot.feather;

import java.nio.ByteBuffer;
import java.util.UUID;

public class hc {
    public static byte[] sy(UUID uUID) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[16]);
        byteBuffer.putLong(uUID.getMostSignificantBits());
        byteBuffer.putLong(uUID.getLeastSignificantBits());
        return byteBuffer.array();
    }

    public static UUID nw(byte[] byArray) {
        int n;
        long l = 0L;
        long l2 = 0L;
        for (n = 0; n < 8; ++n) {
            l = l << 8 | (long) (byArray[n] & 0xFF);
        }
        for (n = 8; n < 16; ++n) {
            l2 = l2 << 8 | (long) (byArray[n] & 0xFF);
        }
        return new UUID(l, l2);
    }
}
