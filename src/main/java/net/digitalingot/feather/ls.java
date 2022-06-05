package net.digitalingot.feather;

import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ls
extends mn<Hypixel.ay> {
    private static final Pattern tV = Pattern.compile("\u00a7m----------------------------------------------------Friend request from (?:\\[.+] )?(?<name>[a-zA-Z0-9_]{1,16})\\[ACCEPT] - \\[DENY] - \\[IGNORE].*");
    private static final Pattern tW = Pattern.compile("You are now friends with \\[?[a-zA-Z0-9_]{1,16}(:?] )?");
    private static final Pattern tX = Pattern.compile("\\[?[a-zA-Z0-9_]{1,16}(:?] )? removed you from their friends list!");

    ls(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uF;
    }

    @Override
    public void initialize() {
        gd.bo.ay(iTextComponent -> {
            if (!this.gc()) {
                return iTextComponent;
            }
            if (!ck.oS()) {
                return iTextComponent;
            }
            String string = iTextComponent.getUnformattedText().replace("\n", "");
            Matcher matcher = tV.matcher(string);
            if (matcher.matches()) {
                String string2 = matcher.group("name");
                Minecraft.getMinecraft().player.sendChatMessage("/friend accept " + string2);
                if (!this.vM.xd().uG) {
                    return null;
                }
            }
            if (!this.vM.xd().uG && (string.equals("-----------------------------------------------------") || tW.matcher(string).matches() || tX.matcher(string).matches())) {
                return null;
            }
            return iTextComponent;
        });
    }
}
