package net.digitalingot.feather;

import net.digitalingot.feather.aj;
import net.digitalingot.feather.bz;
import net.digitalingot.feather.ja;
import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.fwebp.WebPImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class sy {
    private static final an<General> CORE_PROVIDER = ej.ay(General.class);
    private static final pb ve = pb.ay(704, 544, 2000);
    private static final ResourceLocation lm = new ResourceLocation("feather:cosmetics/cloak/cloak.obj");
    private static final IResourceManager wz = Minecraft.getMinecraft().getResourceManager();
    private static final Executor mq = Executors.newSingleThreadExecutor();
    private boolean vc;
    private bz hl;
    private long yk;
    private final Path cv = zz.nw().sb().toPath().resolve("assets/game/cosmetics/cloaks");
    private final Map<String, aj> zx = new HashMap<String, aj>();
    private final rc zr = new rc();
    public static final sy jw = new sy();

    public sy() {
        sw.sq.ay((uj2, f) -> {
            if (uj2 == sw.uj.END) {
                this.pm();
            }
        });
    }

    private void zr() {
        if (this.vc) {
            return;
        }
        this.vc = true;
        mq.execute(() -> {
            IResource iResource = wz.getResource(lm);
            if (iResource == null) {
                this.vc = false;
                return;
            }
            InputStream inputStream = iResource.getInputStream();
            ja ja2 = ja.ay((InputStream)inputStream, (pb)ve);
            if (inputStream != null) {
                inputStream.close();
            }
            this.hl = rf.nn().ay(() -> bz.rf((ja)ja2)).get();
            this.vc = false;
        });
    }

    public bz jw() {
        if (this.hl == null) {
            this.zr();
            return null;
        }
        return this.hl;
    }

    private void kl(@NotNull String string) {
        if (this.vc) {
            return;
        }
        this.vc = true;
        mq.execute(() -> {
            File file = this.cv.resolve(string + ".webp").toFile();
            if (!file.exists()) {
                this.vc = false;
                return;
            }
            byte[] byArray = zd.xn(file).nZ().oA();
            WebPImage webPImage = new WebPImage(byArray);
            aj aj2 = new do pb.ay(webPImage).ek();
            if (aj2 == null) {
                vm.Fq.error("[Cloak] Failed to load animation for " + string);
                this.vc = false;
                return;
            }
            this.zx.put(string, aj2);
            this.vc = false;
        });
    }

    public aj nn(@NotNull String string) {
        aj aj2 = this.zx.get(string);
        if (aj2 == null) {
            this.kl(string);
        }
        return aj2;
    }

    private void pm() {
        if (this.hl == null) {
            return;
        }
        int n = (int)(System.currentTimeMillis() - this.yk);
        for (aj aj2 : this.zx.values()) {
            int n2 = aj2.ei();
            int n3 = aj2.hp() + n;
            int n4 = aj2.ff();
            int n5 = aj2.kl(n4);
            while (n3 >= n5) {
                n3 -= n5;
                if (++n4 == n2) {
                    n4 = 0;
                }
                n5 = aj2.kl(n4);
            }
            aj2.sd(n3);
            aj2.zz(n4);
        }
        this.yk = System.currentTimeMillis();
    }

    public boolean rf(UUID uUID) {
        return this.zz(uUID) != null;
    }

    public void uj(UUID uUID) {
        sb sb2 = this.zz(uUID);
        if (sb2 == null) {
            return;
        }
        bz bz2 = this.jw();
        if (bz2 == null) {
            return;
        }
        aj aj2 = this.nn(sb2.getSlug());
        if (aj2 == null) {
            return;
        }
        this.zr.ay(bz2, aj2);
    }

    private sb zz(UUID uUID) {
        General rh2 = CORE_PROVIDER.nt();
        sf sf2 = rh2.qy();
        if (sf2 == null) {
            return null;
        }
        List<sb> list = sf2.hq().cr().get(uUID);
        if (list == null) {
            return null;
        }
        for (sb sb2 : list) {
            if (sb2.jo() != sb.ay.CAPE) continue;
            return sb2;
        }
        return null;
    }
}
