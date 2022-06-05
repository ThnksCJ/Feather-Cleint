package net.digitalingot.feather;

import net.digitalingot.feather.lr;
import net.digitalingot.feather.vx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class oq {
    @NotNull
    private final ny BG;
    @NotNull
    private final List<lr> BH = new ArrayList<lr>();
    @Nullable
    private vx BI;

    public oq(@NotNull ny ny2) {
        this.BG = ny2;
    }

    @NotNull
    public qb R() {
        return new qb(this.BG, this);
    }

    @NotNull
    public List<lr> S() {
        return this.BH;
    }

    @Nullable
    public vx T() {
        return this.BI;
    }

    public void rf(@Nullable vx vx2) {
        this.BI = vx2;
    }
}
