package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class xm
implements da {
    @SerializedName(value="id")
    private final int id;
    @SerializedName(value="target")
    @NotNull
    private final UUID yf;

    public xm(int n, @NotNull UUID uUID) {
        this.id = n;
        this.yf = uUID;
    }

    public int mo() {
        return this.id;
    }

    @NotNull
    public UUID zi() {
        return this.yf;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.REQUEST_P2P_JOIN;
    }
}
