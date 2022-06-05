package net.digitalingot.feather;

import com.google.gson.Gson;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import net.digitalingot.feather.enums.ed;
import net.digitalingot.feather.pv;
import net.digitalingot.feather.rl;
import net.digitalingot.feather.xn;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*
 * Illegal identifiers - recommend switching to table mode
 */
public class nn
        implements Closeable {
    @NotNull
    public static final Gson GSON = new Gson();
    @NotNull
    private final zs ag;
    @NotNull
    private final Map<UUID, String> nw = new HashMap<UUID, String>();
    @NotNull
    private final Map<String, UUID> mm = new TreeMap<String, UUID>(String.CASE_INSENSITIVE_ORDER);

    {
        Minecraft minecraft = Minecraft.getMinecraft();
        MinecraftSessionService minecraftSessionService = minecraft.getSessionService();
        if (minecraftSessionService == null) {
            throw new nl("session service not available");
        }
        Session session = minecraft.getSession();
        if (session == null) {
            throw new nl("session not available");
        }
        boolean bl = false;
        for (int i = 0; i < 2; ++i) {
            String string = this.ay(String.class, ed.SERVER_ID);
            minecraftSessionService.joinServer(session.getProfile(), session.getToken(), string);
            String string2 = this.ay(ed.HAS_JOINED, session.getUsername(), string);
            if (!string2.contains("mcUsername")) continue;
            bl = true;
            break;
        }
        if (!bl) {
            throw new nl("Failed to authenticate with core backend");
        }
        if (ay.rf() != en.ay.IDE) {
            this.op();
        }
        vm.Fq.info("Authenticated with core backend");
    }

    public nn() {
        this.ag = new zs(this);
        this. do ();
    }

    @Nullable
    public String ay(@NotNull UUID uUID) {
        return this.ay(new UUID[]{uUID}).values().stream().findAny().orElse(null);
    }

    @NotNull
    public Map<UUID, String> ay(UUID... pv2) {
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        HashMap<UUID, String> hashMap = new HashMap<UUID, String>(pv2.length);
        for (UUID uUID : pv2) {
            String string = this.nw.get(uUID);
            if (string != null) {
                hashMap.put(uUID, string);
                continue;
            }
            arrayList.add(uUID);
        }
        if (!arrayList.isEmpty()) {
            pv pv3 = new pv(null, arrayList, null);
            xn xn2 = this.ay(xn.class, ed.ACCOUNT_SEARCH, pv3, new String[0]);
            for (UUID uUID : xn2.em()) {
                this.ay((xn.ay) uUID);
                hashMap.put(uUID.xh(), uUID.yb());
            }
        }
        return hashMap;
    }

    @Nullable
    public UUID rf(@NotNull String string) {
        return this.rf(new String[]{string}).values().stream().findAny().orElse(null);
    }

    @NotNull
    public Map<String, UUID> rf(String... pv2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        HashMap<String, UUID> hashMap = new HashMap<String, UUID>(pv2.length);
        for (String string : pv2) {
            UUID uUID = this.mm.get(string);
            if (uUID != null) {
                hashMap.put(string, uUID);
                continue;
            }
            arrayList.add(string);
        }
        if (!arrayList.isEmpty()) {
            pv pv3 = new pv(null, null, arrayList);
            xn xn2 = this.ay(xn.class, ed.ACCOUNT_SEARCH, pv3, new String[0]);
            for (String string : xn2.em()) {
                this.ay((xn.ay) string);
                hashMap.put(string.yb(), string.xh());
            }
        }
        return hashMap;
    }

    private void ay(@NotNull xn.ay ay2) {
        this.nw.put(ay2.xh(), ay2.yb());
        this.mm.put(ay2.yb(), ay2.xh());
    }

    void es() {
        this.ay(rl.class, ed.UPDATE_TOKEN, new String[0]);
    }

    public void do()

    @NotNull
    String aj() {
        return this.ay(String.class, ed.AUTH_TOKEN);
    }

    void op() {
        URL uRL = new URL("https://wl.feathermc.com/whitelist_status");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRL.openConnection();
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setRequestProperty("User-Agent", "Feather Client");
        httpsURLConnection.setRequestProperty("Authorization", this.ag.yw());
        if (httpsURLConnection.getResponseCode() != 200) {
            throw new IOException("Unexpected status code: " + httpsURLConnection.getResponseCode());
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        String string = bufferedReader.readLine();
        bufferedReader.close();
        boolean bl = "true".equalsIgnoreCase(string);
        boolean bl2 = "false".equalsIgnoreCase(string);
        if (!bl && !bl2) {
            throw new IOException("Unexpected response: " + string);
        }
        if (!bl) {
            throw new nl("Not whitelisted");
        }
    }

    @NotNull
    private <T> T ay(@NotNull Class<T> clazz, @NotNull ed ed2, String... stringArray) {
        return this.ay(clazz, ed2, null, stringArray);
    }

    @NotNull
    private <T> T ay(@NotNull Class<T> clazz, @NotNull ed ed2, @Nullable Object object, String... stringArray) {
        String string = this.ay(ed2, object, stringArray);
        return GSON.fromJson(string, clazz);
    }

    @NotNull
    private String ay(@NotNull ed ed2, String... stringArray) {
        return this.ay(ed2, null, stringArray);
    }

    @NotNull
    private String ay(@NotNull ed ed2, @Nullable Object object, String... stringArray) {
        String string;
        URL uRL = ed2.get(stringArray);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRL.openConnection();
        httpsURLConnection.setRequestMethod(ed2.getMethod().name());
        httpsURLConnection.setRequestProperty("User-Agent", "Feather Client");
        if (ed2 != ed.SERVER_ID && ed2 != ed.HAS_JOINED && (string = this.ag.oh()) != null) {
            httpsURLConnection.setRequestProperty("Authorization", string);
        }
        if (object != null) {
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        }
        httpsURLConnection.connect();
        if (object != null) {
            string = GSON.toJson(object);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(string.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            if (outputStream != null) {
                outputStream.close();
            }
        }
        if ((string = httpsURLConnection.getHeaderField("Authorization")) != null) {
            this.ag.uj(string);
        }
        return zd.zz(httpsURLConnection.getInputStream()).oB();
    }

    @Override
    public void close() {
        this.ag.close();
    }

    @NotNull
    public zs ww() {
        return this.ag;
    }
}
