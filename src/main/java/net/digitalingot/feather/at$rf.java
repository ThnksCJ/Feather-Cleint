package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class at$rf
        extends TypeAdapter<fm> {
    public void ay(JsonWriter jsonWriter, fm fm2) {
        jsonWriter.beginObject();
        jsonWriter.name("name").value(fm2.getName());
        jsonWriter.name("slug").value(fm2.getSlug());
        jsonWriter.endObject();
    }

    public fm ed(JsonReader jsonReader) {
        throw new UnsupportedOperationException("not implemented");
    }

    public Object read(JsonReader jsonReader) {
        return this.ed(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (fm) object);
    }
}
