package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.hg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.InputStream;

public class wf
        implements hg {
    @NotNull
    private final String EL;
    @Nullable
    private InputStream EM;

    public wf(@NotNull String string) {
        this.EL = string;
    }

    @Override
    @NotNull
    public InputStream nY() {
        this.EM = this.getClass().getClassLoader().getResourceAsStream(this.EL);
        if (this.EM == null) {
            throw new RuntimeException("Could not find resource: " + this.EL);
        }
        return this.EM;
    }

    @Override
    public void close() {
        ha.ay(this.EM);
        this.EM = null;
    }
}
