package net.digitalingot.feather;

import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface zr {
    gb<zr> ll = yd.ay(zr.class, zrArray -> (entity, ay2) -> {
        for (zr zr2 : zrArray) {
            zr2.render(entity, ay2);
        }
    });
    gb<zr> ds = yd.ay(zr.class, zrArray -> (entity, ay2) -> {
        for (zr zr2 : zrArray) {
            zr2.render(entity, ay2);
        }
    });

    void render(@NotNull Entity var1, @NotNull ay var2);

    class ay {
        private int xi;
        private int et;
        private int go;

        public ay(int n, int n2) {
            this.xi = n;
            this.et = n2;
        }

        public int pz() {
            return this.xi;
        }

        public void sb(int n) {
            this.xi = n;
        }

        public int ro() {
            return this.et;
        }

        public void iu(int n) {
            this.et = n;
        }

        public int oa() {
            return this.go;
        }

        public void ig(int n) {
            this.go = n;
        }
    }
}
