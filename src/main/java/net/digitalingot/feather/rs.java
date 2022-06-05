package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import net.digitalingot.feather.enums.vp;

import java.util.List;

public class rs
        extends ByteToMessageDecoder {
    private final vp Gt;

    public rs() {
        this(vp.SHORT);
    }

    public rs(vp vp2) {
        this.Gt = vp2;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        int n;
        if (!byteBuf.isReadable()) {
            return;
        }
        int n2 = byteBuf.readerIndex();
        switch (1. Gu[this.Gt.ordinal()]){
            case 1: {
                n = Short.toUnsignedInt(byteBuf.readShort());
                break;
            }
            case 2: {
                n = byteBuf.readInt();
                break;
            }
            default: {
                throw new IllegalStateException("Unknown packet length type: " + this.Gt);
            }
        }
        if (n == 0) {
            return;
        }
        if (byteBuf.readableBytes() < n) {
            byteBuf.readerIndex(n2);
            return;
        }
        list.add(byteBuf.slice(byteBuf.readerIndex(), n).retain());
        byteBuf.skipBytes(n);
    }
}
