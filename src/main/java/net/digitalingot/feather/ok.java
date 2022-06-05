package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import org.cef.CefApp;
import org.cef.ICefRenderer;
import org.cef.browser.CefBrowser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.*;

public class ok
extends GuiScreen {
    private static final Component lh = new Component(){};
    private final CefApp cefApp;
    private final CefBrowser cefBrowser;
    private final ICefRenderer no;
    private final wj xj;
    private final co zy;
    private final Map<Integer, ay> at = new HashMap<Integer, ay>();
    private final Set<Integer> jg = new HashSet<Integer>();
    private int fc;
    private boolean po;
    private boolean fy;
    private boolean oj;
    @Nullable
    private yg.ay el;
    private long tg;

    public ok(CefApp cefApp, CefBrowser cefBrowser, ICefRenderer iCefRenderer) {
        this.cefApp = cefApp;
        this.cefBrowser = cefBrowser;
        this.no = iCefRenderer;
        this.zy = new co(this);
        this.xj = new wj();
    }

    private static int sy(int n) {
        if (ok.isCtrlKeyDown()) {
            n |= 0x80;
        }
        if (ok.isShiftKeyDown()) {
            n |= 0x40;
        }
        if (ok.isAltKeyDown()) {
            n |= 0x200;
        }
        return n;
    }

    private static int ja(int n) {
        switch (n) {
            case 29: 
            case 42: 
            case 56: 
            case 219: {
                return 2;
            }
            case 54: 
            case 157: 
            case 184: 
            case 220: {
                return 3;
            }
            case 55: 
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: 
            case 76: 
            case 77: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 141: 
            case 156: 
            case 179: 
            case 181: {
                return 4;
            }
        }
        return 1;
    }

    private static int pb(int n) {
        if (n >= 0 && n <= 4) {
            return n + 1;
        }
        return 0;
    }

    private static int rc(int n) {
        if (Mouse.isButtonDown(0)) {
            n |= 0x400;
        }
        if (Mouse.isButtonDown(1)) {
            n |= 0x800;
        }
        if (Mouse.isButtonDown(3)) {
            n |= 0x1000;
        }
        return n;
    }

    public void initGui() {
        this.cefBrowser.setFocus(true);
        GlStateManager.disableTexture2D();
        GlStateManager.enableTexture2D();
        this.xj.wg();
    }

    public void onGuiClosed() {
        this.cefBrowser.setFocus(false);
        this.ay(null);
        this.at.clear();
    }

    public void drawScreen(int n, int n2, float f) {
        long l;
        boolean bl;
        if (!this.oj && this.fy) {
            this.xj.wg();
            this.oj = true;
        }
        if (this.po) {
            this.zy.ay(f);
        }
        if ((bl = this.ay(l = System.currentTimeMillis())) || l - this.tg >= 20L) {
            this.cefApp.N_DoMessageLoopWork();
            this.tg = l;
        }
        this.no.render();
        bd.INSTANCE.onRenderModPreview();
    }

    private boolean ay(long l) {
        if (!this.fy) {
            return false;
        }
        boolean bl = false;
        while (this.mc.currentScreen != null && Mouse.isCreated() && Mouse.next()) {
            bl = true;
            this.mc.currentScreen.handleMouseInput();
        }
        while (this.mc.currentScreen != null && Keyboard.isCreated() && Keyboard.next()) {
            bl = true;
            this.mc.currentScreen.handleKeyboardInput();
        }
        Iterator<Map.Entry<Integer, ay>> iterator = this.at.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ay> entry = iterator.next();
            if (!Keyboard.isKeyDown(entry.getKey())) {
                iterator.remove();
                continue;
            }
            ay ay2 = entry.getValue();
            ay2.rf(l);
        }
        return bl;
    }

    protected void keyTyped(char c, int n) {
    }

    protected void mouseClicked(int n, int n2, int n3) {
    }

    protected void mouseReleased(int n, int n2, int n3) {
    }

    protected void mouseClickMove(int n, int n2, int n3, long l) {
    }

    public void handleKeyboardInput() {
        if (!this.fy) {
            return;
        }
        boolean bl = Keyboard.getEventKeyState();
        char c = Keyboard.getEventCharacter();
        int n2 = Keyboard.getEventKey();
        long l = Keyboard.getEventNanoseconds() / 1000000L;
        int n3 = ok.sy(0);
        int n4 = fz.oh(n2).oj();
        int n5 = ok.ja(n2);
        if (bl) {
            if (this.el != null) {
                if (n2 != 1) {
                    this.jg.add(n2);
                } else {
                    this.el.respond(new int[]{n2});
                    this.ay(null);
                }
                return;
            }
            char c2 = c == '\u0000' || !Character.isDefined(c) ? '\uffff' : c;
            KeyEvent keyEvent = new KeyEvent(lh, 401, l, n3, n4, c2, n5);
            tc.rf(keyEvent, n2);
            this.cefBrowser.sendKeyEvent(keyEvent);
            if (c2 != '\uffff') {
                KeyEvent keyEvent2 = new KeyEvent(lh, 400, l, n3, 0, c2);
                if (!Character.isIdentifierIgnorable(c2)) {
                    keyEvent = keyEvent2;
                }
                this.cefBrowser.sendKeyEvent(keyEvent2);
            }
            this.at.put(n2, new ay(c2 != '\uffff' ? Character.valueOf(c) : null, keyEvent, System.currentTimeMillis()));
        } else {
            if (this.el != null) {
                this.el.respond(this.jg.stream().mapToInt(n -> n).toArray());
                this.ay(null);
                return;
            }
            ay ay2 = this.at.remove(n2);
            char c3 = ay2 != null ? (ay2.dd() != null ? ay2.dd().charValue() : '\uffff') : '\uffff';
            KeyEvent keyEvent = new KeyEvent(lh, 402, l, n3, n4, c3, n5);
            tc.rf(keyEvent, n2);
            this.cefBrowser.sendKeyEvent(keyEvent);
        }
        super.handleKeyboardInput();
    }

    public void handleMouseInput() {
        if (!this.fy && this.el != null) {
            return;
        }
        int n2 = Math.min(wg.INSTANCE.getPreferredWidth(), this.mc.displayWidth);
        int n3 = Math.min(wg.INSTANCE.getPreferredHeight(), this.mc.displayHeight);
        int n4 = Mouse.getEventX() * n2 / this.mc.displayWidth;
        int n5 = n3 - Mouse.getEventY() * n3 / this.mc.displayHeight - 1;
        long l = Mouse.getEventNanoseconds() / 1000000L;
        int n6 = Mouse.getEventButton();
        int n7 = ok.sy(ok.rc(0));
        if (n6 == -1) {
            int n8 = Mouse.getEventDWheel();
            if (n8 != 0) {
                this.cefBrowser.sendMouseWheelEvent(new MouseWheelEvent(lh, 507, l, n7, n4, n5, 0, false, 0, 1, n8));
            } else {
                boolean bl = this.fc != -1;
                this.cefBrowser.sendMouseEvent(new MouseEvent(lh, bl ? 506 : 503, l, n7, n4, n5, 0, false, 0));
            }
        } else {
            int n9 = ok.pb(n6);
            if (n9 != 0) {
                boolean bl = Mouse.getEventButtonState();
                if (bl) {
                    this.fc = n6;
                    if (this.el != null) {
                        this.jg.add(n6 + 100001);
                        return;
                    }
                    this.cefBrowser.sendMouseEvent(new MouseEvent(lh, 501, l, n7, n4, n5, 1, false, n9));
                } else {
                    this.fc = -1;
                    if (this.el != null) {
                        this.el.respond(this.jg.stream().mapToInt(n -> n).toArray());
                        this.ay(null);
                        return;
                    }
                    this.cefBrowser.sendMouseEvent(new MouseEvent(lh, 502, l, n7, n4, n5, 1, false, n9));
                    this.cefBrowser.sendMouseEvent(new MouseEvent(lh, 500, l, n7, n4, n5, 1, false, n9));
                }
            }
        }
    }

    public void setWorldAndResolution(@NotNull Minecraft minecraft, int n, int n2) {
        super.setWorldAndResolution(minecraft, n, n2);
        this.lz();
    }

    public void sd(boolean bl) {
        this.po = bl;
    }

    public boolean zj() {
        return this.po;
    }

    public void bu(boolean bl) {
        this.fy = bl;
    }

    public void ay(@Nullable yg.ay ay2) {
        this.jg.clear();
        this.el = ay2;
    }

    public void lz() {
        if (this.mc == null) {
            return;
        }
        int n = Math.min(wg.INSTANCE.getPreferredWidth(), this.mc.displayWidth);
        int n2 = Math.min(wg.INSTANCE.getPreferredHeight(), this.mc.displayHeight);
        Rectangle rectangle = this.cefBrowser.getRenderHandler().getViewRect(this.cefBrowser);
        if (rectangle.width != n || rectangle.height != n2) {
            this.xj.wg();
            this.cefBrowser.wasResized(n, n2);
        }
    }

    public float ti() {
        return this.field_73735_i;
    }

    class ay {
        @Nullable
        private final Character ib;
        @NotNull
        private final KeyEvent rn;
        private int tn;
        private long xp;

        private ay(@NotNull Character c, KeyEvent keyEvent, long l) {
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
}
