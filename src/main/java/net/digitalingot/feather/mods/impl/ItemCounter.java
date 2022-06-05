package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - recommend switching to table mode
 */
@sv(aw= qc.ITEM_COUNTER, jf=@bx(vu="Item Counter", jm="https://assets.feathercdn.net/game/mods/itemcounter.svg", mz="Count items in your inventory", lq={ly.ay.PVP, ly.ay.HUD}))
@pq(we={@xd(bp=rf.class)})
public class ItemCounter
extends HUDMod<ay> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final ItemStack lQ = ItemCounter.ay(Items.POTIONITEM, 8197);
    private static final ItemStack lR = ItemCounter.ay(Items.POTIONITEM, 8229);
    private static final Item lS = Items.SPLASH_POTION;
    private static final ItemStack lT = ItemCounter.ay(lS, 16389);
    private static final ItemStack lU = ItemCounter.ay(lS, 16421);
    private static final ItemStack lV = ItemCounter.ay(Items.GOLDEN_APPLE, 0);
    private static final ItemStack lW = ItemCounter.ay(Items.GOLDEN_APPLE, 1);
    private static final int lX = 16;
    private static final int lY = 16;
    private static final int lZ = 2;
    private static final int mA = 2;

    @NotNull
    private static ItemStack ay(@NotNull Item item, int n) {
        ItemStack itemStack = new ItemStack(item, 1);
        itemStack.setItemDamage(n);
        switch (n) {
            case 8197: 
            case 16389: {
                ItemCounter.ay(itemStack, "minecraft:healing");
                break;
            }
            case 8229: 
            case 16421: {
                ItemCounter.ay(itemStack, "minecraft:strong_healing");
                break;
            }
        }
        return itemStack;
    }

    private static void ay(ItemStack itemStack, String string) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        nBTTagCompound.setString("Potion", string);
        itemStack.setTagCompound(nBTTagCompound);
        itemStack.setItemDamage(0);
    }

    public int qe() {
        int n = 0;
        for (boolean bl : new boolean[]{((ay)this.vz).mI, ((ay)this.vz).mL, ((ay)this.vz).mO, ((ay)this.vz).mR, ((ay)this.vz).mU, ((ay)this.vz).mX}) {
            if (!bl) continue;
            ++n;
        }
        return n;
    }

    public static classox$ay
    extends zi {
        @de(vi=10)
        public iv mD = new iv("Item Counter");
        @au(wd="displayMode", vu="Display Mode", pr="horizontal", yp=@de(vi=11))
        public ay mE;
        @au(wd="textAlignment", vu="Text Alignment", pr="top", yp=@de(vi=12))
        public rf mF;
        @fl(yp=@de(vi=20))
        @cy(yv= ho.BOTTOM_CENTER, dz=151.0)
        public ju mG;
        @de(vi=30)
        public iv mH = new iv("Arrows");
        @au(wd="arrows", vu="Arrows", pr="true", yp=@de(vi=31))
        public boolean mI;
        @au(wd="arrowsColor", vu="Color", nu=@ra(wd="arrows"), yp=@de(vi=32))
        public gp mJ;
        @de(vi=40)
        public iv mK = new iv("Food");
        @au(wd="food", vu="Food", pr="true", yp=@de(vi=41))
        public boolean mL;
        @au(wd="foodColor", vu="Color", nu=@ra(wd="food"), yp=@de(vi=42))
        public gp mM;
        @de(vi=50)
        public iv mN = new iv("Potions");
        @au(wd="potions", vu="Potions", pr="true", yp=@de(vi=51))
        public boolean mO;
        @au(wd="potionsColor", vu="Color", nu=@ra(wd="potions"), yp=@de(vi=52))
        public gp mP;
        @de(vi=60)
        public iv mQ = new iv("Golden Apples");
        @au(wd="goldenApples", vu="Golden Apples", pr="true", yp=@de(vi=61))
        public boolean mR;
        @au(wd="goldenApplesColor", vu="Color", nu=@ra(wd="goldenApples"), yp=@de(vi=62))
        public gp mS;
        @de(vi=70)
        public iv mT = new iv("God Apples");
        @au(wd="godApples", vu="God Apples", pr="true", yp=@de(vi=71))
        public boolean mU;
        @au(wd="godApplesColor", vu="Color", nu=@ra(wd="godApples"), yp=@de(vi=72))
        public gp mV;
        @de(vi=80)
        public iv mW = new iv("Soup");
        @au(wd="soup", vu="Soup", pr="true", yp=@de(vi=81))
        public boolean mX;
        @au(wd="soupColor", vu="Color", nu=@ra(wd="soup"), yp=@de(vi=82))
        public gp mY;

        public static enum ay {
            HORIZONTAL,
            VERTICAL

        }

        public static enum rf {
            BOTTOM,
            LEFT,
            RIGHT,
            TOP

        }
    }

    public class rf
    extends kb {
        private int mZ = 0;

        private void iu(boolean bl) {
            int n;
            int n2;
            int n3;
            int n4 = bl ? 0 : zf.ay(MINECRAFT.player, Items.ARROW);
            int n5 = bl ? 0 : zf.ay(MINECRAFT.player, Items.COOKED_BEEF, Items.COOKED_PORKCHOP, Items.GOLDEN_CARROT);
            int n6 = bl ? 0 : zf.ay(MINECRAFT.player, lV);
            int n7 = bl ? 0 : zf.ay(MINECRAFT.player, lW);
            int n8 = bl ? 0 : zf.ay(MINECRAFT.player, lQ, lR, lT, lU);
            int n9 = n3 = bl ? 0 : zf.ay(MINECRAFT.player, Items.MUSHROOM_STEW);
            if (((ay) ItemCounter.this.vz).mG.bg) {
                n2 = this.df();
                n = this.hu();
                this.kw.rf(0, 0, n2, n, ((ay) ItemCounter.this.vz).mG.kv.getRGB());
                if (((ay) ItemCounter.this.vz).mG.pi) {
                    int n10 = ((ay) ItemCounter.this.vz).mG.hi.getRGB();
                    float f = (float)((ay) ItemCounter.this.vz).mG.xt / 20.0f;
                    this.kw.ay(0, 0, n2, n, n10, f);
                }
            }
            switch (1.mB[((ay) ItemCounter.this.vz).mE.ordinal()]) {
                case 1: {
                    n2 = 0;
                    n = 2;
                    if (((ay) ItemCounter.this.vz).mI) {
                        this.ay(n2, 2, Items.ARROW, n4, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mJ);
                        n2 += this.mi(n4) + 2;
                    }
                    if (((ay) ItemCounter.this.vz).mL) {
                        this.ay(n2, 2, Items.COOKED_BEEF, n5, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mM);
                        n2 += this.mi(n5) + 2;
                    }
                    if (((ay) ItemCounter.this.vz).mR) {
                        this.ay(n2, 2, Items.GOLDEN_APPLE, n6, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mS);
                        n2 += this.mi(n6) + 2;
                    }
                    if (((ay) ItemCounter.this.vz).mU) {
                        this.ay(n2, 2, lW, n7, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mV);
                        n2 += this.mi(n7) + 2;
                    }
                    if (((ay) ItemCounter.this.vz).mO) {
                        this.ay(n2, 2, lR, n8, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mP);
                        n2 += this.mi(n8) + 2;
                    }
                    if (((ay) ItemCounter.this.vz).mX) {
                        this.ay(n2, 2, Items.MUSHROOM_STEW, n3, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mY);
                        n2 += this.mi(n3);
                    }
                    this.mZ = n2;
                    break;
                }
                case 2: {
                    n2 = 0;
                    if (((ay) ItemCounter.this.vz).mI) {
                        this.ay(0, n2, Items.ARROW, n4, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mJ);
                        n2 += this.am();
                    }
                    if (((ay) ItemCounter.this.vz).mL) {
                        this.ay(0, n2, Items.COOKED_BEEF, n5, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mM);
                        n2 += this.am();
                    }
                    if (((ay) ItemCounter.this.vz).mR) {
                        this.ay(0, n2, Items.GOLDEN_APPLE, n6, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mS);
                        n2 += this.am();
                    }
                    if (((ay) ItemCounter.this.vz).mU) {
                        this.ay(0, n2, lW, n7, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mV);
                        n2 += this.am();
                    }
                    if (((ay) ItemCounter.this.vz).mO) {
                        this.ay(0, n2, lR, n8, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mP);
                        n2 += this.am();
                    }
                    if (!((ay) ItemCounter.this.vz).mX) break;
                    this.ay(0, n2, Items.MUSHROOM_STEW, n3, ((ay) ItemCounter.this.vz).mF, ((ay) ItemCounter.this.vz).mY);
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
            if (((ay) ItemCounter.this.vz).mE == ay.ay.HORIZONTAL) {
                return ((ay) ItemCounter.this.vz).mF == ay.rf.TOP || ((ay) ItemCounter.this.vz).mF == ay.rf.BOTTOM ? 30 : 16;
            }
            return ((ay) ItemCounter.this.vz).mF == ay.rf.TOP || ((ay) ItemCounter.this.vz).mF == ay.rf.BOTTOM ? ItemCounter.this.qe() * 30 - 2 : ItemCounter.this.qe() * 18 - 2;
        }

        @Override
        public int df() {
            return ((ay) ItemCounter.this.vz).mE == ay.ay.HORIZONTAL ? this.mZ : this.mi(99);
        }

        private int am() {
            return ((ay) ItemCounter.this.vz).mF == ay.rf.BOTTOM || ((ay) ItemCounter.this.vz).mF == ay.rf.TOP ? 30 : 18;
        }

        private int em(int n) {
            return (16 - this.kw.on(String.valueOf(n))) / 2;
        }

        private int mi(int n) {
            return ((ay) ItemCounter.this.vz).mF == ay.rf.BOTTOM || ((ay) ItemCounter.this.vz).mF == ay.rf.TOP ? 16 : 18 + this.kw.on(String.valueOf(n));
        }

        public void ay(int n, int n2, Item item, int n3, ay.rf rf2, gp gp2) {
            ItemStack itemStack = new ItemStack(item);
            this.ay(n, n2, itemStack, n3, rf2, gp2);
        }

        public void ay(int n, int n2, ItemStack itemStack, int n3, ay.rf rf2, gp gp2) {
            int n4;
            int n5;
            int n6;
            int n7;
            switch (1.mC[rf2.ordinal()]) {
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
            this.kw.ay(String.valueOf(n3), (float)n5, (float)n4, gp2, !((ay) ItemCounter.this.vz).mG.bg);
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override
        public ci te() {
            return ((ay) ItemCounter.this.vz).mG;
        }
    }
}
