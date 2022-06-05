package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.net.InetSocketAddress;

public class xj
        extends TypeAdapter<InetSocketAddress> {
    public void ay(JsonWriter jsonWriter, InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            jsonWriter.nullValue();
            return;
        }
        String string = inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
        jsonWriter.value(string);
    }

    public InetSocketAddress bu(JsonReader jsonReader) {
        String string = jsonReader.nextString();
        String[] stringArray = string.split(":", 2);
        String string2 = stringArray[0];
        int n = Integer.parseInt(stringArray[1]);
        return new InetSocketAddress(string2, n);
    }

    public Object read(JsonReader jsonReader) {
        return this.bu(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (InetSocketAddress) object);
    }
}
