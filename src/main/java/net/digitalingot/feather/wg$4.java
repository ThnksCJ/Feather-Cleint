package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.handler.CefLifeSpanHandlerAdapter;

class wg$4
extends CefLifeSpanHandlerAdapter {
    wg$4() {
    }

    public void onAfterCreated(CefBrowser cefBrowser) {
        cefBrowser.setWindowlessFrameRate(144);
        super.onAfterCreated(cefBrowser);
    }
}
