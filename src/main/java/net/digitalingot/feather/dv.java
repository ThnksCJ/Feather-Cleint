package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;

public final class dv {
    public static final int BR = 0;
    public static final int BS = 1;
    public static final int BT = 2;
    public static final int BU = 3;
    public static final int BV = 4;
    public static final int BW = 5;
    public static final int BX = 6;
    public static final int BY = 7;
    public static final int BZ = 7;
    public static final int Ca = 0;
    public static final int Cb = 1;
    public static final int Cc = 2;
    private static final Minecraft minecraft = Minecraft.getMinecraft();

    private dv() {
        throw new AssertionError();
    }

    public static boolean wz(int n) {
        if (n > 7) {
            return false;
        }
        return Mouse.isButtonDown(n);
    }

    public static int aO() {
        return Mouse.getDWheel();
    }

    public static boolean aP() {
        return Mouse.isGrabbed();
    }

    public static void om(boolean bl) {
        Mouse.setGrabbed(bl);
    }

    public static void ag(int n, int n2) {
        Mouse.setCursorPosition(n, n2);
    }
}
