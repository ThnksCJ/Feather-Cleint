package net.digitalingot.feather;

import com.google.gson.annotations.SerializedName;
import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.enums.ao;
import net.digitalingot.feather.fc;
import net.digitalingot.feather.interfaces.vt;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mixin.core.ed;
import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.feather.mods.impl.Voice;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class vi {
    @NotNull
    private final General eN;
    @NotNull
    private final Voice eO;
    @NotNull
    private List<ay> oq = new ArrayList<ay>();

    private vi(@NotNull General rh2) {
        this.eN = rh2;
        this.eO = zz.nw().xn().rf(Voice.class);
    }

    public static vi ay(@NotNull General rh2) {
        final vi vi2 = new vi(rh2);
        final gw gw2 = zz.nw().pv();
        gw2.rf(new el(), new Consumer<tg>() {

            public void ay(tg tg2) {
                vi2.oq = tg2.fx();
                gw2.rf(new oj(Minecraft.getMinecraft().getSession().getProfile().getId(), vi2.oq.stream().map(oj.ay::ay).collect(Collectors.toList())));
            }

            @Override
            public void accept(Object object) {
                this.ay((tg) object);
            }
        }, null);
        if (net.digitalingot.feather.rf.nl()) {
            GameProfile gameProfile = Minecraft.getMinecraft().getSession().getProfile();
            vi2.oq.add(new ay("support@feathermc.com", gameProfile.getId(), gameProfile.getName(), ""));
            gw2.rf(new oj(gameProfile.getId(), vi2.oq.stream().map(oj.ay::ay).collect(Collectors.toList())));
        }
        gw2.ay(ao.CHANGE_ACCOUNT, new rf(vi2));
        return vi2;
    }

    public void ed(UUID uUID) {
        vm.Fq.info("Changing account to " + uUID + "...");
        ay ay3 = this.oq.stream().filter(ay2 -> ay2.zx().equals(uUID)).findFirst().orElseThrow(IllegalArgumentException::new);
        Minecraft minecraft = Minecraft.getMinecraft();
        Session session = new Session(ay3.getName(), ay3.zx().toString(), ay3.wr(), "mojang");
        ((ed) minecraft).setSession(session);
        nn nn2 = this.eN.ex();
        if (nn2 != null) {
            nn2.ww().hs();
            nn2. do ();
        }
        if (this.eN.qy() != null) {
            this.eN.qy(). if ().fk();
        }
    }

    public static class ay {
        @SerializedName(value = "email")
        private final String eR;
        @SerializedName(value = "uuid")
        private final UUID hj;
        @SerializedName(value = "name")
        private final String name;
        @SerializedName(value = "authToken")
        private final String eS;

        public ay(String string, UUID uUID, String string2, String string3) {
            this.eR = string;
            this.hj = uUID;
            this.name = string2;
            this.eS = string3;
        }

        public String th() {
            return this.eR;
        }

        public UUID zx() {
            return this.hj;
        }

        public String getName() {
            return this.name;
        }

        public String wr() {
            return this.eS;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || this.getClass() != object.getClass()) {
                return false;
            }
            ay ay2 = (ay) object;
            return Objects.equals(this.eR, ay2.eR) && Objects.equals(this.hj, ay2.hj) && Objects.equals(this.name, ay2.name) && Objects.equals(this.eS, ay2.eS);
        }

        public int hashCode() {
            return Objects.hash(this.eR, this.hj, this.name, this.eS);
        }
    }

    public static class rf
            implements vt<fy, fc, jg> {
        @NotNull
        private final vi eT;

        rf(@NotNull vi vi2) {
            this.eT = vi2;
        }

        @Override
        public void ay(fy fy2, Consumer<fc> consumer, Consumer<jg> consumer2) {
            UUID uUID = fy2.zg();
            if (net.digitalingot.feather.rf.nl()) {
                General rh2 = zz.nw().xn().rf(General.class);
                rh2.qy(). if ().fk();
            } else {
                this.eT.ed(uUID);
            }
        }
    }
}
