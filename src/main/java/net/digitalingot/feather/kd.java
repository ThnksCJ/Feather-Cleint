package net.digitalingot.feather;

import net.digitalingot.feather.ps;
import net.digitalingot.feather.vx;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.UUID;

public class kd
        extends xu {
    public kd(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.IN_PARTY);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        vx vx2 = this.hC.ys().T();
        String string = this.xs.ay(vx2.O());
        Map<UUID, String> map = this.xs.ay(vx2.P().toArray(new UUID[0]));
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.info.heading");
        TextComponentTranslation textComponentTranslation2 = new TextComponentTranslation(vx2.Q() == ps.rf.EVERYONE ? "feather.commands.featherparty.info.modeEveryone" : "feather.commands.featherparty.info.modeProximity");
        TextComponentTranslation textComponentTranslation3 = new TextComponentTranslation("feather.commands.featherparty.info.owner", string);
        dd.ay(entityPlayerSP, textComponentTranslation);
        dd.ay(entityPlayerSP, textComponentTranslation2);
        dd.ay(entityPlayerSP, textComponentTranslation3);
        for (String string2 : map.values()) {
            TextComponentTranslation textComponentTranslation4 = new TextComponentTranslation("feather.commands.featherparty.info.member", string2);
            dd.ay(entityPlayerSP, textComponentTranslation4);
        }
    }
}
