package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class qo {
    private static final List<ay> ij = new ArrayList<ay>();

    public static void initialize() {
        lv.vs.ay((n, n2, n3, n4) -> qo.nn(n, n3));
        lv.zl.ay((n, n2, n3) -> qo.nn(n + 100001, n2));
        gv.eq.ay(guiScreen -> qo.at());
    }

    public static void ay(@NotNull Supplier<km> supplier, @Nullable rf rf2, @Nullable rf rf3) {
        ij.add(new ay(supplier, rf2, rf3));
    }

    private static void nn(int n, int n3) {
        if (Minecraft.getMinecraft().currentScreen != null) {
            return;
        }
        for (ay ay2 : ij) {
            km km2 = ay2.jg().get();
            if (km2.zy().length == 0 || Arrays.stream(km2.zy()).noneMatch(n2 -> n2 == n)) continue;
            boolean bl = km2.xj();
            if (n3 == 1 && bl && !ay2.isPressed()) {
                ay2.kl(true);
                if (ay2.fc() == null) continue;
                ay2.fc().onInteract();
                continue;
            }
            if (bl || !ay2.isPressed()) continue;
            ay2.kl(false);
            if (ay2.po() == null) continue;
            ay2.po().onInteract();
        }
    }

    private static void at() {
        for (ay ay2 : ij) {
            if (!ay2.isPressed()) continue;
            if (ay2.po() != null) {
                ay2.po().onInteract();
            }
            ay2.kl(false);
        }
    }

    static final class ay {
        @NotNull
        private final Supplier<km> oi;
        @Nullable
        private final rf zv;
        @Nullable
        private final rf ue;
        private boolean dj;

        private ay(@NotNull Supplier<km> supplier, @Nullable rf rf2, @Nullable rf rf3) {
            this.oi = supplier;
            this.zv = rf2;
            this.ue = rf3;
        }

        @NotNull
        public Supplier<km> jg() {
            return this.oi;
        }

        @Nullable
        public rf fc() {
            return this.zv;
        }

        @Nullable
        public rf po() {
            return this.ue;
        }

        public boolean isPressed() {
            return this.dj;
        }

        public void kl(boolean bl) {
            this.dj = bl;
        }
    }

    public interface rf {
        void onInteract();
    }
}
