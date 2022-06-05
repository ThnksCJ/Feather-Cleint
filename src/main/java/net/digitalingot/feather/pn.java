package net.digitalingot.feather;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.featherserverapi.proto.*;
import net.digitalingot.featherserverapi.proto.models.PacketType;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class pn {
    @NotNull
    public static final pn Fh = new pn();
    @NotNull
    private static final String Fi = "feather:client";
    @NotNull
    private final Gson Fj = new Gson();

    public void tu() {
        mv.ay(Fi, this::ig);
    }

    private void ig(byte[] byArray) {
        Minecraft.getMinecraft().addScheduledTask(() -> {
            String string = new String(byArray, StandardCharsets.UTF_8);
            ClientboundWrapper clientboundWrapper = (ClientboundWrapper)this.Fj.fromJson(string, ClientboundWrapper.class);
            PacketType.Clientbound clientbound = clientboundWrapper.getPacketType();
            switch (1.Fk[clientbound.ordinal()]) {
                case 1: {
                    DisableMods disableMods = (DisableMods)this.Fj.fromJson(clientboundWrapper.getPayload(), DisableMods.class);
                    zz.nw().xn().nn(disableMods.getMods());
                    vm.Fq.info("Received instruction to disable mods from server: " + disableMods.getMods());
                    break;
                }
                case 2: {
                    SetWaypoints setWaypoints = (SetWaypoints)this.Fj.fromJson(clientboundWrapper.getPayload(), SetWaypoints.class);
                    ck.oR().ifPresent(ck2 -> {
                        List<cr> list = setWaypoints.getWaypoints().stream().map(cr::ay).collect(Collectors.toList());
                        ck2.rl(list);
                    });
                    break;
                }
                case 3: {
                    ck.oR().ifPresent(ck2 -> ck2.ja(true));
                    vm.Fq.info("Received instruction to disable hit delay from server");
                }
            }
        });
    }

    public void oZ() {
        List<String> list = zz.nw().xn().qq().values().stream().filter(Mod::gc).map(Mod::cs).map(sv::aw).map(qc::getSlug).collect(Collectors.toList());
        List<net.digitalingot.featherserverapi.proto.models.Mod> list2 = dk.pE();
        this.ay(PacketType.Serverbound.CLIENT_HELLO, new ClientHello(list, list2));
    }

    private void ay(@NotNull PacketType.Serverbound serverbound, @NotNull Object object) {
        if (Minecraft.getMinecraft().getConnection() == null) {
            return;
        }
        vm.Fq.debug("Sending " + (Object)serverbound + " to server over plugin messaging channel");
        JsonElement jsonElement = this.Fj.toJsonTree(object);
        ServerboundWrapper serverboundWrapper = new ServerboundWrapper(serverbound, jsonElement);
        String string = this.Fj.toJson(serverboundWrapper);
        mv.ay(Fi, string.getBytes(StandardCharsets.UTF_8));
    }
}
