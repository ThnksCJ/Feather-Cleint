package net.digitalingot.feather;

import java.util.concurrent.Callable;

public interface av<T>
extends Callable<T> {
    @Override
    T call();
}
