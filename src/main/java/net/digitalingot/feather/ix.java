package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

class ix<T extends ci>
extends gc<T> {
    @NotNull
    private final cy my;
    @NotNull
    private final ca jv;

    ix(@NotNull Class<T> clazz, @Nullable Map<String, String> map, @NotNull String string, @NotNull ca ca2) {
        super(clazz, map, string);
        this.jv = ca2;
        this.my = this.wl();
    }

    @Override
    protected List<ca> gh() {
        cs cs2 = new cs(this.rp);
        return cs2.ay(this.jv.ta());
    }

    @NotNull
    public T mb() {
        ci ci2 = super.sf();
        this.ay(ci2);
        return (T)ci2;
    }

    @Override
    @Nullable
    protected Object ay(@NotNull String string, @Nullable String string2) {
        if (string2 == null && string.equals(this.np + "hudEnabled")) {
            return this.my.wm();
        }
        return super.ay(string, string2);
    }

    private void ay(@NotNull T t) {
        if (this.ud == null || !this.ud.containsKey(this.np + "hudRelativeX")) {
            ho ho2 = this.my.yv();
            double d = this.my.dz();
            double d2 = this.my.ev();
            double d3 = this.my.bw();
            t.ay(ho2, d, d2, d3);
        }
    }

    @NotNull
    private cy wl() {
        cy cy2 = this.jv.wt().getAnnotation(cy.class);
        if (cy2 == null) {
            throw new jl(this.jv.wt(), cy.class);
        }
        return cy2;
    }

    @Override
    @NotNull
    public Object sf() {
        return this.mb();
    }
}
