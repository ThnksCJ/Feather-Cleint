package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.entity.EntityLivingBase;
import org.jetbrains.annotations.NotNull;

public interface jo {
    gb<jo> bo = yd.ay(jo.class, (T[] joArray) -> entityLivingBase -> {
        for (jo jo2 : joArray) {
            jo2.hurt(entityLivingBase);
        }
    });

    void hurt(@NotNull EntityLivingBase var1);
}
