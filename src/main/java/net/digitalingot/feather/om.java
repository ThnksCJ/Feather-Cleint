package net.digitalingot.feather;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class om
extends TypeAdapter<ResourceLocation> {
    public void ay(JsonWriter jsonWriter, ResourceLocation resourceLocation) {
        throw new IOException("operation unsupported");
    }

    public ResourceLocation ay(JsonReader jsonReader) {
        String string = jsonReader.nextString();
        return new ResourceLocation(string);
    }

    public Object read(JsonReader jsonReader) {
        return this.ay(jsonReader);
    }

    public void write(JsonWriter jsonWriter, Object object) {
        this.ay(jsonWriter, (ResourceLocation)object);
    }
}
