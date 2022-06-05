package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class ji
        implements da {
    @SerializedName(value = "profile")
    @NotNull
    private final String ck;
    @SerializedName(value = "newName")
    @NotNull
    private final String ym;

    public ji(@NotNull String string, @NotNull String string2) {
        this.ck = string;
        this.ym = string2;
    }

    @NotNull
    public String kq() {
        return this.ck;
    }

    @NotNull
    public String uz() {
        return this.ym;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.RENAME_MOD_PROFILE;
    }
}
