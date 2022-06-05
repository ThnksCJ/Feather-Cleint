package net.digitalingot.feather.enums;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.feather.mu;
import net.digitalingot.feather.og;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ai {
    @SerializedName(value="type")
    @NotNull
    private final ay wa;
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="slug")
    @Nullable
    private final String slug;
    @SerializedName(value="parent")
    @Nullable
    private final og rk;
    @SerializedName(value="value")
    @Nullable
    private final mu az;
    @SerializedName(value="chroma")
    @Nullable
    private final Boolean jb;
    @SerializedName(value="opacity")
    @Nullable
    private final Boolean wk;

    public ai(@NotNull ay ay2, @NotNull String string, @Nullable String string2, @Nullable og og2, @Nullable mu mu2, @Nullable Boolean bl, @Nullable Boolean bl2) {
        this.wa = ay2;
        this.name = string;
        this.slug = string2;
        this.rk = og2;
        this.az = mu2;
        this.jb = bl;
        this.wk = bl2;
    }

    @NotNull
    public ay ty() {
        return this.wa;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getSlug() {
        return this.slug;
    }

    @Nullable
    public og sl() {
        return this.rk;
    }

    @Nullable
    public mu gx() {
        return this.az;
    }

    @Nullable
    public Boolean yn() {
        return this.jb;
    }

    @Nullable
    public Boolean xr() {
        return this.wk;
    }

    public enum ay {
        TITLE,
        RADIO,
        DROPDOWN,
        BOOLEAN,
        COLOR_PICKER,
        SLIDER,
        TEXT,
        KEY_PICKER,
        CHECKBOX

    }
}
