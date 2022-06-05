package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.bw;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ib
        implements da {
    @SerializedName(value = "macro")
    @Nullable
    private final String lr;
    @SerializedName(value = "payload")
    @NotNull
    private final bw ny;

    public ib(@Nullable String string, @NotNull bw bw2) {
        this.lr = string;
        this.ny = bw2;
    }

    @Nullable
    public String rq() {
        return this.lr;
    }

    @NotNull
    public bw up() {
        return this.ny;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CREATE_UPDATE_MACRO;
    }
}
