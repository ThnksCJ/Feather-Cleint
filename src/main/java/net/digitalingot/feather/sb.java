package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class sb {
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="slug")
    @NotNull
    private final String slug;
    @SerializedName(value="icon")
    @NotNull
    private final String icon;
    @SerializedName(value="type")
    @NotNull
    private final ay yw;
    @SerializedName(value="defaultSettings")
    @Nullable
    private final JsonElement rd;

    public sb(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull ay ay2, @Nullable JsonElement jsonElement) {
        this.name = string;
        this.slug = string2;
        this.icon = string3;
        this.yw = ay2;
        this.rd = jsonElement;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }

    @NotNull
    public String getIcon() {
        return this.icon;
    }

    @NotNull
    public ay jo() {
        return this.yw;
    }

    @Nullable
    public JsonElement it() {
        return this.rd;
    }

    public String toString() {
        return this.slug;
    }

    public enum ay {
        CAPE,
        WINGS,
        BOOTS,
        HATS

    }
}
