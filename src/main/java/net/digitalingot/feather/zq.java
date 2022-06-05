package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class zq {
    @NotNull
    private final qk xf;
    @NotNull
    private final Type dn;
    @NotNull
    private final Method vj;

    public zq(@NotNull qk qk2, @NotNull Type type, @NotNull Method method) {
        this.xf = qk2;
        this.dn = type;
        this.vj = method;
    }

    @NotNull
    public qk uh() {
        return this.xf;
    }

    @NotNull
    public Type rt() {
        return this.dn;
    }

    @NotNull
    public Method is() {
        return this.vj;
    }
}
