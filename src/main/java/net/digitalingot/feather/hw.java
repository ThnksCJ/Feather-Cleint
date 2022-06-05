package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class hw
implements da {
    @SerializedName(value="colorPicker")
    @Nullable
    private final qi pk;
    @SerializedName(value="modMenu")
    @Nullable
    private final cd rr;

    public hw(@Nullable qi qi2, @Nullable cd cd2) {
        this.pk = qi2;
        this.rr = cd2;
    }

    @Nullable
    public qi bh() {
        return this.pk;
    }

    @Nullable
    public cd id() {
        return this.rr;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.UPDATE_CLIENT_PREFERENCES;
    }
}
