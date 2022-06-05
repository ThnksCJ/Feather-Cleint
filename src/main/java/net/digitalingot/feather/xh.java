package net.digitalingot.feather;

public interface xh {
    gb<xh> bo = yd.ay(xh.class, xhArray -> (f, f2) -> {
        float f3 = f2;
        for (xh xh2 : xhArray) {
            f3 = xh2.updateFOV(f, f3);
        }
        return f3;
    });

    float updateFOV(float var1, float var2);
}
