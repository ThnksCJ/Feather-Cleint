package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class ym
extends HashMap<String, rf> {
    @NotNull
    private static final List<ay> Fb = new ArrayList<ay>();

    public static void initialize() {
        hj.dw.ay((entityPlayer, netHandlerPlayClient) -> {
            if (vs.cb()) {
                return;
            }
            NetworkManager networkManager = netHandlerPlayClient.getNetworkManager();
            if (networkManager.isLocalChannel()) {
                return;
            }
            if (Minecraft.getMinecraft().isSingleplayer()) {
                return;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)networkManager.getRemoteAddress();
            String string = inetSocketAddress.getHostName();
            string = string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
            ay ay2 = ym.ff(string);
            if (ay2 != null) {
                zz.nw().xn().nn(ay2.oW());
                ej ej2 = zz.nw().xn();
                kt.ay(ej2);
            }
        });
        ym ym2 = zd.sw("https://game-client.feathermc.com/disabled-mods.json").nn(ym.class);
        for (rf rf2 : ym2.values()) {
            ay ay2 = rf2.oX();
            Fb.add(ay2);
        }
    }

    @Nullable
    private static ay ff(@NotNull String string) {
        for (ay ay2 : Fb) {
            if (!ay2.hp(string)) continue;
            return ay2;
        }
        return null;
    }

    public static class rf {
        @SerializedName(value="match")
        @NotNull
        private final List<String> Fe;
        @SerializedName(value="disabledMods")
        @NotNull
        private final List<String> Fd;

        public rf(@NotNull List<String> list, @NotNull List<String> list2) {
            this.Fe = list;
            this.Fd = list2;
        }

        @NotNull
        public ay oX() {
            ArrayList<Pattern> arrayList = new ArrayList<Pattern>(this.Fe.size());
            for (String string : this.Fe) {
                arrayList.add(Pattern.compile(string, 2));
            }
            return new ay(arrayList, this.Fd);
        }

        @NotNull
        public List<String> oY() {
            return this.Fe;
        }

        @NotNull
        public List<String> oW() {
            return this.Fd;
        }
    }

    public static class ay {
        @NotNull
        private final List<Pattern> Fc;
        @NotNull
        private final List<String> Fd;

        public ay(@NotNull List<Pattern> list, @NotNull List<String> list2) {
            this.Fc = list;
            this.Fd = list2;
        }

        public boolean hp(@NotNull String string) {
            for (Pattern pattern : this.Fc) {
                if (!pattern.matcher(string).matches()) continue;
                return true;
            }
            return false;
        }

        @NotNull
        public List<Pattern> oV() {
            return this.Fc;
        }

        @NotNull
        public List<String> oW() {
            return this.Fd;
        }
    }
}
