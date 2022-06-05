package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.*;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;

public class ca {
    @Nullable
    private final Field qs;
    @NotNull
    private final Class<?> od;
    @Nullable
    private final au zb;
    @Nullable
    private final ke qn;
    @Nullable
    private final dg lc;
    @Nullable
    private final jf ew;
    @Nullable
    private final in pp;
    @Nullable
    private final mj ye;
    @Nullable
    private final aw ia;
    @Nullable
    private final wv ih;
    @Nullable
    private final zq fe;
    @Nullable
    private final fl tz;

    public ca(@NotNull Class<?> clazz) {
        this.od = ClassUtils.primitiveToWrapper(clazz);
        this.qs = null;
        this.zb = null;
        this.qn = null;
        this.lc = null;
        this.ew = null;
        this.pp = null;
        this.ye = null;
        this.ia = null;
        this.ih = null;
        this.fe = null;
        this.tz = null;
    }

    public ca(@NotNull Field field, @NotNull au au2, @Nullable ke ke2, @Nullable dg dg2, @Nullable jf jf2, @Nullable in in2, @Nullable mj mj2, @Nullable aw aw2, @Nullable wv wv2, @Nullable zq zq2, @Nullable fl fl2) {
        this.qs = field;
        this.od = ClassUtils.primitiveToWrapper(field.getType());
        this.zb = au2;
        this.qn = ke2;
        this.lc = dg2;
        this.ew = jf2;
        this.pp = in2;
        this.ye = mj2;
        this.ia = aw2;
        this.ih = wv2;
        this.fe = zq2;
        this.tz = fl2;
    }

    @NotNull
    public <T> T bu(@NotNull Object object) {
        if (this.qs == null) {
            throw new NullPointerException("Field is null");
        }
        return (T) this.qs.get(object);
    }

    public void ay(@NotNull Object object, @NotNull Object object2) {
        if (this.qs == null) {
            throw new NullPointerException("Field is null");
        }
        this.qs.set(object, object2);
    }

    @NotNull
    public Class<?> nj() {
        return this.od;
    }

    @Nullable
    public Field wt() {
        return this.qs;
    }

    @Nullable
    public au su() {
        return this.zb;
    }

    @Nullable
    public ke sn() {
        return this.qn;
    }

    @Nullable
    public dg kd() {
        return this.lc;
    }

    @Nullable
    public jf pf() {
        return this.ew;
    }

    @Nullable
    public in uw() {
        return this.pp;
    }

    @Nullable
    public mj tw() {
        return this.ye;
    }

    @Nullable
    public aw hk() {
        return this.ia;
    }

    public wv ta() {
        return this.ih;
    }

    @Nullable
    public zq xu() {
        return this.fe;
    }

    @Nullable
    public fl fi() {
        return this.tz;
    }

    public String toString() {
        return this.qs == null ? "" : this.qs.getDeclaringClass().getName() + "." + this.qs.getName();
    }
}
