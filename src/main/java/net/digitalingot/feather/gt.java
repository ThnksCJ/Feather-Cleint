package net.digitalingot.feather;

import io.netty.channel.Channel;
import org.capnproto.MessageBuilder;
import org.jetbrains.annotations.NotNull;

public class gt
extends jq {
    public gt(@NotNull Channel channel, @NotNull gk gk2) {
        super(channel, gk2);
    }

    public void dy(@NotNull String string) {
        vm.Fq.info("Authenticating with Redstone...");
        MessageBuilder messageBuilder = new MessageBuilder();
        rr.ig.uj.ay ay2 = this.zz(messageBuilder);
        rr.sd.ay ay3 = ay2.kY();
        ay3.hj(string);
        this.ay(messageBuilder);
    }

    public void bM() {
        vm.Fq.info("Authenticated with Redstone");
        nf nf2 = new nf(this.fq, this.hG);
        this.hG.zz(nf2);
        this.fq.pipeline().replace("unauthenticated-handler", "authenticated-handler", new kc(nf2));
        wz.bo.mg().connect(nf2);
    }
}
