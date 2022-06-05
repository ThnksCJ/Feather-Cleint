package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class zd {
    @NotNull
    public static dt zz(@NotNull InputStream inputStream) {
        return new dt(inputStream);
    }

    @NotNull
    public static xe ay(@NotNull URL uRL) {
        return new xe(uRL);
    }

    @NotNull
    public static xe sw(@NotNull String string) {
        return zd.ay(new URL(string));
    }

    @NotNull
    public static mp xn(@NotNull File file) {
        return new mp(file);
    }

    @NotNull
    public static mp gb(@NotNull String string) {
        return new mp(new File(string));
    }

    @NotNull
    public static wf yd(@NotNull String string) {
        return new wf(string);
    }
}
