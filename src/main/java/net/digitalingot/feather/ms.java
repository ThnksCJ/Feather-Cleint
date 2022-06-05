package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class ms
implements bs<gp> {
    @NotNull
    private final iq ip = new iq();
    @NotNull
    private final tv ur = new tv();

    @NotNull
    public gp zz(@NotNull String string, @NotNull Class<? extends gp> clazz) {
        String[] stringArray = string.split("/", 2);
        if (stringArray.length != 2) {
            throw new lu("ChromaColor input does not contain a minimum of two /");
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        boolean bl = this.ip.uj(string2, Boolean.class);
        Color color = this.ur.sd(string3, Color.class);
        return new gp(bl, color);
    }

    @NotNull
    public String ay(@NotNull gp gp2) {
        return gp2.sc() + "/" + this.ur.zz(gp2.pg());
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.ay((gp)object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.zz(string, clazz);
    }
}
