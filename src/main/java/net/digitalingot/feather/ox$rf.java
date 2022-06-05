package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.ItemCounter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ox$rf
extends kb {
    private int mZ = 0;

    private void iu(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, Items.ARROW);
        int n5 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, Items.COOKED_BEEF, Items.COOKED_PORKCHOP, Items.GOLDEN_CARROT);
        int n6 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, lV);
        int n7 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, lW);
        int n8 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, lQ, lR, lT, lU);
        int n9 = n3 = bl ? 0 : zf.ay((EntityPlayer)MINECRAFT.player, Items.MUSHROOM_STEW);
        if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.bg) {
            n2 = this.df();
            n = this.hu();
            this.kw.rf(0, 0, n2, n, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.kv.getRGB());
            if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.pi) {
                int n10 = ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.hi.getRGB();
                float f = (float)((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.xt / 20.0f;
                this.kw.ay(0, 0, n2, n, n10, f);
            }
        }
        switch (ItemCounter .1.mB[((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mE.ordinal()]) {
            case 1: {
                n2 = 0;
                n = 2;
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mI) {
                    this.ay(n2, 2, Items.ARROW, n4, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mJ);
                    n2 += this.mi(n4) + 2;
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mL) {
                    this.ay(n2, 2, Items.COOKED_BEEF, n5, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mM);
                    n2 += this.mi(n5) + 2;
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mR) {
                    this.ay(n2, 2, Items.GOLDEN_APPLE, n6, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mS);
                    n2 += this.mi(n6) + 2;
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mU) {
                    this.ay(n2, 2, lW, n7, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mV);
                    n2 += this.mi(n7) + 2;
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mO) {
                    this.ay(n2, 2, lR, n8, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mP);
                    n2 += this.mi(n8) + 2;
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mX) {
                    this.ay(n2, 2, Items.MUSHROOM_STEW, n3, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mY);
                    n2 += this.mi(n3);
                }
                this.mZ = n2;
                break;
            }
            case 2: {
                n2 = 0;
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mI) {
                    this.ay(0, n2, Items.ARROW, n4, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mJ);
                    n2 += this.am();
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mL) {
                    this.ay(0, n2, Items.COOKED_BEEF, n5, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mM);
                    n2 += this.am();
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mR) {
                    this.ay(0, n2, Items.GOLDEN_APPLE, n6, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mS);
                    n2 += this.am();
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mU) {
                    this.ay(0, n2, lW, n7, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mV);
                    n2 += this.am();
                }
                if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mO) {
                    this.ay(0, n2, lR, n8, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mP);
                    n2 += this.am();
                }
                if (!((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mX) break;
                this.ay(0, n2, Items.MUSHROOM_STEW, n3, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF, ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mY);
                break;
            }
        }
    }

    @Override
    public void ay(qx qx2) {
        this.iu(false);
    }

    @Override
    public void ms() {
        this.iu(true);
    }

    @Override
    public int hu() {
        if (((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mE == ItemCounter.ay.ay.HORIZONTAL) {
            return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.TOP || ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.BOTTOM ? 30 : 16;
        }
        return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.TOP || ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.BOTTOM ? ItemCounter.this.qe() * 30 - 2 : ItemCounter.this.qe() * 18 - 2;
    }

    @Override
    public int df() {
        return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mE == ItemCounter.ay.ay.HORIZONTAL ? this.mZ : this.mi(99);
    }

    private int am() {
        return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.BOTTOM || ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.TOP ? 30 : 18;
    }

    private int em(int n) {
        return (16 - this.kw.on(String.valueOf(n))) / 2;
    }

    private int mi(int n) {
        return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.BOTTOM || ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mF == ItemCounter.ay.rf.TOP ? 16 : 18 + this.kw.on(String.valueOf(n));
    }

    public void ay(int n, int n2, Item item, int n3, ItemCounter.ay.rf rf2, gp gp2) {
        ItemStack itemStack = new ItemStack(item);
        this.ay(n, n2, itemStack, n3, rf2, gp2);
    }

    public void ay(int n, int n2, ItemStack itemStack, int n3, ItemCounter.ay.rf rf2, gp gp2) {
        int n4;
        int n5;
        int n6;
        int n7;
        switch (ItemCounter .1.mC[rf2.ordinal()]) {
            case 1: {
                n7 = n;
                n6 = n2;
                n5 = n + this.em(n3);
                n4 = n2 + 16;
                break;
            }
            case 2: {
                n7 = n;
                n6 = n2 + 12;
                n5 = n + this.em(n3);
                n4 = n2;
                break;
            }
            case 3: {
                n7 = n + this.kw.on(String.valueOf(n3)) + 2;
                n6 = n2;
                n5 = n;
                n4 = n2 + 2;
                break;
            }
            case 4: {
                n7 = n;
                n6 = n2;
                n5 = n + 16 + 2;
                n4 = n2 + 2;
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        this.kw.ay(itemStack, n7, n6, false, false);
        this.kw.ay(String.valueOf(n3), (float)n5, (float)n4, gp2, !((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG.bg);
        fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public ci te() {
        return ((ItemCounter.ay)((ItemCounter) ItemCounter.this).vz).mG;
    }
}
