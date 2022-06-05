package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.av;

import java.util.concurrent.Callable;

class ph$1
        implements av<T> {
    final long Ft;
    final Callable Fu;
    private long Fr = 0L;
    private T Fs = null;

    ph$1() {
        this.Ft = l;
        this.Fu = callable;
    }

    @Override
    public T call() {
        long l = System.currentTimeMillis();
        if (l - this.Fr > this.Ft) {
            this.Fs = this.Fu.call();
            this.Fr = l;
        }
        return this.Fs;
    }
}
