package net.digitalingot.feather;

import net.digitalingot.feather.mods.impl.General;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class fb {
    private static final an<General> CORE_PROVIDER = ej.ay(General.class);
    @NotNull
    private final gm yC;
    @NotNull
    private final File b = new File(zz.nw().iu(), "muted.json");
    @NotNull
    private final List<ij> Ag = new ArrayList<ij>();

    public fb(@NotNull gm gm2) {
        this.yC = gm2;
        if (this.b.exists()) {
            List list = (List)zd.xn(this.b).ay(new /* Unavailable Anonymous Inner Class!! */.getType());
            this.Ag.addAll(list);
        }
    }

    @NotNull
    public List<ij> hi() {
        return this.Ag;
    }

    public boolean iu(@NotNull UUID uUID) {
        ij ij2 = new ij(uUID, this.ig(uUID));
        if (!this.Ag.contains(ij2)) {
            this.Ag.add(ij2);
            this.ii();
            return true;
        }
        return false;
    }

    private String ig(@NotNull UUID uUID) {
        return CORE_PROVIDER.nt().ex().ay(uUID);
    }

    public boolean ag(@NotNull UUID uUID) {
        if (this.Ag.removeIf(ij2 -> ij2.ba().equals(uUID))) {
            this.ii();
            return true;
        }
        return false;
    }

    private void ii() {
        gq gq2 = this.yC.io();
        if (gq2 != null) {
            gq2.pp();
        }
        this.b.getParentFile().mkdirs();
        zd.xn(this.b).oE().nl(this.Ag);
    }
}
