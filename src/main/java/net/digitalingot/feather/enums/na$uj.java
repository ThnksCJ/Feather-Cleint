package net.digitalingot.feather.enums;

import net.minecraft.util.ResourceLocation;

public enum na$uj {
    DEFAULT("default.png", 1728, 70, 4.8f),
    SIMPLE("simple.png", 1728, 84, 4.8f),
    NO_TICK("no_tick.png", 1728, 84, 4.8f);

    private static final String BASE_PATH = "textures/direction/";
    public final ResourceLocation texture;
    public final int textureWidth;
    public final int textureHeight;
    public final float pixelsPerDegree;

    na$uj(String string2, int n2, int n3, float f) {
        this.texture = new ResourceLocation("feather:textures/direction/" + string2);
        this.textureWidth = n2;
        this.textureHeight = n3;
        this.pixelsPerDegree = f;
    }
}
