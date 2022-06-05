package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.hg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class xe
        implements hg {
    @NotNull
    private final URL EO;
    @Nullable
    private HttpURLConnection EP;
    @Nullable
    private InputStream EM;
    @NotNull
    private String EQ;

    public xe(@NotNull URL uRL) {
        this.EO = uRL;
        this.EQ = "Feather Client";
    }

    public xe or(@NotNull String string) {
        this.EQ = string;
        return this;
    }

    @Override
    @NotNull
    public InputStream nY() {
        if (this.EM != null) {
            return this.EM;
        }
        this.EP = (HttpURLConnection) this.EO.openConnection();
        this.EP.setRequestMethod("GET");
        this.EP.setUseCaches(true);
        this.EP.setRequestProperty("User-Agent", this.EQ);
        this.EP.setReadTimeout(30000);
        this.EP.setConnectTimeout(30000);
        this.EP.setDoOutput(true);
        this.EM = this.EP.getInputStream();
        return this.EM;
    }

    @Override
    public void close() {
        if (this.EP != null) {
            this.EP.disconnect();
        }
        ha.ay(this.EM);
        this.EM = null;
    }
}
