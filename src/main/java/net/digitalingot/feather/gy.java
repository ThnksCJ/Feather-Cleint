package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.impl.Waypoints;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class gy
        implements vt<cg, po, jg> {
    @NotNull
    private final Waypoints Bn;

    public gy(@NotNull Waypoints ys2) {
        this.Bn = ys2;
    }

    @Override
    public void ay(cg cg2, Consumer<po> consumer, Consumer<jg> consumer2) {
        cr cr3 = cg2.xg();
        if (cg2.pq() != null) {
            cr cr4 = this.Bn.I().stream().filter(cr2 -> cr2.getName().equals(cg2.pq())).findAny().orElse(null);
            if (cr4 == null) {
                throw new IllegalArgumentException("Waypoint not found");
            }
            cr4. do (cr3.getName());
            cr4.nw(cr3.B());
            cr4.rf(cr3.ra());
            cr4.ay(cr3.de());
            cr4.ve(this.Bn.H());
            cr4.lm(this.Bn.G());
        } else {
            cr3.ve(this.Bn.H());
            cr3.lm(this.Bn.G());
            this.Bn.ay(cr3);
        }
        consumer.accept(new po("success"));
    }
}
