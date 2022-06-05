package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import net.digitalingot.feather.jx;

class gm$2
        extends ChannelInitializer<Channel> {
    final gm zZ;

    gm$2(gm gm3) {
        this.zZ = gm3;
    }

    protected void initChannel(Channel channel) {
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast("packet-decoder", new fk());
        channelPipeline.addLast("packet-encoder", new gu());
        channelPipeline.addLast("voice-decoder", new ex());
        channelPipeline.addLast("voice-handler", new qy(this.zZ));
        channelPipeline.addLast("inbound-exception-handler", (ChannelHandler) new jx.ay());
        channelPipeline.addLast("outbound-exception-handler", (ChannelHandler) new jx.rf());
    }
}
