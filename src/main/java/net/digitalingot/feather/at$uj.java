package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import net.digitalingot.feather.enums.li;

public class at$uj
extends TypeAdapter<li> {
    public void ay(JsonWriter jsonWriter, li li2) {
        jsonWriter.beginObject();
        jsonWriter.name("slug").value(li2.getSlug());
        jsonWriter.endObject();
    }

    public li zs(JsonReader jsonReader) {
        return null;
    }

    public Object read(JsonReader jsonReader) {
        return this.zs(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (li) object);
    }
}
