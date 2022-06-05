package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

public class xq
extends FontRenderer {
    private final FontRenderer EA;

    public xq() {
        super(Minecraft.getMinecraft().gameSettings, new ResourceLocation("textures/font/ascii.png"), Minecraft.getMinecraft().getTextureManager(), false);
        this.EA = Minecraft.getMinecraft().fontRenderer;
    }

    public int drawString(String string, float f, float f2, int n, boolean bl) {
        return this.EA.drawString(string, f + 1.0f, f2 + 1.0f, n, bl);
    }

    public int on(String string) {
        return this.getStringWidth(string);
    }

    public int getStringWidth(String string) {
        return this.EA.getStringWidth(string);
    }

    public int getCharWidth(char c) {
        return this.EA.getCharWidth(c);
    }

    public int uj(String string, float f, float f2, int n, boolean bl) {
        return this.EA.drawString(string, f, f2, n, bl);
    }
}
