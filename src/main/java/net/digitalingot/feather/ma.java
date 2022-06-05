package net.digitalingot.feather;

import net.digitalingot.feather.me;
import net.digitalingot.feather.sx;
import net.digitalingot.feather.uv;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.concurrent.ForkJoinPool;

public class ma
        extends kl {
    public ma() {
        super("featherscreenshot", Collections.emptyList());
    }

    @Override
    public void ay(@NotNull String[] stringArray) {
        if (stringArray.length < 2) {
            return;
        }
        String string = stringArray[0];
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 1; i < stringArray.length; ++i) {
            stringJoiner.add(stringArray[i]);
        }
        String string2 = stringJoiner.toString();
        File file = new File(string2);
        ForkJoinPool.commonPool().execute(() -> {
            switch (string) {
                case "copy": {
                    me.uj((File) file);
                    break;
                }
                case "upload": {
                    String string2 = sx.nn((File) file);
                    this.mi(string2);
                    break;
                }
                case "tweet": {
                    String string3 = sx.nn((File) file);
                    this.mi(this.em(string3));
                }
            }
        });
    }

    private String em(@NotNull String string) {
        String string2 = URLEncoder.encode(string, StandardCharsets.UTF_8.toString());
        return "https://twitter.com/intent/tweet?text=Look%20at%20this%20screenshot%20I%20took!%0A" + string2 + "%0A%0A%20%40Feather_Client&related=Feather_Client%3AFeather%20Client%20Published%20via&hashtags=minecraft";
    }

    private void mi(@NotNull String string) {
        uv.ay((URI) new URL(string).toURI());
    }
}
