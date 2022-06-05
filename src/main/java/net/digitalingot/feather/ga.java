package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;

import java.util.function.Consumer;

public class ga
        implements vt<ji, po, jg> {
    @Override
    public void ay(ji ji2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        dr dr2 = ej2.hm().bf();
        gj gj2 = new gj(dr2, ji2.kq());
        gj gj3 = new gj(dr2, ji2.uz());
        gj2.zc().renameTo(gj3.zc());
        if (dr2.dh().getName().equals(ji2.kq())) {
            dr2.nw(ji2.uz());
        }
        consumer.accept(new po("success"));
    }
}
