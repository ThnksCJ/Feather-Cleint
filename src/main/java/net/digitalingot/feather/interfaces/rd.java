package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

public interface rd {
    gb<rd> bo = yd.ay(rd.class, rdArray -> (entityPlayer, entity) -> {
        for (rd rd2 : rdArray) {
            rd2.attack(entityPlayer, entity);
        }
    });

    void attack(@NotNull EntityPlayer var1, @NotNull Entity var2);
}
