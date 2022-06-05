package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.util.ArrayList;

public class sg
        extends TypeAdapter<byte[]> {
    public void ay(JsonWriter jsonWriter, byte[] byArray) {
        if (byArray == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        for (byte by : byArray) {
            int n = by & 0xFF;
            jsonWriter.value(n);
        }
        jsonWriter.endArray();
    }

    public byte[] rf(JsonReader jsonReader) {
        jsonReader.beginArray();
        ArrayList<Byte> arrayList = new ArrayList<Byte>();
        while (jsonReader.peek() == JsonToken.NUMBER) {
            int n = jsonReader.nextInt();
            arrayList.add((byte) n);
        }
        jsonReader.endArray();
        byte[] byArray = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i) {
            byArray[i] = arrayList.get(i);
        }
        return byArray;
    }

    public Object read(JsonReader jsonReader) {
        return this.rf(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (byte[]) object);
    }
}
