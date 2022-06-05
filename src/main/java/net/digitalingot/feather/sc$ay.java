package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.PotionEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class sc$ay
implements PotionEffects.uj {
    private static final ResourceLocation qR = new ResourceLocation("minecraft:textures/gui/container/inventory.png");

    @Override
    public int ay(PotionEffect potionEffect) {
        return Potion.getIdFromPotion(potionEffect.getPotion());
    }

    @Override
    public String rf(PotionEffect potionEffect) {
        return potionEffect.getEffectName();
    }

    @Override
    public int uj(PotionEffect potionEffect) {
        return potionEffect.getDuration();
    }

    @Override
    public boolean zz(PotionEffect potionEffect) {
        return potionEffect.getIsPotionDurationMax();
    }

    @Override
    public void ay(PotionEffect potionEffect, int n, int n2) {
        Potion potion = potionEffect.getPotion();
        if (!potion.hasStatusIcon()) {
            return;
        }
        fp.ay(0, qR);
        int n3 = potion.getStatusIconIndex();
        int n4 = n3 % 8 * 18;
        int n5 = 198 + n3 / 8 * 18;
        vr.nR().zz(n, n2, n4, n5, 18, 18);
    }
}
