package net.digitalingot.feather;

public interface mq {
    gb<mq> bo = yd.ay(mq.class, mqArray -> () -> {
        for (mq mq2 : mqArray) {
            mq2.disconnect();
        }
    });

    void disconnect();
}
