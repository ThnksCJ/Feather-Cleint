package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.qj;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.text.translation.I18n;

import java.awt.*;
import java.util.List;
import java.util.Map;

@sv(aw= qc.ITEM_INFO, jf=@bx(vu="Item Info", jm="https://assets.feathercdn.net/game/mods/iteminfo.svg", mz="Display enchants when picking up an item", lq={ly.ay.PVP, ly.ay.HUD}))
@pq(we={@xd(bp=rf.class)})
public class ItemInfo
extends HUDMod<ay> {
    private static final String nB = "";
    private static final String nC = "14";
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();

    private String pk() {
        EntityPlayerSP entityPlayerSP = ItemInfo.MINECRAFT.player;
        if (entityPlayerSP == null) {
            return nB;
        }
        ItemStack itemStack = entityPlayerSP.func_184614_ca();
        if (itemStack.isEmpty()) {
            return nB;
        }
        if (itemStack.getItem() instanceof ItemPotion) {
            return this.nn(itemStack);
        }
        return this.kl(itemStack);
    }

    private String kl(ItemStack itemStack) {
        if (!itemStack.isItemEnchanted()) {
            return nB;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : EnchantmentHelper.getEnchantments(itemStack).entrySet()) {
            Enchantment enchantment = (Enchantment)entry.getKey();
            int n = Enchantment.REGISTRY.getIDForObject(enchantment);
            stringBuilder.append((String)qj.Fv.get(n)).append(" ").append(entry.getValue()).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private String nn(ItemStack itemStack) {
        List list = PotionUtils.getEffectsFromStack(itemStack);
        if (list == null || list.isEmpty()) {
            return nB;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (PotionEffect potionEffect : list) {
            int n = potionEffect.getDuration() / 20;
            stringBuilder.append(I18n.translateToLocal(potionEffect.getEffectName())).append(" ").append(potionEffect.getAmplifier() + 1).append(" (").append(n / 60).append(String.format(":%02d", n % 60)).append(") ");
        }
        return stringBuilder.toString().trim();
    }

    private int rr() {
        EntityPlayerSP entityPlayerSP = ItemInfo.MINECRAFT.player;
        if (entityPlayerSP == null) {
            return -1;
        }
        ItemStack itemStack = entityPlayerSP.func_184614_ca();
        if (itemStack.isEmpty()) {
            return -1;
        }
        Item item = itemStack.getItem();
        int n = itemStack.getItemDamage();
        if (item instanceof ItemBow) {
            item = Items.ARROW;
            n = 0;
        }
        int n2 = Item.getIdFromItem(item);
        int n3 = 0;
        for (ItemStack itemStack2 : entityPlayerSP.field_71071_by.mainInventory) {
            if (itemStack2 == null || Item.getIdFromItem(itemStack2.getItem()) != n2 || itemStack2.getItemDamage() != n) continue;
            n3 += itemStack2.getCount();
        }
        return n3;
    }

    public static class ay
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(yv= ho.BOTTOM_CENTER, dz=-1.0, ev=-56.0)
        public fw jQ;
        @de(vi=10)
        public iv nD = new iv("Item Info");
        @au(wd="showTime", vu="Show Time", pr="15", yp=@de(vi=11))
        @mj(js=30)
        public int nE;
        @de(vi=20)
        public iv nF = new iv("Count");
        @au(wd="count", vu="Count", pr="true", yp=@de(vi=21))
        public boolean nG;
        @au(wd="countColor", vu="Count Color", pr="false/192/192/192", nu=@ra(wd="count"), yp=@de(vi=22))
        public gp nH;
        @de(vi=30)
        public iv nI = new iv("Enchants");
        @au(wd="enchants", vu="Enchants", yp=@de(vi=31))
        public boolean nJ;
        @au(wd="enchantsColor", vu="Color", pr="false/192/192/192", nu=@ra(wd="enchants"), yp=@de(vi=32))
        public gp nK;
        @de(vi=40)
        public iv nL = new iv("Fade Out");
        @au(wd="fadeOut", vu="Fade Out", pr="true", yp=@de(vi=41))
        public boolean nM;
        @au(wd="fadeOutTime", vu="Time", pr="5", nu=@ra(wd="fadeOut"), yp=@de(vi=42))
        @mj(js=20)
        public int nN;
    }

    public class rf
    extends kb {
        private String nO;
        private long nP;
        private float eg;

        @Override
        public void ay(qx qx2) {
            this.ig(qx2 == qx.MOD_LAYOUT);
        }

        @Override
        public void ms() {
            this.kw.ay(ItemInfo.nC, 0.0f, 0.0f, ((ay) ItemInfo.this.vz).nH, true);
        }

        @Override
        public int br() {
            return 0;
        }

        @Override
        public int to() {
            return 0;
        }

        private void ig(boolean bl) {
            Color color;
            Object object;
            float f = this.eg;
            String string = null;
            String string2 = null;
            if (((ay) ItemInfo.this.vz).nJ) {
                string = bl ? ItemInfo.nB : ItemInfo.this.pk();
            }
            if (((ay) ItemInfo.this.vz).nG) {
                if (bl) {
                    string2 = ItemInfo.nC;
                } else {
                    int n = ItemInfo.this.rr();
                    if (n != -1) {
                        string2 = String.valueOf(n);
                    }
                }
            }
            float f2 = 1.0f;
            if (!bl && ((ay) ItemInfo.this.vz).nM) {
                object = string + "\n" + string2;
                long l = 0L;
                if (object.equals(this.nO)) {
                    l = System.currentTimeMillis() - this.nP - (long)((ay) ItemInfo.this.vz).nE * 100L;
                } else {
                    this.nO = object;
                    this.nP = System.currentTimeMillis();
                }
                if (l >= (long)((ay) ItemInfo.this.vz).nN * 100L) {
                    return;
                }
                if (l > 0L) {
                    f2 = 1.0f - (float)l / 100.0f / (float)((ay) ItemInfo.this.vz).nN;
                }
            }
            if (string != null) {
                object = ((ay) ItemInfo.this.vz).nK.pg();
                color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), Math.max(5, (int)((float)((Color)object).getAlpha() * f2)));
                this.kw.ay(string, (float)(this.df() - this.kw.on(string)) / 2.0f, f, color.getRGB(), true, ((ay) ItemInfo.this.vz).nK.sc());
                f += 16.0f;
            }
            if (string2 != null) {
                object = ((ay) ItemInfo.this.vz).nH.pg();
                color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), Math.max(5, (int)((float)((Color)object).getAlpha() * f2)));
                this.kw.ay(string2, (float)(this.df() - this.kw.on(string2)) / 2.0f, f, color.getRGB(), true, ((ay) ItemInfo.this.vz).nH.sc());
            }
        }

        @Override
        public int hu() {
            if (((ay) ItemInfo.this.vz).nG) {
                return ((ay) ItemInfo.this.vz).nJ ? 30 : 14;
            }
            return ((ay) ItemInfo.this.vz).nJ ? 14 : 0;
        }

        @Override
        public int df() {
            return ((ay) ItemInfo.this.vz).nJ ? 120 : 30;
        }

        @Override
        public void zq() {
            float f = 8.0f;
            this.eg = ((float)this.hu() - f) / 2.0f;
        }

        @Override
        public ci te() {
            return ((ay) ItemInfo.this.vz).jQ;
        }
    }
}
