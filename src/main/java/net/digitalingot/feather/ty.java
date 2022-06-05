package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ty
implements da {
    @SerializedName(value="waypoints")
    @NotNull
    private final List<cr> xc;

    public ty(@NotNull List<cr> list) {
        this.xc = list;
    }

    @NotNull
    public List<cr> cy() {
        return this.xc;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_WAYPOINTS;
    }
}
