package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

public interface zx {
    gb<zx> kt = yd.ay(zx.class, (T[] zxArray) -> void_ -> {
        for (zx zx2 : zxArray) {
            zx2.render(void_);
        }
    });

    void render(Void var1);
}
