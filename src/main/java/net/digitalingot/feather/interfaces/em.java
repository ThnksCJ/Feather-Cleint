package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public interface em {
    gb<em> bo = yd.ay(em.class, emArray -> (entity, world) -> {
        for (em em2 : emArray) {
            em2.joinLevel(entity, world);
        }
    });

    void joinLevel(@NotNull Entity var1, @NotNull World var2);
}
