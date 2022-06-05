package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class yh
implements da {
    @SerializedName(value="mod")
    @NotNull
    private final qc wf;
    @SerializedName(value="enabled")
    @Nullable
    private final Boolean mp;
    @SerializedName(value="favorite")
    @Nullable
    private final Boolean dt;
    @SerializedName(value="renderMod")
    @Nullable
    private final Boolean xe;
    @SerializedName(value="settings")
    @Nullable
    private final Map<String, JsonElement> ul;

    public yh(@NotNull qc qc2, @Nullable Boolean bl, @Nullable Boolean bl2, @Nullable Boolean bl3, @Nullable Map<String, JsonElement> map) {
        this.wf = qc2;
        this.mp = bl;
        this.dt = bl2;
        this.xe = bl3;
        this.ul = map;
    }

    @NotNull
    public qc lg() {
        return this.wf;
    }

    @Nullable
    public Boolean sp() {
        return this.mp;
    }

    @Nullable
    public Boolean hf() {
        return this.dt;
    }

    @Nullable
    public Boolean yi() {
        return this.xe;
    }

    @Nullable
    public Map<String, JsonElement> lp() {
        return this.ul;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.UPDATE_MOD_SETTINGS;
    }
}
