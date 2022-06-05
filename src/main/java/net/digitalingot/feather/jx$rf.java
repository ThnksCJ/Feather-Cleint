package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class jx$rf
        extends ChannelOutboundHandlerAdapter {
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        vm.Fq.error("Error during an outbound netty operation", throwable);
    }
}
