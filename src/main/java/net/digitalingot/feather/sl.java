package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class sl
        implements da {
    @SerializedName(value = "create")
    private final boolean du;
    @SerializedName(value = "nextFields")
    @NotNull
    private final ay uo;

    public sl(boolean bl, @NotNull ay ay2) {
        this.du = bl;
        this.uo = ay2;
    }

    public boolean mj() {
        return this.du;
    }

    @NotNull
    public ay fl() {
        return this.uo;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.OPEN_WAYPOINTS_MENU;
    }
}
