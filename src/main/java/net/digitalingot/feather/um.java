package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.interfaces.mu;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class um
        implements mu {
    @SerializedName(value = "choices")
    @NotNull
    private final List<os> af;

    public um(@NotNull List<os> list) {
        this.af = list;
    }

    @NotNull
    public List<os> ci() {
        return this.af;
    }
}
