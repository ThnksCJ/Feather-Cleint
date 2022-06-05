package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class xa
        implements vt<lb, po, jg> {
    @Override
    public void ay(lb lb2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        ej2.hm().bf().nw(lb2.kq());
        ej2.dr();
        consumer.accept(new po("success"));
    }
}
