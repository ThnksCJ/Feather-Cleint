package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.Mod;

import java.util.function.Consumer;

public class ir
implements vt<kq, po, jg> {
    @Override
    public void ay(kq kq2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        for (qc qc2 : kq2.dg()) {
            Mod<?> ux2 = ej2.ay(qc2);
            bx bx2 = ux2.cs().jf();
            if (bx2.mc().vu().isEmpty()) continue;
            ej2.uj(ux2);
        }
        bt.ay(ej2);
        consumer.accept(new po("success"));
    }
}
