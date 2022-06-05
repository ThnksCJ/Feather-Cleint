package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.ny;
import net.digitalingot.feather.lr;
import net.digitalingot.feather.vx;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class is
        implements ny {
    @NotNull
    private final nn xs;
    @NotNull
    private final rt hC;

    public is(@NotNull nn nn2, @NotNull rt rt2) {
        this.xs = nn2;
        this.hC = rt2;
    }

    @Override
    public void ay(vx vx2) {
    }

    @Override
    public void ay(lr lr2) {
        String string = this.xs.ay(lr2.V());
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.receivedInvite", string);
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP != null) {
            dd.ay(entityPlayerSP, textComponentTranslation);
        }
    }

    @Override
    public void nl(UUID uUID) {
        String string = this.xs.ay(uUID);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.inviteDenied", string);
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP != null) {
            dd.ay(entityPlayerSP, textComponentTranslation);
        }
    }

    @Override
    public void fq() {
        if (!this.hC.gy()) {
            return;
        }
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.kicked");
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP != null) {
            dd.ay(entityPlayerSP, textComponentTranslation);
        }
    }
}
