package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class so
        implements vt<ni, po, jg> {
    @Override
    public void ay(ni ni2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        ej2.hm().bf().nw(ni2.kq());
        consumer.accept(new po("success"));
    }
}
