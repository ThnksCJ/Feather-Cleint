package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class di
implements da {
    @SerializedName(value="mods")
    @NotNull
    private final Collection<qc> lk;

    public di(@NotNull Collection<qc> collection) {
        this.lk = collection;
    }

    @NotNull
    public Collection<qc> mu() {
        return this.lk;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.DISABLED_MODS;
    }
}
