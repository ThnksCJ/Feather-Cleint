package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public class co {
    private static final ResourceLocation[] kn = new ResourceLocation[]{new ResourceLocation("feather:textures/gui/panorama/panorama_0.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_1.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_2.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_3.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_4.png"), new ResourceLocation("feather:textures/gui/panorama/panorama_5.png")};
    @NotNull
    private final ok zg;
    private float en;
    private int tq;

    public co(@NotNull ok ok2) {
        this.zg = ok2;
    }

    public void ay(float f) {
        if (this.en > f) {
            ++this.tq;
        }
        this.en = f;
        float f2 = (float)this.tq + f;
        this.ay(this.zg.mc, (float)Math.sin(f2 * 0.001f) * 5.0f + 25.0f, -f2 * 0.1f, 1.0f);
    }

    public void ay(Minecraft minecraft, float f, float f2, float f3) {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.matrixMode(5889);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.multMatrix(this.ay(85.0, (float)minecraft.currentScreen.width / (float)minecraft.currentScreen.height, 0.05f, 10.0f));
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.disableCull();
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        for (int i = 0; i < 4; ++i) {
            GlStateManager.pushMatrix();
            float f4 = ((float)(i % 2) / 2.0f - 0.5f) / 256.0f;
            float f5 = ((float)(i / 2) / 2.0f - 0.5f) / 256.0f;
            float f6 = 0.0f;
            GlStateManager.translate(f4, f5, 0.0f);
            GlStateManager.rotate(f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(f2, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                minecraft.getTextureManager().bindTexture(kn[j]);
                bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                int n = Math.round(255.0f * f3) / (i + 1);
                if (j == 0) {
                    bufferBuilder.pos(-1.0, -1.0, 1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, 1.0, 1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, 1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, -1.0, 1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                if (j == 1) {
                    bufferBuilder.pos(1.0, -1.0, 1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, 1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, -1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, -1.0, -1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                if (j == 2) {
                    bufferBuilder.pos(1.0, -1.0, -1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, -1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, 1.0, -1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, -1.0, -1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                if (j == 3) {
                    bufferBuilder.pos(-1.0, -1.0, -1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, 1.0, -1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, 1.0, 1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, -1.0, 1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                if (j == 4) {
                    bufferBuilder.pos(-1.0, -1.0, -1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, -1.0, 1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, -1.0, 1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, -1.0, -1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                if (j == 5) {
                    bufferBuilder.pos(-1.0, 1.0, 1.0).tex(0.0, 0.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(-1.0, 1.0, -1.0).tex(0.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, -1.0).tex(1.0, 1.0).color(255, 255, 255, n).endVertex();
                    bufferBuilder.pos(1.0, 1.0, 1.0).tex(1.0, 0.0).color(255, 255, 255, n).endVertex();
                }
                tessellator.draw();
            }
            GlStateManager.popMatrix();
            GlStateManager.colorMask(true, true, true, false);
        }
        GlStateManager.colorMask(true, true, true, true);
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
        GlStateManager.depthMask(true);
        GlStateManager.enableCull();
        GlStateManager.enableDepth();
    }

    private FloatBuffer ay(double d, float f, float f2, float f3) {
        float f4 = (float)(1.0 / Math.tan(d * 0.01745329238474369 / 2.0));
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(16);
        floatBuffer.put(this.uj(0, 0), f4 / f);
        floatBuffer.put(this.uj(0, 1), 0.0f);
        floatBuffer.put(this.uj(0, 2), 0.0f);
        floatBuffer.put(this.uj(0, 3), 0.0f);
        floatBuffer.put(this.uj(1, 0), 0.0f);
        floatBuffer.put(this.uj(1, 1), f4);
        floatBuffer.put(this.uj(1, 2), 0.0f);
        floatBuffer.put(this.uj(1, 3), 0.0f);
        floatBuffer.put(this.uj(2, 0), 0.0f);
        floatBuffer.put(this.uj(2, 1), 0.0f);
        floatBuffer.put(this.uj(2, 2), (f3 + f2) / (f2 - f3));
        floatBuffer.put(this.uj(2, 3), 2.0f * f3 * f2 / (f2 - f3));
        floatBuffer.put(this.uj(3, 0), 0.0f);
        floatBuffer.put(this.uj(3, 1), 0.0f);
        floatBuffer.put(this.uj(3, 2), -1.0f);
        floatBuffer.put(this.uj(3, 3), 0.0f);
        return floatBuffer;
    }

    private int uj(int n, int n2) {
        return n2 * 4 + n;
    }
}
