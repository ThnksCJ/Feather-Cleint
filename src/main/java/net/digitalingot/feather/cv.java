package net.digitalingot.feather;

import net.digitalingot.feather.enums.wi;
import org.jetbrains.annotations.NotNull;

public class cv {
    public static gb<rf> ll = yd.ay(rf.class, rfArray -> (void_, uj2) -> {
        for (rf rf2 : rfArray) {
            wi wi2 = rf2.render(void_, uj2);
            if (wi2 == wi.PASS) continue;
            return wi2;
        }
        return wi.PASS;
    });
    public static gb<ay> ds = yd.ay(ay.class, ayArray -> (void_, uj2) -> {
        for (ay ay2 : ayArray) {
            ay2.render(void_, uj2);
        }
    });
    public static gb<ay> fj = yd.ay(ay.class, ayArray -> (void_, uj2) -> {
        for (ay ay2 : ayArray) {
            ay2.render(void_, uj2);
        }
    });

    public interface ay {
        void render(Void var1, @NotNull uj var2);
    }

    public enum uj {
        ALL,
        CROSSHAIRS,
        FOOD

    }

    public interface rf {
        @NotNull wi render(Void var1, @NotNull uj var2);
    }
}
