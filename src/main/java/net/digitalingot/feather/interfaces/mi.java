package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface mi {
    gb<mi> bo = yd.ay(mi.class, miArray -> (block, f) -> {
        Float f2 = null;
        for (mi mi2 : miArray) {
            f2 = mi2.renderFogDensity(block, f2 == null ? 0.1f : f2.floatValue());
        }
        return f2;
    });

    @Nullable Float renderFogDensity(@NotNull Block var1, float var2);
}
