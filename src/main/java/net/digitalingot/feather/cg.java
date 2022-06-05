package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cg
        implements da {
    @SerializedName(value = "waypoint")
    @Nullable
    private final String fv;
    @SerializedName(value = "payload")
    @NotNull
    private final cr fh;

    public cg(@Nullable String string, @NotNull cr cr2) {
        this.fv = string;
        this.fh = cr2;
    }

    @Nullable
    public String pq() {
        return this.fv;
    }

    @NotNull
    public cr xg() {
        return this.fh;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CREATE_UPDATE_WAYPOINT;
    }
}
