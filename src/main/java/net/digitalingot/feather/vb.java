package net.digitalingot.feather;

import net.digitalingot.feather.enums.hh;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.sv;
import net.digitalingot.feather.mods.HUDMod;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class vb {
    @NotNull
    private final ej ed;
    @NotNull
    private final et zs;

    public vb(@NotNull ej ej2, @NotNull et et2) {
        this.ed = ej2;
        this.zs = et2;
    }

    public void kg() {
        for (Class<Mod<?>> clazz : this.ed.zm()) {
            sv sv2 = clazz.getDeclaredAnnotation(sv.class);
            if (sv2 == null) {
                throw new IllegalStateException("FeatherModule not annotated with @FeatherHandler");
            }
            Mod<?> ux2 = clazz.getConstructor(new Class[0]).newInstance();
            ux2.ay(sv2);
            this.kl(ux2);
            this.ed.qq().put(sv2.aw(), ux2);
            this.ed.gp().put(ux2.getClass(), ux2);
        }
    }

    public <T extends zi> void kl(@NotNull Mod<T> ux2) {
        Class<?> clazz = hi.ay(ux2.getClass(), 0);
        assert (clazz != null);
        Map<qc, Map<String, String>> map = this.ed.hm().qp();
        assert (map != null);
        qc qc2 = ux2.cs().aw();
        Map<String, String> map2 = map.get(qc2);
        gc<?> gc2 = hh.INSTANCE.create(clazz, map2, null);
        zi zi2 = (zi) gc2.sf();
        cd cd2 = this.zs.wq().ub();
        List<qc> list = cd2.zh();
        zi2.bc = list.contains(qc2);
        zi2.us = ux2 instanceof HUDMod;
        ux2.ay(zi2);
    }
}
