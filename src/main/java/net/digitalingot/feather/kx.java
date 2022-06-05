package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;

public class kx {
    private static long hv;
    private static ay rj;

    @NotNull
    public static ay qt() {
        long l = System.currentTimeMillis();
        if (l - hv > 1000L || rj == null) {
            hv = l;
            rj = kx.ap();
        }
        return rj;
    }

    @NotNull
    private static ay ap() {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP == null) {
            return ay.LOBBY;
        }
        Scoreboard scoreboard = entityPlayerSP.getWorldScoreboard();
        ScoreObjective scoreObjective = scoreboard.getObjectiveInDisplaySlot(1);
        if (scoreObjective == null) {
            return ay.LOBBY;
        }
        if (scoreObjective.getDisplayName() == null) {
            return ay.LOBBY;
        }
        String string = scoreObjective.getDisplayName().trim();
        string = az.uf(string);
        return ay.fromScoreboardName(string);
    }

    public enum ay {
        SKYBLOCK("Skyblock"),
        SKYBLOCK_CO_OP("Skyblock", "Skyblock Co-Op"),
        SKYWARS("Skywars"),
        BLITZ_SG("Survival Games"),
        CRAZY_WALLS("Crazy Walls"),
        COPS_AND_CRIMS("Cops and Crims"),
        THE_WALLS("The Walls"),
        MEGA_WALLS("Mega Walls"),
        UHC_CHAMPIONS("UHC Champions"),
        MURDER_MYSTERY("Murder Mystery"),
        HOUSING("Housing"),
        THE_HYPIXEL_PIT("The Hypixel Pit"),
        ARCADE_GAMES("Arcade Games"),
        BUILD_BATTLE("Build Battle"),
        CREEPER_ATTACK("Creeper Attack"),
        FARM_HUNT("Farm Hunt"),
        PARTY_GAMES("Party Games"),
        ZOMBIES("Zombies"),
        HIDE_AND_SEEK("Hide and Seek"),
        HYPIXEL_SAYS("Hypixel Says"),
        MINI_WALLS("Mini Walls"),
        BLOCKING_DEAD("Blocking Dead"),
        THROW_OUT("Throw Out"),
        GALAXY_WARS("Galaxy Wars"),
        ENDER_SPLEEF("Ender Spleef"),
        DRAGON_WARS("Dragon Wars"),
        CAPTURE_THE_WOOL("Capture The Wool"),
        PIXEL_PAINTERS("Pixel Painters"),
        BOUNTY_HUNTERS("Bounty Hunters"),
        FOOTBALL("Football"),
        HOLE_IN_THE_WALL("Hole In The Wall"),
        DUELS("Duels"),
        THE_TNT_GAMES("The TNT Games"),
        SMASH_HEROES("Smash Heroes"),
        WARLORDS("Warlords"),
        SPEED_UHC("Speed UHC"),
        BEDWARS("Bedwars", "Bed Wars"),
        LOBBY("Lobby", "Hypixel");

        @NotNull
        private final String displayName;
        @NotNull
        private final String scoreboardName;

        @NotNull
        public static ay fromScoreboardName(@NotNull String string) {
            for (ay ay2 : ay.values()) {
                if (!string.equalsIgnoreCase(ay2.getScoreboardName())) continue;
                return ay2;
            }
            return LOBBY;
        }

        ay(String string2) {
            this.displayName = string2;
            this.scoreboardName = string2;
        }

        ay(String string2, String string3) {
            this.displayName = string2;
            this.scoreboardName = string3;
        }

        @NotNull
        public String getDisplayName() {
            return this.displayName;
        }

        @NotNull
        public String getScoreboardName() {
            return this.scoreboardName;
        }
    }
}
