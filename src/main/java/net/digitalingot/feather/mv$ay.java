package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import org.jetbrains.annotations.NotNull;

@ChannelHandler.Sharable
class mv$ay
extends ChannelInboundHandlerAdapter {
    @NotNull
    private final zo Fg;

    private mv$ay(@NotNull zo zo2) {
        this.Fg = zo2;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        ByteBuf byteBuf = ((FMLProxyPacket)object).payload();
        int n = byteBuf.readableBytes();
        byte[] byArray = new byte[n];
        byteBuf.readBytes(byArray);
        this.Fg.onMessage(byArray);
    }
}
