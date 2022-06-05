package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface yk {
    gb<yk> ll = yd.ay(yk.class, ykArray -> (entity, d, d2, d3) -> {
        for (yk yk2 : ykArray) {
            yk2.render(entity, d, d2, d3);
        }
    });
    gb<yk> eq = yd.ay(yk.class, ykArray -> (entity, d, d2, d3) -> {
        for (yk yk2 : ykArray) {
            yk2.render(entity, d, d2, d3);
        }
    });

    void render(@NotNull Entity var1, double var2, double var4, double var6);
}
