package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class id
implements da {
    @SerializedName(value="categories")
    @NotNull
    private final ly.ay[] ts = ly.ay.values();
    @SerializedName(value="mods")
    @NotNull
    private final List<ly> xk;

    public id(@NotNull List<ly> list) {
        this.xk = list;
    }

    @NotNull
    public ly.ay[] um() {
        return this.ts;
    }

    @NotNull
    public List<ly> wu() {
        return this.xk;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.BUILD_MOD_SETTINGS;
    }
}
