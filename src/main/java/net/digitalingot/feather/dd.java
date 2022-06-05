package net.digitalingot.feather;

import net.digitalingot.feather.mixin.core.ay;
import net.digitalingot.feather.mixin.core.pv;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;

public class dd {
    public static int ay(@NotNull Gui gui) {
        return (int) ((ay) gui).getBlitOffset();
    }

    public static Entity ay(@NotNull RenderManager renderManager) {
        return renderManager.renderViewEntity;
    }

    public static boolean ay(@NotNull Minecraft minecraft) {
        return minecraft.gameSettings.thirdPersonView != 0;
    }

    public static float rf(@NotNull Minecraft minecraft) {
        return minecraft.player.field_71109_bG;
    }

    public static float uj(@NotNull Minecraft minecraft) {
        return minecraft.player.field_70726_aT;
    }

    public static boolean ay(@NotNull ItemStack itemStack) {
        return itemStack.getItem() instanceof ItemFood;
    }

    public static boolean ay(@NotNull Item item) {
        return item instanceof ItemFood;
    }

    public static boolean ay(@NotNull EntityPlayer entityPlayer) {
        return entityPlayer.capabilities.isCreativeMode;
    }

    public static void zz(@NotNull Minecraft minecraft) {
        minecraft.updateDisplay();
    }

    public static void ay(@NotNull KeyBinding keyBinding, int n) {
        keyBinding.setKeyCode(n);
    }

    public static boolean ay(@NotNull Entity entity) {
        return entity.onGround;
    }

    public static boolean rf(@NotNull Entity entity) {
        return entity.isSneaking();
    }

    public static int ay(@NotNull KeyBinding keyBinding) {
        return keyBinding.getKeyCode();
    }

    public static boolean rf(@NotNull KeyBinding keyBinding) {
        return keyBinding.getKeyCode() < 0;
    }

    public static void ay(@NotNull EntityPlayerSP entityPlayerSP, ITextComponent iTextComponent) {
        entityPlayerSP.sendMessage(iTextComponent);
    }

    public static boolean sd(@NotNull Minecraft minecraft) {
        return minecraft.inGameHasFocus;
    }

    public static int ay(@NotNull Enchantment enchantment) {
        return Enchantment.REGISTRY.getIDForObject(enchantment);
    }

    public static double bu(@NotNull Minecraft minecraft) {
        return new ScaledResolution(minecraft).getScaledWidth();
    }

    public static int kl(@NotNull Minecraft minecraft) {
        return new ScaledResolution(minecraft).getScaledHeight();
    }

    public static double nn(@NotNull Minecraft minecraft) {
        return new ScaledResolution(minecraft).getScaleFactor();
    }

    public static int ed(@NotNull Minecraft minecraft) {
        return minecraft.displayWidth;
    }

    public static int zs(@NotNull Minecraft minecraft) {
        return minecraft.displayHeight;
    }

    public static int rf(@NotNull ItemStack itemStack) {
        return itemStack.getCount();
    }

    public static ItemStack ay(@NotNull EntityLivingBase entityLivingBase) {
        return entityLivingBase.getHeldItemMainhand();
    }

    public static Entity uj(@NotNull Entity entity) {
        return entity.getRidingEntity();
    }

    public static Object rf(@NotNull EntityPlayer entityPlayer) {
        return entityPlayer.capabilities;
    }

    public static void ay(@NotNull Entity entity, float f) {
        entity.rotationPitch = f;
    }

    public static float zz(@NotNull Entity entity) {
        return entity.rotationPitch;
    }

    public static void rf(@NotNull Entity entity, float f) {
        entity.rotationYaw = f;
    }

    public static float sd(@NotNull Entity entity) {
        return entity.rotationYaw;
    }

    public static IInventory uj(@NotNull EntityPlayer entityPlayer) {
        return entityPlayer.inventory;
    }

    public static boolean uj(ItemStack itemStack) {
        return itemStack.isEmpty();
    }

    public static int ay(EntityTNTPrimed entityTNTPrimed) {
        return entityTNTPrimed.getFuse();
    }

    public static <T extends GuiButton> T ay(@NotNull GuiScreen guiScreen, T t) {
        pv pv2 = (pv) guiScreen;
        pv2.getRenderables().add(t);
        return t;
    }
}
