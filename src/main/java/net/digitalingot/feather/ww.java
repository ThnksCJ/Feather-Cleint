package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ww {
    public static void rf(@NotNull nu nu2) {
        Map<String, oh> map = nu2.je().mq().mw();
        Map<sb.ay, String> map2 = ww.uj(nu2);
        sh sh2 = new sh(map, map2);
        zz.nw().pv().rf(sh2);
    }

    @NotNull
    private static Map<sb.ay, String> uj(@NotNull nu nu2) {
        UUID uUID = Minecraft.getMinecraft().getSession().getProfile().getId();
        List<sb> list = nu2.cr().get(uUID);
        if (list == null) {
            return new HashMap<sb.ay, String>();
        }
        HashMap<sb.ay, String> hashMap = new HashMap<sb.ay, String>(list.size());
        for (sb sb2 : list) {
            hashMap.put(sb2.jo(), sb2.getSlug());
        }
        return hashMap;
    }
}
