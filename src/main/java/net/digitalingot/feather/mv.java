package net.digitalingot.feather;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.FMLEmbeddedChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class mv {
    @Nullable
    private static FMLEmbeddedChannel Ff;

    static void ay(@NotNull String string, @NotNull zo zo2) {
        if (!NetworkRegistry.INSTANCE.hasChannel(string, Side.CLIENT)) {
            Ff = NetworkRegistry.INSTANCE.newChannel(string, new ChannelHandler[]{new ay(zo2)}).get(Side.CLIENT);
        }
    }

    static void ay(@NotNull String string, byte[] byArray) {
        if (Ff == null) {
            throw new IllegalStateException("Channel not yet registered");
        }
        Ff.writeAndFlush(new FMLProxyPacket(new PacketBuffer(Unpooled.wrappedBuffer(byArray)), string));
    }

    @ChannelHandler.Sharable
    static class ay
    extends ChannelInboundHandlerAdapter {
        @NotNull
        private final zo Fg;

        private ay(@NotNull zo zo2) {
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
}
