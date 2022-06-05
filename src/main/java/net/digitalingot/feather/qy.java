package net.digitalingot.feather;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.digitalingot.feather.je;
import net.digitalingot.feather.tb;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class qy
        extends ChannelInboundHandlerAdapter {
    @NotNull
    private final gm yC;

    public qy(@NotNull gm gm2) {
        this.yC = gm2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        tb.rf.uj uj2 = (tb.rf.uj) object;
        UUID uUID = hc.nw(uj2.jv().toArray());
        long l = uj2.vk();
        byte[] byArray = uj2.ud() ? uj2.oe().toArray() : new byte[]{};
        je.uj uj3 = uj2.xt();
        this.yC.vw().ay(uUID, l, byArray, uj3);
    }
}
