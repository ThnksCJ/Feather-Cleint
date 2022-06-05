package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.util.ArrayList;

public class zy
        extends TypeAdapter<km> {
    public void ay(JsonWriter jsonWriter, km km2) {
        if (km2 == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("keys");
        jsonWriter.beginArray();
        for (int n : km2.zy()) {
            jsonWriter.value(fz.oh(n).oj());
        }
        jsonWriter.endArray();
        jsonWriter.name("display").value(km2.getName());
        jsonWriter.endObject();
    }

    public km kl(JsonReader jsonReader) {
        jsonReader.beginObject();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            if (string.equals("keys")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(fz.yw(jsonReader.nextInt()).fy());
                }
                jsonReader.endArray();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new km(arrayList.stream().mapToInt(n -> n).toArray());
    }

    public Object read(JsonReader jsonReader) {
        return this.kl(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (km) object);
    }
}
