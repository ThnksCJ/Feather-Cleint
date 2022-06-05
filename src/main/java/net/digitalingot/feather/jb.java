package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

public class jb {
    public static String sd(@NotNull String string, @NotNull String string2) {
        String string3 = System.getenv(string);
        if (string3 != null) {
            return string3;
        }
        return string2;
    }
}
