package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class gf {
    public static void ay(@NotNull ej ej2) {
        HashMap<qc, xy> hashMap = new HashMap<qc, xy>(ej2.qq().size());
        for (Map.Entry<qc, Mod<?>> entry : ej2.qq().entrySet()) {
            qc qc2 = entry.getKey();
            Mod<?> ux2 = entry.getValue();
            bx bx2 = ux2.cs().jf();
            if (!bx2.mc().vu().isEmpty()) continue;
            xy xy2 = new xy(ux2.xd());
            hashMap.put(qc2, xy2);
        }
        sr sr2 = new sr(hashMap);
        zz.nw().pv().rf(sr2);
    }
}
