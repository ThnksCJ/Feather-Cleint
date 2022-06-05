package net.digitalingot.feather.mods.impl;

import de.jcm.discordgamesdk.Core;
import de.jcm.discordgamesdk.CreateParams;
import de.jcm.discordgamesdk.activity.Activity;
import de.jcm.discordgamesdk.activity.ActivityType;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.server.integrated.IntegratedServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@sv(aw= qc.DISCORD, jf=@bx(vu="Discord", jm="https://assets.feathercdn.net/game/mods/discord.svg", mz="Share your current status on Discord", lq={}))
public class Discord
extends Mod<ay> {
    private final Executor S = Executors.newSingleThreadExecutor();
    private final Instant T = Instant.now();
    private CreateParams U;
    private Core V;
    private long W;

    @Override
    public void initialize() {
        this.S.execute(() -> {
            String string = System.getProperty("java.library.path");
            for (String string2 : string.split("[;:]")) {
                File file = new File(string2, "discord_game_sdk.dll");
                if (!file.exists()) continue;
                Core.init((File)file);
                return;
            }
            vm.Fq.error("Couldn't find discord api path! Tried those paths: " + string);
        });
        sw.ti.ay(uj2 -> {
            long l;
            if (!this.gc()) {
                return;
            }
            if (uj2 != sw.uj.START) {
                return;
            }
            if (this.V == null) {
                return;
            }
            this.S.execute(() -> this.V.runCallbacks());
            if (this.ob() && (l = Instant.now().getEpochSecond()) - this.W > 1L) {
                this.W = l;
                this.vv();
            }
        });
        hj.dw.ay((entityPlayer, netHandlerPlayClient) -> this.ls());
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            if (!this.gc()) {
                return;
            }
            this.rf("Main Menu", null);
        });
    }

    @Override
    public void au() {
        this.S.execute(() -> {
            this.U = new CreateParams();
            this.U.setClientID(903733444876582983L);
            this.U.setFlags(new CreateParams.Flags[]{CreateParams.Flags.NO_REQUIRE_DISCORD});
            this.V = new Core(this.U);
            this.ls();
        });
    }

    private void ls() {
        if (!this.gc()) {
            return;
        }
        if (this.ob()) {
            this.vv();
        } else if (Minecraft.getMinecraft().isSingleplayer()) {
            this.rf("Singleplayer", ((ay)this.vz).X ? this.ep() : null);
        } else if (Minecraft.getMinecraft().getCurrentServerData() != null) {
            String string = ((ay)this.vz).Y ? (!Minecraft.getMinecraft().isConnectedToRealms() ? Minecraft.getMinecraft().getCurrentServerData().serverIP : "Realms") : null;
            this.rf("Multiplayer", string);
        } else {
            this.rf("Main Menu", null);
        }
    }

    private boolean ob() {
        return ((ay)this.vz).Z && ck.oS();
    }

    private void vv() {
        kx.ay ay2 = kx.qt();
        this.rf("Hypixel", ay2.getDisplayName());
    }

    private void rf(@NotNull String string, @Nullable String string2) {
        if (this.V == null) {
            return;
        }
        this.S.execute(() -> {
            if (this.V == null) {
                return;
            }
            Activity activity = new Activity();
            activity.setType(ActivityType.PLAYING);
            activity.setState(string);
            if (string2 != null) {
                activity.setDetails(string2);
            }
            activity.timestamps().setStart(this.T);
            activity.assets().setLargeImage("app_icon");
            activity.assets().setLargeText("Feather Client");
            this.V.activityManager().updateActivity(activity);
            activity.close();
        });
    }

    private String ep() {
        IntegratedServer integratedServer = Minecraft.getMinecraft().getIntegratedServer();
        return integratedServer.func_71221_J();
    }

    @Override
    public void jl() {
        block1: {
            if (this.U != null) {
                this.U.close();
            }
            if (this.V == null) break block1;
            this.V.close();
        }
    }

    @rm(wm=true)
    public static class ay
    extends zi {
        @au(wd="showWorld", vu="Show Singleplayer World", pr="true", yp=@de(vi=0))
        public boolean X;
        @au(wd="showServer", vu="Show Server", pr="false", yp=@de(vi=1))
        public boolean Y;
        @au(wd="hypixelGamemode", vu="Show Hypixel Gamemodes", pr="true", yp=@de(vi=3))
        public boolean Z;
    }
}
