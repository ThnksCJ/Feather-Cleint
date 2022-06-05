package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

public interface it {
    gb<it> bo = yd.ay(it.class, itArray -> (ux2, bl) -> {
        for (it it2 : itArray) {
            it2.loadedStateChange(ux2, bl);
        }
    });

    void loadedStateChange(@NotNull Mod<?> var1, boolean var2);
}
