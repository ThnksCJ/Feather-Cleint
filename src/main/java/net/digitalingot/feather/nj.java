package net.digitalingot.feather;

import net.digitalingot.feather.vx;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class nj
        extends kl {
    @NotNull
    private final Map<String, xu> hD = new HashMap<String, xu>();
    @NotNull
    private final rt hC;

    public nj(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super("featherparty", Collections.singletonList("fparty"));
        this.hC = rt2;
        this.hD.put("create", new su(nn2, gk2, rt2));
        this.hD.put("accept", new wt(nn2, gk2, rt2));
        this.hD.put("deny", new sn(nn2, gk2, rt2));
        kd kd2 = new kd(nn2, gk2, rt2);
        this.hD.put("info", kd2);
        this.hD.put("list", kd2);
        this.hD.put("leave", new tw(nn2, gk2, rt2));
        this.hD.put("mode", new hk(nn2, gk2, rt2));
        this.hD.put("leader", new uw(nn2, gk2, rt2));
        this.hD.put("remove", new ta(nn2, gk2, rt2));
        this.hD.put("invite", new pf(nn2, gk2, rt2));
    }

    @Override
    public void ay(@NotNull String[] stringArray) {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (stringArray.length == 0) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.base.usage", new Object[0]));
            return;
        }
        String string = stringArray[0].toLowerCase();
        xu xu2 = this.hD.get(string);
        if (xu2 == null) {
            dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.base.usage", new Object[0]));
            return;
        }
        switch (1. hE[xu2.wc().ordinal()]){
            case 1: {
                if (!this.xl()) break;
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.error.alreadyInParty", new Object[0]));
                return;
            }
            case 2: {
                if (this.xl()) break;
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.notInParty", new Object[0]));
                return;
            }
            case 3: {
                if (this.xw()) break;
                dd.ay(entityPlayerSP, new TextComponentTranslation("feather.commands.featherparty.notLeader", new Object[0]));
                return;
            }
        }
        String[] stringArray2 = new String[stringArray.length - 1];
        System.arraycopy(stringArray, 1, stringArray2, 0, stringArray2.length);
        xu2.ay(entityPlayerSP, stringArray2);
    }

    private boolean xl() {
        return this.hC.ys().T() != null;
    }

    private boolean xw() {
        vx vx2 = this.hC.ys().T();
        if (vx2 == null) {
            return false;
        }
        UUID uUID = Minecraft.getMinecraft().getSession().getProfile().getId();
        return vx2.O().equals(uUID);
    }
}
