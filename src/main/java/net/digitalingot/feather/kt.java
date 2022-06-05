package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class kt {
    @NotNull
    private static final ImmutableMap<Integer, Integer> fz = ImmutableMap.builder().put(0, 6).put(1, 2).put(2, 4).put(3, 0).put(4, 1).put(5, 3).put(6, 5).put(7, 7).build();

    public static void ay(@NotNull ej ej2) {
        ml ml2 = new ml(kt.rf(ej2));
        zz.nw().pv().rf(ml2);
    }

    @NotNull
    private static Map<Integer, ml.ay> rf(@NotNull ej ej2) {
        TreeMap<Integer, ml.ay> treeMap = new TreeMap<Integer, ml.ay>();
        for (Mod<?> ux2 : ej2.qq().values()) {
            xg xg2;
            Object object = ux2.xd();
            Object object2 = object.getClass().getDeclaredAnnotation(rm.class);
            if (object2 == null || (xg2 = object2.le()).ae().isEmpty() || !((zi)object).enabled || !((zi)object).vk || ej2.iv().contains(ux2.cs().aw())) continue;
            ml.ay ay2 = new ml.ay(xg2.ae(), xg2.vu(), xg2.jm());
            treeMap.put(xg2.un(), ay2);
        }
        HashMap hashMap = new HashMap(treeMap.size());
        hashMap.put(fz.get(0), new ml.ay("cosmetics", "Cosmetics", "https://assets.feathercdn.net/game/hudselection/cosmetics.svg"));
        int n = 1;
        for (Object object2 : treeMap.values()) {
            hashMap.put(fz.get(n++), object2);
        }
        return hashMap;
    }
}
