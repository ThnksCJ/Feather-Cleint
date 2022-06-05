package net.digitalingot.feather;

import com.google.common.collect.Maps;
import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class br<T> {
    @NotNull
    private final ca jv;
    @NotNull
    private final bs<T> jk;
    @NotNull
    private final T uc;

    public br(@NotNull ca ca2, @NotNull T t) {
        this.jv = ca2;
        this.jk = to.zz(ca2.nj());
        if (this.jk == null) {
            throw new IllegalArgumentException("Type " + ca2.nj().getName() + " (" + ca2 + ") not supported");
        }
        this.uc = t;
    }

    @NotNull
    public Map.Entry<String, String> wh() {
        String string = this.jv.su().wd();
        String string2 = this.jk.kl(this.uc);
        String string3 = this.jv.fi() != null ? (this.jv.fi().fd().isEmpty() ? "" : this.jv.fi().fd() + ":") : "";
        return Maps.immutableEntry(string3 + string, string2);
    }
}
