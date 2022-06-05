package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class sp
        implements da {
    @SerializedName(value = "origin")
    @NotNull
    private final UUID ph;
    @SerializedName(value = "serverPort")
    private final int av;

    public sp(@NotNull UUID uUID, int n) {
        this.ph = uUID;
        this.av = n;
    }

    @NotNull
    public UUID qc() {
        return this.ph;
    }

    public int qx() {
        return this.av;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.ACCEPT_P2P_JOIN;
    }
}
