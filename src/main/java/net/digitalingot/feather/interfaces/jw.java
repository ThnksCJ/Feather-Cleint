package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface jw {
    gb<jw> ne = yd.ay(jw.class, jwArray -> (void_, itemStack, n, n2, n3, n4) -> {
        for (jw jw2 : jwArray) {
            jw2.render(void_, itemStack, n, n2, n3, n4);
        }
    });
    gb<jw> pt = yd.ay(jw.class, jwArray -> (void_, itemStack, n, n2, n3, n4) -> {
        for (jw jw2 : jwArray) {
            jw2.render(void_, itemStack, n, n2, n3, n4);
        }
    });
    gb<jw> eq = yd.ay(jw.class, jwArray -> (void_, itemStack, n, n2, n3, n4) -> {
        for (jw jw2 : jwArray) {
            jw2.render(void_, itemStack, n, n2, n3, n4);
        }
    });

    void render(Void var1, @NotNull ItemStack var2, int var3, int var4, int var5, int var6);
}
