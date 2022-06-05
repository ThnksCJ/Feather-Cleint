package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.Keystrokes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.opengl.GL11;

import java.text.DecimalFormat;

public class lt$kl
        extends kb
        implements yt.ay {
    private final yt pC;
    private final DecimalFormat pD;
    private Keystrokes.zz pE;
    private Keystrokes.zz pF;
    private Keystrokes.zz pG;
    private Keystrokes.zz pH;
    private Keystrokes.zz pI;
    private Keystrokes.rf pJ;
    private Keystrokes.rf pK;
    private Keystrokes.zz[] pL;
    private int pM;
    private float pN;
    private float pO;
    private float pP;
    private float pQ;
    private float pR;
    private float pS;
    private String pT;

    public lt$kl() {
        this.pC = new yt(Keystrokes.this, this);
        this.pD = wk.yl("#.#");
        this.pL = new Keystrokes.zz[0];
    }

    private void gg() {
        GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
        this.pE = new Keystrokes.zz((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.FORWARD, gameSettings.keyBindForward);
        this.pF = new Keystrokes.zz((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.BACK, gameSettings.keyBindBack);
        this.pG = new Keystrokes.zz((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.LEFT, gameSettings.keyBindLeft);
        this.pH = new Keystrokes.zz((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.RIGHT, gameSettings.keyBindRight);
        this.pI = new Keystrokes.zz((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.JUMP, gameSettings.keyBindJump);
        this.pJ = new Keystrokes.rf((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.ATTACK, gameSettings.keyBindAttack);
        this.pK = new Keystrokes.rf((Keystrokes.bu) Keystrokes.this.vz, Keystrokes.sd.USE, gameSettings.keyBindUseItem);
        this.pL = new Keystrokes.zz[]{this.pE, this.pF, this.pG, this.pH, this.pI, this.pJ, this.pK};
    }

    @Override
    public void ay(qx qx2) {
        this.xq();
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oX != Keystrokes.bu.rf.NONE) {
            this.uj(this.pE);
            this.uj(this.pG);
            this.uj(this.pF);
            this.uj(this.pH);
        }
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oV != Keystrokes.bu.rf.NONE) {
            this.zz(this.pJ);
            this.zz(this.pK);
        }
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oW != Keystrokes.bu.rf.NONE) {
            this.zz(this.pI);
        }
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).pe == Keystrokes.bu.ay.SEPARATE) {
            this.kw.ay((int) this.pN, (int) this.pO, (int) this.pP, (int) this.pQ, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).kv.getRGB(), false);
            this.kw.ay(this.pT, this.pR, this.pS, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).sa, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).ki);
        }
    }

    @Override
    public void zq() {
        wk.ay(this.pD, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).px);
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

    private void ay(Keystrokes.zz zz2) {
        this.kw.rf((int) zz2.oO, (int) zz2.oP, (int) zz2.oQ, (int) zz2.oR, zz2.oJ.oB.getRGB());
    }

    private void rf(Keystrokes.zz zz2) {
        this.kw.ay(zz2.qv, zz2.oS, zz2.oT, zz2.oJ.oC, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).ki);
    }

    private void uj(Keystrokes.zz zz2) {
        this.ay(zz2);
        this.rf(zz2);
    }

    private void zz(Keystrokes.rf rf2) {
        this.uj(rf2);
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).pe == Keystrokes.bu.ay.WITH_CLICKS) {
            GL11.glPushMatrix();
            GL11.glScalef(0.5f, 0.5f, 1.0f);
            this.kw.ay(rf2.oD, rf2.oE, rf2.oF, rf2.oJ.oC, ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).ki);
            GL11.glPopMatrix();
        }
    }

    private void zz(Keystrokes.zz zz2) {
        this.ay(zz2);
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oW == Keystrokes.bu.rf.ARROWS) {
            float f = zz2.oP + (zz2.oR - zz2.oP) / 2.0f;
            this.kw.ay((int) (zz2.oO + 20.0f), (int) (f + 1.0f), (int) (zz2.oQ - 20.0f), (int) f, zz2.oJ.oC.aq(), zz2.oJ.oC.sc());
        } else {
            this.rf(zz2);
        }
    }

    private void re() {
        float f = 0.0f;
        this.pM = 0;
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oX != Keystrokes.bu.rf.NONE) {
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
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oV != Keystrokes.bu.rf.NONE) {
            this.pJ.uj(0.0f, f);
            float f4 = f;
            f = f4 + 1.0f;
            this.pK.uj(1.0f, f4);
            this.pM += 21;
        }
        int n = 0;
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).oW != Keystrokes.bu.rf.NONE) {
            float f5 = f;
            f = f5 + 1.0f;
            this.pI.ay(0.0f, f5, 10);
            this.pM += 11;
            n = -10;
        }
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).pe == Keystrokes.bu.ay.SEPARATE) {
            this.pN = 0.0f;
            this.pO = f * 21.0f + (float) n;
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
            bu.xs();
        }
    }

    private void xq() {
        this.ya();
        long l = System.currentTimeMillis();
        for (Keystrokes.zz zz2 : this.pL) {
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
        this.pR = this.pN + (float) (62 - fp.mq(this.pT)) / 2.0f;
        this.pS = this.pO + 2.5f;
    }

    private void ay(Keystrokes.rf rf2, double d) {
        rf2.oh(this.rf(d));
    }

    private String rf(double d) {
        if (((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).py) {
            return "CPS: " + this.pD.format(d);
        }
        return this.pD.format(d) + " CPS";
    }

    @Override
    public ci te() {
        return ((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).iO;
    }

    @Override
    public void rf(double d, double d2) {
        switch (Keystrokes .1.nY[((Keystrokes.bu) ((Keystrokes) Keystrokes.this).vz).pe.ordinal()]){
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
