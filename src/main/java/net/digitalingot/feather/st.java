package net.digitalingot.feather;

import net.digitalingot.feather.enums.ai;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.bx;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class st {
    public static void ay(@NotNull ej ej2) {
        Set<Map.Entry<qc, Mod<?>>> set = ej2.qq().entrySet();
        TreeMap<Integer, ns.ay> treeMap = new TreeMap<Integer, ns.ay>();
        for (Map.Entry<qc, Mod<?>> entry : set) {
            qc qc2 = entry.getKey();
            Mod<?> ux2 = entry.getValue();
            bx bx2 = ux2.cs().jf();
            if (bx2.mc().vu().isEmpty()) continue;
            List<ai> list = hm.ed(ux2.xd());
            ns.ay ay2 = new ns.ay(bx2.vu(), qc2, bx2.mc().vu(), bx2.jm(), bx2.mz(), list);
            treeMap.put(bx2.mc().yp().vi(), ay2);
        }
        ns ns2 = new ns(new ArrayList<ns.ay>(treeMap.values()));
        zz.nw().pv().rf(ns2);
    }
}
