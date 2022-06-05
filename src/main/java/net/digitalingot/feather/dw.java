package net.digitalingot.feather;

import net.digitalingot.feather.enums.qd;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class dw {
    public static void cv() {
        List<fm> list = dw.zl();
        List<qd> list2 = dw.vs();
        td td2 = new td(list, list2);
        zz.nw().pv().rf(td2);
    }

    @NotNull
    private static List<fm> zl() {
        ArrayList<fm> arrayList = new ArrayList<fm>();
        arrayList.add(fm.SINGLEPLAYER);
        arrayList.add(fm.MULTIPLAYER);
        arrayList.add(fm.COSMETICS);
        arrayList.add(fm.QUIT_GAME);
        return arrayList;
    }

    @NotNull
    private static List<qd> vs() {
        ArrayList<qd> arrayList = new ArrayList<qd>();
        arrayList.add(qd.MC_SETTINGS);
        if (vs.kx()) {
            arrayList.add(qd.REPLAY_MOD);
        }
        return arrayList;
    }
}
