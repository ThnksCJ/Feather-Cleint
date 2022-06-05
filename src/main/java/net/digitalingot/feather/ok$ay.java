package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.KeyEvent;

class ok$ay {
    @Nullable
    private final Character ib;
    @NotNull
    private final KeyEvent rn;
    private int tn;
    private long xp;

    private ok$ay(@NotNull Character c, KeyEvent keyEvent, long l) {
        this.ib = c;
        this.rn = keyEvent;
        this.xp = l;
    }

    public void rf(long l) {
        if (l - this.xp < (this.tn == 0 ? 500L : 30L)) {
            return;
        }
        ok.this.cefBrowser.sendKeyEvent(this.rn);
        this.xp = l;
        ++this.tn;
    }

    public Character dd() {
        return this.ib;
    }

    @NotNull
    public KeyEvent gn() {
        return this.rn;
    }
}
