package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class yt {
    private static final long tM = 1000L;
    private static final double tN = 0.01;
    private final ay tO;
    private final rf tP = new rf();
    private final rf tQ = new rf();

    public yt(@NotNull Mod<?> ux2) {
        this(ux2, null);
    }

    public yt(@NotNull Mod<?> ux2, @Nullable ay ay2) {
        this.tO = ay2;
        sw.ti.ay(uj2 -> {
            if (!ux2.gc()) {
                return;
            }
            if (uj2 != sw.uj.END) {
                return;
            }
            this.jb();
        });
        lv.zl.ay((n, n2, n3) -> {
            if (!ux2.gc()) {
                return;
            }
            if (n2 == 0) {
                return;
            }
            long l = System.currentTimeMillis();
            if (n == 0) {
                this.tP.sd(l);
            } else if (n == 1) {
                this.tQ.sd(l);
            }
        });
    }

    private void jb() {
        long l = System.currentTimeMillis() - 1000L;
        double d = this.tP.bu(l);
        double d2 = this.tQ.bu(l);
        if ((d != 0.0 || d2 != 0.0) && this.tO != null) {
            this.tO.rf(d, d2);
        }
    }

    public double wk() {
        return this.tP.tR.size();
    }

    public double si() {
        return this.tQ.tR.size();
    }

    public interface ay {
        void rf(double var1, double var3);
    }

    static class rf {
        private final List<Long> tR = new ArrayList<Long>();
        private double tS;

        private rf() {
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
}
