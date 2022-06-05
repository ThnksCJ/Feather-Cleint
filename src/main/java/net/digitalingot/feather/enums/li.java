package net.digitalingot.feather.enums;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum li {
    HUD_EDITOR("hudEditor");

    @SerializedName(value="slug")
    @NotNull
    private final String slug;

    li(String string2) {
        this.slug = string2;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }
}
