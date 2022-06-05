package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;

public class ch<T> {
    @NotNull
    private final ca jv;

    public ch(@NotNull ca ca2) {
        this.jv = ca2;
    }

    public boolean nn(@NotNull T t) {
        if (this.jv.xu() != null) {
            Collection<T> collection = this.ay(this.jv.xu());
            for (T t2 : collection) {
                if (!t2.equals(t)) continue;
                return true;
            }
            return false;
        }
        if (this.jv.uw() != null) {
            double d = (Double)t;
            return !(d > this.jv.uw().lf()) && !(d < this.jv.uw().hd());
        }
        if (this.jv.tw() != null) {
            int n = (Integer)t;
            return n <= this.jv.tw().js() && n >= this.jv.tw().yu();
        }
        if (this.jv.pf() != null) {
            String string = (String)t;
            return string.length() <= this.jv.pf().js() && string.length() >= this.jv.pf().yu();
        }
        return true;
    }

    @NotNull
    private Collection<T> ay(@NotNull zq zq2) {
        Method method = zq2.is();
        if (!Collection.class.isAssignableFrom(method.getReturnType())) {
            throw new IllegalStateException(method.getName() + " does not return a Collection or a subtype of one");
        }
        Object object = method.invoke(null);
        Class<?> clazz = hi.ay((ParameterizedType)method.getGenericReturnType(), 0);
        if (clazz == String.class) {
            Collection collection = (Collection)object;
            return this.ay(collection, (Class)zq2.rt());
        }
        return (Collection)object;
    }

    @NotNull
    private Collection<T> ay(Collection<String> collection, Class<T> clazz) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (String string : collection) {
            ku<T> ku2 = new ku<T>(clazz, string);
            T t = ku2.wo();
            arrayList.add(t);
        }
        return arrayList;
    }
}
