package net.digitalingot.feather;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

class tl<T>
extends gb<T> {
    private final Function<T[], T> ok;
    private final Lock ug = new ReentrantLock();
    private T[] tc;

    tl(Class<? super T> clazz, Function<T[], T> function) {
        this.ok = function;
        this.tc = (Object[])Array.newInstance(clazz, 0);
        this.yj();
    }

    void yj() {
        this.hn = this.ok.apply(this.tc);
    }

    @Override
    public void ay(T t) {
        Objects.requireNonNull(t, "Tried to register a null listener!");
        this.ug.lock();
        this.tc = Arrays.copyOf(this.tc, this.tc.length + 1);
        this.tc[this.tc.length - 1] = t;
        this.yj();
        this.ug.unlock();
    }
}
