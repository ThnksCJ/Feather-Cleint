package net.digitalingot.feather;

import net.digitalingot.feather.enums.ai;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class op {
    public static void rf(@NotNull nu nu2) {
        ig ig2 = nu2.je();
        List<kn> list = op.ay(ig2);
        zt zt2 = new zt(list);
        zz.nw().pv().rf(zt2);
    }

    @NotNull
    private static List<kn> ay(@NotNull ig ig2) {
        ArrayList<kn> arrayList = new ArrayList<kn>();
        for (sb sb2 : ig2.lm().values()) {
            List<ai> list;
            Object object;
            Class<?> clazz = yw.al.get(sb2.getSlug());
            if (clazz != null) {
                object = ig2.mq().ay(sb2.getSlug(), clazz);
                list = hm.ed(object);
            } else {
                list = null;
            }
            object = new kn(sb2.getName(), sb2.getSlug(), sb2.getIcon(), sb2.jo(), list);
            arrayList.add((kn) object);
        }
        return arrayList;
    }
}
