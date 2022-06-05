package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class sr
        implements da {
    @SerializedName(value = "mods")
    @NotNull
    private final Map<qc, xy> mv;

    public sr(@NotNull Map<qc, xy> map) {
        this.mv = map;
    }

    @NotNull
    public Map<qc, xy> qq() {
        return this.mv;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_MOD_PROFILE;
    }
}
