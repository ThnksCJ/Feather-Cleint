package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.jetbrains.annotations.NotNull;

public class sz
        extends ChannelInboundHandlerAdapter {
    @NotNull
    private final gq AE;

    public sz(@NotNull gq gq2) {
        this.AE = gq2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        cm.uj.zz zz2 = (cm.uj.zz) object;
        if (zz2.b().sj() == cm.uj.uj.zz.AUTH_SUCCESSFUL) {
            vm.Fq.error("Received authentication successful packet on voice control while already authenticated.");
        }
    }
}
