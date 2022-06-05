package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.hg;
import net.digitalingot.feather.interfaces.rw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;

public class mp
        implements hg,
        rw {
    @NotNull
    private final File b;
    @Nullable
    private InputStream EM;
    @Nullable
    private OutputStream EN;

    public mp(@NotNull File file) {
        this.b = file;
    }

    @Override
    @NotNull
    public InputStream nY() {
        if (this.EM != null) {
            return this.EM;
        }
        this.EM = new FileInputStream(this.b);
        return this.EM;
    }

    @Override
    @NotNull
    public OutputStream oD() {
        if (this.EN != null) {
            return this.EN;
        }
        this.EN = new FileOutputStream(this.b);
        return this.EN;
    }

    @Override
    public void close() {
        ha.ay(this.EM, this.EN);
        this.EM = null;
        this.EN = null;
    }
}
