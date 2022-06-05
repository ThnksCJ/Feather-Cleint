package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.gb;
import net.digitalingot.feather.yd;

public interface mq {
    gb<mq> bo = yd.ay(mq.class, mqArray -> () -> {
        for (mq mq2 : mqArray) {
            mq2.disconnect();
        }
    });

    void disconnect();
}
