package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class tg
        implements da {
    @SerializedName(value = "accounts")
    @NotNull
    private final List<vi.ay> oq;

    public tg(@NotNull List<vi.ay> list) {
        this.oq = list;
    }

    @NotNull
    public List<vi.ay> fx() {
        return this.oq;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CALLBACK;
    }
}
