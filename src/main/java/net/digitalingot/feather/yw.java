package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import com.google.gson.JsonElement;
import joptsimple.internal.Strings;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class yw {
    @NotNull
    public static final Map<String, Class<?>> al = new HashMap();
    @NotNull
    private final Map<String, oh> fu;
    @NotNull
    private final File oo = new File(zz.nw().sb(), "cosmetic_settings.json");

    public yw() {
        Type type;
        List<String> list;
        String string;
        HashMap hashMap;
        if (!this.oo.exists()) {
            this.oo.createNewFile();
        }
        if ((hashMap = gw.GSON.fromJson(string = Strings.join(list = Files.readAllLines(this.oo.toPath()), "\n"), type = new TypeToken<HashMap<String, oh>>() {
        }.getType())) == null) {
            hashMap = new HashMap();
        }
        this.fu = hashMap;
    }

    public <T> T ay(@NotNull String string, @NotNull Class<T> clazz) {
        JsonElement jsonElement = gw.GSON.toJsonTree(this.fu.get(string));
        return gw.GSON.fromJson(jsonElement, clazz);
    }

    public void ay(@NotNull String string, @NotNull oh oh2) {
        this.fu.put(string, oh2);
        this.pd();
    }

    public void pd() {
        String string = gw.GSON.toJson(this.fu);
        Files.write(this.oo.toPath(), string.getBytes(StandardCharsets.UTF_8));
    }

    @NotNull
    public Map<String, oh> mw() {
        return this.fu;
    }
}
