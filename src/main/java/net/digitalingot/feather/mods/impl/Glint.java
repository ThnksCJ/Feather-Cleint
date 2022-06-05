package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.ay;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.iv;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.vr;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;

import java.awt.*;

@sv(aw = qc.GLINT, jf = @bx(vu = "Glint", jm = "https://assets.feathercdn.net/game/mods/glint.svg", mz = "Customize color of enchants and other settings", lq = {}))
public class Glint
        extends Mod<ay> {
    private static final int hW = -8372020;

    zi {
        @de(vi = 0)
        public iv i = new iv("General");
        @au(wd = "shinyPots", vu = "Shiny Pots", yp = @de(vi = 1))
        public boolean hY;
        @de(vi = 10)
        public iv hZ = new iv("Armor");
        @au(wd = "mode", vu = "Mode", pr = "defaultColor", yp = @de(vi = 11))
        public ay iA;
        @au(wd = "armorColor", vu = "Color", pr = "128/64/204", nu = @ra(wd = "mode", ee = {"customColor"}), yp = @de(vi = 12))
        public Color iB;
        @de(vi = 20)
        public iv iC = new iv("Item");
        @au(wd = "item", vu = "Mode", pr = "defaultColor", yp = @de(vi = 21))
        public ay iD = ay.DEFAULT_COLOR;
        @au(wd = "itemColor", vu = "Color", pr = "128/64/204", nu = @ra(wd = "item", ee = {"customColor"}), yp = @de(vi = 22))
        public Color iE;

        public static enum ay {
            OFF,
            DEFAULT_COLOR,
            CUSTOM_COLOR,
            CHROMA

        }
    }

    public static boolean sd(ItemStack itemStack) {
        if (itemStack == null) {
            return false;
        }
        return itemStack.getItem() instanceof ItemArmor;
    }

    public int zz(ItemStack itemStack) {
        boolean bl = Glint.sd(itemStack);
        ay.ay ay2 = bl ? ((ay) this.vz).iA : ((ay) this.vz).iD;
        switch (1. hX[ay2.ordinal()]){
            case 1: {
                return 0;
            }
            case 2: {
                return -8372020;
            }
            case 3: {
                return bl ? ((ay) this.vz).iB.getRGB() : ((ay) this.vz).iE.getRGB();
            }
        }
        return vr.nR().nT();
    }

    public boolean bu(ItemStack itemStack) {
        return this.gc() && ((ay) this.vz).hY && this.zz(itemStack) != 0 && itemStack.getItem() instanceof ItemPotion;
    }

    public boolean ay(ay.ay ay2) {
        return ay2 == ay.ay.DEFAULT_COLOR;
    }

    public static classqp$ay
    extends

    @Override
    public void initialize() {
        super.initialize();
    }
}
