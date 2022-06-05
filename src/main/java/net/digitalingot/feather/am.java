package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.jetbrains.annotations.NotNull;

public class am
extends ChannelInboundHandlerAdapter {
    @NotNull
    private final gt Cw;

    public am(@NotNull gt gt2) {
        this.Cw = gt2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        pk.rl.zz zz2 = (pk.rl.zz) object;
        if (zz2.gK().eA() != pk.rl.uj.zz.AUTHENTICATION_SUCCESS) {
            vm.Fq.error("received packet type {} while still unauthenticated", (Object)zz2.gK());
            return;
        }
        this.Cw.bM();
    }
}
