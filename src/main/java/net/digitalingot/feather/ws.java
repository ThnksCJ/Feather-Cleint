package net.digitalingot.feather;

public class ws {
    private static final byte Al = -127;
    private static final byte Am = 0;

    public static void ay(byte[] byArray, float f) {
        if (Math.abs((double)f - 1.0) < 0.001) {
            return;
        }
        for (int i = 0; i < byArray.length; i += 2) {
            short s = ws.ay(byArray[i], byArray[i + 1]);
            s = (short)((float)s * f);
            byArray[i] = (byte)s;
            byArray[i + 1] = (byte)(s >> 8);
        }
    }

    public static byte[] ay(byte[] byArray, float f, float f2) {
        byte[] byArray2 = new byte[byArray.length * 2];
        for (int i = 0; i < byArray.length; i += 2) {
            short s = ws.ay(byArray[i], byArray[i + 1]);
            short s2 = (short)((float)s * f);
            short s3 = (short)((float)s * f2);
            byArray2[i * 2] = (byte)s2;
            byArray2[i * 2 + 1] = (byte)(s2 >> 8);
            byArray2[i * 2 + 2] = (byte)s3;
            byArray2[i * 2 + 3] = (byte)(s3 >> 8);
        }
        return byArray2;
    }

    public static double zz(byte[] byArray) {
        double d = -127.0;
        int n = byArray.length / 10;
        for (int i = 0; i < byArray.length; i += n) {
            double d2 = ws.ay(byArray, i, Math.min(i + n, byArray.length));
            if (!(d2 > d)) continue;
            d = d2;
        }
        return d;
    }

    public static double ay(byte[] byArray, int n, int n2) {
        double d = 0.0;
        while (n < n2) {
            double d2 = ws.ay(byArray[n], byArray[n + 1]);
            d += (d2 /= 32767.0) * d2;
            n += 2;
        }
        int n3 = n2 / 2;
        d = n3 == 0 ? 0.0 : Math.sqrt(d / (double)n3);
        double d3 = d > 0.0 ? Math.min(Math.max(20.0 * Math.log10(d), -127.0), 0.0) : -127.0;
        return (byte)d3;
    }

    public static short ay(byte by, byte by2) {
        return (short)((by2 & 0xFF) << 8 | by & 0xFF);
    }

    public static byte[] ay(short s) {
        return new byte[]{(byte)(s & 0xFF), (byte)(s >> 8 & 0xFF)};
    }
}
