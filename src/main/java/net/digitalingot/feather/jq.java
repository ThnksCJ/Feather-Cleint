package net.digitalingot.feather;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public abstract class jq {
    @NotNull
    protected final Channel fq;
    @NotNull
    protected final gk hG;

    {
        return this.hG;
    }

    protected jq(@NotNull Channel channel, @NotNull gk gk2) {
        this.fq = channel;
        this.hG = gk2;
    }

    @NotNull
    public gk if()

    @NotNull
    protected rr.ig.uj.ay zz(MessageBuilder messageBuilder) {
        rr.ig.ay ay2 = (rr.ig.ay) ((Object) messageBuilder.initRoot((FromPointerBuilder) rr.ig.Ee));
        return ay2.kU();
    }

    protected void ay(MessageBuilder messageBuilder) {
        if (this.fq.eventLoop().inEventLoop()) {
            this.fq.writeAndFlush((Object) messageBuilder).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.fq.eventLoop().submit(() -> this.fq.writeAndFlush((Object) messageBuilder).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE));
        }
    }
}
