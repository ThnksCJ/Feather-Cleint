package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.jetbrains.annotations.NotNull;

public class th
extends ChannelInboundHandlerAdapter {
    @NotNull
    private final fn AF;

    public th(@NotNull fn fn2) {
        this.AF = fn2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        cm.uj.zz zz2 = (cm.uj.zz) object;
        if (zz2.b().sj() != cm.uj.uj.zz.AUTH_SUCCESSFUL) {
            vm.Fq.error("received packet type {} while still unauthenticated", (Object)zz2.b());
            return;
        }
        cm.ay.uj uj2 = zz2.b().a();
        int n = uj2.ye();
        this.AF.yb(n);
    }
}
