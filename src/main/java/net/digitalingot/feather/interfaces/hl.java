package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

public interface hl {
    gb<hl> bo = yd.ay(hl.class, hlArray -> () -> {
        for (hl hl2 : hlArray) {
            hl2.onReload();
        }
    });

    void onReload();
}
