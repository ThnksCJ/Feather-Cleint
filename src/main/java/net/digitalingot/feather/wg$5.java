package net.digitalingot.feather;

import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefQueryCallback;
import org.cef.handler.CefMessageRouterHandlerAdapter;

class wg$5
        extends CefMessageRouterHandlerAdapter {
    wg$5() {
    }

    public boolean onQuery(CefBrowser cefBrowser, CefFrame cefFrame, long l, String string, boolean bl, CefQueryCallback cefQueryCallback) {
        bq.xn(string);
        return true;
    }
}
