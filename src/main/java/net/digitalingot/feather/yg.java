package net.digitalingot.feather;

import net.digitalingot.feather.fx;
import net.digitalingot.feather.jg;
import net.digitalingot.feather.mods.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class yg
implements vt<ba, fx, jg> {
    @Override
    public void ay(ba ba2, Consumer<fx> consumer, Consumer<jg> consumer2) {
        wg.INSTANCE.getScreen().ay(nArray -> {
            int[] nArray2 = Arrays.stream(nArray).mapToObj(fz::oh).mapToInt(vf::oj).toArray();
            if (Arrays.stream(nArray2).anyMatch(n -> n == 27)) {
                consumer.accept(new fx(new int[0], "None"));
                return;
            }
            km km2 = new km(nArray);
            String string = this.ay(km2.zy());
            if (string != null) {
                consumer2.accept(new jg(string));
            } else {
                consumer.accept(new fx(nArray2, km2.getName()));
            }
        });
    }

    @Nullable
    public String ay(int[] nArray) {
        String string = this.rf(nArray);
        if (string != null) {
            return string;
        }
        return this.uj(nArray);
    }

    @Nullable
    private String rf(int[] nArray) {
        for (KeyBinding keyBinding : Minecraft.getMinecraft().gameSettings.keyBindings) {
            int n = dd.ay(keyBinding);
            if (n < 0) {
                n += 100101;
            }
            int n3 = n;
            if (!Arrays.stream(nArray).allMatch(n2 -> n2 == n3)) continue;
            return new TextComponentTranslation(keyBinding.getKeyDescription(), new Object[0]).func_150260_c();
        }
        return null;
    }

    @Nullable
    private String uj(int[] nArray) {
        Map<km, String> map = this.dw();
        for (Map.Entry<km, String> entry : map.entrySet()) {
            km km2 = entry.getKey();
            String string = entry.getValue();
            if (!Arrays.equals(km2.zy(), nArray)) continue;
            return string;
        }
        return null;
    }

    @NotNull
    private Map<km, String> dw() {
        HashMap<km, String> hashMap = new HashMap<km, String>();
        ej ej2 = zz.nw().xn();
        for (Mod<?> ux2 : ej2.qq().values()) {
            if (!ux2.gc()) continue;
            Object obj = ux2.xd();
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getType() != km.class) continue;
                au au2 = field.getDeclaredAnnotation(au.class);
                km km2 = (km)field.get(obj);
                hashMap.put(km2, ux2.cs().jf().vu() + ": " + au2.vu());
            }
        }
        return hashMap;
    }
}
