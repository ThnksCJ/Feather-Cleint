package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.it;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public class kf {
    @NotNull
    private final ej ed;

    public kf(@NotNull ej ej2) {
        this.ed = ej2;
    }

    public void cc() {
        this.xn(true);
        this.pv(true);
    }

    public void cn() {
        this.pv(false);
    }

    private void pv(boolean bl) {
        for (Class<? extends Mod<?>> clazz : this.ed.zm()) {
            Map.Entry entry2 = this.ed.qq().entrySet().stream().filter(entry -> entry.getValue().getClass() == clazz).findFirst().orElseThrow(IllegalStateException::new);
            qc qc2 = (qc) entry2.getKey();
            Mod ux2 = (Mod) entry2.getValue();
            if (bl && qc2.isCore() || !ux2.xd().nv() || this.ed.iv().contains(ux2.cs().aw())) continue;
            this.nn(ux2);
        }
    }

    public void bi() {
        this.xn(false);
    }

    private void xn(boolean bl) {
        List<Class<Mod<?>>> list = this.ed.zm();
        for (int i = list.size() - 1; i >= 0; --i) {
            Class<? extends Mod<?>> clazz = list.get(i);
            Map.Entry entry2 = this.ed.qq().entrySet().stream().filter(entry -> entry.getValue().getClass() == clazz).findFirst().orElseThrow(IllegalStateException::new);
            qc qc2 = (qc) entry2.getKey();
            Mod ux2 = (Mod) entry2.getValue();
            if (bl && qc2.isCore() || !ux2.gc()) continue;
            this.ed(ux2);
        }
    }

    public void nn(@NotNull Mod<?> ux2) {
        ux2.nn(true);
        if (!ux2.ig()) {
            ux2.initialize();
            ux2.ed(true);
        }
        ux2.au();
        ux2.zq();
        it.bo.mg().loadedStateChange(ux2, true);
    }

    public void ed(@NotNull Mod<?> ux2) {
        if (!ux2.gc()) {
            return;
        }
        ux2.nn(false);
        ux2.jl();
        it.bo.mg().loadedStateChange(ux2, false);
    }
}
