package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

public class hf
implements da {
    @SerializedName(value="id")
    private final int id;

    public hf(int n) {
        this.id = n;
    }

    public int mo() {
        return this.id;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CLOSE_P2P;
    }
}
