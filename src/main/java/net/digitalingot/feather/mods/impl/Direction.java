package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;

import java.awt.*;

@sv(aw= qc.DIRECTION, jf=@bx(vu="Direction", jm="https://assets.feathercdn.net/game/mods/direction.svg", mz="Display your cardinal direction", lq={ly.ay.HUD}))
@pq(we={@xd(bp=rf.class)})
public class Direction
extends HUDMod<ay> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final float kS = 33.33f;
    private static final float kT = 33.335f;
    private static final float kU = 0.33330002f;
    private static final float kV = 0.33335f;

    public static class ay
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(yv= ho.TOP_CENTER, ev=30.0)
        public ci iO;
        @de(vi=10)
        public iv kW = new iv("Direction");
        @au(wd="type", vu="Type", pr="default", yp=@de(vi=11))
        public uj kX;
        @au(wd="markerSize", vu="Marker Size", pr="3", yp=@de(vi=12))
        @mj(yu=1, js=9)
        public int kY;
        @au(wd="shadow", vu="Shadow", pr="true", yp=@de(vi=13))
        public boolean kZ;
        @au(wd="visibleDegrees", vu="Visible Degrees", pr="200", yp=@de(vi=14))
        @mj(yu=45, js=360)
        public int lA;
        @au(wd="width", vu="Width", pr="200", yp=@de(vi=15))
        @mj(yu=50, js=300)
        public int wl;
        @de(vi=20)
        public iv lB = new iv("Colors");
        @au(wd="backgroundColor", vu="Background Color", pr="7/7/7/100", yp=@de(vi=21))
        public Color kv;
        @au(wd="directionColor", vu="Direction Color", pr="false/255/255/255", yp=@de(vi=22))
        public gp lC;
        @au(wd="markerColor", vu="Marker Color", pr="255/255/255", yp=@de(vi=23))
        public Color lD;
    }

    public enum uj {
        DEFAULT("default.png", 1728, 70, 4.8f),
        SIMPLE("simple.png", 1728, 84, 4.8f),
        NO_TICK("no_tick.png", 1728, 84, 4.8f);

        private static final String BASE_PATH = "textures/direction/";
        public final ResourceLocation texture;
        public final int textureWidth;
        public final int textureHeight;
        public final float pixelsPerDegree;

        uj(String string2, int n2, int n3, float f) {
            this.texture = new ResourceLocation("feather:textures/direction/" + string2);
            this.textureWidth = n2;
            this.textureHeight = n3;
            this.pixelsPerDegree = f;
        }
    }

    public class rf
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

        public rf() {
            this.lM = (int)(0.33330002f * this.lK);
            this.lN = (int)(0.33335f * this.lK);
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
            float f3 = (-this.lL + f2 * this.pixelsPerDegree + 7.5f * this.pixelsPerDegree) % (float)this.textureWidth;
            fp.ay(0, this.texture);
            this.kw.rf(0, 0, this.lJ, this.fg, this.lE, this.lF);
            this.kw.ay(0, 0, f3, 0.0f, this.lN, this.textureHeight, this.lJ, this.fg, (float)this.textureWidth, (float)this.textureHeight, this.lG, this.lH);
            this.kw.rf(0 + this.lJ, 0, this.lI, this.fg, this.lF, this.lF);
            this.kw.ay(0 + this.lJ, 0, f3 + (float)this.lN, 0.0f, this.lM, this.textureHeight, this.lI, this.fg, (float)this.textureWidth, (float)this.textureHeight, this.lH, this.lH);
            this.kw.rf(0 + this.lJ + this.lI, 0, this.lJ, this.fg, this.lF, this.lE);
            this.kw.ay(0 + this.lJ + this.lI, 0, f3 + (float)this.lN + (float)this.lM, 0.0f, this.lN, this.textureHeight, this.lJ, this.fg, (float)this.textureWidth, (float)this.textureHeight, this.lH, this.lG);
        }

        private void gk() {
            float f = (float)(this.wl - ((ay) Direction.this.vz).kY) / 2.0f;
            float f2 = -1.0f;
            float f3 = f2 - (float)((ay) Direction.this.vz).kY;
            int n = ((ay) Direction.this.vz).lD.getRed();
            int n2 = ((ay) Direction.this.vz).lD.getGreen();
            int n3 = ((ay) Direction.this.vz).lD.getBlue();
            int n4 = 255;
            fp.aE();
            fp.aI();
            fp.uj(770, 771, 1, 0);
            wa wa2 = wa.Fl;
            wa2.ay(6, DefaultVertexFormats.POSITION_COLOR);
            wa2.zz(f, f2, 0.0f).sd(n, n2, n3, 255).pe();
            wa2.zz(f + (float)((ay) Direction.this.vz).kY, f3, 0.0f).sd(n, n2, n3, 255).pe();
            wa2.zz(f - (float)((ay) Direction.this.vz).kY, f3, 0.0f).sd(n, n2, n3, 255).pe();
            wa2.ok();
            fp.aJ();
            fp.aF();
        }

        private void nf() {
            this.texture = ((ay) Direction.this.vz).kX.texture;
            this.textureWidth = ((ay) Direction.this.vz).kX.textureWidth;
            this.textureHeight = ((ay) Direction.this.vz).kX.textureHeight;
            this.pixelsPerDegree = ((ay) Direction.this.vz).kX.pixelsPerDegree;
        }

        private void jq() {
            this.lF = ((ay) Direction.this.vz).kv.getRGB();
            this.lE = this.lF & 0xFFFFFF;
            this.lH = ((ay) Direction.this.vz).lC.aq();
            this.lG = this.lH & 0xFFFFFF;
        }

        private void gt() {
            this.wl = ((ay) Direction.this.vz).wl;
            this.fg = (int)((double)((ay) Direction.this.vz).kY * 0.75 + 18.0);
            this.lI = (int)(0.33330002f * (float)this.wl);
            this.lJ = (int)(0.33335f * (float)this.wl);
            this.lK = (float)((ay) Direction.this.vz).lA * this.pixelsPerDegree;
            this.lL = this.lK / 2.0f;
            this.lM = (int)(0.33330002f * this.lK);
            this.lN = (int)(0.33335f * this.lK);
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
            return ((ay) Direction.this.vz).iO;
        }
    }
}
