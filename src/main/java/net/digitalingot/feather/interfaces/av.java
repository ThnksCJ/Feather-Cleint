package net.digitalingot.feather.interfaces;

import java.util.concurrent.Callable;

public interface av<T>
        extends Callable<T> {
    @Override
    T call();
}
