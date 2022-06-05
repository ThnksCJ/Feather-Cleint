package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.hg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class xk
        implements hg {
    @NotNull
    private final hg EH;
    @Nullable
    private BufferedInputStream EI;

    public xk(@NotNull hg hg2) {
        this.EH = hg2;
    }

    @Override
    @NotNull
    public InputStream nY() {
        this.EI = new BufferedInputStream(this.EH.nY());
        return this.EI;
    }

    @Override
    public void close() {
        ha.ay(this.EI);
        this.EH.close();
    }
}
