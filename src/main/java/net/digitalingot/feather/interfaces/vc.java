package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

public interface vc {
    gb<vc> bo = yd.ay(vc.class, (T[] vcArray) -> void_ -> {
        for (vc vc2 : vcArray) {
            vc2.registerCommands(void_);
        }
    });

    void registerCommands(Void var1);
}
