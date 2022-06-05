package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.Keystrokes;
import net.minecraft.client.settings.KeyBinding;

class lt$rf
extends Keystrokes.zz {
    private String oD;
    private float oE;
    private float oF;

    public lt$rf(Keystrokes.bu bu2, Keystrokes.sd sd2, KeyBinding keyBinding) {
        super(bu2, sd2, keyBinding);
    }

    @Override
    public void uj(float f, float f2) {
        super.uj(f, f2);
        if (this.oG.pe == Keystrokes.bu.ay.WITH_CLICKS) {
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

    static String ay(lt$rf rf2) {
        return rf2.oD;
    }

    static float rf(lt$rf rf2) {
        return rf2.oE;
    }

    static float uj(lt$rf rf2) {
        return rf2.oF;
    }
}
