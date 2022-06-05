package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import org.jetbrains.annotations.NotNull;

public interface yb {
    gb<yb> bo = yd.ay(yb.class, (T[] ybArray) -> string -> {
        for (yb yb2 : ybArray) {
            yb2.select(string);
        }
    });

    void select(@NotNull String var1);
}
