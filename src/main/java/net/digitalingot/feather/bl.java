package net.digitalingot.feather;

public class bl {
    public static boolean on(int n) {
        return n < 0 ? dv.wz(n + 100) : bu.ay(n);
    }

    public static boolean zz(int ... nArray) {
        for (int n : nArray) {
            if (bl.on(n)) continue;
            return false;
        }
        return true;
    }
}
