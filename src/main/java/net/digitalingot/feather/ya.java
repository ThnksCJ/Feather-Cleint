package net.digitalingot.feather;

import org.lwjgl.opengl.GL11;

public class ya
extends vr {
    private final kb Ey;
    private boolean Ez;

    public ya(kb kb2) {
        this.Ey = kb2;
    }

    public void nV() {
        this.Ez = false;
    }

    public void nW() {
        this.Ez = true;
    }

    public void ok() {
        GL11.glPopMatrix();
        this.Ez = false;
    }

    public void nX() {
        GL11.glPushMatrix();
        ci ci2 = this.Ey.te();
        GL11.glTranslated(this.Ey.hh(), this.Ey.ix(), 0.0);
        float f = (float)ci2.yx();
        GL11.glScalef(f, f, 1.0f);
        this.Ez = true;
    }

    @Override
    protected float iu(float f) {
        ci ci2 = this.Ey.te();
        return f;
    }

    @Override
    protected float ig(float f) {
        ci ci2 = this.Ey.te();
        return f;
    }
}
