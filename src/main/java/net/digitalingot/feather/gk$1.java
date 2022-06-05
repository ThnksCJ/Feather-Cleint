package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import net.digitalingot.feather.jx;

class gk$1
        extends ChannelInitializer<Channel> {
    final gk Cr;

    gk$1(gk gk3) {
        this.Cr = gk3;
    }

    protected void initChannel(Channel channel) {
        gt gt2 = new gt(channel, this.Cr);
        channel.attr(Ci).set(gt2);
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast("frame-decoder", new rs());
        channelPipeline.addLast("frame-encoder", new qf());
        channelPipeline.addLast("packet-decoder", new fk());
        channelPipeline.addLast("packet-encoder", new gu());
        channelPipeline.addLast("redstone-decoder", new ct());
        channelPipeline.addLast("unauthenticated-handler", new am(gt2));
        channelPipeline.addLast("inbound-exception-handler", (ChannelHandler) new jx.ay());
        channelPipeline.addLast("outbound-exception-handler", (ChannelHandler) new jx.rf());
    }
}
