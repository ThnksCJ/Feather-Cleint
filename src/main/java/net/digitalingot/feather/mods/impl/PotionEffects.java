package net.digitalingot.feather.mods.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraft.util.text.translation.I18n;

import java.awt.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@sv(aw = qc.POTION_EFFECTS, jf = @bx(vu = "Potion Effects", jm = "https://assets.feathercdn.net/game/mods/potioneffects.svg", mz = "Display potion effects", lq = {ly.ay.PVP, ly.ay.HUD}))
@pq(we = {@xd(bp = rf.class)})
public class PotionEffects
        extends HUDMod<sd> {
    private static final List<PotionEffect> qO = Lists.newArrayList(PotionEffects.kl(1, 1000, 1), PotionEffects.kl(2, 2456, 7), PotionEffects.kl(3, 8456, 12), PotionEffects.kl(4, 12456, 6), PotionEffects.kl(5, 45456, 17));
    private static final Set<Integer> qP = Sets.newHashSet(9, 12, 13, 14, 15, 16);
    private static final uj qQ = zz.bn();

    private static PotionEffect kl(int n, int n2, int n3) {
        return new PotionEffect(Objects.requireNonNull(Potion.getPotionById(n)), n2, n3);
    }

    private static String yw(String string) {
        char[] cArray = string.toCharArray();
        boolean bl = true;
        int n = cArray.length;
        for (int i = 0; i < n; ++i) {
            char c = cArray[i];
            if (c == ' ') {
                bl = true;
                continue;
            }
            if (!bl) continue;
            cArray[i] = Character.toUpperCase(c);
            bl = false;
        }
        return new String(cArray);
    }

    interface uj {
        int ay(PotionEffect var1);

        String rf(PotionEffect var1);

        int uj(PotionEffect var1);

        boolean zz(PotionEffect var1);

        void ay(PotionEffect var1, int var2, int var3);
    }

    static class zz {
        private zz() {
        }

        public static uj bn() {
            return new ay();
        }
    }

    @rm(wm = true)
    public static class sd
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.CENTER_LEFT, ev = 17.5)
        public ci iO;
        @au(wd = "hud", vu = "Show HUD", pr = "true", yp = @de(vi = 10))
        public boolean qT;
        @au(wd = "durationBlinkSeconds", vu = "Blink Duration (in seconds)", pr = "10", yp = @de(vi = 11))
        @mj(yu = 1, js = 60)
        public int qU;
        @de(vi = 20)
        public iv m = new iv("Color");
        @au(wd = "durationColor", vu = "Color Duration (in seconds)", yp = @de(vi = 21))
        public gp qV;
        @au(wd = "effectNameColor", vu = "Color Effect Name", yp = @de(vi = 22))
        public gp qW;
        @au(wd = "enableBackground", vu = "Background", yp = @de(vi = 23))
        public boolean qX;
        @de(vi = 30)
        public iv iP = new iv("Show");
        @au(wd = "enableEffectName", vu = "Effect Name", pr = "true", yp = @de(vi = 31))
        public boolean qY;
        @au(wd = "enableIconBlink", vu = "Icon Blink", pr = "true", yp = @de(vi = 32))
        public boolean qZ;
        @au(wd = "hideInventoryStatus", vu = "Hide Inventory Status", pr = "true", yp = @de(vi = 33))
        public boolean rv;
        @au(wd = "hideVanillaEffects", vu = "Hide Vanilla Effects (1.12.2+)", pr = "true", yp = @de(vi = 34))
        public boolean rA;
    }

    public static class ay
            implements uj {
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

    public class rf
            extends kb {
        @Override
        public void ay(qx qx2) {
            switch (1.ef[qx2.ordinal()]) {
                case 1: {
                    this.render();
                    return;
                }
                case 2: {
                    this.jy();
                    return;
                }
            }
        }

        private void render() {
            this.ay(Minecraft.getMinecraft().player.func_70651_bq(), false);
        }

        private void jy() {
            this.ay(qO, true);
        }

        @Override
        public boolean tv() {
            return ((sd) PotionEffects.this.vz).qT;
        }

        @Override
        public int df() {
            return ((sd) PotionEffects.this.vz).qX || ((sd) PotionEffects.this.vz).qY ? 120 : 50;
        }

        @Override
        public int hu() {
            return Minecraft.getMinecraft().player.func_70651_bq().size() * (((sd) PotionEffects.this.vz).qX ? 25 : 20);
        }

        @Override
        public int ku() {
            return 5 * (((sd) PotionEffects.this.vz).qX ? 25 : 20);
        }

        public boolean xo() {
            return PotionEffects.this.gc() && ((sd) PotionEffects.this.vz).rv;
        }

        private void ay(Collection<PotionEffect> collection, boolean bl) {
            int n;
            boolean bl2;
            int n2;
            if (collection.isEmpty()) {
                return;
            }
            int n3 = ((sd) PotionEffects.this.vz).qX ? 25 : (n2 = ((sd) PotionEffects.this.vz).qY ? 20 : 18);
            if (collection.size() > 5 && ((sd) PotionEffects.this.vz).qX) {
                n2 = 132 / (collection.size() - 1);
            }
            if (((sd) PotionEffects.this.vz).qX) {
                this.kw.rf(0, 0, this.df(), bl ? this.ku() : this.hu(), new Color(0, 0, 0, 100).getRGB());
            }
            int n4 = 0;
            boolean bl3 = bl2 = this.hh() + this.ch() / 2.0 <= (double) ((float) new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth() / 2.0f);
            if (bl2) {
                n = ((sd) PotionEffects.this.vz).qX ? 6 : 0;
            } else {
                n = this.df() - 18;
                n -= ((sd) PotionEffects.this.vz).qX ? 6 : 0;
            }
            for (PotionEffect potionEffect : collection) {
                float f;
                int n5 = n4 + (((sd) PotionEffects.this.vz).qX ? 5 : 0);
                StringBuilder stringBuilder = new StringBuilder(PotionEffects.yw(I18n.translateToLocal(qQ.rf(potionEffect))));
                if (!qP.contains(qQ.ay(potionEffect))) {
                    stringBuilder.append(" ").append(jc.mg(potionEffect.getAmplifier() + 1));
                }
                String string = stringBuilder.toString();
                String string2 = "**:**";
                if (!qQ.zz(potionEffect)) {
                    string2 = StringUtils.ticksToElapsedTime(qQ.uj(potionEffect));
                }
                qQ.ay(potionEffect, n, n5);
                if (((sd) PotionEffects.this.vz).qY) {
                    if (bl2) {
                        f = (((sd) PotionEffects.this.vz).qX ? 10 : 4) + 18;
                    } else {
                        f = (float) (this.df() - this.kw.on(string)) - 18.0f;
                        f -= ((sd) PotionEffects.this.vz).qX ? 10.0f : 4.0f;
                    }
                    this.kw.ay(string, f, (float) (n4 + (((sd) PotionEffects.this.vz).qX ? 4 : 0)), ((sd) PotionEffects.this.vz).qW, true);
                }
                if (this.rf(potionEffect, potionEffect.getDuration(), ((sd) PotionEffects.this.vz).qU)) {
                    if (bl2) {
                        f = (((sd) PotionEffects.this.vz).qX ? 10 : 4) + 18;
                    } else {
                        f = (float) (this.df() - this.kw.on(string2)) - 18.0f;
                        f -= ((sd) PotionEffects.this.vz).qX ? 10.0f : 4.0f;
                    }
                    this.kw.ay(string2, f, (float) (n4 + (((sd) PotionEffects.this.vz).qX ? 4 : 0) + (((sd) PotionEffects.this.vz).qY ? 10 : 5)), ((sd) PotionEffects.this.vz).qV, true);
                }
                n4 += n2;
            }
        }

        private boolean rf(PotionEffect potionEffect, int n, int n2) {
            if (!potionEffect.getIsAmbient() && n / 20 <= n2) {
                return n % 20 < 10;
            }
            return true;
        }

        @Override
        public ci te() {
            return ((sd) PotionEffects.this.vz).iO;
        }
    }
}
