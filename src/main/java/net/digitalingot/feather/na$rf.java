package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.Direction;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

public class na$rf
        extends kb {
    private ResourceLocation texture;
    private int textureWidth;
    private int textureHeight;
    private float pixelsPerDegree;
    private int lE;
    private int lF;
    private int lG;
    private int lH;
    private int wl;
    private int fg;
    private int lI;
    private int lJ;
    private float lK;
    private float lL;
    private int lM;
    private int lN;

    public na$rf() {
        this.lM = (int) (0.33330002f * this.lK);
        this.lN = (int) (0.33335f * this.lK);
    }

    @Override
    public void ay(qx qx2) {
        this.kl(MINECRAFT.player.field_70177_z);
    }

    @Override
    public void ms() {
        this.kl(90.0f);
    }

    public void kl(float f) {
        this.nn(f);
        this.gk();
    }

    private void nn(float f) {
        boolean bl = false;
        boolean bl2 = false;
        float f2 = f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        float f3 = (-this.lL + f2 * this.pixelsPerDegree + 7.5f * this.pixelsPerDegree) % (float) this.textureWidth;
        fp.ay(0, this.texture);
        this.kw.rf(0, 0, this.lJ, this.fg, this.lE, this.lF);
        this.kw.ay(0, 0, f3, 0.0f, this.lN, this.textureHeight, this.lJ, this.fg, (float) this.textureWidth, (float) this.textureHeight, this.lG, this.lH);
        this.kw.rf(0 + this.lJ, 0, this.lI, this.fg, this.lF, this.lF);
        this.kw.ay(0 + this.lJ, 0, f3 + (float) this.lN, 0.0f, this.lM, this.textureHeight, this.lI, this.fg, (float) this.textureWidth, (float) this.textureHeight, this.lH, this.lH);
        this.kw.rf(0 + this.lJ + this.lI, 0, this.lJ, this.fg, this.lF, this.lE);
        this.kw.ay(0 + this.lJ + this.lI, 0, f3 + (float) this.lN + (float) this.lM, 0.0f, this.lN, this.textureHeight, this.lJ, this.fg, (float) this.textureWidth, (float) this.textureHeight, this.lH, this.lG);
    }

    private void gk() {
        float f = (float) (this.wl - ((Direction.ay) ((Direction) Direction.this).vz).kY) / 2.0f;
        float f2 = -1.0f;
        float f3 = f2 - (float) ((Direction.ay) ((Direction) Direction.this).vz).kY;
        int n = ((Direction.ay) ((Direction) Direction.this).vz).lD.getRed();
        int n2 = ((Direction.ay) ((Direction) Direction.this).vz).lD.getGreen();
        int n3 = ((Direction.ay) ((Direction) Direction.this).vz).lD.getBlue();
        int n4 = 255;
        fp.aE();
        fp.aI();
        fp.uj(770, 771, 1, 0);
        wa wa2 = wa.Fl;
        wa2.ay(6, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(f, f2, 0.0f).sd(n, n2, n3, 255).pe();
        wa2.zz(f + (float) ((Direction.ay) ((Direction) Direction.this).vz).kY, f3, 0.0f).sd(n, n2, n3, 255).pe();
        wa2.zz(f - (float) ((Direction.ay) ((Direction) Direction.this).vz).kY, f3, 0.0f).sd(n, n2, n3, 255).pe();
        wa2.ok();
        fp.aJ();
        fp.aF();
    }

    private void nf() {
        this.texture = ((Direction.ay) ((Direction) Direction.this).vz).kX.texture;
        this.textureWidth = ((Direction.ay) ((Direction) Direction.this).vz).kX.textureWidth;
        this.textureHeight = ((Direction.ay) ((Direction) Direction.this).vz).kX.textureHeight;
        this.pixelsPerDegree = ((Direction.ay) ((Direction) Direction.this).vz).kX.pixelsPerDegree;
    }

    private void jq() {
        this.lF = ((Direction.ay) ((Direction) Direction.this).vz).kv.getRGB();
        this.lE = this.lF & 0xFFFFFF;
        this.lH = ((Direction.ay) ((Direction) Direction.this).vz).lC.aq();
        this.lG = this.lH & 0xFFFFFF;
    }

    private void gt() {
        this.wl = ((Direction.ay) ((Direction) Direction.this).vz).wl;
        this.fg = (int) ((double) ((Direction.ay) ((Direction) Direction.this).vz).kY * 0.75 + 18.0);
        this.lI = (int) (0.33330002f * (float) this.wl);
        this.lJ = (int) (0.33335f * (float) this.wl);
        this.lK = (float) ((Direction.ay) ((Direction) Direction.this).vz).lA * this.pixelsPerDegree;
        this.lL = this.lK / 2.0f;
        this.lM = (int) (0.33330002f * this.lK);
        this.lN = (int) (0.33335f * this.lK);
    }

    @Override
    public void zq() {
        this.nf();
        this.gt();
        this.jq();
    }

    @Override
    public int hu() {
        return this.fg;
    }

    @Override
    public int df() {
        return this.wl;
    }

    @Override
    public ci te() {
        return ((Direction.ay) ((Direction) Direction.this).vz).iO;
    }
}
