package net.digitalingot.feather;

import net.digitalingot.feather.enums.ai;
import net.digitalingot.feather.il;
import net.digitalingot.feather.interfaces.*;
import org.apache.commons.lang3.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.List;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class hm {
    public static final Pattern g = Pattern.compile("(:?true|false/)?\\d+/\\d+/\\d+/\\d+");

    @NotNull
    public static <T> List<ai> ed(@NotNull T t) {
        cs cs2 = new cs(t.getClass());
        List<ca> list3 = cs2.gh();
        HashMap<ai, List<Integer>> hashMap = new HashMap<ai, List<Integer>>();
        hm.ay(t, hashMap, list3);
        hm.ay(t, hashMap);
        return hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue((list, list2) -> {
            List list3 = list.size() < list2.size() ? list : list2;
            List list4 = list.size() < list2.size() ? list2 : list;
            for (int i = 0; i < list3.size(); ++i) {
                if (((Integer) list3.get(i)).intValue() == ((Integer) list4.get(i)).intValue()) continue;
                return (list3 == list ? 1 : -1) * ((Integer) list3.get(i) - (Integer) list4.get(i));
            }
            return Comparator.comparingInt(List::size).compare(list, list2);
        })).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private static <T> void ay(@NotNull T t, @NotNull Map<ai, List<Integer>> map, @NotNull List<ca> list) {
        hm.ay(t, null, map, list);
    }

    private static <T> void ay(@NotNull T t, @Nullable cy cy2, @NotNull Map<ai, List<Integer>> map, @NotNull List<ca> list) {
        for (ca ca2 : list) {
            List<Integer> list2;
            Iterator iterator;
            Object object;
            if (ca2.fi() != null) {
                int n = ca2.fi().yp().vi();
                object = new HashMap();
                Object t2 = ca2.bu(t);
                hm.ay(t2, ca2.wt().getAnnotation(cy.class), (Map<ai, List<Integer>>) object, new cs(t2.getClass()).ay(ca2.ta()));
                iterator = object.values().iterator();
                while (iterator.hasNext()) {
                    list2 = (List) iterator.next();
                    list2.add(0, n);
                }
                map.putAll((Map<ai, List<Integer>>) object);
                continue;
            }
            au au2 = Objects.requireNonNull(ca2.su());
            object = au2.yp();
            int n = object.vi();
            if (n <= -10 || au2.wd().equals("hudSelection") && ((iterator = t.getClass().getDeclaredAnnotation(rm.class)) == null || iterator.le().ae().isEmpty()) || ca2.hk() != null && ca2.hk().pu() || (iterator = hm.ay(cy2, ca2, ca2.hk())) == null)
                continue;
            list2 = new ArrayList<Integer>(1);
            list2.add(n);
            map.put((ai) iterator, list2);
        }
    }

    @Nullable
    private static ai ay(@Nullable cy cy2, @NotNull ca ca2, @Nullable aw aw2) {
        au au2 = Objects.requireNonNull(ca2.su());
        String string = au2.vu();
        String string2 = au2.wd();
        if (cy2 != null && string2.equals("hudEnabled")) {
            if (cy2.jj().isEmpty()) {
                return null;
            }
            string = cy2.jj();
        }
        og og2 = hm.ay(au2);
        Class<?> clazz = ca2.nj();
        if (ClassUtils.isAssignable(clazz, Enum.class, true)) {
            ai.ay ay2 = ca2.kd() != null ? ai.ay.DROPDOWN : ai.ay.RADIO;
            return new ai(ay2, string, string2, og2, new um(hm.sd(clazz)), null, null);
        }
        if (ClassUtils.isAssignable(clazz, String.class, true)) {
            if (ca2.xu() != null) {
                ai.ay ay3 = ca2.kd() != null ? ai.ay.DROPDOWN : ai.ay.RADIO;
                return new ai(ay3, string, string2, og2, new um(hm.rf(ca2.xu())), null, null);
            }
            if (ca2.pf() != null) {
                return new ai(ai.ay.TEXT, string, string2, og2, null, null, null);
            }
        } else {
            if (ClassUtils.isAssignable(clazz, Boolean.TYPE, true)) {
                return new ai(ai.ay.BOOLEAN, string, string2, og2, null, null, null);
            }
            if (ClassUtils.isAssignable(clazz, Integer.TYPE, true)) {
                if (ca2.tw() == null) {
                    throw new IllegalArgumentException(ca2.wt() + " is not annotated with @IntRange");
                }
                return new ai(ai.ay.SLIDER, string, string2, og2, hm.ay(ca2.tw(), aw2), null, null);
            }
            if (ClassUtils.isAssignable(clazz, Double.TYPE, true)) {
                if (ca2.uw() == null) {
                    throw new IllegalArgumentException(ca2.wt() + " is not annotated with @DoubleRange");
                }
                return new ai(ai.ay.SLIDER, string, string2, og2, hm.ay(ca2.uw()), null, null);
            }
            if (ClassUtils.isAssignable(clazz, Collection.class, true)) {
                if (ca2.sn() == null) {
                    throw new IllegalArgumentException(ca2.wt() + " is not annotated with @Checkbox");
                }
                int n = ca2.sn().mf();
                Class<?> clazz2 = hi.ay(clazz, 0, 0);
                if (ClassUtils.isAssignable(clazz2, Enum.class, true)) {
                    return new ai(ai.ay.CHECKBOX, string, string2, og2, (mu) new il(n, hm.sd(clazz2)), null, null);
                }
                if (ca2.xu() != null) {
                    return new ai(ai.ay.CHECKBOX, string, string2, og2, (mu) new il(n, hm.rf(ca2.xu())), null, null);
                }
            } else {
                if (ClassUtils.isAssignable(clazz, km.class, true)) {
                    return new ai(ai.ay.KEY_PICKER, string, string2, og2, null, null, null);
                }
                if (ClassUtils.isAssignable(clazz, Color.class, true)) {
                    return new ai(ai.ay.COLOR_PICKER, string, string2, og2, null, false, g.matcher(ca2.su().pr()).find());
                }
                if (ClassUtils.isAssignable(clazz, gp.class, true)) {
                    return new ai(ai.ay.COLOR_PICKER, string, string2, og2, null, true, g.matcher(ca2.su().pr()).find());
                }
            }
        }
        throw new IllegalArgumentException(ca2.wt() + " not supported in a config");
    }

    @NotNull
    private static List<os> rf(@NotNull zq zq2) {
        List list = (List) zq2.is().invoke(null, new Object[0]);
        return list.stream().map(string -> new os((String) string, (String) string)).collect(Collectors.toList());
    }

    @NotNull
    private static List<os> sd(@NotNull Class<? extends Enum<?>> clazz) {
        Enum<?>[] enumArray = clazz.getEnumConstants();
        ArrayList<os> arrayList = new ArrayList<os>(enumArray.length);
        for (Enum<?> enum_ : enumArray) {
            Field field = clazz.getDeclaredField(enum_.name());
            uq uq2 = field.getDeclaredAnnotation(uq.class);
            String string = uq2.wd();
            String string2 = uq2.vu();
            os os2 = new os(string, string2);
            arrayList.add(os2);
        }
        return arrayList;
    }

    @NotNull
    private static lg ay(@NotNull mj mj2, @Nullable aw aw2) {
        int n = aw2 != null && aw2.yu() != -9999 ? aw2.yu() : mj2.yu();
        int n2 = aw2 != null && aw2.js() != 9999 ? aw2.js() : mj2.js();
        return new lg(n, n2, mj2.cw());
    }

    @NotNull
    private static wu ay(@NotNull in in2) {
        return new wu(in2.hd(), in2.lf(), in2.dq());
    }

    private static <T> void ay(@NotNull T t, @NotNull Map<ai, List<Integer>> map) {
        for (Field field : t.getClass().getFields()) {
            Object object4;
            Object object2;
            Object object3;
            fl fl2 = field.getAnnotation(fl.class);
            if (fl2 != null) {
                object3 = new HashMap();
                object2 = field.get(t);
                hm.ay(object2, (Map<ai, List<Integer>>) object3);
                for (Object object4 : object3.values()) {
                    object4.add(0, fl2.yp().vi());
                }
                map.putAll((Map<ai, List<Integer>>) object3);
            }
            if (field.getType() != iv.class) continue;
            object3 = field.get(t);
            object2 = ((iv) object3).getName();
            ai ai2 = new ai(ai.ay.TITLE, (String) object2, null, null, null, null, null);
            object4 = field.getDeclaredAnnotation(de.class);
            if (object4 == null) {
                throw new jl(field, de.class);
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
            arrayList.add(object4.vi());
            map.put(ai2, arrayList);
        }
    }

    @Nullable
    private static og ay(@NotNull au au2) {
        ra ra2 = au2.nu();
        if (ra2.wd().isEmpty()) {
            return null;
        }
        List<String> list = ra2.ee().length == 0 ? null : Arrays.asList(ra2.ee());
        return new og(ra2.wd(), list);
    }
}
