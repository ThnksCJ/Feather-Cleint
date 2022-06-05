package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

@sv(aw= qc.PARTICLES, jf=@bx(vu="Particles", jm="https://assets.feathercdn.net/game/mods/particles.svg", mz="Customize particle settings", lq={ly.ay.PVP}))
public class Particles
extends Mod<ay> {
    private static final Potion cL = Potion.getPotionFromResourceLocation("blindness");

    @Override
    public void initialize() {
        rd.bo.ay((entityPlayer, entity) -> {
            if (!this.gc()) {
                return;
            }
            if (!(entity instanceof EntityLivingBase)) {
                return;
            }
            boolean bl = entityPlayer.field_70143_R > 0.0f && !entityPlayer.field_70122_E && !entityPlayer.func_70617_f_() && !entityPlayer.func_70090_H() && !entityPlayer.func_70644_a(cL) && entityPlayer.func_184187_bx() == null;
            float f = EnchantmentHelper.getModifierForCreature((ItemStack)entityPlayer.func_184614_ca(), ((EntityLivingBase)entity).getCreatureAttribute());
            if (((ay)this.vz).cM && !(f > 0.0f)) {
                entityPlayer.onEnchantmentCritical(entity);
            }
            if (bl || f > 0.0f || ((ay)this.vz).cM) {
                for (int i = 1; i < ((ay)this.vz).multiplier; ++i) {
                    if (bl) {
                        entityPlayer.onCriticalHit(entity);
                    }
                    if (!(f > 0.0f) && !((ay)this.vz).cM) continue;
                    entityPlayer.onEnchantmentCritical(entity);
                }
            }
        });
    }

    public static class ay
    extends zi {
        @au(wd="alwaysSharpParticles", vu="Always Sharp Particles", yp=@de(vi=0))
        public boolean cM;
        @au(wd="multiplier", vu="Multiplier", pr="1", yp=@de(vi=1))
        @mj(yu=1, js=25)
        public int multiplier;
    }
}
