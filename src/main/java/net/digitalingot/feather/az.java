package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.regex.Pattern;

public class az {
    public static final char Fo = '\u00a7';
    private static final Pattern Fp = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");

    private az() {
    }

    public static int nn(int n, int n2, int n3) {
        return az.bu(n, n2, n3, 255);
    }

    public static int bu(int n, int n2, int n3, int n4) {
        return (n4 & 0xFF) << 24 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF;
    }

    public static int sd(float f, float f2, float f3) {
        return az.zz(f, f2, f3, 1.0f);
    }

    public static int zz(float f, float f2, float f3, float f4) {
        return az.bu((int)((double)(f * 255.0f) + 0.5), (int)((double)(f2 * 255.0f) + 0.5), (int)((double)(f3 * 255.0f) + 0.5), (int)((double)(f4 * 255.0f) + 0.5));
    }

    public static gp ay(@NotNull gp gp2, @NotNull gp gp3, float f) {
        f = eb.ag(f);
        if (gp2.sc() && gp3.sc()) {
            return new gp(true, gp2.pg());
        }
        Color color = gp2.sc() ? new Color(vr.nR().nT(), true) : gp2.pg();
        Color color2 = gp3.sc() ? new Color(vr.nR().nT(), true) : gp3.pg();
        return new gp(false, az.ay(color, color2, f));
    }

    public static Color ay(@NotNull Color color, @NotNull Color color2, float f) {
        f = eb.ag(f);
        return new Color((int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f), (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f), (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f), (int)((float)color.getAlpha() + (float)(color2.getAlpha() - color.getAlpha()) * f));
    }

    public static String uf(String string) {
        if (string == null) {
            return null;
        }
        return Fp.matcher(string).replaceAll("");
    }
}
