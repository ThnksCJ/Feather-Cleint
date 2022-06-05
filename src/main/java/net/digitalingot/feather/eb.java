package net.digitalingot.feather;

public final class eb {
    private eb() {
        throw new AssertionError();
    }

    public static float bu(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float ag(float f) {
        return eb.bu(f, 0.0f, 1.0f);
    }

    public static float kl(float f, float f2, float f3) {
        return (f2 - f * f3) / (1.0f - f);
    }

    public static float[] ay(float[] fArray, float f) {
        float f2 = (fArray[0] + fArray[2]) / 2.0f;
        float f3 = (fArray[1] + fArray[3]) / 2.0f;
        fArray[0] = eb.kl(f, fArray[0], f2);
        fArray[2] = eb.kl(f, fArray[2], f2);
        fArray[1] = eb.kl(f, fArray[1], f3);
        fArray[3] = eb.kl(f, fArray[3], f3);
        return fArray;
    }
}
