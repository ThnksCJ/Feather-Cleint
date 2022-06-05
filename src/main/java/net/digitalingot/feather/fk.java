package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.capnproto.MessageReader;
import org.capnproto.SerializePacked;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.List;

public class fk
extends MessageToMessageDecoder<Object> {
    public boolean acceptInboundMessage(Object object) {
        if (object instanceof DatagramPacket) {
            return this.acceptInboundMessage(((DatagramPacket)object).content());
        }
        return object instanceof ByteBuf;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, Object object, List<Object> list) {
        ByteBuf byteBuf;
        if (object instanceof ByteBuf) {
            byteBuf = (ByteBuf)object;
        } else if (object instanceof DatagramPacket) {
            byteBuf = ((DatagramPacket)object).content();
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + object.getClass().getName());
        }
        if (!byteBuf.isReadable()) {
            return;
        }
        MessageReader messageReader = SerializePacked.readFromUnbuffered((ReadableByteChannel)new ay(byteBuf));
        if (byteBuf.isReadable()) {
            throw new CorruptedFrameException("Did not read full packet");
        }
        list.add(messageReader);
    }

    static class ay
    implements ReadableByteChannel {
        private final ByteBuf Gr;

        public ay(ByteBuf byteBuf) {
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
}
