package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.ay;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.zi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.MathHelper;

@sv(aw = qc.FOV_CHANGER, jf = @bx(vu = "FOV Changer", jm = "https://assets.feathercdn.net/game/mods/fovchanger.svg", mz = "Customize field of view", lq = {}))
public class FOVChanger
        extends Mod<ay> {
    public static final Potion aA = Potion.getPotionFromResourceLocation("speed");
    public static final Potion aB = Potion.getPotionFromResourceLocation("slowness");

    @Override
    public void initialize() {
        xh.bo.ay((f, f2) -> {
            if (!this.gc()) {
                return f2;
            }
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            float f3 = 100.0f;
            if (entityPlayerSP.func_70051_ag()) {
                f3 = (float) ((double) f3 + ((ay) this.vz).aF);
            }
            if (entityPlayerSP.capabilities.isFlying) {
                f3 = (float) ((double) f3 + ((ay) this.vz).aD);
            }
            if (entityPlayerSP.func_70644_a(aA)) {
                f3 = (float) ((double) f3 + ((ay) this.vz).aG);
            }
            if (entityPlayerSP.func_70644_a(aB)) {
                f3 = (float) ((double) f3 - ((ay) this.vz).aE);
            }
            ItemStack itemStack = entityPlayerSP.func_184614_ca();
            if (((ay) this.vz).aC > 0.0 && !itemStack.isEmpty() && itemStack.getItem() instanceof ItemBow) {
                float f4 = (float) Math.pow((float) (itemStack.getMaxItemUseDuration() - entityPlayerSP.func_184605_cv()) / 20.0f, 2.0);
                f3 = (float) ((double) f3 - (double) MathHelper.clamp(f4, 0.0f, 1.0f) * ((ay) this.vz).aC);
            }
            return f * f3 / 100.0f;
        });
    }

    public static class ay
            extends zi {
        @au(wd = "bowZoomModifier", vu = "Bow Zoom", yp = @de(vi = 0))
        @in(hd = -50.0, lf = 50.0)
        public double aC;
        @au(wd = "flyingModifier", vu = "Flying Modifier", yp = @de(vi = 1))
        @in(hd = -50.0, lf = 50.0)
        public double aD;
        @au(wd = "slownessModifier", vu = "Slowness Modifier", yp = @de(vi = 2))
        @in(hd = -50.0, lf = 50.0)
        public double aE;
        @au(wd = "sprintModifier", vu = "Sprint Modifier", yp = @de(vi = 3))
        @in(hd = -50.0, lf = 50.0)
        public double aF;
        @au(wd = "swiftnessModifier", vu = "Swiftness Modifier", yp = @de(vi = 4))
        @in(hd = -50.0, lf = 50.0)
        public double aG;
    }
}
