package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class ld
        extends TypeAdapter<Color> {
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

    public void ay(JsonWriter jsonWriter, Color color) {
        if (color == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        String string = color.getAlpha() == 0 ? String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()) : String.format("#%02x%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        jsonWriter.name("color").value(string);
        jsonWriter.name("chroma").value(false);
        jsonWriter.endObject();
    }

    public Color zz(JsonReader jsonReader) {
        jsonReader.beginObject();
        Color color = null;
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            if (string.equals("color")) {
                color = ld.rl(jsonReader.nextString());
                continue;
            }
            if (!string.equals("chroma")) continue;
            jsonReader.nextBoolean();
        }
        jsonReader.endObject();
        return color;
    }

    public Object read(JsonReader jsonReader) {
        return this.zz(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (Color) object);
    }
}
