package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.bs;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class tv
        implements bs<Color> {
    @NotNull
    public Color sd(@NotNull String string, @NotNull Class<? extends Color> clazz) {
        String[] stringArray = string.split("/");
        if (stringArray.length != 3 && stringArray.length != 4) {
            throw new lu("Color input doesn't contain 3 or 4 parts");
        }
        int n = Integer.parseInt(stringArray[0]);
        int n2 = Integer.parseInt(stringArray[1]);
        int n3 = Integer.parseInt(stringArray[2]);
        if (stringArray.length == 3) {
            return new Color(n, n2, n3);
        }
        int n4 = Integer.parseInt(stringArray[3]);
        return new Color(n, n2, n3, n4);
    }

    @NotNull
    public String zz(@NotNull Color color) {
        return color.getRed() + "/" + color.getGreen() + "/" + color.getBlue() + "/" + color.getAlpha();
    }

    @Override
    @NotNull
    public String kl(@NotNull Object object) {
        return this.zz((Color) object);
    }

    @Override
    @NotNull
    public Object rf(@NotNull String string, @NotNull Class clazz) {
        return this.sd(string, clazz);
    }
}
