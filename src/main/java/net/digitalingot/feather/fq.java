package net.digitalingot.feather;

import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.impl.Waypoints;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.Consumer;

public class fq
implements vt<hx, po, jg> {
    @NotNull
    private final Waypoints Bn;

    public fq(@NotNull Waypoints ys2) {
        this.Bn = ys2;
    }

    @Override
    public void ay(hx hx2, Consumer<po> consumer, Consumer<jg> consumer2) {
        String string = hx2.pq();
        Optional<cr> optional = this.Bn.I().stream().filter(cr2 -> cr2.getName().equals(string)).findAny();
        if (!optional.isPresent()) {
            consumer2.accept(new jg("Waypoint not found"));
            return;
        }
        this.Bn.rf(optional.get());
        consumer.accept(new po("success"));
    }
}
