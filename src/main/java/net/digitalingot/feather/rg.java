package net.digitalingot.feather;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class rg {
    public static ay zs(ItemStack itemStack) {
        ItemFood itemFood = (ItemFood) itemStack.getItem();
        int n = itemFood.getHealAmount(itemStack);
        float f = itemFood.getSaturationModifier(itemStack);
        return new ay(n, f);
    }

    public static ay nl(ItemStack itemStack) {
        return rg.zs(itemStack);
    }

    public static class ay {
        public final int wO;
        public final float wP;

        public ay(int n, float f) {
            this.wO = n;
            this.wP = f;
        }

        public float jc() {
            return (float) this.wO * this.wP * 2.0f;
        }
    }
}
