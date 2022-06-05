package net.digitalingot.feather;

import net.digitalingot.feather.fc;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.impl.General;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Consumer;

public class vi$rf
        implements vt<fy, fc, jg> {
    @NotNull
    private final vi eT;

    vi$rf(@NotNull vi vi2) {
        this.eT = vi2;
    }

    @Override
    public void ay(fy fy2, Consumer<fc> consumer, Consumer<jg> consumer2) {
        UUID uUID = fy2.zg();
        if (rf.nl()) {
            General rh2 = zz.nw().xn().rf(General.class);
            rh2.qy(). if ().fk();
        } else {
            this.eT.ed(uUID);
        }
    }
}
