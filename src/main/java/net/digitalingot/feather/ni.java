package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

public class ni
implements da {
    @SerializedName(value="profile")
    @NotNull
    private final String ck;

    public ni(@NotNull String string) {
        this.ck = string;
    }

    @NotNull
    public String kq() {
        return this.ck;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CREATE_MOD_PROFILE;
    }
}
