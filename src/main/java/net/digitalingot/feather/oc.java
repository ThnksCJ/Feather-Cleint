package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.capnproto.FromPointerReader;
import org.capnproto.MessageReader;

import java.util.List;

public class oc
        extends MessageToMessageDecoder<MessageReader> {
    protected void ay(ChannelHandlerContext channelHandlerContext, MessageReader messageReader, List<Object> list) {
        cm.uj.zz zz2 = (cm.uj.zz) ((Object) messageReader.getRoot((FromPointerReader) cm.uj.AP));
        list.add(zz2);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.ay(channelHandlerContext, (MessageReader) object, list);
    }
}
