package net.digitalingot.feather;

import net.digitalingot.feather.fc;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class hq$ay
        implements vt<sp, fc, jg> {
    @NotNull
    private final if Bo;

    public hq$ay(@NotNull if if_) {
        this.Bo = if_;
    }

    @Override
    public void ay(sp sp2, Consumer<fc> consumer, Consumer<jg> consumer2) {
        if.ay ay2 = new if.ay(System.currentTimeMillis(), sp2.qx());
        this.Bo.N().put(sp2.qc(), ay2);
    }
}
