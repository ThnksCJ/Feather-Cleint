package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class wb
implements da {
    @SerializedName(value="sidebar")
    @NotNull
    private final Map<qc, qq> vl;

    public wb(@NotNull Map<qc, qq> map) {
        this.vl = map;
    }

    @NotNull
    public Map<qc, qq> in() {
        return this.vl;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_SIDEBAR_SETTINGS;
    }
}
