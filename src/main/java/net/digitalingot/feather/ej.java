package net.digitalingot.feather;

import com.google.gson.JsonElement;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.*;

public class ej {
    @NotNull
    private final List<Class<? extends Mod<?>>> rs;
    @NotNull
    private final Map<qc, Mod<?>> mv = new HashMap();
    @NotNull
    private final Map<Class<? extends Mod<?>>, Mod<?>> qf = new HashMap();
    @NotNull
    private final tk vp;
    @NotNull
    private final kf vh = new kf(this);
    @NotNull
    private final vb qa;
    @NotNull
    private Set<qc> vw = new HashSet<qc>();

    public ej(@NotNull List<Class<? extends Mod<?>>> list, @NotNull tk tk2, @NotNull et et2) {
        this.rs = list;
        this.vp = tk2;
        this.qa = new vb(this, et2);
    }

    @NotNull
    public static <T extends Mod<?>> an<T> ay(final @NotNull Class<T> clazz) {
        return new an<T>() {
            private T qw;

            @Override
            public T nt() {
                if (this.qw != null) {
                    return this.qw;
                }
                sd sd2 = zz.nw();
                if (sd2 == null) {
                    return null;
                }
                this.qw = sd2.xn().rf(clazz);
                return this.qw;
            }
        };
    }

    public void initialize() {
        this.qa.kg();
    }

    public void ez() {
        this.vh.cn();
    }

    public void ii() {
        this.vp.zz(this.mv);
    }

    public void nn(List<String> list) {
        HashSet<qc> hashSet = new HashSet<qc>(list.size());
        for (String object : list) {
            qc qc2 = qc.fromSlug(object);
            if (qc2 == null || qc2.isCore()) continue;
            hashSet.add(qc2);
        }
        this.vw = hashSet;
        for (qc qc3 : this.vw) {
            this.vh.ed(this.mv.get(qc3));
        }
        jm.cv();
    }

    public void gj() {
        for (qc qc2 : this.vw) {
            Mod<?> ux2 = this.mv.get(qc2);
            if (!ux2.xd().enabled) continue;
            this.vh.nn(ux2);
        }
        this.vw.clear();
        jm.cv();
    }

    public void dr() {
        this.vp.wn();
        for (Mod<?> ux2 : this.mv.values()) {
            this.qa.kl(ux2);
        }
        this.vh.cc();
        bt.ay(this);
        gf.ay(this);
        kt.ay(this);
    }

    public <T extends zi> void ay(@NotNull Mod<T> ux2, @NotNull Map<String, JsonElement> map) {
        cs cs2 = new cs(ux2.xd().getClass());
        List<ca> list = cs2.gh();
        this.ay(list, ux2, null, map, "");
    }

    private <T extends zi> void ay(@NotNull List<ca> list, @NotNull Mod<T> ux2, @Nullable ca ca2, @NotNull Map<String, JsonElement> map, @NotNull String string) {
        for (ca ca3 : list) {
            au au2 = ca3.su();
            fl fl2 = ca3.fi();
            if (fl2 != null) {
                this.ay(ux2, map, string, ca3, fl2);
                continue;
            }
            if (au2 != null) {
                if (ca2 != null) {
                    this.ay(ca2.bu(ux2.xd()), map, string, ca3, au2);
                    continue;
                }
                this.ay(ux2, map, string, ca3, au2);
                continue;
            }
            throw new jl("@Value or @Nested annotation is missing on field \"" + ca3.wt().getName() + "\"");
        }
    }

    private <T extends zi> void ay(@NotNull Mod<T> ux2, @NotNull Map<String, JsonElement> map, @NotNull String string, @NotNull ca ca2, @NotNull fl fl2) {
        List<ca> list = new cs(ca2.nj()).gh();
        String string2 = string.isEmpty() ? fl2.fd() : string + ":" + fl2.fd();
        this.ay(list, ux2, ca2, map, string2);
    }

