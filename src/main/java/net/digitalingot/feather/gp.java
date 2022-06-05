package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.ChromaColor;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class gp {
    @SerializedName(value="chroma")
    private boolean e;
    @SerializedName(value="color")
    @NotNull
    private Color f;

    public gp(boolean bl, @NotNull Color color) {
        this.e = bl;
        this.f = color;
    }

    public int aq() {
        return this.f.getRGB();
    }

    public void nl(boolean bl) {
        this.e = bl;
    }

    public void sd(@NotNull Color color) {
        this.f = color;
    }

    public boolean sc() {
        return this.e;
    }

    @NotNull
    public Color pg() {
        return this.f;
    }

    @NotNull
    public static gp ay(@NotNull ChromaColor chromaColor) {
        return new gp(chromaColor.isChroma(), new Color(chromaColor.getColor()));
    }
}
