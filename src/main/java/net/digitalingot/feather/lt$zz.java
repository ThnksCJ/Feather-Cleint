package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Keystrokes;
import net.minecraft.client.settings.KeyBinding;

import java.awt.*;

class lt$zz {
    protected final Keystrokes.bu oG;
    protected final Keystrokes.sd oH;
    protected final KeyBinding oI;
    protected final Keystrokes.ay oJ;
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

    public lt$zz(Keystrokes.bu bu2, Keystrokes.sd sd2, KeyBinding keyBinding) {
        this.oG = bu2;
        this.oH = sd2;
        this.oI = keyBinding;
        this.oK = 0.0f;
        this.oJ = new Keystrokes.ay(this.ay(bu2.pA, bu2.kv), this.ay(bu2.pB, bu2.sa));
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
            this.oK = eb.ag((float) ((double) (l - this.oM) / Math.max(1.0, this.oG.oY)));
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
        Keystrokes.uj uj2 = this.oH.bounds;
        this.oO = f * (uj2.width + uj2.margin);
        this.oP = f2 * (uj2.height + 1.0f);
        this.oQ = this.oO + uj2.width;
        this.oR = this.oP + uj2.height;
        this.oS = this.oO + (uj2.width - (float) this.oH.getTextWidth(this.oG)) / 2.0f;
        this.oT = this.oP + (uj2.height - 7.0f) / 2.0f;
    }

    public void ay(float f, float f2, int n) {
        this.vr();
        Keystrokes.uj uj2 = this.oH.bounds;
        this.oO = f * (uj2.width + uj2.margin);
        this.oP = f2 * (uj2.height + 1.0f);
        this.oQ = this.oO + uj2.width;
        this.oR = this.oP + (float) n;
        this.oS = this.oO + (uj2.width - (float) this.oH.getTextWidth(this.oG)) / 2.0f;
        this.oT = this.oP + (uj2.height - 7.0f) / 2.0f;
    }
}
