package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class eq
        implements vt<up, po, jg> {
    @Override
    public void ay(up up2, Consumer<po> consumer, Consumer<jg> consumer2) {
        bd.INSTANCE.setRenderMod(up2);
        consumer.accept(new po("success"));
    }
}
