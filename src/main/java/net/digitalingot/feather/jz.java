package net.digitalingot.feather;

import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.ResourcePackRepository;
import org.capnproto.Text;
import org.capnproto.TextList;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class jz {
    public static void initialize() {
        wz.bo.ay(jz::rf);
    }

    public static void rf(nf nf2) {
        Minecraft.getMinecraft().addScheduledTask(() -> nf2.ay(jz.bC()));
    }

    private static Consumer<rr.bu.sd.ay> bC() {
        return ay2 -> {
            jz.ay(ay2);
            ay2.pm(Minecraft.getMinecraft().getVersion());
            jz.rf(ay2);
            jz.uj(ay2);
            jz.zz(ay2);
        };
    }

    private static void ay(rr.bu.sd.ay ay2) {
        Runtime runtime = Runtime.getRuntime();
        String string = System.getProperty("os.name");
        short s = (short)runtime.availableProcessors();
        int n = jz.nn(runtime.maxMemory());
        String string2 = OpenGlHelper.getCpu();
        String string3 = GL11.glGetString(7936) + " " + GL11.glGetString(7937);
        rr.bu.sd.uj.ay ay3 = ay2.hE();
        ay3.gv(string);
        ay3.uj(s);
        ay3.vq(n);
        ay3.ei(string2);
        ay3.nb(string3);
    }

    private static void rf(rr.bu.sd.ay ay2) {
        List list = dk.pE().stream().map(net.digitalingot.featherserverapi.proto.models.Mod::getName).collect(Collectors.toList());
        TextList.Builder builder = ay2.gb(list.size());
        for (int i = 0; i < list.size(); ++i) {
            String string = (String)list.get(i);
            builder.set(i, new Text.Reader(string));
        }
    }

    private static void uj(rr.bu.sd.ay ay2) {
        int n = 0;
        Minecraft minecraft = Minecraft.getMinecraft();
        List list = minecraft.getResourcePackRepository().getRepositoryEntries();
        TextList.Builder builder = ay2.yd(list.size());
        for (ResourcePackRepository.Entry entry : list) {
            String string = entry.getResourcePackName();
            builder.set(n, new Text.Reader(string));
            ++n;
        }
    }

    private static void zz(rr.bu.sd.ay ay2) {
        Object object;
        ArrayList<qc> arrayList = new ArrayList<qc>();
        for (Map.Entry<qc, Mod<?>> entry : zz.nw().xn().qq().entrySet()) {
            object = entry.getValue();
            if (!((Mod)object).gc()) continue;
            qc qc2 = entry.getKey();
            arrayList.add(qc2);
        }
        TextList.Builder builder = ay2.wi(arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            object = arrayList.get(i);
            builder.set(i, new Text.Reader(((qc) object).getSlug()));
        }
    }

    private static int nn(long l) {
        return (int)(l / 1024L / 1024L);
    }
}
