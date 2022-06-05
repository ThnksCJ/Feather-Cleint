package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class nw {
    @SerializedName(value="slug")
    @NotNull
    private final String slug;

    public nw(@NotNull String string) {
        this.slug = string;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }
}
