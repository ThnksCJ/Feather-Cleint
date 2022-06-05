package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import net.digitalingot.feather.enums.vp;
import net.digitalingot.feather.jx;

class pj$1
extends ChannelInitializer<Channel> {
    pj$1() {
    }

    protected void initChannel(Channel channel) {
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast("frame-decoder", new rs(vp.INTEGER));
        channelPipeline.addLast("frame-encoder", new qf(vp.INTEGER));
        channelPipeline.addLast("packetProcessor", new pj.ay());
        channelPipeline.addLast("inboundExceptionHandler", (ChannelHandler)new jx.ay());
        channelPipeline.addLast("outboundExceptionHandler", (ChannelHandler)new jx.rf());
    }
}
