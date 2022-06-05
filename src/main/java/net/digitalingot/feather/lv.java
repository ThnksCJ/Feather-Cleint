package net.digitalingot.feather;

public class lv {
    public static gb<rf> zl = yd.ay(rf.class, rfArray -> (n, n2, n3) -> {
        for (rf rf2 : rfArray) {
            rf2.mouseInput(n, n2, n3);
        }
    });
    public static gb<ay> vs = yd.ay(ay.class, ayArray -> (n, n2, n3, n4) -> {
        for (ay ay2 : ayArray) {
            ay2.keyInput(n, n2, n3, n4);
        }
    });

    public interface ay {
        void keyInput(int var1, int var2, int var3, int var4);
    }

    public interface rf {
        void mouseInput(int var1, int var2, int var3);
    }
}
