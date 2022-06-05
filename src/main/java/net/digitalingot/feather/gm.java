package net.digitalingot.feather;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import net.digitalingot.feather.ht;
import net.digitalingot.feather.jx;
import net.digitalingot.feather.mt;
import net.digitalingot.feather.oi;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Closeable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class gm
implements Closeable {
    @NotNull
    private final fb zQ;
    @NotNull
    private final oq hA;
    @NotNull
    private final ey zR;
    @NotNull
    private final lo zS;
    @NotNull
    private final dj zT;
    @NotNull
    private final NioEventLoopGroup gy;
    @NotNull
    private final List<wr> zU = Collections.synchronizedList(new ArrayList());
    @Nullable
    private hb zV;
    @NotNull
    private final @NotNull Map<@NotNull UUID, @NotNull ht> zW = new ConcurrentHashMap<UUID, ht>();
    @Nullable
    private gq zX;
    private final av<List<oi>> zY = ph.ay(() -> {
        ArrayList<oi> arrayList = new ArrayList<oi>(this.zW.size() + 1);
        for (Object object : this.zW.values()) {
            if (!object.xf()) continue;
            arrayList.add(new oi(object.od(), object.yb()));
        }
        if (this.zV != null && this.zV.ew()) {
            Object object;
            UUID uUID = Minecraft.getMinecraft().player.func_110124_au();
            object = Minecraft.getMinecraft().player.func_70005_c_();
            arrayList.add(new oi(uUID, (String)object));
        }
        return arrayList;
    }, 200L);

    private gm(@NotNull oq oq2, @NotNull ey ey2, @NotNull lo lo2) {
        this.zQ = new fb(this);
        this.hA = oq2;
        this.zR = ey2;
        this.zS = lo2;
        this.zT = new zn(this);
        this.gy = new NioEventLoopGroup(2, new ThreadFactoryBuilder().setNameFormat("feather-voice-netty-%d").build());
    }

    public static gm ay(@NotNull zs zs2, @NotNull oq oq2, @NotNull ey ey2, @NotNull lo lo2) {
        vm.Fq.info("Initializing voice...");
        gm gm2 = new gm(oq2, ey2, lo2);
        ey2.rf(gm2);
        gm2.rf(zs2);
        gm2.qf().scheduleAtFixedRate(() -> {
            for (wr wr2 : gm2.yq()) {
                wr2.ih();
            }
        }, 20L, 20L, TimeUnit.SECONDS);
        hb hb2 = new hb(gm2);
        hb2.start();
        gm2.ay(hb2);
        return gm2;
    }

    public void fk() {
        if (this.zX != null && !this.gy.isShuttingDown()) {
            vm.Fq.info("Reconnecting voice control connection...");
            this.zX.ia().close();
        }
    }

    private void rf(@NotNull zs zs2) {
        final gm gm2 = this;
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(this.gy);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, (Object)true);
        bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, (Object)5000);
        bootstrap.option(ChannelOption.SO_RCVBUF, (Object)65536);
        bootstrap.option(ChannelOption.SO_SNDBUF, (Object)65536);
        bootstrap.option(ChannelOption.AUTO_READ, (Object)true);
        bootstrap.remoteAddress(cl.zG, 5433);
        vm.Fq.info("Establishing voice control connection to " + cl.zG + ":" + 5433 + "...");
        bootstrap.handler(new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) {
                fn fn2 = new fn(channel, gm2);
                channel.attr(cl.zC).set(fn2);
                ChannelPipeline channelPipeline = channel.pipeline();
                channelPipeline.addLast("frame-decoder", new rs());
                channelPipeline.addLast("frame-encoder", new qf());
                channelPipeline.addLast("packet-decoder", new fk());
                channelPipeline.addLast("packet-encoder", new gu());
                channelPipeline.addLast("control-packet-processor", new oc());
                channelPipeline.addLast("unauthenticated-handler", new th(fn2));
                channelPipeline.addLast("inbound-exception-handler", (ChannelHandler)new jx.ay());
                channelPipeline.addLast("outbound-exception-handler", (ChannelHandler)new jx.rf());
            }
        });
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.addListener(future -> {
            if (!future.isSuccess()) {
                vm.Fq.warn("Couldn't establish connection to voice control connection", future.cause());
                return;
            }
            Channel channel = channelFuture.channel();
            vm.Fq.info("Established voice control connection to " + channel.remoteAddress());
            fn fn2 = channel.attr(cl.zC).get();
            fn2.dy(zs2.yw());
        });
        channelFuture.channel().closeFuture().addListener(future -> {
            if (this.zX != null) {
                vm.Fq.info("Control connection to {} stopped.", this.zX.ia().remoteAddress(), future.cause());
                this.zX = null;
            }
            ArrayList<wr> arrayList = new ArrayList<wr>(gm2.yq());
            for (wr wr2 : arrayList) {
                wr2.ia().close();
            }
            gm2.yq().clear();
            if (!this.gy.isShuttingDown()) {
                this.gy.schedule(this::fk, 5L, TimeUnit.SECONDS);
            }
        });
    }

    public void gu() {
        assert (this.zX != null);
        Object[] objectArray = this.jx();
        vm.Fq.info("Fetched voice IPs: " + Arrays.toString(objectArray));
        for (Object object : objectArray) {
            this.yb((String)object);
        }
    }

    private void yb(@NotNull String string) {
        final gm gm2 = this;
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(this.gy);
        bootstrap.channel(NioDatagramChannel.class);
        bootstrap.option(ChannelOption.SO_RCVBUF, (Object)65536);
        bootstrap.option(ChannelOption.SO_SNDBUF, (Object)65536);
        bootstrap.option(ChannelOption.AUTO_READ, (Object)true);
        bootstrap.remoteAddress(string, 5432);
        bootstrap.handler(new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) {
                ChannelPipeline channelPipeline = channel.pipeline();
                channelPipeline.addLast("packet-decoder", new fk());
                channelPipeline.addLast("packet-encoder", new gu());
                channelPipeline.addLast("voice-decoder", new ex());
                channelPipeline.addLast("voice-handler", new qy(gm2));
                channelPipeline.addLast("inbound-exception-handler", (ChannelHandler)new jx.ay());
                channelPipeline.addLast("outbound-exception-handler", (ChannelHandler)new jx.rf());
            }
        });
        ChannelFuture channelFuture = bootstrap.connect();
        Channel channel = channelFuture.channel();
        channelFuture.addListener(future -> {
            InetSocketAddress inetSocketAddress = (InetSocketAddress)channel.remoteAddress();
            InetAddress inetAddress = inetSocketAddress.getAddress();
            InetAddress inetAddress2 = ((InetSocketAddress)this.zX.ia().remoteAddress()).getAddress();
            boolean bl = inetAddress.equals(inetAddress2);
            wr wr2 = new wr(gm2, channel, bl);
            gm2.yq().add(wr2);
            channel.attr(cl.zD).set(wr2);
            List list = gm2.yq().stream().map(wr::ia).map(Channel::remoteAddress).collect(Collectors.toList());
            vm.Fq.info("Established voice connection to " + inetSocketAddress + " - connected: " + list);
            wr2.ih();
        });
        channel.closeFuture().addListener(future -> {
            wr wr2 = channel.attr(cl.zD).get();
            if (wr2 != null) {
                vm.Fq.info("Voice connection to " + wr2.ia().remoteAddress() + " closed.", future.cause());
                gm2.yq().remove(wr2);
                if (wr2.fe()) {
                    gm2.fk();
                }
            }
        });
    }

    private String[] jx() {
        String string = zd.sw(cl.zE).oB();
        return string.split("\n");
    }

    public boolean rl(@NotNull UUID uUID) {
        return this.rs().stream().anyMatch(oi2 -> oi2.ba().equals(uUID));
    }

    @NotNull
    public List<oi> rs() {
        return this.zY.call();
    }

    @NotNull
    public oq ys() {
        return this.hA;
    }

    @NotNull
    public NioEventLoopGroup qf() {
        return this.gy;
    }

    @NotNull
    public ey vp() {
        return this.zR;
    }

    @NotNull
    public lo vh() {
        return this.zS;
    }

    @NotNull
    public fb qa() {
        return this.zQ;
    }

    @NotNull
    public dj vw() {
        return this.zT;
    }

    @Nullable
    public wr qw() {
        for (wr wr2 : this.zU) {
            if (!wr2.fe()) continue;
            return wr2;
        }
        return null;
    }

    @NotNull
    public List<wr> yq() {
        return this.zU;
    }

    @Nullable
    public gq io() {
        return this.zX;
    }

    public void ay(@Nullable gq gq2) {
        this.zX = gq2;
    }

    private void ay(@NotNull hb hb2) {
        this.zV = hb2;
    }

    public void ay(@NotNull ht ht2) {
        this.zW.put(ht2.od(), ht2);
    }

    public void ay(@NotNull UUID uUID, @NotNull mt mt2) {
        ht ht2 = this.zW.get(uUID);
        if (ht2 != null) {
            ht2.vj().add(mt2);
        } else {
            ht2 = new ht(this, uUID);
            this.ay(ht2);
            ht2.vj().add(mt2);
            ht2.start();
        }
    }

    @NotNull
    public Map<UUID, ht> rz() {
        return this.zW;
    }

    @Override
    public void close() {
        for (ht ht2 : this.zW.values()) {
            ht2.close();
        }
        this.zW.clear();
        this.gy.shutdownGracefully();
        if (this.zV != null) {
            this.zV.close();
        }
    }
}
