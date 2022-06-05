package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

public class fi
implements cj {
    @Override
    public void hs(@NotNull String string) {
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation(string);
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP != null) {
            dd.ay(entityPlayerSP, textComponentTranslation);
        }
    }
}
