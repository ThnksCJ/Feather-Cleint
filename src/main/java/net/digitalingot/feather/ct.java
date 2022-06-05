package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.capnproto.FromPointerReader;
import org.capnproto.MessageReader;

import java.util.List;

public class ct
        extends MessageToMessageDecoder<MessageReader> {
    protected void ay(ChannelHandlerContext channelHandlerContext, MessageReader messageReader, List<Object> list) {
        pk.rl.zz zz2 = (pk.rl.zz) ((Object) messageReader.getRoot((FromPointerReader) pk.rl.Dg));
        list.add(zz2);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.ay(channelHandlerContext, (MessageReader) object, list);
    }
}
