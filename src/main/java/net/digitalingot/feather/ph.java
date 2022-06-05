package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.av;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Callable;

public class ph {
    public static <T> av<T> ay(final @NotNull Callable<T> callable, final long l) {
        return new av<T>() {
            private long Fr = 0L;
            private T Fs = null;

            @Override
            public T call() {
                long l2 = System.currentTimeMillis();
                if (l2 - this.Fr > l) {
                    this.Fs = callable.call();
                    this.Fr = l2;
                }
                return this.Fs;
            }
        };
    }
}
