package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - recommend switching to table mode
 */
@sv(aw = qc.ARMOR_STATUS, jf = @bx(vu = "Armor Status", jm = "https://assets.feathercdn.net/game/mods/armorstatus.svg", mz = "Display your armor durability", lq = {ly.ay.PVP, ly.ay.HUD}))
@pq(we = {@xd(bp = rf.class)})
public class ArmorStatus
        extends HUDMod<ay> {
    private static final ItemStack[] iF = new ItemStack[]{new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.DIAMOND_HELMET)};
    private static final ItemStack iG = new ItemStack(Items.DIAMOND_SWORD);

    @rm(wm = true)
    public static class zc$ay
            extends zi {
        @au(wd = "color", vu = "Text Color", yp = @de(vi = 0))
        public gp sa;
        @au(wd = "damageDisplayType", vu = "Damage Display Type", pr = "value", yp = @de(vi = 1))
        public ay iK;
        @au(wd = "iconLocation", vu = "Icon Location", pr = "right", yp = @de(vi = 2))
        public rf iL;
        @au(wd = "listMode", vu = "List Mode", pr = "vertical", yp = @de(vi = 3))
        public uj iM;
        @au(wd = "padding", vu = "Padding", pr = "2", yp = @de(vi = 4))
        @mj(js = 5)
        public int iN;
        @fl(yp = @de(vi = 10))
        @cy(yv = ho.BOTTOM_RIGHT, dz = 0.0, ev = -1.0)
        public ci iO;
        @de(vi = 10)
        public iv iP = new iv("Show");
        @au(wd = "enableItemName", vu = "Enable Item Name", pr = "false", yp = @de(vi = 11))
        public boolean iQ;
        @au(wd = "showArmorDamage", vu = "Show Armor Damage", pr = "true", yp = @de(vi = 12))
        public boolean iR;
        @au(wd = "showDamageOverlay", vu = "Show Damage Overlay", pr = "true", yp = @de(vi = 13))
        public boolean iS;
        @au(wd = "showEquippedItem", vu = "Show Equipped Item", pr = "true", yp = @de(vi = 14))
        public boolean iT;
        @au(wd = "showItemCount", vu = "Show Item Count", pr = "true", yp = @de(vi = 15))
        public boolean iU;
        @au(wd = "showItemDamage", vu = "Show Item Damage", pr = "true", yp = @de(vi = 16))
        public boolean iV;
        @au(wd = "showMaxDamage", vu = "Show Max Damage", pr = "false", yp = @de(vi = 17))
        public boolean iW;

        public enum uj {
            HORIZONTAL,
            VERTICAL

        }

        public enum rf {
            LEFT,
            RIGHT

        }

        public enum ay {
            VALUE,
            PERCENT

        }
    }

    public class rf
            extends kb {
        private final List<ay> iX = new ArrayList<ay>();

        @Override
        public void ay(qx qx2) {
            boolean bl = qx2 == qx.MOD_LAYOUT;
            this.sb(bl);
            this.ny();
        }

        @Override
        public int df() {
            switch (1. iH[((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iM.ordinal()]){
                case 1: {
                    return ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iQ ? 130 : 45;
                }
                case 2: {
                    int n = 0;
                    for (ay ay2 : this.iX) {
                        n += ay2.jE;
                    }
                    return n + 5;
                }
            }
            throw new IllegalStateException();
        }

        @Override
        public int hu() {
            return (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iM == ay.uj.HORIZONTAL ? 1 : (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iT ? 5 : 4)) * (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iQ ? 22 : 16);
        }

        @Override
        public int bs() {
            switch (1. iH[((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iM.ordinal()]){
                case 1: {
                    return ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iQ ? 130 : 45;
                }
                case 2: {
                    return 196;
                }
            }
            throw new IllegalStateException();
        }

        private ItemStack ay(int n, boolean bl) {
            if (bl) {
                if (n == -1 && ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iT) {
                    return iG;
                }
                if (n != -1) {
                    return iF[n];
                }
            } else {
                EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
                if (n == -1 && ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iT) {
                    return entityPlayerSP.func_184614_ca();
                }
                if (n != -1) {
                    return (ItemStack) entityPlayerSP.field_71071_by.armorInventory.get(n);
                }
            }
            return null;
        }

        private void sb(boolean bl) {
            this.iX.clear();
            for (int i = 3; i >= -1; --i) {
                ItemStack itemStack = this.ay(i, bl);
                if (itemStack == null || itemStack.isEmpty()) continue;
                this.iX.add(new ay(itemStack, 16, 16, i > -1, (net.digitalingot.feather.zc$ay) ArmorStatus.this.vz));
            }
        }

        private void ny() {
            if (this.iX.isEmpty()) {
                return;
            }
            switch (1. iH[((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iM.ordinal()]){
                case 1: {
                    int n;
                    int n2 = ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iQ ? 5 : 0;
                    int n3 = n = ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iQ ? 21 : 16;
                    if (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iL == ay.rf.LEFT) {
                        for (ay ay2 : this.iX) {
                            ay2.sb(ay2.jE + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN, n2);
                            n2 += n;
                        }
                        return;
                    }
                    int n4 = this.df();
                    for (ay ay3 : this.iX) {
                        ay3.sb(n4, n2);
                        n2 += n;
                    }
                    break;
                }
                case 2: {
                    int n = 3;
                    for (ay ay4 : this.iX) {
                        ay4.sb(n + ay4.jE + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN, 6);
                        n += ay4.jE;
                    }
                    break;
                }
            }
        }

        @Override
        public ci te() {
            return ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iO;
        }

        class ay {
            public final int iZ;
            public final int jA;
            public final ItemStack jB;
            private final boolean jC;
            private final net.digitalingot.feather.zc$ay jD;
            private int jE;
            private String jF = "";
            private int jG;
            private String jH = "";
            private int jI;

            public ay(ItemStack itemStack, int n, int n2, boolean bl, net.digitalingot.feather.zc$ay ay2) {
                this.jB = itemStack;
                this.jA = n;
                this.iZ = n2;
                this.jC = bl;
                this.jD = ay2;
                this.fp();
            }

            private void fp() {
                if (this.jB == null) {
                    return;
                }
                if ((this.jC && this.jD.iR || !this.jC && this.jD.iV) && this.jB.isItemStackDamageable()) {
                    int n = this.jB.getMaxDamage();
                    int n2 = n - this.jB.getItemDamage();
                    switch (1. iI[this.jD.iK.ordinal()]){
                        case 1: {
                            this.jF = n2 + (this.jD.iW ? "/" + n : "");
                            break;
                        }
                        case 2: {
                            this.jF = n2 * 100 / n + "%";
                            break;
                        }
                    }
                }
                this.jG = rf.this.kw.on(az.uf(this.jF));
                this.jE = ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jG;
                if (this.jD.iQ) {
                    this.jH = az.uf(this.jB.getDisplayName());
                    this.jH = this.jH.replace("Splash ", "").replace("Potion of ", "");
                    this.jE = ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + Math.max(rf.this.kw.on(this.jH), this.jG);
                }
                this.jI = rf.this.kw.on(this.jH);
            }

            public void sb(int n, int n2) {
                int n3 = 0;
                switch (1. iJ[this.jD.iL.ordinal()]){
                    case 1: {
                        n3 = Math.max(this.jG, this.jD.iQ ? this.jI : 0);
                        rf.this.kw.ay(this.jB, n - (2 * ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + n3), n2, this.jD.iS, this.jD.iU);
                        if (this.jD.iQ) {
                            rf.this.kw.ay(this.jH + "\u00a7r", (float) (n - (n3 + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN)), (float) (n2 - 3), ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).sa, true);
                        }
                        rf.this.kw.ay(this.jF + "\u00a7r", (float) (n - (n3 + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN)), (float) (n2 + (this.jD.iQ ? 8 : 2)), ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).sa, true);
                        break;
                    }
                    case 2: {
                        rf.this.kw.ay(this.jB, n - (this.jA + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN), n2, this.jD.iS, this.jD.iU);
                        if (this.jD.iQ) {
                            rf.this.kw.ay(this.jH + "\u00a7r", (float) (n - (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN) - this.jI), (float) (n2 - 3), ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).sa, true);
                        }
                        rf.this.kw.ay(this.jF + "\u00a7r", (float) (n - (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN) - this.jG), (float) (n2 + (this.jD.iQ ? 8 : 2)), ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).sa, true);
                        break;
                    }
                }
                if (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iS && this.jB.isItemStackDamageable()) {
                    GlStateManager.disableDepth();
                    GlStateManager.disableBlend();
                    GlStateManager.disableTexture2D();
                    int n4 = this.jB.getItem().getRGBDurabilityForDisplay(this.jB);
                    double d = this.jB.getItem().getDurabilityForDisplay(this.jB);
                    int n5 = Math.round(13.0f - (float) d * 13.0f);
                    if (this.jD.iL == ay.rf.RIGHT) {
                        n += 2;
                    }
                    rf.this.kw.rf(n - (2 * ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + n3) + 2, n2 + this.iZ - 3, n - (2 * ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + n3) + 15, n2 + this.iZ - 1, -16777216);
                    rf.this.kw.rf(n - (2 * ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + n3) + 2, n2 + this.iZ - 3, n - (2 * ((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iN + this.jA + n3) + n5 + 2, n2 + this.iZ - 2, n4 | 0xFF000000);
                    GlStateManager.enableTexture2D();
                    GlStateManager.enableBlend();
                    GlStateManager.enableDepth();
                }
                if (((net.digitalingot.feather.zc$ay) ArmorStatus.this.vz).iU && this.jB.getCount() != 1) {
                    String string = String.valueOf(this.jB.getCount());
                    GlStateManager.disableDepth();
                    rf.this.kw.ay(string, (float) ((n -= 4) + 1 - Minecraft.getMinecraft().fontRenderer.getStringWidth(string)), (float) (n2 + 9), Color.WHITE.getRGB(), true);
                    GlStateManager.enableDepth();
                }
                fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }
}
