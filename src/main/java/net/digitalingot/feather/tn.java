package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.bw;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class tn
implements da {
    @SerializedName(value="macros")
    @NotNull
    private final Set<bw> fp;

    public tn(@NotNull Set<bw> set) {
        this.fp = set;
    }

    @NotNull
    public Set<bw> kj() {
        return this.fp;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_MACROS;
    }
}
