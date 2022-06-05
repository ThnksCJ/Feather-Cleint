package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import net.digitalingot.feather.jx;

class gm$1
        extends ChannelInitializer<Channel> {
    final gm zZ;

    gm$1(gm gm3) {
        this.zZ = gm3;
    }

    protected void initChannel(Channel channel) {
        fn fn2 = new fn(channel, this.zZ);
        channel.attr(cl.zC).set(fn2);
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast("frame-decoder", new rs());
        channelPipeline.addLast("frame-encoder", new qf());
        channelPipeline.addLast("packet-decoder", new fk());
        channelPipeline.addLast("packet-encoder", new gu());
        channelPipeline.addLast("control-packet-processor", new oc());
        channelPipeline.addLast("unauthenticated-handler", new th(fn2));
        channelPipeline.addLast("inbound-exception-handler", (ChannelHandler) new jx.ay());
        channelPipeline.addLast("outbound-exception-handler", (ChannelHandler) new jx.rf());
    }
}
