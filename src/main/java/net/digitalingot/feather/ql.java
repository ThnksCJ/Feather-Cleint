package net.digitalingot.feather;

import net.digitalingot.feather.enums.wi;
import org.jetbrains.annotations.NotNull;

public interface ql {
    gb<ql> cb = yd.ay(ql.class, qlArray -> () -> {
        for (ql ql2 : qlArray) {
            wi wi2 = ql2.drawHighlightBlock();
            if (wi2 == wi.PASS) continue;
            return wi2;
        }
        return wi.PASS;
    });

    @NotNull wi drawHighlightBlock();
}
