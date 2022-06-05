package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

public class md
implements da {
    @SerializedName(value="profile")
    @NotNull
    private final String ck;

    public md(@NotNull String string) {
        this.ck = string;
    }

    @NotNull
    public String kq() {
        return this.ck;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.DELETE_MOD_PROFILE;
    }
}
