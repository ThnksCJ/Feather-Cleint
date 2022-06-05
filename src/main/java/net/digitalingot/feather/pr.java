package net.digitalingot.feather;

import net.digitalingot.feather.interfaces.an;
import net.digitalingot.feather.interfaces.nb;
import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.feather.mods.impl.Voice;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class pr {
    @NotNull
    private static final an<Voice> gM = ej.ay(Voice.class);
    private static final ResourceLocation gN = new ResourceLocation("feather:textures/gui/feather_logo.png");
    private static final int gO = 322;
    private static final int gP = 97;
    private static final ResourceLocation gQ = new ResourceLocation("feather:textures/gui/feather_icon.png");
    private static final int gR = 173;
    private static final int gS = 257;
    private static final ResourceLocation gT = new ResourceLocation("feather:textures/gui/voice_icon.png");
    private static final int gU = 512;
    private static final int gV = 512;
    @NotNull
    private final General eN;

    public pr(@NotNull General rh2) {
        this.eN = rh2;
        nb.eq.ay(guiScreen -> {
            if (guiScreen instanceof ok || guiScreen instanceof ov) {
                return;
            }
            if (guiScreen instanceof GuiIngameMenu) {
                return;
            }
            if (!guiScreen.getClass().getName().startsWith("net.minecraft")) {
                return;
            }
            boolean bl = guiScreen instanceof GuiChat;
            if (!bl) {
                this.xn(guiScreen.width, guiScreen.height);
            }
        });
    }

    @Nullable
    protected Integer zs(UUID uUID) {
        if (this.eN.qy() == null) {
            return null;
        }
        pk.ay.uj.rf.uj uj2 = this.eN.qy(). if ().bD().get(uUID);
        if (uj2 != null && uj2.bY()) {
            switch (1. gW[uj2.cE().cG().ordinal()]){
                case 1: {
                    return -65531;
                }
                case 2: {
                    return -16747009;
                }
                case 3: {
                    return -1628828;
                }
                case 4: {
                    return -459710;
                }
                case 5: {
                    return -10496;
                }
                case 6: {
                    return -13445665;
                }
            }
            return -1;
        }
        return null;
    }

    public int ay(UUID uUID, int n, int n2) {
        Integer n3 = this.zs(uUID);
        if (n3 != null) {
            fp.ay(0, gQ);
            vr.nR().ay(n, n2, 0.0f, 0.0f, 173, 257, 6, 8, 173.0f, 257.0f, n3);
            return 9;
        }
        return 0;
    }

    public void ay(Entity entity, int n, int n2) {
        UUID uUID = entity.getUniqueID();
        Integer n3 = this.zs(uUID);
        if (n3 != null) {
            fp.mm(true);
            fp.aA();
            fp.aJ();
            Voice zv2 = gM.nt();
            if (zv2.gc() && zv2.uo() != null && zv2.uo().rl(uUID)) {
                fp.ay(0, gT);
                vr.nR().ay(n + 1 - 2, n2 - 1, 0.0f, 0.0f, 512, 512, 10, 10, 512.0f, 512.0f, n3);
            }
            n = -n;
            fp.ay(0, gQ);
            vr.nR().ay(n + 1, n2, 0.0f, 0.0f, 173, 257, 5, 7, 173.0f, 257.0f, entity.isSneaking() ? n3 & 0xFFFFFF | 0x64000000 : n3);
            fp.mm(false);
            fp.aB();
            fp.aI();
        }
    }

    public void xn(int n, int n2) {
        int n3 = 80;
        int n4 = 24;
        fp.Z();
        fp.aB();
        fp.aF();
        fp.X();
        fp.ay(0, gN);
        vr.nR().ay(n - 80 - 5, n2 - 24 - 5, 0.0f, 0.0f, 322, 257, 80, 24, 322.0f, 257.0f, -1);
        fp.Y();
        fp.aA();
        fp.W();
    }
}
