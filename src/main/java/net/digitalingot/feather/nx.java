package net.digitalingot.feather;

import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class nx<S, F> {
    @Nullable
    private final Consumer<S> dc;
    @Nullable
    private final Consumer<F> fn;

    public nx(@Nullable Consumer<S> consumer, @Nullable Consumer<F> consumer2) {
        this.dc = consumer;
        this.fn = consumer2;
    }

    @Nullable
    public Consumer<S> ib() {
        return this.dc;
    }

    @Nullable
    public Consumer<F> rn() {
        return this.fn;
    }
}
