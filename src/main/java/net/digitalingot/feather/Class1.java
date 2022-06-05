package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.interfaces.da;
import org.jetbrains.annotations.NotNull;

public class ab
        implements da {
    @SerializedName(value = "colorPicker")
    @NotNull
    private final qi pk;
    @SerializedName(value = "modMenu")
    @NotNull
    private final cd rr;
    @SerializedName(value = "version")
    @NotNull
    private final String vr;
    @SerializedName(value = "militaryTime")
    private boolean ps;

    public ab(@NotNull qi qi2, @NotNull cd cd2, boolean bl, @NotNull String string) {
        this.pk = qi2;
        this.rr = cd2;
        this.ps = bl;
        this.vr = string;
    }

    @NotNull
    public qi bh() {
        return this.pk;
    }

    @NotNull
    public cd id() {
        return this.rr;
    }

    public boolean di() {
        return this.ps;
    }

    @NotNull
    public String by() {
        return this.vr;
    }

    @Override
    @NotNull
    public ao xp() {
        return ao.LOAD_CLIENT_PREFERENCES;
    }
}
