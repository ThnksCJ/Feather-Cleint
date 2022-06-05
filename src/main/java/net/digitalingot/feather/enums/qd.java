package net.digitalingot.feather.enums;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public enum qd {
    MC_SETTINGS("MC Settings", "mcSettings", "https://assets.feathercdn.net/game/homepageicons/settings.svg"),
    REALMS("Minecraft Realms", "mcRealms", "https://assets.feathercdn.net/game/homepageicons/realms.svg"),
    REPLAY_MOD("Replay Mod", "replayMod", "https://assets.feathercdn.net/game/homepageicons/replaymod.svg");

    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="slug")
    @NotNull
    private final String slug;
    @SerializedName(value="icon")
    @NotNull
    private final String icon;

    qd(@NotNull String string2, String string3, String string4) {
        this.name = string2;
        this.slug = string3;
        this.icon = string4;
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
}
