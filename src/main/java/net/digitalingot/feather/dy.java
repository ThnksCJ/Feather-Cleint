package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface dy {
    gb<dy> ll = yd.ay(dy.class, (T[] dyArray) -> entity -> {
        for (dy dy2 : dyArray) {
            dy2.orient(entity);
        }
    });
    gb<dy> ds = yd.ay(dy.class, (T[] dyArray) -> entity -> {
        for (dy dy2 : dyArray) {
            dy2.orient(entity);
        }
    });

    void orient(@NotNull Entity var1);
}
