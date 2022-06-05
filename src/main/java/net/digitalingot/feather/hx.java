package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

public class hx
implements da {
    @SerializedName(value="waypoint")
    @NotNull
    private final String fv;

    public hx(@NotNull String string) {
        this.fv = string;
    }

    @NotNull
    public String pq() {
        return this.fv;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.DELETE_WAYPOINT;
    }
}
