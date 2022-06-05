package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ym$rf {
    @SerializedName(value="match")
    @NotNull
    private final List<String> Fe;
    @SerializedName(value="disabledMods")
    @NotNull
    private final List<String> Fd;

    public ym$rf(@NotNull List<String> list, @NotNull List<String> list2) {
        this.Fe = list;
        this.Fd = list2;
    }

    @NotNull
    public ym.ay oX() {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>(this.Fe.size());
        for (String string : this.Fe) {
            arrayList.add(Pattern.compile(string, 2));
        }
        return new ym.ay(arrayList, this.Fd);
    }

    @NotNull
    public List<String> oY() {
        return this.Fe;
    }

    @NotNull
    public List<String> oW() {
        return this.Fd;
    }
}
