package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class fy
        implements da {
    @SerializedName(value = "account")
    @NotNull
    private final UUID hq;

    public fy(@NotNull UUID uUID) {
        this.hq = uUID;
    }

    @NotNull
    public UUID zg() {
        return this.hq;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CHANGE_ACCOUNT;
    }
}
