package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class oj$ay {
    @SerializedName(value = "mcID")
    @NotNull
    private final UUID hj;
    @SerializedName(value = "mcUsername")
    @NotNull
    private final String hs;

    public oj$ay(@NotNull UUID uUID, @NotNull String string) {
        this.hj = uUID;
        this.hs = string;
    }

    public static oj$ay ay(vi.ay ay2) {
        return new oj$ay(ay2.zx(), ay2.getName());
    }

    @NotNull
    public UUID ba() {
        return this.hj;
    }

    @NotNull
    public String yb() {
        return this.hs;
    }
}
