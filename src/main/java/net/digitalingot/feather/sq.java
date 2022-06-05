package net.digitalingot.feather;

import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

final class sq {
    private static final Field wx = KeyEvent.class.getDeclaredField("scancode");

    private sq() {
        throw new AssertionError();
    }

    public static void ay(KeyEvent keyEvent, int n) {
        wx.set(keyEvent, n);
    }

    static {
        wx.setAccessible(true);
    }
}
