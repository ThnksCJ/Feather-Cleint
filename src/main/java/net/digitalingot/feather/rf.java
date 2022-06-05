package net.digitalingot.feather;

import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.ii;
import net.digitalingot.feather.interfaces.yb;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class rf extends zi {
    private static final boolean rf = System.getenv("FEATHER_TEST") != null;
    private static final List<Runnable> uj = new ArrayList<Runnable>();
    private static rf zz;
    @NotNull
    private final Path sd;
    private final ul bu;
    private final bn kl;

    public rf(@NotNull Minecraft minecraft) {
        zz = this;
        Path path = minecraft.mcDataDir.toPath();
        this.sd = path.resolve("feather");
        this.bu = new ul();
        this.kl = new bn();
    }

    public static rf kl() {
        return zz;
    }

    public static ul nn() {
        return net.digitalingot.feather.rf.zz.bu;
    }

    public static void ay(@NotNull Runnable runnable) {
        uj.add(runnable);
    }

    public static bn ed() {
        return net.digitalingot.feather.rf.zz.kl;
    }

    public static boolean zs() {
        return Minecraft.getMinecraft().isCallingFromMinecraftThread();
    }

    public static boolean nl() {
        return rf;
    }

    public void ay(@NotNull List<Class<? extends Mod<?>>> list) {
        et et2 = new et(this.sd.toFile());
        tk tk2 = this.sd();
        ej ej2 = this.ay(list, tk2, et2);
        gw gw2 = new gw();
        uj uj2 = new uj(gw2, ej2, et2, this.sd.toFile(), this.sd.resolve("misc").toFile(), this.bu());
        zz zz2 = new zz();
        zz2.ay(uj2);
        net.digitalingot.feather.zz.ay(zz2);
        wg.INSTANCE.initialize();
        ej2.ez();
        tk2.zz(ej2.qq());
        ff.tu();
        bd.INSTANCE.init();
        this.zz();
        vm.Fq.info("Started Feather (" + uj2.bu() + ")");
        uj.forEach(Runnable::run);
    }

    private void zz() {
        ej ej2 = net.digitalingot.feather.zz.nw().xn();
        gw gw2 = net.digitalingot.feather.zz.nw().pv();
        et et2 = net.digitalingot.feather.zz.nw().rl();
        gw2.ay(ao.READY_FOR_MESSAGES, new ub());
        gw2.ay(ao.RECORD_KEYS, new yg());
        gw2.ay(ao.PAGE_UPDATE, new mr());
        gw2.ay(ao.PRESS_BUTTON, new wq());
        gw2.ay(ao.UPDATE_CLIENT_PREFERENCES, new zj(et2));
        gw2.ay(ao.CREATE_MOD_PROFILE, new so());
        gw2.ay(ao.DELETE_MOD_PROFILE, new ui());
        gw2.ay(ao.RENAME_MOD_PROFILE, new ga());
        gw2.ay(ao.CLONE_MOD_PROFILE, new yp());
        gw2.ay(ao.SELECT_MOD_PROFILE, new xa());
        gw2.ay(ao.RESET_MOD_POSITIONS, new mz());
        gw2.ay(ao.RESET_MOD_SETTINGS, new lq());
        gw2.ay(ao.UPDATE_MOD_SETTINGS, new mc(et2));
        gw2.ay(ao.RENDER_MOD, new eq());
        gw2.ay(ao.REMOVE_RENDER_MOD, new ea());
        gw2.ay(ao.RESET_SIDEBAR_SETTINGS, new ir());
        gw2.ay(ao.UPDATE_SIDEBAR_SETTINGS, new wd());
        gw2.ay(ao.DO_HUD_SELECTION, new ll());
        yb.bo.ay(string -> {
            if (string.equals("featherMods")) {
                wg.INSTANCE.show();
                ii.zz((boolean) true);
            }
        });
        dw.cv();
        go.ay(et2);
        st.ay(ej2);
        bt.ay(ej2);
        vu.ay(ej2);
        tj.ay(ej2);
        gf.ay(ej2);
        kt.ay(ej2);
    }

    @NotNull
    private ej ay(@NotNull List<Class<? extends Mod<?>>> list, @NotNull tk tk2, et et2) {
        ej ej2 = new ej(list, tk2, et2);
        ej2.initialize();
        return ej2;
    }

    @NotNull
    private tk sd() {
        tk tk2 = new tk(this.sd);
        tk2.wn();
        return tk2;
    }

    @NotNull
    private String bu() {
        return zd.yd("git.hash").oB();
    }
}
