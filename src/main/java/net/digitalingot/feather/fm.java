package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum fm {
    SINGLEPLAYER("Singleplayer", "singleplayer"),
    MULTIPLAYER("Multiplayer", "multiplayer"),
    COSMETICS("Cosmetics", "cosmetics"),
    QUIT_GAME("Quit Game", "quitGame");

    @SerializedName(value = "name")
    @NotNull
    private final String name;
    @SerializedName(value = "slug")
    @NotNull
    private final String slug;

    fm(String string2, String string3) {
        this.name = string2;
        this.slug = string3;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getSlug() {
        return this.slug;
    }
}
