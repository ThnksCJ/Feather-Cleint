package net.digitalingot.feather;

import net.digitalingot.feather.fc;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class hq$rf
        implements vt<xm, fc, jg> {
    @NotNull
    private final if Bo;

    public hq$rf(@NotNull if if_) {
        this.Bo = if_;
    }

    @Override
    public void ay(xm xm2, Consumer<fc> consumer, Consumer<jg> consumer2) {
        nf nf2;
        if.rf rf2 = new if.rf(xm2.mo(), System.currentTimeMillis());
        this.Bo.M().put(xm2.zi(), rf2);
        gk gk2 = this.Bo. if () ;
        nf nf3 = nf2 = gk2 != null ? gk2.lx() : null;
        if (nf2 == null) {
            consumer2.accept(new jg("redstone connection not established"));
            return;
        }
        gw gw2 = zz.nw().pv();
        gw2.rf(new yi(), new /* Unavailable Anonymous Inner Class!! */, consumer2);
    }
}
