package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.digitalingot.feather.interfaces.xs;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ig {
    private static final String em = jb.sd("FEATHER_COSMETICS_JSON", "https://game-client.feathermc.com/cosmetics.json");
    private static final Gson GSON = new GsonBuilder().registerTypeAdapter(ResourceLocation.class, new om()).create();
    @NotNull
    private final Map<String, sb> mi;
    @NotNull
    private final Map<String, nw> xh;
    @NotNull
    private final Map<String, sb> yb = new HashMap<String, sb>();
    @NotNull
    private final Map<String, nw> lv = new HashMap<String, nw>();
    @NotNull
    private final yw bv;
    @NotNull
    private final xs hr;
    @NotNull
    private final nu jo;

    private ig(@NotNull Map<String, sb> map, @NotNull Map<String, nw> map2, nu nu2, @NotNull xs xs2) {
        this.mi = map;
        this.xh = map2;
        this.bv = new yw();
        this.jo = nu2;
        this.hr = xs2;
    }

    public static ig ay(@NotNull nu nu2) {
        Class5 ag2 = zd.sw(em).ay(GSON, Class5.class);
        HashMap<String, sb> hashMap = new HashMap<String, sb>(ag2.hl().size());
        for (sb object : ag2.hl()) {
            hashMap.put(object.getSlug(), object);
        }
        HashMap<String, nw> hashMap2 = new HashMap<String, nw>(ag2.yk().size());
        for (nw nw2 : ag2.yk()) {
            hashMap2.put(nw2.getSlug(), nw2);
        }
        return new ig(hashMap, hashMap2, nu2, new uh(nu2));
    }

    public iu dy() {
        return new iu(this.hr, this);
    }

    public ay zz(String string) {
        return this.mi.containsKey(string) ? ay.COSMETIC : (this.xh.containsKey(string) ? ay.EMOTE : ay.NONE);
    }

    @Nullable
    public sb sd(String string) {
        return this.mi.get(string);
    }

    @Nullable
    public nw bu(String string) {
        return this.xh.get(string);
    }

    @NotNull
    public Map<String, sb> hj() {
        return this.mi;
    }

    @NotNull
    public Map<String, nw> ve() {
        return this.xh;
    }

    @NotNull
    public Map<String, sb> lm() {
        return this.yb;
    }

    @NotNull
    public Map<String, nw> wz() {
        return this.lv;
    }

    @NotNull
    public yw mq() {
        return this.bv;
    }

    public nu vc() {
        return this.jo;
    }
}
