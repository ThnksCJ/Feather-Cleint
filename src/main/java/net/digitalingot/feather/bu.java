package net.digitalingot.feather;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class bu {
    public static void xs() {
        Mouse.poll();
    }

    public static boolean ay(int n) {
        return Keyboard.isKeyDown(n);
    }

    public static int om() {
        return Display.getDesktopDisplayMode().getWidth();
    }

    public static int sy() {
        return Display.getDesktopDisplayMode().getHeight();
    }

    public static int ja() {
        return Display.getX();
    }

    public static int pb() {
        return Display.getY();
    }

    public static int rc() {
        return Display.getWidth();
    }

    public static int cp() {
        return Display.getHeight();
    }

    public static boolean ac() {
        return Display.isFullscreen();
    }

    public static boolean bz() {
        String string = System.getProperty("org.lwjgl.opengl.Window.undecorated");
        if (string == null) {
            System.setProperty("org.lwjgl.opengl.Window.undecorated", "false");
            return bu.bz();
        }
        return string.equals("false");
    }

    public static void ay(boolean bl) {
        System.setProperty("org.lwjgl.opengl.Window.undecorated", Boolean.toString(bl));
    }

    public static void ay(boolean bl, int n, int n2, int n3, int n4, boolean bl2) {
        Display.setFullscreen(bl);
        Display.setDisplayMode(new DisplayMode(n3, n4));
        Display.setLocation(n, n2);
        Display.setVSyncEnabled(bl2);
    }

    public static void ay(int n, int n2) {
        Display.setLocation(n, n2);
    }

    public static void rf(boolean bl) {
        Display.setResizable(bl);
    }
}
