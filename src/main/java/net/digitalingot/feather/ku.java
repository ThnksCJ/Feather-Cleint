package net.digitalingot.feather;

import com.google.common.collect.ImmutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Map;
import java.util.Objects;

public class ku<T> {
    private static final Map<Class<?>, String> pc = ImmutableMap.builder().put(Boolean.class, "false").put(Double.class, "0.0").put(Integer.class, "0").put(String.class, "").put(Color.class, "255/255/255").put(gp.class, "false/255/255/255").build();
    @NotNull
    private final ca jv;
    @NotNull
    private final bs<T> jk;
    @NotNull
    private String aa;

    @Nullable
    private static String uj(@NotNull Class<?> clazz) {
        for (Map.Entry<Class<?>, String> entry : pc.entrySet()) {
            Class<?> clazz2 = entry.getKey();
            String string = entry.getValue();
            if (!clazz2.isAssignableFrom(clazz)) continue;
            return string;
        }
        return null;
    }

    public ku(@NotNull Class<T> clazz, @NotNull String string) {
        this(new ca(clazz), string);
    }

    public ku(@NotNull ca ca2, @Nullable String string) {
        this.jv = ca2;
        this.jk = to.zz(ca2.nj());
        if (this.jk == null) {
            throw new IllegalArgumentException("Type " + ca2.nj().getName() + " (" + ca2 + ") not supported");
        }
        if (string == null) {
            if (ca2.su() == null) {
                throw new jl("Unannotated type with a null input (" + ca2 + ")");
            }
            this.aa = this.sd(ca2);
        } else {
            this.aa = string;
        }
    }

    @NotNull
    private String sd(@NotNull ca ca2) {
        String string = ca2.su().pr();
        if (ca2.hk() != null && !ca2.hk().pr().isEmpty()) {
            string = ca2.hk().pr();
        }
        if (!string.isEmpty()) {
            return string;
        }
        return Objects.requireNonNull(ku.uj(ca2.nj()), "No default type for type " + ca2.nj().getName() + " (" + ca2 + ")");
    }

    @NotNull
    public T wo() {
        return this.zs(false);
    }

    @NotNull
    private T zs(boolean bl) {
        String string;
        Class<?> clazz = this.jv.nj();
        T t = this.jk.rf(this.aa, clazz);
        ch<T> ch2 = new ch<T>(this.jv);
        String string2 = string = this.jv.su() == null ? "" : this.jv.su().wd();
        if (ch2.nn(t) || string.equals("backgroundWidth") || string.equals("backgroundHeight")) {
            return t;
        }
        if (bl) {
            throw new lu("Default value \"" + this.aa + "\" of type \"" + clazz.getName() + "\" is invalid: " + this.jv.wt());
        }
        return this.mk();
    }

    @NotNull
    private T mk() {
        if (this.jv.su() == null) {
            throw new lu("Unannotated type (" + this.jv + ") couldn't be parsed.");
        }
        this.aa = this.sd(this.jv);
        return this.zs(true);
    }
}
