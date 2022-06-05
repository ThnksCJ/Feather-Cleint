package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;

public class et {
    @NotNull
    private final ne ik;
    @NotNull
    private final File oo;

    public et(@NotNull File file) {
        ne ne2;
        this.oo = new File(file, "client_preferences.json");
        if (!this.oo.exists()) {
            this.oo.getParentFile().mkdirs();
            this.oo.createNewFile();
        }
        if ((ne2 = zd.xn(this.oo).ay(gw.GSON, ne.class)) == null) {
            ne2 = this.mr();
        }
        this.ay(ne2);
        this.ik = ne2;
    }

    private void ay(ne ne2) {
        cd cd2 = ne2.ub();
        if (cd2.zh() == null) {
            cd2.bu(new ArrayList<qc>());
        }
        if (cd2.ni() == null) {
            cd2.kl(new ArrayList<qc>());
        }
        if (cd2.md() == null) {
            cd2.uj(false);
        }
        if (cd2.sr() == null) {
            cd2.sb("https://assets.feathercdn.net/game/modpreview/background1.webp");
        }
    }

    public void ii() {
        zd.xn(this.oo).ay(gw.GSON, this.ik);
    }

    @NotNull
    private ne mr() {
        cd cd2 = new cd(false, false, new ArrayList<qc>(), new ArrayList<qc>(), false, "https://assets.feathercdn.net/game/modpreview/background1.webp");
        qi qi2 = new qi(new ArrayList<String>(), new ArrayList<String>());
        return new ne(cd2, qi2);
    }

    @NotNull
    public ne wq() {
        return this.ik;
    }
}
