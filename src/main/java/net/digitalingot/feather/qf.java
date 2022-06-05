package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.digitalingot.feather.enums.vp;

public class qf
extends MessageToByteEncoder<ByteBuf> {
    private final vp Gt;

    public qf() {
        this(vp.SHORT);
    }

    public qf(vp vp2) {
        this.Gt = vp2;
    }

    protected void ay(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n = byteBuf.readableBytes();
        byteBuf2.ensureWritable(this.Gt.getSize() + n);
        switch (1.Gu[this.Gt.ordinal()]) {
            case 1: {
                byteBuf2.writeShort(n);
                break;
            }
            case 2: {
                byteBuf2.writeInt(n);
            }
        }
        byteBuf2.writeBytes(byteBuf, byteBuf.readerIndex(), n);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.ay(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}
