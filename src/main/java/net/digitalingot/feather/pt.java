package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class pt {
    public static void ay(@NotNull Color color) {
        String string = pt.rf(color);
        String string2 = pt.rf(ay.uj(color).nw(17).ea());
        String string3 = pt.rf(ay.uj(color).nw(57).ea());
        ax ax2 = new ax(string, string2, string3);
        zz.nw().pv().rf(ax2);
    }

    private static String rf(Color color) {
        return String.format("%s,%s,%s", color.getRed(), color.getGreen(), color.getBlue());
    }

    static class ay {
        private int kp;
        private int ao;
        private int nx;

        private ay(int n, int n2, int n3) {
            this.kp = n;
            this.ao = n2;
            this.nx = n3;
        }

        @NotNull
        public static ay uj(@NotNull Color color) {
            float[] fArray = new float[3];
            Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
            return new ay(Math.round(fArray[0] * 100.0f), Math.round(fArray[1] * 100.0f), Math.round(fArray[2] * 100.0f));
        }

        @NotNull
        public Color ea() {
            return Color.getHSBColor((float)this.kp / 100.0f, (float)this.ao / 100.0f, (float)this.nx / 100.0f);
        }

        public ay nw(int n) {
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
}
