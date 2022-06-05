package net.digitalingot.feather;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
import net.digitalingot.feather.jx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class gk {
    public static final AttributeKey<gt> Ci = AttributeKey.valueOf("unauthenticated-redstone-connection");
    @NotNull
    private static final String Cj = jb.sd("FEATHER_REDSTONE", "redstone.feathermc.com");
    private static final int Ck = 1668;
    @NotNull
    private final cj Cl;
    @NotNull
    private final ze Cm;
    @NotNull
    private final qg Cn;
    @NotNull
    private final va Co;
    @NotNull
    private final NioEventLoopGroup gy;
    @Nullable
    private Channel fq;
    @NotNull
    private final Map<UUID, pk.ay.uj.rf.uj> Cp = new HashMap<UUID, pk.ay.uj.rf.uj>();
    @Nullable
    private nf Cq;

    private gk(@NotNull cj cj2, @NotNull ze ze2, @NotNull qg qg2, @NotNull va va2) {
        this.Cl = cj2;
        this.Cm = ze2;
        this.Cn = qg2;
        this.Co = va2;
        this.gy = new NioEventLoopGroup(1);
    }

    public static gk ay(@NotNull cj cj2, @NotNull ze ze2, @NotNull qg qg2, @NotNull va va2, @NotNull zs zs2) {
        vm.Fq.info("Initializing Redstone...");
        gk gk2 = new gk(cj2, ze2, qg2, va2);
        gk2.uj(zs2);
        return gk2;
    }

    public void fk() {
        if (this.fq != null) {
            this.fq.close();
        }
    }

    private void uj(@NotNull zs zs2) {
        final gk gk2 = this;
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(this.gy);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, (Object)true);
        bootstrap.remoteAddress(Cj, 1668);
        bootstrap.handler(new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) {
                gt gt2 = new gt(channel, gk2);
                channel.attr(Ci).set(gt2);
                ChannelPipeline channelPipeline = channel.pipeline();
                channelPipeline.addLast("frame-decoder", new rs());
                channelPipeline.addLast("frame-encoder", new qf());
                channelPipeline.addLast("packet-decoder", new fk());
                channelPipeline.addLast("packet-encoder", new gu());
                channelPipeline.addLast("redstone-decoder", new ct());
                channelPipeline.addLast("unauthenticated-handler", new am(gt2));
                channelPipeline.addLast("inbound-exception-handler", (ChannelHandler)new jx.ay());
                channelPipeline.addLast("outbound-exception-handler", (ChannelHandler)new jx.rf());
            }
        });
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.addListener(future -> {
            if (!future.isSuccess()) {
                vm.Fq.warn("Couldn't establish connection to Redstone", future.cause());
                return;
            }
            String string = zs2.yw();
            if (string == null) {
                throw new IllegalArgumentException("Game token couldn't be fetched");
            }
            this.fq = channelFuture.channel();
            this.fq.config().setOption(ChannelOption.SO_RCVBUF, (Object)65536);
            this.fq.config().setOption(ChannelOption.SO_SNDBUF, (Object)65536);
            this.fq.config().setOption(ChannelOption.AUTO_READ, (Object)true);
            vm.Fq.info("Established Redstone connection to " + this.fq.remoteAddress());
            gt gt2 = this.fq.attr(Ci).get();
            gt2.dy(zs2.yw());
        });
        channelFuture.channel().closeFuture().addListener(future -> {
            vm.Fq.info("Redstone connection stopped.", future.cause());
            this.fq = null;
            if (this.Cq != null) {
                this.Cq = null;
            }
            mq.bo.mg().disconnect();
            if (!this.gy.isShuttingDown()) {
                this.gy.schedule(() -> {
                    vm.Fq.info("Reconnecting to Redstone...");
                    this.uj(zs2);
                }, 5L, TimeUnit.SECONDS);
            }
        });
    }

    @NotNull
    public Map<UUID, pk.ay.uj.rf.uj> bD() {
        return this.Cp;
    }

    @Nullable
    public nf lx() {
        return this.Cq;
    }

    public void zz(@NotNull nf nf2) {
        this.Cq = nf2;
    }

    @NotNull
    public cj bE() {
        return this.Cl;
    }

    @NotNull
    public ze bF() {
        return this.Cm;
    }

    @NotNull
    public qg bG() {
        return this.Cn;
    }

    @NotNull
    public va bH() {
        return this.Co;
    }
}
