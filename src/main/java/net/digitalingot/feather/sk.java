package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class sk
extends TypeAdapter<gp> {
    public void ay(JsonWriter jsonWriter, gp gp2) {
        if (gp2 == null) {
            jsonWriter.nullValue();
            return;
        }
        Color color = gp2.pg();
        String string = color.getAlpha() == 0 ? String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()) : String.format("#%02x%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        jsonWriter.beginObject();
        jsonWriter.name("chroma").value(gp2.sc());
        jsonWriter.name("color").value(string);
        jsonWriter.endObject();
    }

    public gp uj(JsonReader jsonReader) {
        jsonReader.beginObject();
        boolean bl = false;
        Color color = null;
        while (jsonReader.hasNext()) {
            String string;
            switch (string = jsonReader.nextName()) {
                case "chroma": {
                    bl = jsonReader.nextBoolean();
                    break;
                }
                case "color": {
                    color = sk.rl(jsonReader.nextString());
                }
            }
        }
        jsonReader.endObject();
        return new gp(bl, color);
    }

    private static Color rl(@NotNull String string) {
        int n = Integer.valueOf(string.substring(1, 3), 16);
        int n2 = Integer.valueOf(string.substring(3, 5), 16);
        int n3 = Integer.valueOf(string.substring(5, 7), 16);
        if (string.length() > 7) {
            int n4 = Integer.valueOf(string.substring(7, 9), 16);
            return new Color(n, n2, n3, n4);
        }
        return new Color(n, n2, n3);
    }

    public Object read(JsonReader jsonReader) {
        return this.uj(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (gp)object);
    }
}
