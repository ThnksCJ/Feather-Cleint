package net.digitalingot.feather;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class su
        extends xu {
    private long hF = -1L;

    public su(@NotNull nn nn2, @NotNull gk gk2, @NotNull rt rt2) {
        super(nn2, rt2, gk2, xu.ay.NOT_IN_PARTY);
    }

    @Override
    public void ay(EntityPlayerSP entityPlayerSP, String[] stringArray) {
        if (System.currentTimeMillis() - this.hF < TimeUnit.SECONDS.toMillis(3L)) {
            return;
        }
        this.hF = System.currentTimeMillis();
        this.hG.lx().bK();
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation("feather.commands.featherparty.create.success");
        dd.ay(entityPlayerSP, textComponentTranslation);
    }
}
