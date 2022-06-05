package net.digitalingot.featherserverapi.proto;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.Mod;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ClientHello {
    @SerializedName(value="featherMods")
    @NotNull
    private final List<String> featherMods;
    @SerializedName(value="mods")
    @NotNull
    private final List<Mod> mods;

    public ClientHello(@NotNull List<String> featherMods, @NotNull List<Mod> mods) {
        this.featherMods = featherMods;
        this.mods = mods;
    }

    @NotNull
    public List<String> getFeatherMods() {
        return this.featherMods;
    }

    @NotNull
    public List<Mod> getMods() {
        return this.mods;
    }
}
