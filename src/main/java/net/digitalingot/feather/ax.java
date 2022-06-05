package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class ax
        implements da {
    @SerializedName(value = "primary-contrast-color")
    @NotNull
    private final String kc;
    @SerializedName(value = "primary-contrast-active-color")
    @NotNull
    private final String ct;
    @SerializedName(value = "secondary-contrast-color")
    @NotNull
    private final String am;

    public ax(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        this.kc = string;
        this.ct = string2;
        this.am = string3;
    }

    @NotNull
    public String fa() {
        return this.kc;
    }

    @NotNull
    public String nq() {
        return this.ct;
    }

    @NotNull
    public String ml() {
        return this.am;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.SET_UI_COLORS;
    }
}
