package net.digitalingot.feather;

import net.digitalingot.feather.enums.hu;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class tk {
    @NotNull
    private final dr cz;
    @NotNull
    private final ez eh;
    @NotNull
    private final nt fr;
    @NotNull
    private final File xz;
    @Nullable
    private Map<qc, Map<String, String>> a;

    public tk(@NotNull Path path) {
        this.cz = new dr(path.resolve("configuration"));
        this.eh = new ez(this);
        this.fr = new nt(this);
        this.xz = path.resolve("sidebar.json").toFile();
    }

    public void uj(@NotNull Map<qc, Map<String, String>> map) {
        this.eh.zz(map);
        this.a = map;
    }

    public void ay(qc qc2, @NotNull Map<String, String> map) {
        this.eh.rf(qc2, map);
        if (this.a == null) {
            this.a = new HashMap<qc, Map<String, String>>();
        }
        this.a.put(qc2, map);
    }

    public void ay(qc qc2, @NotNull zi zi2) {
        df<zi> df2 = hu.INSTANCE.create(zi2);
        Map<String, String> map = df2.fg();
        this.ay(qc2, map);
    }

    public void zz(@NotNull Map<qc, Mod<?>> map) {
        if (this.a == null) {
            this.a = new HashMap<qc, Map<String, String>>();
        }
        for (Map.Entry<qc, Mod<?>> entry : map.entrySet()) {
            qc qc2 = entry.getKey();
            Mod<?> ux2 = entry.getValue();
            df<?> df2 = hu.INSTANCE.create(ux2.xd());
            Map<String, String> map2 = df2.fg();
            this.a.put(qc2, map2);
        }
        this.uj(this.a);
    }

    @NotNull
    public Map<qc, Map<String, String>> wn() {
        this.a = this.fr.ss();
        return this.a;
    }

    @Nullable
    public Map<qc, Map<String, String>> qp() {
        return this.a;
    }

    @NotNull
    public File zc() {
        return this.cz.dh().zc();
    }

    @NotNull
    public File uk() {
        return this.xz;
    }

    @NotNull
    public dr bf() {
        return this.cz;
    }
}
