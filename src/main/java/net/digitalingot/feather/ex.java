package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import net.digitalingot.feather.tb;
import org.capnproto.FromPointerReader;
import org.capnproto.MessageReader;

import java.util.List;

public class ex
extends MessageToMessageDecoder<MessageReader> {
    protected void ay(ChannelHandlerContext channelHandlerContext, MessageReader messageReader, List<Object> list) {
        tb.rf.uj uj2 = (tb.rf.uj)messageReader.getRoot((FromPointerReader)tb.rf.AJ);
        list.add(uj2);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.ay(channelHandlerContext, (MessageReader)object, list);
    }
}
