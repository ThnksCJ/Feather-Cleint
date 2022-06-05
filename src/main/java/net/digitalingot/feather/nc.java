package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class nc
implements da {
    @SerializedName(value="mods")
    @NotNull
    private final List<qc> xk;

    public nc(@NotNull List<qc> list) {
        this.xk = list;
    }

    @NotNull
    public List<qc> wu() {
        return this.xk;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.RESET_MOD_SETTINGS;
    }
}
