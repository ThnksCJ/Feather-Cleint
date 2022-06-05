package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.an;
import net.digitalingot.feather.interfaces.tf;
import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.minecraft.client.Minecraft;
import org.cef.*;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.browser.CefMessageRouter;
import org.cef.callback.CefContextMenuParams;
import org.cef.callback.CefMenuModel;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.*;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public enum wg implements sw.ay {
    INSTANCE;

    private static final String URL;

    static {
        URL = wg.getUrl();
    }

    private final an<General> coreGetter = ej.ay(General.class);
    private Minecraft minecraft;
    private CefApp cefApp;
    private CefClient cefClient;
    private CefBrowser cefBrowser;
    private hn renderer;
    private CefMessageRouter messageRouter;
    private ok screen;
    private int tickCount = 0;

    private static String getUrl() {
        if (rf.nl()) {
            if (System.getenv("FEATHER_LOCAL_TEST") != null) {
                return "http://127.0.0.1:4200/";
            }
            return "https://ig-client.feathermc.com/";
        }
        switch (7. ld[ay.rf().ordinal()]){
            case 1: {
                return "https://ig-client.feathermc.com/";
            }
            case 2: {
                return "https://dev.mc-webapp.feathermc.com/";
            }
            case 3: {
                return "https://beta.mc-webapp.feathermc.com/";
            }
        }
        return "https://mc-webapp.feathermc.com/";
    }

    public void initialize() {
        this.minecraft = Minecraft.getMinecraft();
        this.initializeCef();
        this.registerEvents();
    }

    private void initializeCef() {
        Async.setImpl((Async.Impl) new Async.Impl() {

            public void invokeLater(Runnable runnable) {
                wg.this.minecraft.addScheduledTask(runnable);
            }

            public void invokeAndWait(Runnable runnable) {
                if (wg.this.minecraft.isCallingFromMinecraftThread()) {
                    runnable.run();
                } else {
                    wg.this.minecraft.addScheduledTask(runnable).get();
                }
            }
        });
        if (!CefApp.startup(null)) {
            throw new RuntimeException();
        }
        CefSettings cefSettings = new CefSettings();
        cefSettings.windowless_rendering_enabled = true;
        cefSettings.cache_path = new File(zz.nw().sb(), "cef_cache").getAbsolutePath();
        cefSettings.locale = "en-US";
        if (rf.nl()) {
            cefSettings.remote_debugging_port = 9222;
        }
        this.cefApp = CefApp.getInstance(null, (CefSettings) cefSettings);
        CefApp.addAppHandler((CefAppHandler) new CefAppHandlerAdapter(new String[]{"--external-message-pump", "--disable-threaded-scrolling=1", "--disable-features=TouchpadAndWheelScrollLatching,AsyncWheelEvents"}) {

            public void onScheduleMessagePumpWork(long l) {
            }
        });
        this.cefClient = this.cefApp.createClient();
        this.cefClient.addContextMenuHandler((CefContextMenuHandler) new CefContextMenuHandlerAdapter() {

            public void onBeforeContextMenu(CefBrowser cefBrowser, CefFrame cefFrame, CefContextMenuParams cefContextMenuParams, CefMenuModel cefMenuModel) {
                cefMenuModel.clear();
            }
        });
        this.cefClient.removeLifeSpanHandler();
        this.cefClient.addLifeSpanHandler((CefLifeSpanHandler) new CefLifeSpanHandlerAdapter() {

            public void onAfterCreated(CefBrowser cefBrowser) {
                cefBrowser.setWindowlessFrameRate(144);
                super.onAfterCreated(cefBrowser);
            }
        });
        this.messageRouter = CefMessageRouter.create((CefMessageRouter.CefMessageRouterConfig) new CefMessageRouter.CefMessageRouterConfig());
        this.cefClient.addMessageRouter(this.messageRouter);
        this.messageRouter.addHandler((CefMessageRouterHandler) new CefMessageRouterHandlerAdapter() {

            public boolean onQuery(CefBrowser cefBrowser, CefFrame cefFrame, long l, String string, boolean bl, CefQueryCallback cefQueryCallback) {
                bq.xn(string);
                return true;
            }
        }, true);
        this.renderer = new hn();
        this.cefBrowser = this.cefClient.createBrowser(URL, true, (ICefRenderer) this.renderer, new ICefPlatform() {
        });
        this.cefBrowser.createImmediately();
        this.screen = new ok(this.cefApp, this.cefBrowser, this.renderer);
    }

    private void registerEvents() {
        sw.ti.ay(this);
        tf.lz.ay(() -> {
            if (this.isOpen()) {
                this.renderer.render();
            }
        });
    }

    public void show() {
        this.minecraft.displayGuiScreen(this.screen);
        ua ua2 = zz.nw().xn().rf(Hypixel.class).nz();
        if (ua2.eb()) {
            vu.ay(zz.nw().xn());
        }
    }

    @Override
    public void tick(@NotNull sw.uj uj2) {
        if (uj2 == sw.uj.END && this.cefBrowser != null && !(this.minecraft.currentScreen instanceof ok) && ++this.tickCount % 20 == 0) {
            this.screen.lz();
            this.cefApp.N_DoMessageLoopWork();
        }
    }

    public int getPreferredWidth() {
        int n = iz.aW();
        General rh2 = this.coreGetter.nt();
        return (int) ((float) n * (rh2 != null ? ((General.ay) rh2.xd()).fW.getScale() : 1.0f));
    }

    public int getPreferredHeight() {
        int n = iz.aX();
        General rh2 = this.coreGetter.nt();
        return (int) ((float) n * (rh2 != null ? ((General.ay) rh2.xd()).fW.getScale() : 1.0f));
    }

    public CefBrowser getCefBrowser() {
        return this.cefBrowser;
    }

    public ok getScreen() {
        return this.screen;
    }

    public boolean isOpen() {
        return this.minecraft != null && (this.minecraft.currentScreen instanceof ok || this.minecraft.currentScreen instanceof ov);
    }
}
