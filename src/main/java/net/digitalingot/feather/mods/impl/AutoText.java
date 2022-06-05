package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

@sv(aw= qc.AUTO_TEXT, jf=@bx(vu="Auto Text", jm="https://assets.feathercdn.net/game/mods/autotext.svg", mz="", lq={}))
public class AutoText
extends Mod<ay> {
    private File eI;
    @NotNull
    private final Set<bw> fp = new LinkedHashSet<bw>();

    @Override
    public void initialize() {
        gw gw2 = zz.nw().pv();
        gw2.ay(ao.CREATE_UPDATE_MACRO, new js(this));
        gw2.ay(ao.DELETE_MACRO, new yu(this));
        lv.vs.ay((n, n2, n3, n4) -> {
            if (n3 != 1) {
                return;
            }
            this.gd(n);
        });
        lv.zl.ay((n, n2, n3) -> {
            if (n2 != 1) {
                return;
            }
            this.gd(n + 100001);
        });
        qo.ay(() -> ((ay)this.vz).eK, () -> {
            if (!this.gc()) {
                return;
            }
            if (Minecraft.getMinecraft().world == null) {
                return;
            }
            if (!Minecraft.getMinecraft().inGameHasFocus) {
                return;
            }
            if (((ay)this.vz).eK.xj()) {
                wg.INSTANCE.show();
                fd.cv();
            }
        }, null);
        yb.bo.ay(string -> {
            if (string.equals("autoText")) {
                wg.INSTANCE.show();
                fd.cv();
            }
        });
    }

    private void gd(int n) {
        if (!this.gc()) {
            return;
        }
        if (Minecraft.getMinecraft().world == null) {
            return;
        }
        if (!Minecraft.getMinecraft().inGameHasFocus) {
            return;
        }
        for (bw bw2 : this.fp) {
            if (!Arrays.stream(bw2.oc().zy()).anyMatch(n2 -> n2 == n) || !bw2.oc().xj()) continue;
            bw2.fn();
        }
    }

    @Override
    public void au() {
        this.eI = new File(zz.nw().iu(), "autotext.json");
        if (this.eI.exists()) {
            Set set = (Set)zd.xn(this.eI).ay(new /* Unavailable Anonymous Inner Class!! */.getType());
            this.fp.addAll(set);
        }
        cw.ay(this.fp);
    }

    @Override
    public void jl() {
        this.fp.clear();
    }

    @Override
    public void ay(@NotNull bw bw2) {
        this.fp.remove(bw2);
        this.fp.add(bw2);
        this.ii();
    }

    public void rf(@NotNull bw bw2) {
        this.fp.remove(bw2);
        this.ii();
    }

    public void ii() {
        this.eI.getParentFile().mkdirs();
        zd.xn(this.eI).oE().nl(this.fp);
    }

    @NotNull
    public Set<bw> kj() {
        return this.fp;
    }

    @rm(le=@xg(ae="autoText", vu="AutoText", jm="https://assets.feathercdn.net/game/hudselection/autotext.svg", un=1))
    public static class ay
    extends zi {
        @au(wd="keyOpenGui", vu="AutoText Editor", pr="77", yp=@de(vi=0))
        public km eK;
    }
}
