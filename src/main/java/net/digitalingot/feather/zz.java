package net.digitalingot.feather;

public class zz {
    private static zz rl;
    private sd sb;

    public static boolean ig() {
        return rl != null;
    }

    public static zz ag() {
        if (rl == null) {
            return null;
        }
        return rl;
    }

    public static sd nw() {
        if (rl == null) {
            return null;
        }
        return zz.ag().sb;
    }

    public static void ay(zz zz2) {
        rl = zz2;
    }

    public void ay(sd sd2) {
        this.sb = sd2;
    }

    public sd mm() {
        return this.sb;
    }
}
