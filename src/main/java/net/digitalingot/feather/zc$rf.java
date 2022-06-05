package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.ArmorStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class zc$rf
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
        switch (ArmorStatus .1.iH[((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iM.ordinal()]) {
            case 1: {
                return ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iQ ? 130 : 45;
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
        return (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iM == ArmorStatus.ay.uj.HORIZONTAL ? 1 : (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iT ? 5 : 4)) * (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iQ ? 22 : 16);
    }

    @Override
    public int bs() {
        switch (ArmorStatus .1.iH[((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iM.ordinal()]) {
            case 1: {
                return ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iQ ? 130 : 45;
            }
            case 2: {
                return 196;
            }
        }
        throw new IllegalStateException();
    }

    private ItemStack ay(int n, boolean bl) {
        if (bl) {
            if (n == -1 && ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iT) {
                return iG;
            }
            if (n != -1) {
                return iF[n];
            }
        } else {
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (n == -1 && ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iT) {
                return entityPlayerSP.func_184614_ca();
            }
            if (n != -1) {
                return (ItemStack)entityPlayerSP.field_71071_by.armorInventory.get(n);
            }
        }
        return null;
    }

    private void sb(boolean bl) {
        this.iX.clear();
        for (int i = 3; i >= -1; --i) {
            ItemStack itemStack = this.ay(i, bl);
            if (itemStack == null || itemStack.isEmpty()) continue;
            this.iX.add(new ay(itemStack, 16, 16, i > -1, (ArmorStatus.ay) ArmorStatus.this.vz));
        }
    }

    private void ny() {
        if (this.iX.isEmpty()) {
            return;
        }
        switch (ArmorStatus .1.iH[((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iM.ordinal()]) {
            case 1: {
                int n;
                int n2 = ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iQ ? 5 : 0;
                int n3 = n = ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iQ ? 21 : 16;
                if (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iL == ArmorStatus.ay.rf.LEFT) {
                    for (ay ay2 : this.iX) {
                        ay2.sb(ay2.jE + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN, n2);
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
                    ay4.sb(n + ay4.jE + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN, 6);
                    n += ay4.jE;
                }
                break;
            }
        }
    }

    @Override
    public ci te() {
        return ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iO;
    }

    class ay {
        public final int iZ;
        public final int jA;
        public final ItemStack jB;
        private final boolean jC;
        private final ArmorStatus.ay jD;
        private int jE;
        private String jF = "";
        private int jG;
        private String jH = "";
        private int jI;

        public ay(ItemStack itemStack, int n, int n2, boolean bl, ArmorStatus.ay ay2) {
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
                switch (ArmorStatus .1.iI[this.jD.iK.ordinal()]) {
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
            this.jE = ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jG;
            if (this.jD.iQ) {
                this.jH = az.uf(this.jB.getDisplayName());
                this.jH = this.jH.replace("Splash ", "").replace("Potion of ", "");
                this.jE = ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + Math.max(rf.this.kw.on(this.jH), this.jG);
            }
            this.jI = rf.this.kw.on(this.jH);
        }

        public void sb(int n, int n2) {
            int n3 = 0;
            switch (ArmorStatus .1.iJ[this.jD.iL.ordinal()]) {
                case 1: {
                    n3 = Math.max(this.jG, this.jD.iQ ? this.jI : 0);
                    rf.this.kw.ay(this.jB, n - (2 * ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + n3), n2, this.jD.iS, this.jD.iU);
                    if (this.jD.iQ) {
                        rf.this.kw.ay(this.jH + "\u00a7r", (float)(n - (n3 + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN)), (float)(n2 - 3), ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).sa, true);
                    }
                    rf.this.kw.ay(this.jF + "\u00a7r", (float)(n - (n3 + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN)), (float)(n2 + (this.jD.iQ ? 8 : 2)), ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).sa, true);
                    break;
                }
                case 2: {
                    rf.this.kw.ay(this.jB, n - (this.jA + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN), n2, this.jD.iS, this.jD.iU);
                    if (this.jD.iQ) {
                        rf.this.kw.ay(this.jH + "\u00a7r", (float)(n - (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN) - this.jI), (float)(n2 - 3), ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).sa, true);
                    }
                    rf.this.kw.ay(this.jF + "\u00a7r", (float)(n - (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN) - this.jG), (float)(n2 + (this.jD.iQ ? 8 : 2)), ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).sa, true);
                    break;
                }
            }
            if (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iS && this.jB.isItemStackDamageable()) {
                GlStateManager.disableDepth();
                GlStateManager.disableBlend();
                GlStateManager.disableTexture2D();
                int n4 = this.jB.getItem().getRGBDurabilityForDisplay(this.jB);
                double d = this.jB.getItem().getDurabilityForDisplay(this.jB);
                int n5 = Math.round(13.0f - (float)d * 13.0f);
                if (this.jD.iL == ArmorStatus.ay.rf.RIGHT) {
                    n += 2;
                }
                rf.this.kw.rf(n - (2 * ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + n3) + 2, n2 + this.iZ - 3, n - (2 * ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + n3) + 15, n2 + this.iZ - 1, -16777216);
                rf.this.kw.rf(n - (2 * ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + n3) + 2, n2 + this.iZ - 3, n - (2 * ((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iN + this.jA + n3) + n5 + 2, n2 + this.iZ - 2, n4 | 0xFF000000);
                GlStateManager.enableTexture2D();
                GlStateManager.enableBlend();
                GlStateManager.enableDepth();
            }
            if (((ArmorStatus.ay)((ArmorStatus) ArmorStatus.this).vz).iU && this.jB.getCount() != 1) {
                String string = String.valueOf(this.jB.getCount());
                GlStateManager.disableDepth();
                rf.this.kw.ay(string, (float)((n -= 4) + 1 - Minecraft.getMinecraft().fontRenderer.getStringWidth(string)), (float)(n2 + 9), Color.WHITE.getRGB(), true);
                GlStateManager.enableDepth();
            }
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}
