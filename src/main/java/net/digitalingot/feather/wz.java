package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public interface wz {
    gb<wz> bo = yd.ay(wz.class, (T[] wzArray) -> nf2 -> {
        for (wz wz2 : wzArray) {
            wz2.connect(nf2);
        }
    });

    void connect(@NotNull nf var1);
}
