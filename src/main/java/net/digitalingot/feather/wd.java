package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.Mod;

import java.util.function.Consumer;

public class wd
implements vt<uz, po, jg> {
    @Override
    public void ay(uz uz2, Consumer<po> consumer, Consumer<jg> consumer2) {
        qc qc2 = uz2.uq();
        ej ej2 = zz.nw().xn();
        Mod<?> ux2 = ej2.ay(qc2);
        ej2.ay(ux2, uz2.lp());
        ej2.bu(ux2);
        consumer.accept(new po("success"));
    }
}
