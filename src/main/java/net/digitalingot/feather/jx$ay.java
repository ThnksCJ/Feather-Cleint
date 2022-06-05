package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class jx$ay
extends ChannelInboundHandlerAdapter {
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        vm.Fq.error("Error during an inbound netty operation", throwable);
    }
}
