package net.digitalingot.feather;

import net.digitalingot.feather.enums.hh;
import net.digitalingot.feather.interfaces.rm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gc<T> {
    @NotNull
    protected final Class<T> rp;
    @Nullable
    protected final Map<String, String> ud;
    @NotNull
    protected final String np;

    gc(@NotNull Class<T> clazz, @Nullable Map<String, String> map, String string) {
        this.rp = clazz;
        this.ud = map;
        this.np = string;
    }

    @NotNull
    public T sf() {
        List<ca> list = this.gh();
        Map<ca, Object> map = this.ed(list);
        this.ay(map);
        return this.rf(map);
    }

    protected List<ca> gh() {
        cs<T> cs2 = new cs<T>(this.rp);
        return cs2.gh();
    }

    @NotNull
    private Map<ca, Object> ed(@NotNull List<ca> list) {
        HashMap<ca, Object> hashMap = new HashMap<ca, Object>(list.size());
        for (ca ca2 : list) {
            Object object = ca2.fi() != null ? this.rf(ca2) : this.ay(ca2);
            hashMap.put(ca2, object);
        }
        return hashMap;
    }

    private Object ay(@NotNull ca ca2) {
        String string = ca2.su().wd();
        String string2 = this.np + string;
        String string3 = this.ud == null ? null : this.ud.get(string2);
        Object object = this.ay(string, string3);
        if (object != null) {
            return object;
        }
        ku ku2 = new ku(ca2, string3);
        return ku2.wo();
    }

    @Nullable
    protected Object ay(@NotNull String string, @Nullable String string2) {
        rm rm2;
        if (string2 == null && string.equals("enabled") && (rm2 = this.tr()) != null) {
            return rm2.wm();
        }
        return null;
    }

    private Object rf(ca ca2) {
        return hh.INSTANCE.create(ca2, this.ud, ca2.fi().fd()).sf();
    }

    private void ay(Map<ca, Object> map) {
        if (map == null) {
            throw new IllegalStateException("validateObjects() called before parseObjects()");
        }
        for (Map.Entry<ca, Object> entry : map.entrySet()) {
            ch<Object> ch2;
            ca ca2 = entry.getKey();
            Object object = entry.getValue();
            zq zq2 = ca2.xu();
            if (zq2 == null || (ch2 = new ch<Object>(ca2)).nn(object)) continue;
            ku ku2 = new ku(entry.getKey(), null);
            entry.setValue(ku2.wo());
        }
    }

    private T rf(Map<ca, Object> map) {
        T t = this.rp.getConstructor(new Class[0]).newInstance();
        for (Map.Entry<ca, Object> entry : map.entrySet()) {
            ca ca2 = entry.getKey();
            Object object = entry.getValue();
            ca2.ay(t, object);
        }
        return t;
    }

    @Nullable
    private rm tr() {
        return this.rp.getDeclaredAnnotation(rm.class);
    }
}
