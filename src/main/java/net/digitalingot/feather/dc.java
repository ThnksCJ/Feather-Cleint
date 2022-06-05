package net.digitalingot.feather;

import io.netty.channel.Channel;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class dc {
    @NotNull
    protected final Channel fq;

    public dc(@NotNull Channel channel) {
        this.fq = channel;
    }

    protected void ay(MessageBuilder messageBuilder) {
        this.fq.eventLoop().submit(() -> this.fq.writeAndFlush((Object) messageBuilder));
    }

    @NotNull
    public Channel ia() {
        return this.fq;
    }
}
