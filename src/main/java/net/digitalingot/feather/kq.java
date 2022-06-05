package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class kq
implements da {
    @SerializedName(value="sidebar")
    @NotNull
    private final List<qc> jr;

    public kq(@NotNull List<qc> list) {
        this.jr = list;
    }

    @NotNull
    public List<qc> dg() {
        return this.jr;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.RESET_SIDEBAR_SETTINGS;
    }
}
