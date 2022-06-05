package net.digitalingot.feather;

import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class dr {
    @NotNull
    private final Path c;
    @Nullable
    private gj d;

    public dr(@NotNull Path path) {
        this.c = path;
    }

    public void na() {
        String string = this.kq();
        this.d = new gj(this, string);
    }

    @NotNull
    public gj dh() {
        if (this.d == null) {
            this.na();
        }
        return this.d;
    }

    public void ag(@NotNull String string) {
        new gj(this, string).zc().delete();
    }

    public void nw(@NotNull String string) {
        this.mm(string);
        this.d = new gj(this, string);
    }

    @NotNull
    public List<String> ox() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : this.c.resolve("profiles").toFile().list()) {
            if (!string.endsWith(".json")) continue;
            string = string.substring(0, string.length() - ".json".length());
            arrayList.add(string);
        }
        return arrayList;
    }

    @NotNull
    private File mx() {
        File file = this.lj();
        if (!file.exists()) {
            this.rf(file);
        }
        return file;
    }

    private void rf(@NotNull File file) {
        if (file.getParentFile().mkdirs()) {
            vm.Fq.info("Created profile storage directory");
        }
        if (!file.createNewFile()) {
            throw new IOException("Profile storage couldn't be created.");
        }
        this.mm("default");
    }

    private void mm(@NotNull String string) {
        FileWriter fileWriter = new FileWriter(this.mx());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        IOUtils.write(string, bufferedWriter);
        bufferedWriter.close();
        fileWriter.close();
    }

    @NotNull
    private String kq() {
        return zd.xn(this.mx()).nZ().oB();
    }

    @NotNull
    public Path lt() {
        return this.c;
    }

    @NotNull
    private File lj() {
        return this.c.resolve("current.profile").toFile();
    }
}
