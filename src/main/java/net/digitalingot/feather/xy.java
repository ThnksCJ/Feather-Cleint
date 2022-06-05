package net.digitalingot.feather;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class xy {
    @SerializedName(value = "enabled")
    private final boolean enabled;
    @SerializedName(value = "favorite")
    private final boolean bc;
    @SerializedName(value = "settings")
    @NotNull
    private final JsonElement gi;

    public xy(@NotNull zi zi2) {
        this.enabled = zi2.nv();
        this.bc = zi2.ns();
        this.gi = this.uj(zi2);
    }

    @NotNull
    private JsonElement uj(@NotNull Object object) {
        JsonObject jsonObject = gw.GSON.toJsonTree(object).getAsJsonObject();
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (string.startsWith("nested_")) {
                String string2 = string.substring("nested_".length());
                string2 = string2.isEmpty() ? "" : string2 + ":";
                JsonElement jsonElement2 = this.uj(jsonElement);
                for (Map.Entry entry2 : jsonElement2.getAsJsonObject().entrySet()) {
                    jsonObject2.add(string2 + entry2.getKey(), (JsonElement) entry2.getValue());
                }
                continue;
            }
            jsonObject2.add(string, jsonElement);
        }
        return jsonObject2;
    }

    public boolean nv() {
        return this.enabled;
    }

    public boolean ns() {
        return this.bc;
    }

    @NotNull
    public JsonElement wb() {
        return this.gi;
    }
}
