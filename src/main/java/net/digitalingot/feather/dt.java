package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;

public class dt
implements hg {
    @NotNull
    private final InputStream EM;

    public dt(@NotNull InputStream inputStream) {
        this.EM = inputStream;
    }

    @Override
    @NotNull
    public InputStream nY() {
        return this.EM;
    }

    @Override
    public void close() {
        ha.ay(this.EM);
    }
}
