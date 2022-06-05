package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class nk
implements da {
    @SerializedName(value="cosmetics")
    @NotNull
    private final List<String> it;

    public nk(@NotNull List<String> list) {
        this.it = list;
    }

    @NotNull
    public List<String> hl() {
        return this.it;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.RESET_COSMETICS_SETTINGS;
    }
}
