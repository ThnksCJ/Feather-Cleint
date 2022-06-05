package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.*;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class cs<T> {
    private static final Map<Class<?>, List<ca>> ak = new HashMap();
    @NotNull
    private final Class<T> rp;

    public cs(@NotNull Class<T> clazz) {
        this.rp = clazz;
    }

    @NotNull
    public List<ca> gh() {
        return this.ay((wv) null);
    }

    @NotNull
    public List<ca> ay(wv wv2) {
        List<ca> list = ak.get(this.rp);
        if (list != null && wv2 == null) {
            return list;
        }
        ArrayList<ca> arrayList = new ArrayList<ca>();
        for (Field field : this.rp.getFields()) {
            ca ca2 = this.ay(field, wv2);
            if (ca2 == null) continue;
            arrayList.add(ca2);
        }
        if (wv2 == null) {
            ak.put(this.rp, arrayList);
        }
        return arrayList;
    }

    @Nullable
    private ca ay(Field field, @Nullable wv wv2) {
        zq zq2;
        aw[] awArray;
        au au2 = field.getDeclaredAnnotation(au.class);
        fl fl2 = field.getDeclaredAnnotation(fl.class);
        if (au2 == null && fl2 == null) {
            return null;
        }
        if (au2 != null && fl2 != null) {
            throw new IllegalStateException("Field " + field.getName() + " cannot have both @Value and @Nested annotations");
        }
        ke ke2 = field.getDeclaredAnnotation(ke.class);
        if (ke2 != null && !ClassUtils.isAssignable(field.getType(), Collection.class, true)) {
            throw new IllegalStateException("@Checkbox applied on a non-Collection field");
        }
        jf jf2 = field.getDeclaredAnnotation(jf.class);
        if (jf2 != null && !ClassUtils.isAssignable(field.getType(), String.class, true)) {
            throw new IllegalStateException("@TextLength applied on a non-String field");
        }
        in in2 = field.getDeclaredAnnotation(in.class);
        if (in2 != null && !ClassUtils.isAssignable(field.getType(), Double.TYPE, true)) {
            throw new IllegalStateException("@DoubleRange applied on non-double field");
        }
        mj mj2 = field.getDeclaredAnnotation(mj.class);
        if (mj2 != null && !ClassUtils.isAssignable(field.getType(), Integer.TYPE, true)) {
            throw new IllegalStateException("@IntegerRange applied on non-integer field");
        }
        wv wv3 = field.getDeclaredAnnotation(wv.class);
        aw aw2 = null;
        if (wv2 != null && wv3 != null && fl2 == null) {
            awArray = wv2.rh();
            int n = awArray.length;
            for (int i = 0; i < n; ++i) {
                aw aw3 = awArray[i];
                if (!aw3.ie().equals(au2.wd())) continue;
                aw2 = aw3;
                break;
            }
        }
        if ((awArray = field.getDeclaredAnnotation(qk.class)) != null) {
            Method method = this.ay((qk) awArray);
            if (method == null) {
                throw new jl("No matching @AllowedValues found for value = \"" + awArray.wd() + "\" in class " + this.rp.getName());
            }
            zq2 = new zq((qk) awArray, ClassUtils.primitiveToWrapper(field.getType()), method);
        } else {
            zq2 = null;
        }
        dg dg2 = field.getDeclaredAnnotation(dg.class);
        if (dg2 != null) {
            if (ClassUtils.isAssignable(field.getType(), String.class, true)) {
                if (zq2 == null) {
                    throw new IllegalStateException("@Dropdown applied on String field without @AllowedValues");
                }
            } else if (!ClassUtils.isAssignable(field.getType(), Enum.class, true)) {
                throw new IllegalStateException("@Dropdown applied on non-enum or non-String field");
            }
        }
        return new ca(field, au2, ke2, dg2, jf2, in2, mj2, aw2, wv3, zq2, fl2);
    }

    @Nullable
    private Method ay(@NotNull qk qk2) {
        String string = qk2.wd();
        for (Method method : this.rp.getMethods()) {
            qk qk3 = method.getDeclaredAnnotation(qk.class);
            if (qk3 == null || !Modifier.isStatic(method.getModifiers()) || !qk3.wd().equals(string)) continue;
            return method;
        }
        return null;
    }
}
