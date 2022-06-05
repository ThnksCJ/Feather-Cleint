package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public class po
implements da {
    @SerializedName(value="msg")
    @NotNull
    private final String if;

    public po(@NotNull String string) {
        this.if = string;
    }

    @NotNull
    public String kn() {
        return this.if
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.CALLBACK;
    }
}
