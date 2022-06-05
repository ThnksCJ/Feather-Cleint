package net.digitalingot.feather;

import org.apache.commons.lang3.StringEscapeUtils;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class bq {
    private static final List<String> sz = new ArrayList<String>();
    private static boolean oc;

    static void nl(@NotNull String string) {
        if (rf.nl()) {
            vm.Fq.info("FE Channel <- " + string);
        } else {
            vm.Fq.debug("FE Channel <- " + string);
        }
        if (!oc) {
            sz.add(string);
        } else {
            bq.pv(string);
        }
    }

    private static void pv(@NotNull String string) {
        String string2 = StringEscapeUtils.escapeEcmaScript(string);
        wg.INSTANCE.getCefBrowser().executeJavaScript("window.toFe(\"" + string2 + "\");", "", 0);
    }

    public static void xn(@NotNull String string) {
        if (rf.nl()) {
            vm.Fq.info("FE Channel -> " + string);
        } else {
            vm.Fq.debug("FE Channel -> " + string);
        }
        pa pa2 = gw.GSON.fromJson(string, pa.class);
        zz.nw().pv().ay(pa2, gw.rf.FRONTEND);
    }

    public static void tn() {
        vm.Fq.debug("dumping queue to FE: " + sz);
        for (String string : sz) {
            bq.pv(string);
        }
        oc = true;
    }
}
