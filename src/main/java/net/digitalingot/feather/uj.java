package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.sd;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class uj
        implements sd {
    @NotNull
    private final gw nn;
    @NotNull
    private final ej ed;
    @NotNull
    private final et zs;
    @NotNull
    private final File nl;
    @NotNull
    private final File pv;
    @NotNull
    private final String xn;

    public uj(@NotNull gw gw2, @NotNull ej ej2, @NotNull et et2, @NotNull File file, @NotNull File file2, @NotNull String string) {
        this.nn = gw2;
        this.ed = ej2;
        this.zs = et2;
        this.nl = file;
        this.pv = file2;
        this.xn = string;
    }

    @Override
    @NotNull
    public gw pv() {
        return this.nn;
    }

    @Override
    @NotNull
    public ej xn() {
        return this.ed;
    }

    @Override
    @NotNull
    public et rl() {
        return this.zs;
    }

    @Override
    @NotNull
    public File sb() {
        return this.nl;
    }

    @Override
    @NotNull
    public File iu() {
        return this.pv;
    }

    @Override
    @NotNull
    public String bu() {
        return this.xn;
    }
}