    private <C> void ay(@NotNull C c, @NotNull Map<String, JsonElement> map, @NotNull String string, @NotNull ca ca2, @NotNull au au2) {
        String string2 = au2.wd();
        String string3 = string.isEmpty() ? string2 : string + ":" + string2;
        JsonElement jsonElement = map.get(string3);
        if (jsonElement == null) {
            return;
        }
        Object object = gw.GSON.fromJson(jsonElement, ca2.nj());
        ch<Object> ch2 = new ch<Object>(ca2);
        if (!(ca2.tw() != null && ca2.su() != null && ca2.hk() != null && ca2.su().wd().equals(ca2.hk().ie()) || ch2.nn(object))) {
            throw new IllegalArgumentException("Config key \"" + string2 + "\" contained a payload which couldn't be validated: \"" + jsonElement + "\"");
        }
        if (c instanceof Mod) {
            ca2.ay(((Mod) c).xd(), object);
        } else {
            ca2.ay(c, object);
        }
    }

    public <T extends zi> void uj(@NotNull Mod<T> ux2) {
        this.vp.qp().put(ux2.cs().aw(), new HashMap());
        this.qa.kl(ux2);
        this.bu(ux2);
    }

    public <T extends zi> void zz(@NotNull HUDMod<T> ft2) {
        for (Field field : ft2.xd().getClass().getFields()) {
            cy cy2 = field.getAnnotation(cy.class);
            if (cy2 == null) continue;
            ho ho2 = cy2.yv();
            double d = cy2.dz();
            double d2 = cy2.ev();
            double d3 = cy2.bw();
            ci ci2 = (ci) field.get(ft2.xd());
            ci2.ay(ho2, d, d2, d3);
        }
        this.bu(ft2);
    }

    public void kl(@NotNull kb kb3) {
        HUDMod<?> ft2 = kb3.bk();
        switch (2. io[ft2.tk().ordinal()]){
            case 1: {
                kb3.te().ks = false;
                break;
            }
            case 2: {
                ft2.xd().enabled = ft2.im().stream().noneMatch(kb2 -> kb2.te().ks);
                break;
            }
            case 3: {
                ft2.xd().enabled = false;
            }
        }
        this.bu(ft2);
    }

    public void zz(@NotNull Mod<?> ux2) {
        ux2.xd().enabled = true;
        this.bu(ux2);
    }

    public void sd(@NotNull Mod<?> ux2) {
        ux2.xd().enabled = false;
        this.bu(ux2);
    }

    public <T extends zi> void bu(@NotNull Mod<T> ux2) {
        this.vp.ay(ux2.cs().aw(), ux2.xd());
        ux2.ca();
        ux2.zq();
        rm rm2 = ux2.xd().getClass().getDeclaredAnnotation(rm.class);
        if (rm2 != null && !rm2.le().ae().isEmpty()) {
            kt.ay(this);
        }
        if (ux2.gc() && !ux2.xd().nv()) {
            this.vh.ed(ux2);
        } else if (!ux2.gc() && ux2.xd().nv() && !this.vw.contains(ux2.cs().aw())) {
            this.vh.nn(ux2);
        }
    }

    @NotNull
    public Mod<?> ay(@NotNull qc qc2) {
        return this.mv.get(qc2);
    }

    @NotNull
    public <T extends Mod<?>> T rf(@NotNull Class<T> clazz) {
        return (T) this.qf.get(clazz);
    }

    @NotNull
    public Map<qc, Mod<?>> qq() {
        return this.mv;
    }

    @NotNull
    public Map<Class<? extends Mod<?>>, Mod<?>> gp() {
        return this.qf;
    }

    @NotNull
    public List<Class<? extends Mod<?>>> zm() {
        return this.rs;
    }

    @NotNull
    public tk hm() {
        return this.vp;
    }

    @NotNull
    public Set<qc> iv() {
        return this.vw;
    }
}
