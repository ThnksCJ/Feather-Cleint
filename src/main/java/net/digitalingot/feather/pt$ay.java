package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

class pt$ay {
    private int kp;
    private int ao;
    private int nx;

    private pt$ay(int n, int n2, int n3) {
        this.kp = n;
        this.ao = n2;
        this.nx = n3;
    }

    @NotNull
    public static pt$ay uj(@NotNull Color color) {
        float[] fArray = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        return new pt$ay(Math.round(fArray[0] * 100.0f), Math.round(fArray[1] * 100.0f), Math.round(fArray[2] * 100.0f));
    }

    @NotNull
    public Color ea() {
        return Color.getHSBColor((float)this.kp / 100.0f, (float)this.ao / 100.0f, (float)this.nx / 100.0f);
    }

    public pt$ay nw(int n) {
        int n2 = this.nx >= 50 ? -1 : 1;
        this.nx = Math.min(Math.max(this.nx + n2 * n, 0), 100);
        return this;
    }

    public int eq() {
        return this.kp;
    }

    public void mm(int n) {
        this.kp = n;
    }

    public int fj() {
        return this.ao;
    }

    public void xs(int n) {
        this.ao = n;
    }

    public int kt() {
        return this.nx;
    }

    public void om(int n) {
        this.nx = n;
    }
}
