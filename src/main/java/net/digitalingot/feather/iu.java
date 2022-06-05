package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class iu
implements ze {
    @NotNull
    private final xs hr;
    @NotNull
    private final ig dl;

    iu(@NotNull xs xs2, @NotNull ig ig2) {
        this.hr = xs2;
        this.dl = ig2;
    }

    @Override
    public void ay(UUID uUID, String string) {
        nw nw2 = this.dl.bu(string);
        if (nw2 == null) {
            vm.Fq.info("received an unknown slug as an incoming emote: {}", string);
            return;
        }
        this.hr.ay(uUID, nw2);
    }

    @Override
    public void rf(List<qe> list) {
        ArrayList<xs.ay> arrayList = new ArrayList<xs.ay>(list.size());
        for (qe qe2 : list) {
            ArrayList<sb> arrayList2 = new ArrayList<sb>(qe2.bN().size());
            for (String string : qe2.bN()) {
                sb sb2 = this.dl.sd(string);
                if (sb2 == null) {
                    vm.Fq.info("received an unknown slug as an incoming cosmetic: {}", string);
                    continue;
                }
                arrayList2.add(sb2);
            }
            arrayList.add(new xs.ay(qe2.zx(), arrayList2));
        }
        this.hr.rf(arrayList);
    }

    @Override
    public void uj(List<String> list) {
        this.dl.lm().clear();
        this.dl.wz().clear();
        for (String string : list) {
            switch (1.ql[this.dl.zz(string).ordinal()]) {
                case 1: {
                    sb sb2 = this.dl.sd(string);
                    assert (sb2 != null);
                    this.dl.lm().put(string, sb2);
                    break;
                }
                case 2: {
                    nw nw2 = this.dl.bu(string);
                    assert (nw2 != null);
                    this.dl.wz().put(string, nw2);
                    break;
                }
                case 3: {
                    vm.Fq.info("received an unknown slug as an owned cosmetic: {}", string);
                }
            }
        }
        op.rf(this.dl.vc());
    }
}
