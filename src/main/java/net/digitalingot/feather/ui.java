package net.digitalingot.feather;

import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class ui
implements vt<md, po, jg> {
    @Override
    public void ay(md md2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        ej2.hm().bf().ag(md2.kq());
        consumer.accept(new po("success"));
    }
}
