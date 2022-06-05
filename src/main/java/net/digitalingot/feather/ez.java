package net.digitalingot.feather;

import com.google.gson.stream.JsonWriter;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ez {
    @NotNull
    private final tk vp;

    public ez(@NotNull tk tk2) {
        this.vp = tk2;
    }

    public void rf(@NotNull qc qc2, @NotNull Map<String, String> map) {
        Map<qc, Map<String, String>> map2 = this.vp.qp();
        if (map2 == null && (map2 = this.vp.wn()) == null) {
            throw new IllegalStateException("Config cache after read still null.");
        }
        map2.put(qc2, map);
        this.zz(map2);
    }

    public void zz(@NotNull Map<qc, Map<String, String>> map) {
        Map<Boolean, Map<qc, Map>> map2 = map.entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getKey().isSidebar(), Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        Map map3 = map2.getOrDefault(false, new EnumMap(qc.class));
        Map map4 = map2.getOrDefault(true, new EnumMap(qc.class));
        this.ay(this.vp.zc(), (Map<qc, Map<String, String>>) map3);
        this.ay(this.vp.uk(), (Map<qc, Map<String, String>>) map4);
    }

    private void ay(@NotNull File file, @NotNull Map<qc, Map<String, String>> map) {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        JsonWriter jsonWriter = new JsonWriter(bufferedWriter);
        if (!file.exists() && !file.createNewFile()) {
            throw new IOException("Configuration file could not be created");
        }
        this.ay(jsonWriter, map);
        jsonWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }

    private void ay(@NotNull JsonWriter jsonWriter, @NotNull Map<qc, Map<String, String>> map) {
        jsonWriter.beginObject();
        for (Map.Entry<qc, Map<String, String>> entry : map.entrySet()) {
            qc qc2 = entry.getKey();
            Map<String, String> map2 = entry.getValue();
            jsonWriter.name(qc2.getSlug());
            this.rf(jsonWriter, map2);
        }
        jsonWriter.endObject();
    }

    private void rf(@NotNull JsonWriter jsonWriter, @NotNull Map<String, String> map) {
        jsonWriter.beginObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String string = entry.getKey();
            String string2 = entry.getValue();
            jsonWriter.name(string).value(string2);
        }
        jsonWriter.endObject();
    }
}
