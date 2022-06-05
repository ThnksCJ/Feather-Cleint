package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import net.digitalingot.feather.enums.qd;

public class at$ay
extends TypeAdapter<qd> {
    public void ay(JsonWriter jsonWriter, qd qd2) {
        jsonWriter.beginObject();
        jsonWriter.name("name").value(qd2.getName());
        jsonWriter.name("slug").value(qd2.getSlug());
        jsonWriter.name("icon").value(qd2.getIcon());
        jsonWriter.endObject();
    }

    public qd nn(JsonReader jsonReader) {
        throw new UnsupportedOperationException("not implemented");
    }

    public Object read(JsonReader jsonReader) {
        return this.nn(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (qd) object);
    }
}
