package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class tw
        extends xu {
    public tw(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.IN_PARTY);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        this.hC.ys().rf(null);
        this.hG.lx().bL();
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.leave.success");
        dd.ay(entityPlayerSP, textComponentTranslation);
        this.hC.uj(System.currentTimeMillis());
    }
}
