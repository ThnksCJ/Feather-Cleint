package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

class fk$ay
        implements ReadableByteChannel {
    private final ByteBuf Gr;

    public fk$ay(ByteBuf byteBuf) {
        this.Gr = byteBuf;
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        int n;
        int n2 = this.Gr.readerIndex();
        int n3 = byteBuffer.remaining();
        if (n3 > (n = this.Gr.readableBytes())) {
            byteBuffer.limit(n);
        }
        this.Gr.readBytes(byteBuffer);
        byteBuffer.limit(n3);
        return this.Gr.readerIndex() - n2;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public void close() {
    }
}
