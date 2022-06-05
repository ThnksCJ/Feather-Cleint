package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.regex.Pattern;

public class ym$ay {
    @NotNull
    private final List<Pattern> Fc;
    @NotNull
    private final List<String> Fd;

    public ym$ay(@NotNull List<Pattern> list, @NotNull List<String> list2) {
        this.Fc = list;
        this.Fd = list2;
    }

    public boolean hp(@NotNull String string) {
        for (Pattern pattern : this.Fc) {
            if (!pattern.matcher(string).matches()) continue;
            return true;
        }
        return false;
    }

    @NotNull
    public List<Pattern> oV() {
        return this.Fc;
    }

    @NotNull
    public List<String> oW() {
        return this.Fd;
    }
}
