package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class nq
        implements da {
    @SerializedName(value = "selection")
    @NotNull
    private final String xo;

    public nq(@NotNull String string) {
        this.xo = string;
    }

    public String og() {
        return this.xo;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.DO_HUD_SELECTION;
    }
}
