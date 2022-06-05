package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class gj {
    @NotNull
    private final String name;
    @NotNull
    private final File b;

    public gj(@NotNull dr dr2, @NotNull String string) {
        if (string.contains("\u0000")) {
            string = "default";
        }
        this.name = string;
        this.b = dr2.lt().resolve("profiles/" + string + ".json").toFile();
        if (this.b.getParentFile().mkdirs()) {
            vm.Fq.info("Created profiles directory under " + this.b.getAbsolutePath());
        }
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public File zc() {
        return this.b;
    }
}
