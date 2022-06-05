package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.text.DecimalFormat;

@sv(aw= qc.KEYSTROKES, jf=@bx(vu="Keystrokes", jm="https://assets.feathercdn.net/game/mods/keystrokes.svg", mz="Display your key presses", lq={ly.ay.HUD}))
@pq(we={@xd(bp=kl.class)})
public class Keystrokes
extends HUDMod<bu> {
    private static final int nR = 20;
    private static final int nS = 10;
    private static final int nT = 1;
    private static final int nU = 3;
    private static final int nV = 2;
    private static final int nW = 62;
    private static final int nX = 12;

    static class ay {
        @NotNull
        public Color oB;
        @NotNull
        public gp oC;

        public ay(@NotNull Color color, @NotNull gp gp2) {
            this.oB = color;
            this.oC = gp2;
        }
    }

    static class rf
    extends zz {
        private String oD;
        private float oE;
        private float oF;

        public rf(bu bu2, sd sd2, KeyBinding keyBinding) {
            super(bu2, sd2, keyBinding);
        }

        @Override
        public void uj(float f, float f2) {
            super.uj(f, f2);
            if (this.oG.pe == bu.ay.WITH_CLICKS) {
                this.oT -= 2.0f;
                if (this.oD != null) {
                    this.ps();
                }
            }
        }

        public void oh(String string) {
            this.oD = string;
            this.ps();
        }

        private void ps() {
            float f = (float)fp.mq(this.oD) / 2.0f;
            this.oE = this.oO + (this.oH.bounds.width - f) / 2.0f;
            this.oF = this.oT + 7.0f + 1.0f;
            this.oE *= 2.0f;
            this.oF *= 2.0f;
        }
    }

    static class zz {
        protected final bu oG;
        protected final sd oH;
        protected final KeyBinding oI;
        protected final ay oJ;
        protected float oK;
        protected boolean oL;
        protected long oM;
        protected boolean oN;
        protected float oO;
        protected float oP;
        protected float oQ;
        protected float oR;
        protected String qv;
        protected float oS;
        protected float oT;

        public zz(bu bu2, sd sd2, KeyBinding keyBinding) {
            this.oG = bu2;
            this.oH = sd2;
            this.oI = keyBinding;
            this.oK = 0.0f;
            this.oJ = new ay(this.ay(bu2.pA, bu2.kv), this.ay(bu2.pB, bu2.sa));
            this.zz(System.currentTimeMillis());
        }

        private gp ay(gp gp2, gp gp3) {
            gp gp4;
            gp gp5 = gp4 = this.oN ? gp2 : gp3;
            if (this.oK != 1.0f) {
                gp gp6 = this.oN ? gp3 : gp2;
                return az.ay(gp6, gp4, this.oK);
            }
            return gp4;
        }

        private Color ay(Color color, Color color2) {
            Color color3;
            Color color4 = color3 = this.oN ? color : color2;
            if (this.oK != 1.0f) {
                Color color5 = this.oN ? color2 : color;
                return az.ay(color5, color3, this.oK);
            }
            return color3;
        }

        public void zz(long l) {
            boolean bl;
            boolean bl2 = this.oL;
            if (this.oN != bl2) {
                this.oN = bl2;
                this.oM = l;
                bl = true;
            } else {
                boolean bl3 = bl = this.oK != 1.0f;
            }
            if (bl) {
                this.oK = eb.ag((float)((double)(l - this.oM) / Math.max(1.0, this.oG.oY)));
                this.oJ.oC = this.ay(this.oG.pB, this.oG.sa);
                this.oJ.oB = this.ay(this.oG.pA, this.oG.kv);
            }
        }

        public void vr() {
            this.oJ.oC = this.ay(this.oG.pB, this.oG.sa);
            this.oJ.oB = this.ay(this.oG.pA, this.oG.kv);
            this.qv = this.oH.getText(this.oG);
        }

        public void uj(float f, float f2) {
            this.vr();
            uj uj2 = this.oH.bounds;
            this.oO = f * (uj2.width + uj2.margin);
            this.oP = f2 * (uj2.height + 1.0f);
            this.oQ = this.oO + uj2.width;
            this.oR = this.oP + uj2.height;
            this.oS = this.oO + (uj2.width - (float)this.oH.getTextWidth(this.oG)) / 2.0f;
            this.oT = this.oP + (uj2.height - 7.0f) / 2.0f;
        }

        public void ay(float f, float f2, int n) {
            this.vr();
            uj uj2 = this.oH.bounds;
            this.oO = f * (uj2.width + uj2.margin);
            this.oP = f2 * (uj2.height + 1.0f);
            this.oQ = this.oO + uj2.width;
            this.oR = this.oP + (float)n;
            this.oS = this.oO + (uj2.width - (float)this.oH.getTextWidth(this.oG)) / 2.0f;
            this.oT = this.oP + (uj2.height - 7.0f) / 2.0f;
        }
    }

    public enum sd {
        FORWARD(uj.THIRD, "W", "+"),
        LEFT(uj.THIRD, "A", "<"),
        BACK(uj.THIRD, "S", "-"),
        RIGHT(uj.THIRD, "D", ">"),
        JUMP(uj.FULL, "JUMP", ""),
        CPS(uj.FULL, "", ""),
        ATTACK(uj.HALF, "LMB", "<--"),
        USE(uj.HALF, "RMB", "-->");

        private final uj bounds;
        private final String name;
        private final int nameWidth;
        private final String arrow;
        private final int arrowWidth;

        sd(uj uj2, String string2, String string3) {
            this.bounds = uj2;
            this.name = string2;
            this.nameWidth = fp.mq(string2);
            this.arrow = string3;
            this.arrowWidth = fp.mq(string3);
        }

        private String getText(bu bu2) {
            switch (1.nZ[this.getDisplayMode(bu2).ordinal()]) {
                case 1: {
                    return this.name;
                }
                case 2: {
                    return this.arrow;
                }
            }
            return null;
        }

        private int getTextWidth(bu bu2) {
            switch (1.nZ[this.getDisplayMode(bu2).ordinal()]) {
                case 1: {
                    return this.nameWidth;
                }
                case 2: {
                    return this.arrowWidth;
                }
            }
            return 0;
        }

        private bu.rf getDisplayMode(bu bu2) {
            switch (1.oA[this.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    return bu2.oX;
                }
                case 5: {
                    return bu2.oW;
                }
                case 6: 
                case 7: {
                    return bu2.oV;
                }
            }
            throw new AssertionError();
        }
    }

    public enum uj {
        THIRD(20.0f, 20.0f, 1.0f),
        HALF(30.5f, 20.0f, 1.0f),
        FULL(62.0f, 20.0f, 0.0f);

        private final float width;
        private final float height;
        private final float margin;

        uj(float f, float f2, float f3) {
            this.width = f;
            this.height = f2;
            this.margin = f3;
        }
    }

    public static class bu
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(yv= ho.BOTTOM_CENTER, dz=126.0, ev=-2.5)
        public ci iO;
        @de(vi=10)
        public iv oU = new iv("Keystrokes");
        @au(wd="clicksDisplayMode", vu="Clicks Display Mode", pr="names", yp=@de(vi=11))
        public rf oV;
        @au(wd="jumpDisplayMode", vu="Jump Display Mode", pr="arrows", yp=@de(vi=12))
        public rf oW;
        @au(wd="keysDisplayMode", vu="Keys Display Mode", pr="names", yp=@de(vi=13))
        public rf oX;
        @au(wd="fadeTime", vu="Fade Time", pr="300", yp=@de(vi=14))
        @in(lf=2500.0)
        public double oY;
        @de(vi=20)
        public iv oZ = new iv("CPS");
        @au(wd="cpsDisplayMode", vu="Display Mode", pr="separate", yp=@de(vi=21))
        public ay pe;
        @au(wd="cpsDigits", vu="Digits", yp=@de(vi=22))
        @mj(js=2)
        public int px = 0;
        @au(wd="cpsReversed", vu="Reversed Text", yp=@de(vi=23))
        public boolean py;
        @de(vi=30)
        public iv lB = new iv("Colors");
        @au(wd="backgroundColor", vu="Background", pr="7/7/7/146", yp=@de(vi=31))
        public Color kv;
        @au(wd="backgroundActiveColor", vu="Background Active", pr="255/255/255/53", yp=@de(vi=32))
        public Color pA;
        @au(wd="textColor", vu="Text Color", pr="false/255/255/255/255", yp=@de(vi=33))
        public gp sa;
        @au(wd="textActiveColor", vu="Text Active", pr="false/0/145/237", yp=@de(vi=34))
        public gp pB;
        @au(wd="textShadow", vu="Text Shadow", pr="false", yp=@de(vi=35))
        public boolean ki;

        public enum rf {
            NONE,
            NAMES,
            ARROWS

        }

        public enum ay {
            NONE,
            WITH_CLICKS,
            SEPARATE

        }
    }

    public class kl
    extends kb
    implements yt.ay {
        private final yt pC;
        private final DecimalFormat pD;
        private zz pE;
        private zz pF;
        private zz pG;
        private zz pH;
        private zz pI;
        private rf pJ;
        private rf pK;
        private zz[] pL;
        private int pM;
        private float pN;
        private float pO;
        private float pP;
        private float pQ;
        private float pR;
        private float pS;
        private String pT;

        public kl() {
            this.pC = new yt(Keystrokes.this, this);
            this.pD = wk.yl("#.#");
            this.pL = new zz[0];
        }

        private void gg() {
            GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
            this.pE = new zz((bu) Keystrokes.this.vz, sd.FORWARD, gameSettings.keyBindForward);
            this.pF = new zz((bu) Keystrokes.this.vz, sd.BACK, gameSettings.keyBindBack);
            this.pG = new zz((bu) Keystrokes.this.vz, sd.LEFT, gameSettings.keyBindLeft);
            this.pH = new zz((bu) Keystrokes.this.vz, sd.RIGHT, gameSettings.keyBindRight);
            this.pI = new zz((bu) Keystrokes.this.vz, sd.JUMP, gameSettings.keyBindJump);
            this.pJ = new rf((bu) Keystrokes.this.vz, sd.ATTACK, gameSettings.keyBindAttack);
            this.pK = new rf((bu) Keystrokes.this.vz, sd.USE, gameSettings.keyBindUseItem);
            this.pL = new zz[]{this.pE, this.pF, this.pG, this.pH, this.pI, this.pJ, this.pK};
        }

        @Override
        public void ay(qx qx2) {
            this.xq();
            if (((bu) Keystrokes.this.vz).oX != bu.rf.NONE) {
                this.uj(this.pE);
                this.uj(this.pG);
                this.uj(this.pF);
                this.uj(this.pH);
            }
            if (((bu) Keystrokes.this.vz).oV != bu.rf.NONE) {
                this.zz(this.pJ);
                this.zz(this.pK);
            }
            if (((bu) Keystrokes.this.vz).oW != bu.rf.NONE) {
                this.zz(this.pI);
            }
            if (((bu) Keystrokes.this.vz).pe == bu.ay.SEPARATE) {
                this.kw.ay((int)this.pN, (int)this.pO, (int)this.pP, (int)this.pQ, ((bu) Keystrokes.this.vz).kv.getRGB(), false);
                this.kw.ay(this.pT, this.pR, this.pS, ((bu) Keystrokes.this.vz).sa, ((bu) Keystrokes.this.vz).ki);
            }
        }

        @Override
        public void zq() {
            wk.ay(this.pD, ((bu) Keystrokes.this.vz).px);
            this.gg();
            this.re();
            this.ha();
        }

        @Override
        public int hu() {
            return this.pM;
        }

        @Override
        public int df() {
            return 62;
        }

        private void ay(zz zz2) {
            this.kw.rf((int)zz2.oO, (int)zz2.oP, (int)zz2.oQ, (int)zz2.oR, zz2.oJ.oB.getRGB());
        }

        private void rf(zz zz2) {
            this.kw.ay(zz2.qv, zz2.oS, zz2.oT, zz2.oJ.oC, ((bu) Keystrokes.this.vz).ki);
        }

        private void uj(zz zz2) {
            this.ay(zz2);
            this.rf(zz2);
        }

        private void zz(rf rf2) {
            this.uj(rf2);
            if (((bu) Keystrokes.this.vz).pe == bu.ay.WITH_CLICKS) {
                GL11.glPushMatrix();
                GL11.glScalef(0.5f, 0.5f, 1.0f);
                this.kw.ay(rf2.oD, rf2.oE, rf2.oF, rf2.oJ.oC, ((bu) Keystrokes.this.vz).ki);
                GL11.glPopMatrix();
            }
        }

        private void zz(zz zz2) {
            this.ay(zz2);
            if (((bu) Keystrokes.this.vz).oW == bu.rf.ARROWS) {
                float f = zz2.oP + (zz2.oR - zz2.oP) / 2.0f;
                this.kw.ay((int)(zz2.oO + 20.0f), (int)(f + 1.0f), (int)(zz2.oQ - 20.0f), (int)f, zz2.oJ.oC.aq(), zz2.oJ.oC.sc());
            } else {
                this.rf(zz2);
            }
        }

        private void re() {
            float f = 0.0f;
            this.pM = 0;
            if (((bu) Keystrokes.this.vz).oX != bu.rf.NONE) {
                float f2 = f;
                f = f2 + 1.0f;
                this.pE.uj(1.0f, f2);
                this.pG.uj(0.0f, f);
                this.pF.uj(1.0f, f);
                float f3 = f;
                f = f3 + 1.0f;
                this.pH.uj(2.0f, f3);
                this.pM += 42;
            }
            if (((bu) Keystrokes.this.vz).oV != bu.rf.NONE) {
                this.pJ.uj(0.0f, f);
                float f4 = f;
                f = f4 + 1.0f;
                this.pK.uj(1.0f, f4);
                this.pM += 21;
            }
            int n = 0;
            if (((bu) Keystrokes.this.vz).oW != bu.rf.NONE) {
                float f5 = f;
                f = f5 + 1.0f;
                this.pI.ay(0.0f, f5, 10);
                this.pM += 11;
                n = -10;
            }
            if (((bu) Keystrokes.this.vz).pe == bu.ay.SEPARATE) {
                this.pN = 0.0f;
                this.pO = f * 21.0f + (float)n;
                this.pP = this.pN + 62.0f;
                this.pQ = this.pO + 12.0f;
                this.pM += 12;
            }
        }

        private void ya() {
            boolean bl;
            Minecraft minecraft = Minecraft.getMinecraft();
            GuiScreen guiScreen = minecraft.currentScreen;
            boolean bl2 = bl = guiScreen == null || guiScreen.allowUserInput;
            if (bl) {
                net.digitalingot.feather.bu.xs();
            }
        }

        private void xq() {
            this.ya();
            long l = System.currentTimeMillis();
            for (zz zz2 : this.pL) {
                int n = dd.ay(zz2.oI);
                zz2.oL = bl.on(n);
                zz2.zz(l);
            }
        }

        private void ha() {
            this.ay(this.pJ, this.pC.wk());
            this.ay(this.pK, this.pC.si());
            this.hg();
        }

        private void hg() {
            this.pT = this.rf(this.pC.wk());
            this.pR = this.pN + (float)(62 - fp.mq(this.pT)) / 2.0f;
            this.pS = this.pO + 2.5f;
        }

        private void ay(rf rf2, double d) {
            rf2.oh(this.rf(d));
        }

        private String rf(double d) {
            if (((bu) Keystrokes.this.vz).py) {
                return "CPS: " + this.pD.format(d);
            }
            return this.pD.format(d) + " CPS";
        }

        @Override
        public ci te() {
            return ((bu) Keystrokes.this.vz).iO;
        }

        @Override
        public void rf(double d, double d2) {
            switch (1.nY[((bu) Keystrokes.this.vz).pe.ordinal()]) {
                case 1: {
                    if (d != 0.0) {
                        this.ay(this.pJ, this.pC.wk());
                    }
                    if (d2 == 0.0) break;
                    this.ay(this.pK, this.pC.si());
                    break;
                }
                case 2: {
                    if (d == 0.0) break;
                    this.hg();
                    break;
                }
            }
        }
    }
}
