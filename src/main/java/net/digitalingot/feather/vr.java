package net.digitalingot.feather;

import net.digitalingot.feather.enums.gg;
import net.digitalingot.feather.mods.impl.General;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class vr {
    public static final int Ej = 12;
    private static final xq Ek = new xq();
    private static final FontRenderer El = Minecraft.getMinecraft().fontRenderer;
    private static vr Em;
    private General.ay En = null;
    private double Eo = 1.0;
    private double Ep = 0.0;
    private double Eq = 0.0;

    protected vr() {
        Minecraft.getMinecraft().getRenderItem().zLevel = 200.0f;
    }

    private General.ay nQ() {
        if (this.En == null) {
            this.En = (General.ay)zz.nw().xn().rf(General.class).xd();
        }
        return this.En;
    }

    public static vr nR() {
        if (Em == null) {
            Em = new vr();
        }
        return Em;
    }

    public static xq nS() {
        return Ek;
    }

    public final void zz(int n, int n2, int n3, int n4) {
        this.ay(n, n2, n3, n4, -1);
    }

    public final void ay(int n, int n2, int n3, int n4, int n5) {
        this.ay(n, n2, n3, n4, n5, 1.0f);
    }

    public final void ay(int n, int n2, int n3, int n4, int n5, float f) {
        boolean bl;
        float f2;
        float f3;
        float f4;
        float f5;
        int n6 = n + n3;
        int n7 = n2 + n4;
        if (n5 != -1) {
            f5 = (float)(n5 >> 24 & 0xFF) / 255.0f;
            f4 = (float)(n5 >> 16 & 0xFF) / 255.0f;
            f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
            f2 = (float)(n5 & 0xFF) / 255.0f;
        } else {
            f2 = 1.0f;
            f3 = 1.0f;
            f4 = 1.0f;
            f5 = 1.0f;
        }
        boolean bl2 = bl = f != 1.0f;
        if (bl) {
            fp.pv(f);
        }
        fp.aI();
        wa wa2 = wa.Fl;
        wa2.ay(3, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(n, n7, 0.0f).uj(f4, f3, f2, f5).pe();
        wa2.zz(n6, n7, 0.0f).uj(f4, f3, f2, f5).pe();
        wa2.zz(n6, n2, 0.0f).uj(f4, f3, f2, f5).pe();
        wa2.zz(n, n2, 0.0f).uj(f4, f3, f2, f5).pe();
        wa2.zz(n, n7, 0.0f).uj(f4, f3, f2, f5).pe();
        wa2.ok();
        fp.aJ();
        if (bl) {
            fp.pv(1.0f);
        }
    }

    public final void rf(int n, int n2, int n3, int n4, int n5) {
        this.ay(n, n2, n3, n4, n5, false);
    }

    public final void ay(int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (bl) {
            General.ay ay2 = this.nQ();
            if (ay2.fN == gg.NORMAL) {
                double d = ay2.fO;
                long l = System.currentTimeMillis();
                float f = (float)(((double)l - (double)(n * 100) / d - (double)(n2 * 100) / d) % (50000.0 / d) / (50000.0 / d));
                int n6 = Math.abs(n3 - n);
                float f2 = (float)(((double)l - (double)((n + n6) * 100) / d - (double)(n2 * 100) / d) % (50000.0 / d) / (50000.0 / d));
                int n7 = Color.HSBtoRGB(f, 0.8f, 0.8f);
                int n8 = Color.HSBtoRGB(f2, 0.8f, 0.8f);
                this.uj(n, n2, n3, n4, n7, n8);
            } else {
                this.uj(n, n2, n3, n4, this.nT());
            }
        } else {
            this.uj(n, n2, n3, n4, n5);
        }
    }

    private void uj(int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        fp.aE();
        fp.aI();
        fp.uj(770, 771, 1, 0);
        wa wa2 = wa.Fl;
        wa2.ay(7, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(n, n4, 0.0f).uj(f2, f3, f4, f).pe();
        wa2.zz(n3, n4, 0.0f).uj(f2, f3, f4, f).pe();
        wa2.zz(n3, n2, 0.0f).uj(f2, f3, f4, f).pe();
        wa2.zz(n, n2, 0.0f).uj(f2, f3, f4, f).pe();
        wa2.ok();
        fp.aJ();
        fp.aF();
    }

    public void rf(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n + n3;
        int n8 = n2 + n4;
        this.uj(n, n2, n7, n8, n5, n6);
    }

    private void uj(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n < n3) {
            n7 = n;
            n = n3;
            n3 = n7;
        }
        if (n2 < n4) {
            n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        n7 = n5 >> 24 & 0xFF;
        int n8 = n5 >> 16 & 0xFF;
        int n9 = n5 >> 8 & 0xFF;
        int n10 = n5 >> 0 & 0xFF;
        int n11 = n6 >> 24 & 0xFF;
        int n12 = n6 >> 16 & 0xFF;
        int n13 = n6 >> 8 & 0xFF;
        int n14 = n6 >> 0 & 0xFF;
        fp.aI();
        fp.aE();
        fp.W();
        fp.uj(770, 771, 1, 0);
        fp.hj(7425);
        wa wa2 = wa.Fl;
        wa2.ay(5, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(n3, n4, 0.0f).sd(n8, n9, n10, n7).pe();
        wa2.zz(n3, n2, 0.0f).sd(n8, n9, n10, n7).pe();
        wa2.zz(n, n4, 0.0f).sd(n12, n13, n14, n11).pe();
        wa2.zz(n, n2, 0.0f).sd(n12, n13, n14, n11).pe();
        wa2.ok();
        fp.hj(7424);
        fp.aF();
        fp.X();
        fp.aJ();
    }

    public void ay(String string, float f, float f2, int n, boolean bl) {
        if (string == null) {
            return;
        }
        El.drawString(string, f, f2, n, bl);
    }

    public void ay(String string, float f, float f2, gp gp2, boolean bl) {
        this.ay(string, f, f2, gp2.aq(), bl, gp2.sc());
    }

    public void ay(String string, float f, float f2, int n, boolean bl, boolean bl2) {
        if (bl2) {
            int n2 = n >> 24 & 0xFF;
            this.rf(string, f, f2, n2, bl);
        } else {
            this.ay(string, f, f2, n, bl);
        }
    }

    protected void rf(String string, float f, float f2, int n, boolean bl) {
        string = az.uf(string);
        General.ay ay2 = this.nQ();
        switch (1.Er[ay2.fN.ordinal()]) {
            case 1: {
                Color color = new Color(this.nT(), true);
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha() * n / 255);
                this.ay(string, f, f2, color.getRGB(), bl, false);
                break;
            }
            case 2: {
                for (char c : string.toCharArray()) {
                    float f3 = (float)(((double)System.currentTimeMillis() - ((double)f * this.Eo - this.Ep) * 100.0 / ay2.fO - ((double)f2 * this.Eo - this.Eq) * 100.0 / ay2.fO) % (50000.0 / ay2.fO) / (50000.0 / ay2.fO));
                    int n2 = Color.HSBtoRGB(f3, 0.8f, 0.8f);
                    Color color = new Color(n2, true);
                    color = new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha() * n / 255);
                    String string2 = String.valueOf(c);
                    this.ay(string2, f, f2, color.getRGB(), bl, false);
                    f += (float)this.on(string2);
                }
                break;
            }
        }
    }

    public int nT() {
        double d = 50000.0 / this.nQ().fO;
        double d2 = (double)System.currentTimeMillis() % d / d;
        return Color.HSBtoRGB((float)d2, 0.8f, 0.8f);
    }

    public int on(String string) {
        return Ek.getStringWidth(string);
    }

    public void ay(ItemStack itemStack, int n, int n2, boolean bl, boolean bl2) {
        fp.aC();
        RenderHelper.enableStandardItemLighting();
        RenderHelper.enableGUIStandardItemLighting();
        Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        fp.aD();
    }

    public void zz(int n, int n2, int n3, int n4, int n5, int n6) {
        this.ay(n, n2, n3, n4, n5, n6, n5, n6, 256.0f, 256.0f);
    }

    public void ay(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        this.ay(n, n2, f, f2, n3, n4, n5, n6, f3, f4, -1);
    }

    public void ay(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4, int n7) {
        this.ay(n, n2, 0.0f, f, f2, n3, n4, n5, n6, f3, f4, n7);
    }

    public void ay(int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, int n6, float f4, float f5, int n7) {
        float f6 = 1.0f / f4;
        float f7 = 1.0f / f5;
        float f8 = (float)(n7 >> 24 & 0xFF) / 255.0f;
        float f9 = (float)(n7 >> 16 & 0xFF) / 255.0f;
        float f10 = (float)(n7 >> 8 & 0xFF) / 255.0f;
        float f11 = (float)(n7 & 0xFF) / 255.0f;
        wa wa2 = wa.Fl;
        wa2.ay(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        wa2.zz(n, n2 + n6, f).zz(f2 * f6, (f3 + (float)n4) * f7).uj(f9, f10, f11, f8).pe();
        wa2.zz(n + n5, n2 + n6, f).zz((f2 + (float)n3) * f6, (f3 + (float)n4) * f7).uj(f9, f10, f11, f8).pe();
        wa2.zz(n + n5, n2, f).zz((f2 + (float)n3) * f6, f3 * f7).uj(f9, f10, f11, f8).pe();
        wa2.zz(n, n2, f).zz(f2 * f6, f3 * f7).uj(f9, f10, f11, f8).pe();
        wa2.ok();
    }

    public void ay(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4, int n7, int n8) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        int n9 = n7 >> 24 & 0xFF;
        int n10 = n7 >> 16 & 0xFF;
        int n11 = n7 >> 8 & 0xFF;
        int n12 = n7 >> 0 & 0xFF;
        int n13 = n8 >> 24 & 0xFF;
        int n14 = n8 >> 16 & 0xFF;
        int n15 = n8 >> 8 & 0xFF;
        int n16 = n8 >> 0 & 0xFF;
        fp.aE();
        fp.W();
        fp.uj(770, 771, 1, 0);
        fp.hj(7425);
        boolean bl = GL11.glIsEnabled(2848);
        if (!bl) {
            GL11.glEnable(2848);
        }
        wa wa2 = wa.Fl;
        wa2.ay(5, DefaultVertexFormats.POSITION_TEX_COLOR);
        wa2.zz(n + n5, n2 + n6, 0.0f).zz((f + (float)n3) * f5, (f2 + (float)n4) * f6).sd(n14, n15, n16, n13).pe();
        wa2.zz(n + n5, n2, 0.0f).zz((f + (float)n3) * f5, f2 * f6).sd(n14, n15, n16, n13).pe();
        wa2.zz(n, n2 + n6, 0.0f).zz(f * f5, (f2 + (float)n4) * f6).sd(n10, n11, n12, n9).pe();
        wa2.zz(n, n2, 0.0f).zz(f * f5, f2 * f6).sd(n10, n11, n12, n9).pe();
        wa2.ok();
        if (!bl) {
            GL11.glDisable(2848);
        }
        fp.hj(7424);
        fp.aF();
        fp.X();
        fp.aJ();
    }

    public void nU() {
        this.Eo = 1.0;
        this.Ep = 0.0;
        this.Eq = 0.0;
    }

    public void uj(double d, double d2, double d3) {
        this.Eo = d;
        this.Ep = d2;
        this.Eq = d3;
    }

    protected float iu(float f) {
        return f;
    }

    protected float ig(float f) {
        return f;
    }
}
