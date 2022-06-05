package net.digitalingot.feather.enums;

import io.netty.handler.codec.http.HttpMethod;
import net.digitalingot.feather.jb;
import org.jetbrains.annotations.NotNull;

import java.net.URL;

public enum ed {
    AUTH_TOKEN(HttpMethod.GET, "/game/auth-token"),
    SERVER_ID(HttpMethod.GET, "/minecraft/server-id"),
    HAS_JOINED(HttpMethod.GET, "/minecraft/has-joined/{}?token={}"),
    UPDATE_TOKEN(HttpMethod.GET, "/service/update-token"),
    ACCOUNT_SEARCH(HttpMethod.POST, "/minecraft/account-search");

    private static final String BASE;
    @NotNull
    private final HttpMethod method;
    @NotNull
    private final String endpoint;

    ed(HttpMethod httpMethod, String string2) {
        this.method = httpMethod;
        this.endpoint = string2;
    }

    public URL get(String ... stringArray) {
        String string = this.endpoint;
        for (String string2 : stringArray) {
            string = string.replaceFirst("\\{}", string2);
        }
        if (string.contains("{}")) {
            throw new IllegalArgumentException("not all variables required were delivered");
        }
        return new URL(BASE + string);
    }

    @NotNull
    public HttpMethod getMethod() {
        return this.method;
    }

    static {
        BASE = jb.sd("FEATHER_API_URL", "https://api.feathermc.com/v1");
    }
}
