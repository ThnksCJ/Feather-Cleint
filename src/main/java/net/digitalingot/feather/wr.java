package net.digitalingot.feather;

import io.netty.channel.Channel;
import net.digitalingot.feather.je;
import net.digitalingot.feather.lx;
import net.minecraft.client.Minecraft;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class wr {
    @NotNull
    private final gm yC;
    @NotNull
    private final Channel fq;
    private final boolean AG;
    private long Aj;

    public wr(@NotNull gm gm2, @NotNull Channel channel, boolean bl) {
        this.yC = gm2;
        this.fq = channel;
        this.AG = bl;
    }

    public void rf(byte[] byArray, @NotNull je.uj uj2) {
        if (!this.AG) {
            throw new IllegalArgumentException("sendSpeech() only allowed on the master connection");
        }
        MessageBuilder messageBuilder = new MessageBuilder();
        lx.rf.ay ay2 = (lx.rf.ay)((Object)messageBuilder.initRoot((FromPointerBuilder)lx.rf.Ba));
        assert (this.yC.io() != null);
        ay2.jo(this.yC.io().ye());
        ay2.ay(uj2);
        ay2.kl(++this.Aj);
        ay2.nn(byArray);
        if (cl.yZ) {
            this.uj(byArray, uj2);
        }
        this.ay(messageBuilder);
    }

    private void uj(byte[] byArray, @NotNull je.uj uj2) {
        long l = this.Aj;
        long l2 = cl.zB == 0L ? 0L : ThreadLocalRandom.current().nextLong(-cl.zB, cl.zB);
        long l3 = cl.zA + l2;
        this.fq.eventLoop().schedule(() -> {
            UUID uUID = Minecraft.getMinecraft().player.func_110124_au();
            this.yC.vw().ay(uUID, l, byArray, uj2);
        }, l3, TimeUnit.MILLISECONDS);
    }

    public void ih() {
        MessageBuilder messageBuilder = new MessageBuilder();
        lx.rf.ay ay2 = (lx.rf.ay)((Object)messageBuilder.initRoot((FromPointerBuilder)lx.rf.Ba));
        assert (this.yC.io() != null);
        ay2.jo(this.yC.io().ye());
        vm.Fq.debug("Sending keep alive to voice connection {}...", this.ia().remoteAddress());
        this.ay(messageBuilder);
    }

    private void ay(MessageBuilder messageBuilder) {
        this.fq.eventLoop().submit(() -> this.fq.writeAndFlush((Object)messageBuilder));
    }

    public boolean fe() {
        return this.AG;
    }

    @NotNull
    public Channel ia() {
        return this.fq;
    }
}
