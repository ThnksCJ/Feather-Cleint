package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;

public class ij {
    @SerializedName(value="uuid")
    @NotNull
    private final UUID hj;
    @SerializedName(value="username")
    @NotNull
    private final String hs;

    public ij(@NotNull UUID uUID, @NotNull String string) {
        this.hj = uUID;
        this.hs = string;
    }

    @NotNull
    public UUID ba() {
        return this.hj;
    }

    @NotNull
    public String yb() {
        return this.hs;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ij ij2 = (ij)object;
        return this.hj.equals(ij2.hj);
    }

    public int hashCode() {
        return Objects.hash(this.hj);
    }
}
