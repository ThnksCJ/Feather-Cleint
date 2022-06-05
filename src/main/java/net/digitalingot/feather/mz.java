package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.HUDMod;

import java.util.function.Consumer;

public class mz
implements vt<by, po, jg> {
    @Override
    public void ay(by by2, Consumer<po> consumer, Consumer<jg> consumer2) {
        ej ej2 = zz.nw().xn();
        for (qc qc2 : by2.wu()) {
            Mod<?> ux2 = ej2.ay(qc2);
            if (!(ux2 instanceof HUDMod)) continue;
            ej2.zz((HUDMod)ux2);
        }
        gf.ay(ej2);
        consumer.accept(new po("success"));
    }
}
