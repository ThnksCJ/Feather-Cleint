package net.digitalingot.feather;

import net.minecraft.client.Minecraft;

import java.util.function.Consumer;
import java.util.stream.Collectors;

class vi$1
        implements Consumer<tg> {
    final vi eP;
    final gw eQ;

    vi$1() {
        this.eP = vi2;
        this.eQ = gw2;
    }

    public void ay(tg tg2) {
        this.eP.oq = tg2.fx();
        this.eQ.rf(new oj(Minecraft.getMinecraft().getSession().getProfile().getId(), this.eP.oq.stream().map(oj.ay::ay).collect(Collectors.toList())));
    }

    @Override
    public void accept(Object object) {
        this.ay((tg) object);
    }
}
