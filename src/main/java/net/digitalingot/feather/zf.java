package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class zf {
    public static int ay(EntityPlayer entityPlayer, Item... itemArray) {
        int n = 0;
        block0:
        for (ItemStack itemStack : entityPlayer.inventory.mainInventory) {
            if (itemStack.isEmpty()) continue;
            for (Item item : itemArray) {
                if (itemStack.getItem() != item) continue;
                n += itemStack.getCount();
                continue block0;
            }
        }
        return n;
    }

    public static int ay(EntityPlayer entityPlayer, ItemStack... itemStackArray) {
        int n = 0;
        for (ItemStack itemStack : entityPlayer.inventory.mainInventory) {
            if (itemStack.isEmpty()) continue;
            int n2 = itemStack.getItemDamage();
            int n3 = itemStack.getCount();
            ItemStack[] itemStackArray2 = itemStackArray;
            int n4 = itemStackArray2.length;
            for (int i = 0; i < n4; ++i) {
                ItemStack itemStack2;
                ItemStack itemStack3 = itemStack2 = itemStackArray2[i];
                if (itemStack.getItem() != itemStack3.getItem() || n2 != itemStack3.getItemDamage()) continue;
                n += n3;
            }
        }
        return n;
    }

    @Deprecated
    public static void ay(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        wa wa2 = wa.Fl;
        wa2.ay(7, DefaultVertexFormats.POSITION_TEX);
        wa2.zz(n, n2 + n6, f).zz((float) n3 * f2, (float) (n4 + n6) * f3).pe();
        wa2.zz(n + n5, n2 + n6, f).zz((float) (n3 + n5) * f2, (float) (n4 + n6) * f3).pe();
        wa2.zz(n + n5, n2, f).zz((float) (n3 + n5) * f2, (float) n4 * f3).pe();
        wa2.zz(n, n2, f).zz((float) n3 * f2, (float) n4 * f3).pe();
        wa2.ok();
    }

    @Deprecated
    public static void ay(FontRenderer fontRenderer, ItemStack itemStack, int n, int n2, boolean bl, boolean bl2) {
        int n3;
        if (itemStack == null || !bl && !bl2) {
            return;
        }
        if (itemStack.isItemDamaged() && bl) {
            n3 = (int) Math.round(13.0 - (double) itemStack.getItemDamage() * 13.0 / (double) itemStack.getMaxDamage());
            int n4 = (int) Math.round(255.0 - (double) itemStack.getItemDamage() * 255.0 / (double) itemStack.getMaxDamage());
            fp.Z();
            fp.aB();
            fp.aI();
            fp.W();
            fp.aF();
            int n5 = 255 - n4 << 16 | n4 << 8;
            int n6 = (255 - n4) / 4 << 16 | 0x3F00;
            wa wa2 = wa.Fl;
            zf.ay(wa2, n + 2, n2 + 13, 13, 2, 0);
            zf.ay(wa2, n + 2, n2 + 13, 12, 1, n6);
            zf.ay(wa2, n + 2, n2 + 13, n3, 1, n5);
            fp.X();
            fp.aJ();
            fp.Y();
            fp.aA();
            fp.ay(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (bl2) {
            n3 = 0;
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (itemStack.getMaxStackSize() > 1) {
                n3 = zf.ay(entityPlayerSP, itemStack);
            } else if (itemStack.getItem().equals(Items.BOW)) {
                n3 = zf.ay(entityPlayerSP, Items.ARROW);
            }
            if (n3 > 1) {
                String string = String.valueOf(n3);
                fp.aB();
                vr.nS().drawString(string, n + 19 - 2 - vr.nR().on(string), n2 + 6 + 3, 0xFFFFFF, false);
                fp.aA();
            }
        }
    }

    public static void ay(FontRenderer fontRenderer, ItemStack itemStack, int n, int n2) {
        zf.ay(fontRenderer, itemStack, n, n2, true, true);
    }

    @Deprecated
    public static void ay(wa wa2, int n, int n2, int n3, int n4, int n5) {
        int n6 = n5 >> 16 & 0xFF;
        int n7 = n5 >> 8 & 0xFF;
        int n8 = n5 & 0xFF;
        wa2.ay(7, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(n, n2, 0.0).sd(n6, n7, n8, 255).pe();
        wa2.zz(n, n2 + n4, 0.0).sd(n6, n7, n8, 255).pe();
        wa2.zz(n + n3, n2 + n4, 0.0).sd(n6, n7, n8, 255).pe();
        wa2.zz(n + n3, n2, 0.0).sd(n6, n7, n8, 255).pe();
        wa2.ok();
    }

    public static void rf(ItemStack itemStack, int n, int n2, boolean bl, boolean bl2) {
        int n3;
        int n4;
        if (itemStack == null || !bl && !bl2) {
            return;
        }
        if (itemStack.isItemDamaged() && bl) {
            n4 = (int) Math.round(13.0 - (double) itemStack.getItemDamage() * 13.0 / (double) itemStack.getMaxDamage());
            int n5 = (int) Math.round(255.0 - (double) itemStack.getItemDamage() * 255.0 / (double) itemStack.getMaxDamage());
            int n6 = 255 - n5 << 16 | n5 << 8;
            n3 = (255 - n5) / 4 << 16 | 0x3F00;
            fp.Z();
            fp.aB();
            fp.aI();
            fp.W();
            fp.aF();
            zf.zz(n + 2, n2 + 13, 13, 2, 0);
            zf.zz(n + 2, n2 + 13, 12, 1, n3);
            zf.zz(n + 2, n2 + 13, n4, 1, n6);
            fp.X();
            fp.aJ();
            fp.Y();
            fp.aA();
        }
        if (bl2) {
            n4 = 0;
            EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
            if (itemStack.getMaxStackSize() > 1) {
                n4 = zf.ay(entityPlayerSP, itemStack);
            } else if (itemStack.getItem().equals(Items.BOW)) {
                n4 = zf.ay(entityPlayerSP, Items.ARROW);
            }
            if (n4 > 1) {
                String string = String.valueOf(n4);
                n3 = fp.mq(string);
                fp.aB();
                vr.nR().ay(string, (float) (n + 19 - 2 - n3), (float) (n2 + 6 + 3), -1, false);
                fp.aA();
            }
        }
    }

    public static void zz(int n, int n2, int n3, int n4, int n5) {
        int n6 = n5 >> 16 & 0xFF;
        int n7 = n5 >> 8 & 0xFF;
        int n8 = n5 & 0xFF;
        wa wa2 = wa.Fl;
        wa2.ay(7, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(n, n2, 0.0f).sd(n6, n7, n8, 255).pe();
        wa2.zz(n, n2 + n4, 0.0f).sd(n6, n7, n8, 255).pe();
        wa2.zz(n + n3, n2 + n4, 0.0f).sd(n6, n7, n8, 255).pe();
        wa2.zz(n + n3, n2, 0.0f).sd(n6, n7, n8, 255).pe();
        wa2.ok();
    }
}
