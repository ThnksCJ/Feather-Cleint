package net.digitalingot.featherserverapi.proto.models;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class Mod {
    @SerializedName(value="name")
    @NotNull
    private final String name;
    @SerializedName(value="version")
    @NotNull
    private final String version;

    public Mod(@NotNull String name, @NotNull String version) {
        this.name = name;
        this.version = version;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getVersion() {
        return this.version;
    }
}
