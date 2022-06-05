package net.digitalingot.feather;

import net.digitalingot.feather.enums.ai;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class vu {
    public static void ay(@NotNull ej ej2) {
        Set<Map.Entry<qc, Mod<?>>> set = ej2.qq().entrySet();
        ArrayList<ly> arrayList = new ArrayList<ly>(set.size());
        for (Map.Entry<qc, Mod<?>> entry : set) {
            Mod<?> ux2 = entry.getValue();
            bx bx2 = ux2.cs().jf();
            if (!bx2.mc().vu().isEmpty()) continue;
            Boolean bl = ux2.xd().ir();
            List<ai> list = hm.ed(ux2.xd());
            ly ly2 = new ly(bx2.vu(), entry.getKey(), bx2.jm(), bx2.mz(), bl, bx2.lq(), list);
            arrayList.add(ly2);
        }
        Collections.sort(arrayList);
        id id2 = new id(arrayList);
        zz.nw().pv().rf(id2);
    }
}
