package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

public class rn
implements da {
    @SerializedName(value="macro")
    @NotNull
    private final String lr;

    public rn(@NotNull String string) {
        this.lr = string;
    }

    @NotNull
    public String rq() {
        return this.lr;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.DELETE_MACRO;
    }
}
