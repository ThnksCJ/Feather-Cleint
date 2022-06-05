package net.digitalingot.feather;

import io.netty.channel.Channel;
import org.capnproto.FromPointerBuilder;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class fn
        extends dc {
    @NotNull
    private final gm yC;

    public fn(@NotNull Channel channel, @NotNull gm gm2) {
        super(channel);
        this.yC = gm2;
    }

    public void dy(@NotNull String string) {
        Objects.requireNonNull(string, "trying to connect to voice with null jwt token");
        vm.Fq.debug("Authenticating with voice backend...");
        MessageBuilder messageBuilder = new MessageBuilder();
        mh.zz.ay ay2 = (mh.zz.ay) ((Object) messageBuilder.initRoot((FromPointerBuilder) mh.zz.AX));
        mh.ay.ay ay3 = ay2.m().r();
        ay3.hj(string);
        this.ay(messageBuilder);
    }

    public void yb(int n) {
        vm.Fq.info("Authenticated with voice backend - session id: " + n);
        gq gq2 = new gq(this.yC, this.fq, n);
        this.yC.ay(gq2);
        this.fq.pipeline().replace("unauthenticated-handler", "authenticated-handler", new sz(gq2));
        this.yC.qf().schedule(this.yC::gu, 3L, TimeUnit.SECONDS);
        this.yC.vw().zw();
        gq2.pp();
    }
}
