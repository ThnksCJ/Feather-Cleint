package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.bx;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class bt {
    public static void ay(@NotNull ej ej2) {
        HashMap<qc, qq> hashMap = new HashMap<qc, qq>();
        for (Map.Entry<qc, Mod<?>> entry : ej2.qq().entrySet()) {
            qc qc2 = entry.getKey();
            Mod<?> ux2 = entry.getValue();
            bx bx2 = ux2.cs().jf();
            if (bx2.mc().vu().isEmpty()) continue;
            qq qq2 = new qq(ux2.xd());
            hashMap.put(qc2, qq2);
        }
        wb wb2 = new wb(hashMap);
        zz.nw().pv().rf(wb2);
    }
}
