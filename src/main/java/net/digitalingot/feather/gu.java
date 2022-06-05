package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.capnproto.MessageBuilder;
import org.capnproto.SerializePacked;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class gu
extends MessageToByteEncoder<MessageBuilder> {
    protected void ay(ChannelHandlerContext channelHandlerContext, MessageBuilder messageBuilder, ByteBuf byteBuf) {
        SerializePacked.writeToUnbuffered((WritableByteChannel)new ay(byteBuf), (MessageBuilder)messageBuilder);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.ay(channelHandlerContext, (MessageBuilder)object, byteBuf);
    }

    static class ay
    implements WritableByteChannel {
        private final ByteBuf Gs;

        public ay(ByteBuf byteBuf) {
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
}
