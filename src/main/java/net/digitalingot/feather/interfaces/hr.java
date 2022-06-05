package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import org.jetbrains.annotations.NotNull;

public interface hr {
    gb<hr> bo = yd.ay(hr.class, hrArray -> (f, f2) -> {
        for (hr hr2 : hrArray) {
            wi wi2 = hr2.turn(f, f2);
            if (wi2 == wi.PASS) continue;
            return wi2;
        }
        return wi.PASS;
    });

    @NotNull wi turn(float var1, float var2);
}
