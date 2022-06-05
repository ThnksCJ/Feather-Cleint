package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class uz
implements da {
    @SerializedName(value="sidebar")
    @NotNull
    private final qc rx;
    @SerializedName(value="settings")
    @NotNull
    private final Map<String, JsonElement> ul;

    public uz(@NotNull qc qc2, @NotNull Map<String, JsonElement> map) {
        this.rx = qc2;
        this.ul = map;
    }

    @NotNull
    public qc uq() {
        return this.rx;
    }

    @NotNull
    public Map<String, JsonElement> lp() {
        return this.ul;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.UPDATE_SIDEBAR_SETTINGS;
    }
}
