package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public final class iz {
    private static final Minecraft minecraft = Minecraft.getMinecraft();
    private static ScaledResolution Ce = null;
    private static int Cf = -1;
    private static int Cg = -1;
    private static int Ch = -1;

    private iz() {
        throw new AssertionError();
    }

    public static int aU() {
        return iz.minecraft.displayWidth;
    }

    public static int aV() {
        return iz.minecraft.displayHeight;
    }

    public static int aW() {
        return iz.minecraft.displayWidth;
    }

    public static int aX() {
        return iz.minecraft.displayHeight;
    }

    public static int aY() {
        return iz.bB().getScaledWidth();
    }

    public static int aZ() {
        return iz.bB().getScaledHeight();
    }

    public static double bA() {
        return iz.bB().getScaleFactor();
    }

    private static ScaledResolution bB() {
        if (Cf != iz.aW() || Cg != iz.aX() || Ch != iz.minecraft.gameSettings.guiScale || Ce == null) {
            Cf = iz.aW();
            Cg = iz.aX();
            Ch = iz.minecraft.gameSettings.guiScale;
            Ce = new ScaledResolution(minecraft);
        }
        return Ce;
    }
}
