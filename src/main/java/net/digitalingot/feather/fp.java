package net.digitalingot.feather;

import net.digitalingot.feather.ky;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class fp {
    public static final float BL = 7.0f;
    public static final float BM = 1.0f;
    public static final float BN = 1.0f;
    private static final FontRenderer BO = Minecraft.getMinecraft().fontRenderer;
    private static final TextureManager BP = Minecraft.getMinecraft().getTextureManager();

    private fp() {
        throw new AssertionError();
    }

    public static void W() {
        GlStateManager.disableAlpha();
    }

    public static void X() {
        GlStateManager.enableAlpha();
    }

    public static void ay(int n, float f) {
        GlStateManager.alphaFunc(n, f);
    }

    public static void hj(int n) {
        GlStateManager.shadeModel(n);
    }

    public static void Y() {
        GlStateManager.enableLighting();
    }

    public static void Z() {
        GlStateManager.disableLighting();
    }

    public static void aA() {
        GlStateManager.enableDepth();
    }

    public static void aB() {
        GlStateManager.disableDepth();
    }

    public static void rf(int n) {
        GlStateManager.depthFunc(n);
    }

    public static void mm(boolean bl) {
        GlStateManager.depthMask(bl);
    }

    public static void aC() {
        GlStateManager.enableRescaleNormal();
    }

    public static void aD() {
        GlStateManager.disableRescaleNormal();
    }

    public static void aE() {
        GlStateManager.enableBlend();
    }

    public static void aF() {
        GlStateManager.disableBlend();
    }

    public static void aG() {
        GlStateManager.disableCull();
    }

    public static void aH() {
        GlStateManager.disableCull();
    }

    public static void uj(int n, int n2, int n3, int n4) {
        GlStateManager.tryBlendFuncSeparate(n, n2, n3, n4);
    }

    public static void iu(int n, int n2) {
        GlStateManager.blendFunc(n, n2);
    }

    @Deprecated
    public static void aI() {
        GlStateManager.disableTexture2D();
    }

    @Deprecated
    public static void aJ() {
        GlStateManager.enableTexture2D();
    }

    public static void ay(float f, float f2, float f3, float f4) {
        GlStateManager.color(f, f2, f3, f4);
    }

    public static void ay(float f, float f2, float f3) {
        GlStateManager.color(f, f2, f3);
    }

    public static void pv(float f) {
        GL11.glLineWidth(f);
    }

    public static float aK() {
        return GL11.glGetFloat(2849);
    }

    public static int mq(String string) {
        return BO.getStringWidth(string);
    }

    public static float xs(boolean bl) {
        float f = 7.0f;
        if (bl) {
            f += 1.0f;
        }
        return f;
    }

    public static int aL() {
        return GL11.glGetInteger(34016);
    }

    public static void ve(int n) {
        GlStateManager.setActiveTexture(n);
    }

    private static void lm(int n) {
        GlStateManager.bindTexture(n);
    }

    public static void ig(int n, int n2) {
        int n3 = fp.aL();
        fp.ve(33984 + n);
        fp.lm(n2);
        fp.ve(n3);
    }

    public static void ay(int n, ResourceLocation resourceLocation) {
        fp.ig(n, fp.ay(resourceLocation));
    }

    private static int ay(ResourceLocation resourceLocation) {
        ITextureObject iTextureObject = BP.getTexture(resourceLocation);
        if (iTextureObject == null) {
            iTextureObject = new SimpleTexture(resourceLocation);
            BP.loadTexture(resourceLocation, iTextureObject);
        }
        return iTextureObject.getGlTextureId();
    }

    @Deprecated
    public static void aM() {
        ky.aM();
    }

    @Deprecated
    public static void aN() {
        ky.aN();
    }

    @Deprecated
    public static void rf(float f, float f2, float f3) {
        ky.rf((float) f, (float) f2, (float) f3);
    }

    @Deprecated
    public static void ay(double d, double d2, double d3) {
        ky.ay((double) d, (double) d2, (double) d3);
    }

    @Deprecated
    public static void rf(float f, float f2, float f3, float f4) {
        ky.rf((float) f, (float) f2, (float) f3, (float) f4);
    }

    @Deprecated
    public static void uj(float f, float f2, float f3) {
        ky.uj((float) f, (float) f2, (float) f3);
    }

    @Deprecated
    public static void rf(double d, double d2, double d3) {
        ky.rf((double) d, (double) d2, (double) d3);
    }
}
