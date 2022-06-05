package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface lm {
    gb<lm> yg = yd.ay(lm.class, (T[] lmArray) -> entity -> {
        for (lm lm2 : lmArray) {
            lm2.track(entity);
        }
    });
    gb<lm> ea = yd.ay(lm.class, (T[] lmArray) -> entity -> {
        for (lm lm2 : lmArray) {
            lm2.track(entity);
        }
    });

    void track(@NotNull Entity var1);
}
