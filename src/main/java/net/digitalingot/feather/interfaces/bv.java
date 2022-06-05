package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface bv {
    gb<bv> bo = yd.ay(bv.class, bvArray -> (itemStack, list) -> {
        for (bv bv2 : bvArray) {
            bv2.showTooltip(itemStack, list);
        }
    });

    void showTooltip(@NotNull ItemStack var1, @NotNull List<String> var2);
}
