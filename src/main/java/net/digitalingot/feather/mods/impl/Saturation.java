package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.wi;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mixin.core.kl;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;

import java.awt.*;

@sv(aw = qc.SATURATION, jf = @bx(vu = "Saturation", jm = "https://assets.feathercdn.net/game/mods/saturation.svg", mz = "", lq = {}))
public class Saturation
        extends Mod<ay> {
    public static final ResourceLocation wV = new ResourceLocation("feather:textures/saturation.png");
    private static final int wQ = 3;
    private static final int wR = -3;
    private static final int wS = 3;
    private static final int dJ = fz.yw(16).fy();
    private static final int wT = fz.yw(10016).fy();
    private static final Potion wU = Potion.getPotionFromResourceLocation("hunger");
    private float wW = 0.0f;

    zi {
        @de(vi = 0)
        public iv i = new iv("General");
        @au(wd = "animationSpeed", vu = "Animation Speed", pr = "10", yp = @de(vi = 1))
        @mj(yu = 1, js = 25)
        public int wX;
        @au(wd = "tooltipFoodValues", vu = "Tooltip Food Values", pr = "shiftOnly", yp = @de(vi = 2))
        public ay wY;
        @de(vi = 10)
        public iv wZ = new iv("Food Exhaustion");
        @au(wd = "foodExhaustionColor", vu = "Color", pr = "128/128/128", yp = @de(vi = 11))
        public Color xx;
        @au(wd = "foodExhaustionUnderlay", vu = "Underlay", pr = "true", yp = @de(vi = 12))
        public boolean xA;
        @de(vi = 20)
        public iv xB = new iv("Food Gain");
        @au(wd = "foodGainOverlay", vu = "Gain Overlay", pr = "true", yp = @de(vi = 21))
        public boolean xC;
        @de(vi = 30)
        public iv xD = new iv("Red Saturation");
        @au(wd = "redSaturationGainOverlay", vu = "Gain Overlay", yp = @de(vi = 31))
        public boolean xE;
        @au(wd = "redSaturationOverlay", vu = "Overlay", pr = "true", yp = @de(vi = 32))
        public boolean xF;
        @au(wd = "redTooltipSaturation", vu = "Tooltip Saturation", yp = @de(vi = 33))
        public boolean xG;
        @de(vi = 40)
        public iv xH = new iv("Saturation");
        @au(wd = "saturationGainOverlay", vu = "Gain Overlay", pr = "true", yp = @de(vi = 41))
        public boolean xI;
        @au(wd = "saturationOverlay", vu = "Overlay", pr = "true", yp = @de(vi = 42))
        public boolean xJ;

        public static enum ay {
            NEVER,
            SHIFT_ONLY,
            ALWAYS

        }
    }

    @Override
    public void initialize() {
        bv.bo.ay((itemStack, list) -> {
            if (!this.gc()) {
                return;
            }
            if (itemStack == null) {
                return;
            }
            ay.ay ay2 = ((ay) this.vz).wY;
            if (ay2 == ay.ay.NEVER || ay2 == ay.ay.SHIFT_ONLY && !bu.ay(dJ) && !bu.ay(wT)) {
                return;
            }
            if (!(itemStack.getItem() instanceof ItemFood)) {
                return;
            }
            list.add("           ");
            list.add("           ");
        });
        jw.pt.ay((void_, itemStack, n, n2, n3, n4) -> {
            int n5;
            String string;
            int n6;
            boolean bl2;
            String string2;
            boolean bl3;
            rg.ay ay2;
            if (!this.gc()) {
                return;
            }
            if (itemStack == null) {
                return;
            }
            ay.ay ay3 = ((ay) this.vz).wY;
            if (!(ay3 != ay.ay.NEVER && ay3 != ay.ay.SHIFT_ONLY || bl.on(fz.yw(16).fy()) || bl.on(fz.yw(10016).fy()))) {
                return;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            GuiScreen guiScreen = minecraft.currentScreen;
            if (guiScreen == null) {
                return;
            }
            if (!(itemStack.getItem() instanceof ItemFood)) {
                return;
            }
            int n7 = n3 - 6;
            int n8 = n4 - 26;
            rg.ay ay4 = rg.zs(itemStack);
            if (ay4.equals(ay2 = rg.nl(itemStack)) && ay4.wO == 0) {
                return;
            }
            int n9 = Math.max(ay4.wO, ay2.wO);
            float f = Math.max(ay4.jc(), ay2.jc());
            int n10 = (int) Math.ceil((float) Math.abs(n9) / 2.0f);
            boolean bl4 = bl3 = n10 > 10;
            String string3 = bl3 ? (n9 < 0 ? -1 : 1) * n10 + "x " : (string2 = null);
            if (bl3) {
                n10 = 1;
            }
            boolean bl5 = bl2 = (n6 = (int) Math.max(1.0, Math.ceil(Math.abs(f) / 2.0f))) > 10;
            String string4 = bl2 ? (f < 0.0f ? -1 : 1) * n6 + "x " : (string = null);
            if (bl2) {
                n6 = 1;
            }
            int n11 = n2 + n8 + 1 + 3;
            int n12 = n + n7 + 1 + 3;
            int n13 = iz.aZ();
            boolean bl6 = n11 + 20 < n13 - 3;
            int n14 = n12 - 3;
            int n15 = bl6 ? n11 : n2 - 20 + -3;
            int n16 = n15 + 19;
            fp.Z();
            fp.aB();
            int n17 = n5 = n14 - 2;
            int n18 = n16 - 18;
            fp.ay(0, Gui.ICONS);
            for (int i = 0; i < n10 * 2; i += 2) {
                n5 -= 9;
                if (ay2.wO < 0) {
                    zf.ay(n5, n18, 34, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                } else if (ay2.wO > ay4.wO && ay4.wO <= i) {
                    zf.ay(n5, n18, 133, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                } else if (ay2.wO > i + 1 || ay4.wO == ay2.wO) {
                    zf.ay(n5, n18, 16, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                } else if (ay2.wO == i + 1) {
                    zf.ay(n5, n18, 124, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                } else {
                    zf.ay(n5, n18, 34, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                }
                fp.ay(1.0f, 1.0f, 1.0f, 0.25f);
                zf.ay(n5, n18, ay4.wO - 1 == i ? 115 : 106, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
                if (ay2.wO <= i) continue;
                zf.ay(n5, n18, ay2.wO - 1 == i ? 61 : 52, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
            }
            if (string2 != null) {
                fp.aM();
                fp.rf(0.75, 0.75, 0.75);
                vr.nS().drawString(string2, (float) n5 * 4.0f / 3.0f - (float) minecraft.fontRenderer.getStringWidth(string2) + 2.0f, (float) n18 * 4.0f / 3.0f + 2.0f, -2236963, true);
                fp.aN();
            }
            n18 += 10;
            n5 = n17;
            float f2 = ay2.jc();
            float f3 = Math.abs(f2);
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            fp.ay(0, wV);
            for (int i = 0; i < n6 * 2; i += 2) {
                boolean bl7;
                float f4 = (f3 - (float) i) / 2.0f;
                n5 -= 6;
                boolean bl8 = bl7 = f3 <= (float) i;
                if (bl7) {
                    fp.ay(1.0f, 1.0f, 1.0f, 0.5f);
                }
                zf.ay(n5, n18, f4 >= 1.0f ? 21 : ((double) f4 > 0.5 ? 14 : ((double) f4 > 0.25 ? 7 : (f4 > 0.0f ? 0 : 28))), ((ay) this.vz).xG ? 34 : 27, 7, 7, (int) ((net.digitalingot.feather.mixin.core.ay) guiScreen).getBlitOffset());
                if (!bl7) continue;
                fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            }
            if (string != null) {
                fp.aM();
                fp.rf(0.75, 0.75, 0.75);
                vr.nS().drawString(string, (float) n5 * 4.0f / 3.0f - (float) minecraft.fontRenderer.getStringWidth(string) + 2.0f, (float) n18 * 4.0f / 3.0f + 1.0f, -2236963, true);
                fp.aN();
            }
            fp.aF();
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            RenderHelper.disableStandardItemLighting();
            fp.Z();
            fp.aB();
        });
        sw.ti.ay(uj2 -> {
            if (!this.gc()) {
                return;
            }
            if (uj2 != sw.uj.START) {
                return;
            }
            int n = 15000 / ((ay) this.vz).wX;
            float f = (float) (System.currentTimeMillis() % (long) n) * 1.0f / (float) n;
            this.wW = f < 0.66f ? f * 3.0f : 3.0f - f * 3.0f;
        });
        cv.ll.ay((void_, uj2) -> {
            if (!this.gc()) {
                return wi.PASS;
            }
            if (!((ay) this.vz).xA || uj2 != cv.uj.FOOD) {
                return wi.PASS;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            FoodStats foodStats = minecraft.player.func_71024_bL();
            int n = iz.aY() / 2 + 91;
            int n2 = iz.aZ() - 39;
            this.ay(((kl) foodStats).getFoodExhaustionLevel(), n, n2);
            return wi.PASS;
        });
        cv.ds.ay((void_, uj2) -> {
            if (!this.gc()) {
                return;
            }
            if (uj2 != cv.uj.FOOD) {
                return;
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            EntityPlayerSP entityPlayerSP = minecraft.player;
            if (entityPlayerSP.capabilities.isCreativeMode) {
                return;
            }
            ItemStack itemStack = entityPlayerSP.func_184614_ca();
            FoodStats foodStats = entityPlayerSP.getFoodStats();
            int n = iz.aY() / 2 + 91;
            int n2 = iz.aZ() - 39;
            if (((ay) this.vz).xJ) {
                this.ay(0.0f, foodStats.getSaturationLevel(), minecraft, n, n2, 1.0f, ((ay) this.vz).xF);
            }
            if (itemStack.isEmpty() || !(itemStack.getItem() instanceof ItemFood)) {
                this.wW = 0.0f;
                return;
            }
            rg.ay ay2 = rg.nl(itemStack);
            if (((ay) this.vz).xC) {
                this.ay(ay2.wO, foodStats.getFoodLevel(), minecraft, n, n2, this.wW);
            }
            if (((ay) this.vz).xI) {
                int n3 = foodStats.getFoodLevel() + ay2.wO;
                float f = foodStats.getSaturationLevel() + ay2.jc();
                float f2 = f > (float) n3 ? (float) n3 - foodStats.getSaturationLevel() : ay2.jc();
                this.ay(f2, foodStats.getSaturationLevel(), minecraft, n, n2, this.wW, ((ay) this.vz).xE);
            }
        });
    }

    public void ay(float f, int n, int n2) {
        Minecraft minecraft = Minecraft.getMinecraft();
        fp.X();
        fp.ay((float) ((double) ((ay) this.vz).xx.getRed() / 255.0), (float) ((double) ((ay) this.vz).xx.getGreen() / 255.0), (float) ((double) ((ay) this.vz).xx.getBlue() / 255.0), (float) ((double) ((ay) this.vz).xx.getAlpha() / 255.0));
        fp.ay(0, wV);
        float f2 = 4.0f;
        float f3 = f / f2;
        int n3 = (int) (f3 * 81.0f);
        int n4 = 9;
        GuiIngame guiIngame = minecraft.ingameGUI;
        zf.ay(n - n3, n2, 81 - n3, 18, n3, n4, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
        fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
        fp.ay(0, Gui.ICONS);
    }

    public void ay(int n, int n2, Minecraft minecraft, int n3, int n4, float f) {
        if (n == 0) {
            return;
        }
        int n5 = n2 / 2;
        int n6 = (int) Math.ceil((float) Math.min(20, n2 + n) / 2.0f);
        int n7 = n6 - n5;
        fp.ay(0, Gui.ICONS);
        this.ed(f);
        for (int i = n5; i < n5 + n7; ++i) {
            int n8 = i * 2 + 1;
            float f2 = n3 - i * 8 - 9;
            int n9 = 16;
            int n10 = 13;
            if (minecraft.player.func_70644_a(wU)) {
                n9 += 36;
                n10 = 13;
            }
            GuiIngame guiIngame = minecraft.ingameGUI;
            zf.ay((int) f2, n4, 16 + n10 * 9, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
            int n11 = n9 + (n8 < n2 + n ? 36 : 45);
            zf.ay((int) f2, n4, n11, 27, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
        }
        this.zs(f);
    }

    public void ay(float f, float f2, Minecraft minecraft, int n, int n2, float f3, boolean bl2) {
        if (f2 + f < 0.0f) {
            return;
        }
        int n3 = f != 0.0f ? Math.max(0, (int) f2 / 2) : 0;
        int n4 = (int) Math.ceil(Math.min(20.0f, f2 + f) / 2.0f);
        int n5 = n4 - n3;
        fp.ay(0, wV);
        this.ed(f3);
        int n6 = bl2 ? 9 : 0;
        for (int i = n3; i < n3 + n5; ++i) {
            int n7 = n - i * 8 - 9;
            float f4 = (f2 + f) / 2.0f - (float) i;
            GuiIngame guiIngame = minecraft.ingameGUI;
            if (f4 >= 1.0f) {
                zf.ay(n7, n2, 27, n6, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
                continue;
            }
            if ((double) f4 > 0.5) {
                zf.ay(n7, n2, 18, n6, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
                continue;
            }
            if ((double) f4 > 0.25) {
                zf.ay(n7, n2, 9, n6, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
                continue;
            }
            if (!(f4 > 0.0f)) continue;
            zf.ay(n7, n2, 0, n6, 9, 9, (int) ((net.digitalingot.feather.mixin.core.ay) guiIngame).getBlitOffset());
        }
        this.zs(f3);
        fp.ay(0, Gui.ICONS);
    }

    public void ed(float f) {
        fp.aE();
        if (f == 1.0f) {
            return;
        }
        fp.ay(1.0f, 1.0f, 1.0f, f);
        fp.iu(770, 771);
    }

    public void zs(float f) {
        fp.aF();
        if (f == 1.0f) {
            return;
        }
        fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @rm(wm = true)
    public static classtm$ay
    extends

    public ResourceLocation cf() {
        return wV;
    }
}
