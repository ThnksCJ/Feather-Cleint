package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class lh<T extends Enum<T>>
extends TypeAdapter<T> {
    private final Map<String, T> xw = new HashMap<String, T>();
    private final Map<T, String> wc = new HashMap<T, String>();

    public lh(Class<T> clazz) {
        for (Enum enum_ : clazz.getEnumConstants()) {
            String string = lh.ay(clazz, enum_);
            this.xw.put(string, enum_);
            this.wc.put(enum_, string);
        }
    }

    public T sd(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.xw.get(jsonReader.nextString());
    }

    public void ay(JsonWriter jsonWriter, T t) {
        jsonWriter.value(t == null ? null : this.wc.get(t));
    }

    private static <T> String ay(Class<T> clazz, T t) {
        Field field = clazz.getDeclaredField(t.toString());
        uq uq2 = field.getDeclaredAnnotation(uq.class);
        if (uq2 != null) {
            return uq2.wd();
        }
        SerializedName serializedName = field.getDeclaredAnnotation(SerializedName.class);
        if (serializedName != null) {
            return serializedName.value();
        }
        return t.toString();
    }

    public Object read(JsonReader jsonReader) {
        return this.sd(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (Enum)object);
    }
}
