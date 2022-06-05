package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class ne {
    @SerializedName(value = "updateClientPreferences")
    @NotNull
    private cd ce;
    @SerializedName(value = "colorPickerPreferences")
    @NotNull
    private qi yo;

    public ne(@NotNull cd cd2, @NotNull qi qi2) {
        this.ce = cd2;
        this.yo = qi2;
    }

    @NotNull
    public cd ub() {
        return this.ce;
    }

    public void ay(@NotNull cd cd2) {
        this.ce = cd2;
    }

    @NotNull
    public qi yg() {
        return this.yo;
    }

    public void ay(@NotNull qi qi2) {
        this.yo = qi2;
    }
}
