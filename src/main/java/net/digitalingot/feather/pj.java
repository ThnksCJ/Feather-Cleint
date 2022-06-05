package net.digitalingot.feather;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import net.digitalingot.feather.enums.vp;
import net.digitalingot.feather.jx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;

public class pj {
    @NotNull
    private final NioEventLoopGroup gy = new NioEventLoopGroup(1);
    @Nullable
    private Channel fq;

    public pj() {
        this.init();
    }

    private void init() {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(this.gy);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, (Object) true);
        int n = Integer.parseInt(jb.sd("FEATHER_MESSAGING_PORT", "1001"));
        bootstrap.remoteAddress("127.0.0.1", n);
        bootstrap.handler(new ChannelInitializer<Channel>() {

            protected void initChannel(Channel channel) {
                ChannelPipeline channelPipeline = channel.pipeline();
                channelPipeline.addLast("frame-decoder", new rs(vp.INTEGER));
                channelPipeline.addLast("frame-encoder", new qf(vp.INTEGER));
                channelPipeline.addLast("packetProcessor", new ay());
                channelPipeline.addLast("inboundExceptionHandler", (ChannelHandler) new jx.ay());
                channelPipeline.addLast("outboundExceptionHandler", (ChannelHandler) new jx.rf());
            }
        });
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.addListener(future -> {
            if (future.isSuccess()) {
                vm.Fq.info("Initialized rust channel communication. Communicating on port {}.", n);
            } else {
                vm.Fq.warn("Couldn't connect to rust channel. Are we in development mode?");
            }
            this.fq = channelFuture.channel();
        });
    }

    public void nl(@NotNull String string) {
        if (rf.nl()) {
            vm.Fq.info("Rust Channel <- " + string);
        } else {
            vm.Fq.debug("Rust Channel <- " + string);
        }
        if (this.fq != null && this.fq.isActive()) {
            this.fq.writeAndFlush(Unpooled.wrappedBuffer(string.getBytes(StandardCharsets.UTF_8)));
        }
    }

    public static class ay
            extends ChannelDuplexHandler {
        public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
            if (!(object instanceof ByteBuf)) {
                throw new IllegalArgumentException("Don't know how to cast " + object.getClass() + " to ByteBuf");
            }
            ByteBuf byteBuf = (ByteBuf) object;
            int n = byteBuf.readableBytes();
            byte[] byArray = new byte[n];
            byteBuf.readBytes(byArray);
            String string = new String(byArray, StandardCharsets.UTF_8);
            if (rf.nl()) {
                vm.Fq.info("Rust Channel -> " + string);
            } else {
                vm.Fq.debug("Rust Channel -> " + string);
            }
            pa pa2 = gw.GSON.fromJson(string, pa.class);
            zz.nw().pv().ay(pa2, gw.rf.RUST_LAUNCHER);
            byteBuf.release();
        }
    }
}
