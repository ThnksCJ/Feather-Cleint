package net.digitalingot.feather;

import com.google.gson.stream.JsonReader;
import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class nt {
    @NotNull
    private final tk vp;

    public nt(@NotNull tk tk2) {
        this.vp = tk2;
    }

    @NotNull
    public Map<qc, Map<String, String>> ss() {
        Stream<Map.Entry> stream = this.ay(this.vp.zc()).entrySet().stream().filter(entry -> !entry.getKey().isSidebar());
        Stream<Map.Entry> stream2 = this.ay(this.vp.uk()).entrySet().stream().filter(entry -> entry.getKey().isSidebar());
        return Stream.concat(stream, stream2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @NotNull
    public Map<qc, Map<String, String>> ay(File file) {
        if (!file.exists()) {
            return new EnumMap<qc, Map<String, String>>(qc.class);
        }
        JsonReader jsonReader = new JsonReader(new BufferedReader(new FileReader(file)));
        Map<qc, Map<String, String>> map = this.nl(jsonReader);
        jsonReader.close();
        return map;
    }

    @NotNull
    private Map<qc, Map<String, String>> nl(@NotNull JsonReader jsonReader) {
        EnumMap<qc, Map<String, String>> enumMap = new EnumMap<qc, Map<String, String>>(qc.class);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            qc qc2 = qc.fromSlug(jsonReader.nextName());
            if (qc2 == null) {
                jsonReader.skipValue();
                continue;
            }
            Map<String, String> map = this.pv(jsonReader);
            enumMap.put(qc2, map);
        }
        jsonReader.endObject();
        return enumMap;
    }

    @NotNull
    private Map<String, String> pv(@NotNull JsonReader jsonReader) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            String string2 = jsonReader.nextString();
            hashMap.put(string, string2);
        }
        jsonReader.endObject();
        return hashMap;
    }
}
