package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

class gu$ay
        implements WritableByteChannel {
    private final ByteBuf Gs;

    public gu$ay(ByteBuf byteBuf) {
        this.Gs = byteBuf;
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        int n = this.Gs.writerIndex();
        this.Gs.writeBytes(byteBuffer);
        return this.Gs.writerIndex() - n;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public void close() {
    }
}
