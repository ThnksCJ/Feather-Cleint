package net.digitalingot.feather;

import net.digitalingot.feather.enums.hu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class df<T> {
    @NotNull
    protected final T oe;

    public df(@NotNull T t) {
        this.oe = t;
    }

    @NotNull
    public Map<String, String> fg() {
        List<ca> list = this.gh();
        return this.zs(list);
    }

    private List<ca> gh() {
        cs cs2 = new cs(this.oe.getClass());
        return cs2.gh();
    }

    @NotNull
    private Map<String, String> zs(@NotNull List<ca> list) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (ca ca2 : list) {
            if (ca2.fi() != null) {
                hashMap.putAll(this.zz(ca2));
                continue;
            }
            Map.Entry<String, String> entry = this.uj(ca2);
            if (entry == null) continue;
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    @Nullable
    private Map.Entry<String, String> uj(@NotNull ca ca2) {
        Object object;
        if (ca2.su().wd().equals("hudSelection") && ((object = this.oe.getClass().getDeclaredAnnotation(rm.class)) == null || object.le().ae().isEmpty())) {
            return null;
        }
        object = ca2.bu(this.oe);
        br br2 = new br(ca2, object);
        return br2.wh();
    }

    private Map<String, String> zz(@NotNull ca ca2) {
        Object t = ca2.bu(this.oe);
        return hu.INSTANCE.create(t).fg();
    }
}
