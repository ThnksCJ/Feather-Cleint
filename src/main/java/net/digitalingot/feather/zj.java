package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class zj
        implements vt<hw, po, jg> {
    @NotNull
    private final et bq;

    public zj(@NotNull et et2) {
        this.bq = et2;
    }

    @Override
    public void ay(hw hw2, Consumer<po> consumer, Consumer<jg> consumer2) {
        Object object;
        cd cd2 = hw2.id();
        if (cd2 != null) {
            object = this.bq.wq().ub();
            if (cd2.ly() != null) {
                ((cd) object).ay(cd2.ly());
            }
            if (cd2.xy() != null) {
                ((cd) object).rf(cd2.xy());
            }
            if (cd2.md() != null) {
                ((cd) object).uj(cd2.md());
            }
            if (cd2.sr() != null) {
                ((cd) object).sb(cd2.sr());
            }
        }
        if ((object = hw2.bh()) != null) {
            qi qi2 = this.bq.wq().yg();
            if (((qi) object).yh() != null) {
                qi2.sd(((qi) object).yh());
            }
            if (((qi) object).nc() != null) {
                qi2.zz(((qi) object).nc());
            }
        }
        this.bq.ii();
        consumer.accept(new po("success"));
    }
}
