package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class yz
        implements da {
    @SerializedName(value = "selection")
    @NotNull
    private final String xo;

    public yz(@NotNull String string) {
        this.xo = string;
    }

    @NotNull
    public String og() {
        return this.xo;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.PRESS_BUTTON;
    }
}
