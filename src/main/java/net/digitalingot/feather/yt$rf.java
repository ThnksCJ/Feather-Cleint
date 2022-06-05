package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.List;

class yt$rf {
    private final List<Long> tR = new ArrayList<Long>();
    private double tS;

    private yt$rf() {
    }

    static double ay(yt$rf rf2, long l) {
        return rf2.bu(l);
    }

    static List ay(yt$rf rf2) {
        return rf2.tR;
    }

    static void rf(yt$rf rf2, long l) {
        rf2.sd(l);
    }

    private void sd(long l) {
        this.tR.add(l);
    }

    private double bu(long l) {
        double d;
        this.tR.removeIf(l2 -> l2 < l);
        double d2 = this.tR.size();
        if (d2 != this.tS && Math.abs(d = d2 - this.tS) > 0.01) {
            this.tS = d2;
            return d;
        }
        return 0.0;
    }
}
