package net.digitalingot.feather;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class sw {
    public static gb<ay> ti = yd.ay(ay.class, (T[] ayArray) -> uj2 -> {
        for (ay ay2 : ayArray) {
            ay2.tick(uj2);
        }
    });
    public static gb<rf> dd = yd.ay(rf.class, (T[] rfArray) -> (uj2, world) -> {
        for (rf rf2 : rfArray) {
            rf2.tick(uj2, world);
        }
    });
    public static gb<zz> gn = yd.ay(zz.class, (T[] zzArray) -> (uj2, entityPlayer) -> {
        for (zz zz2 : zzArray) {
            zz2.tick(uj2, entityPlayer);
        }
    });
    public static gb<sd> sq = yd.ay(sd.class, (T[] sdArray) -> (uj2, f) -> {
        for (sd sd2 : sdArray) {
            sd2.tick(uj2, f);
        }
    });

    public interface sd {
        void tick(@NotNull uj var1, float var2);
    }

    public enum uj {
        START,
        END

    }

    public interface zz {
        void tick(@NotNull uj var1, @NotNull EntityPlayer var2);
    }

    public interface rf {
        void tick(@NotNull uj var1, @NotNull World var2);
    }

    public interface ay {
        void tick(@NotNull uj var1);
    }
}
