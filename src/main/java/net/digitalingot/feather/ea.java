package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class ea
        implements vt<rq, po, jg> {
    @Override
    public void ay(rq rq2, Consumer<po> consumer, Consumer<jg> consumer2) {
        bd.INSTANCE.setRenderMod(null);
        consumer.accept(new po("success"));
    }
}
