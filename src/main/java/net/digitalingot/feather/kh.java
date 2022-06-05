package net.digitalingot.feather;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import net.digitalingot.feather.interfaces.em;
import net.digitalingot.feather.interfaces.lm;
import net.digitalingot.feather.interfaces.zr;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.mods.impl.General;
import net.digitalingot.feather.mods.impl.Hypixel;
import net.digitalingot.feather.tt;
import net.digitalingot.feather.wp;
import net.digitalingot.feather.yc;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class kh
        extends mn<Hypixel.ay> {
    private static final int vP = 20;
    private static final int vQ = 100;
    private static final int vR = 500;
    private static final int vS = 100;
    private static final int vT = 5;
    private final Map<UUID, wp> vU = Maps.newHashMap();
    private final List<wp> vV = Lists.newArrayList();
    private final Set<UUID> vW = new HashSet<UUID>();
    private final Map<UUID, tt> vX = Collections.synchronizedMap(new LinkedHashMap());
    private Minecraft minecraft;
    private int vY = 0;
    private zs ag;

    public kh(@NotNull Mod<Hypixel.ay> ux2) {
        super(ux2);
    }

    @Override
    public boolean jn() {
        return this.vM.xd().uS;
    }

    @Override
    public void initialize() {
        this.ag = zz.nw().xn().rf(General.class).ex().ww();
        this.minecraft = Minecraft.getMinecraft();
        lm.yg.ay(entity -> {
            if (!this.gc()) {
                return;
            }
            if (!(entity instanceof EntityPlayer)) {
                return;
            }
            if (!ck.oS()) {
                return;
            }
            UUID uUID = entity.getUniqueID();
            if (!this.vU.containsKey(uUID)) {
                wp wp2 = new wp(uUID);
                this.vU.put(uUID, wp2);
                this.vV.add(wp2);
            }
        });
        lm.ea.ay(entity -> {
            if (!this.gc()) {
                return;
            }
            if (!(entity instanceof EntityPlayer)) {
                return;
            }
            if (!ck.oS()) {
                return;
            }
            UUID uUID = entity.getUniqueID();
            wp wp2 = this.vU.remove(uUID);
            if (wp2 == null) {
                return;
            }
            this.vV.remove(wp2);
            this.vW.remove(uUID);
        });
        em.bo.ay((entity, world) -> {
            if (!this.gc()) {
                return;
            }
            if (entity != this.minecraft.player) {
                return;
            }
            this.vU.clear();
            this.vV.clear();
            this.vW.clear();
            this.bj();
        });
        sw.ti.ay(uj2 -> {
            if (!this.gc()) {
                return;
            }
            if (uj2 != sw.uj.END) {
                return;
            }
            if (!ck.oS()) {
                return;
            }
            Iterator<wp> iterator = this.vV.iterator();
            while (iterator.hasNext()) {
                wp wp2 = iterator.next();
                if (wp2.ln() <= 100) continue;
                this.vW.add(wp2.yf());
                iterator.remove();
            }
            this.vY = 0;
        });
        zr.ll.ay((entity, ay2) -> {
            if (!this.gc()) {
                return;
            }
            if (!ck.oS()) {
                return;
            }
            boolean bl = entity.isSneaking();
            if (bl) {
                return;
            }
            UUID uUID = entity.getUniqueID();
            int n = 0;
            n = ay2.ro();
            if (uUID != this.minecraft.player.func_110124_au() ? !this.vW.contains(uUID) : !this.vM.xd().uT) {
                return;
            }
            tt tt2 = this.vX.get(uUID);
            if (tt2 == null) {
                this.pv(uUID);
                return;
            }
            if (tt2 == tt.wJ) {
                return;
            }
            this.ay(tt2.dk(), n);
            ay2.iu(n - 9);
        });
    }

    private void bj() {
        if (this.vX.size() > 500) {
            Iterator<UUID> iterator = this.vX.keySet().iterator();
            for (int i = 0; i < 500 && iterator.hasNext(); ++i) {
                iterator.next();
                iterator.remove();
            }
        }
    }

    private void ay(String string, int n) {
        Hypixel.ay ay2 = this.vM.xd();
        String string2 = ay2.uW ? ay2.uX.trim() + " " : "";
        String string3 = ay2.vd ? " " + ay2.vA.trim() : "";
        String string4 = string2 + string + string3;
        int n2 = fp.mq(string4);
        fp.aI();
        int n3 = n2 / 2;
        wa wa2 = wa.Fl;
        wa2.ay(7, DefaultVertexFormats.POSITION_COLOR);
        wa2.zz(-n3 - 1, n, 0.0f).uj(0.0f, 0.0f, 0.0f, 0.25f).pe();
        wa2.zz(-n3 - 1, 9 + n, 0.0f).uj(0.0f, 0.0f, 0.0f, 0.25f).pe();
        wa2.zz(n3 + 1, 9 + n, 0.0f).uj(0.0f, 0.0f, 0.0f, 0.25f).pe();
        wa2.zz(n3 + 1, n, 0.0f).uj(0.0f, 0.0f, 0.0f, 0.25f).pe();
        wa2.ok();
        fp.aJ();
        int n4 = -n2 / 2;
        fp.aA();
        fp.mm(true);
        vr vr2 = vr.nR();
        if (ay2.uW) {
            vr2.ay(string2, (float) n4, (float) (1 + n), ay2.uY.aq(), false, ay2.uY.sc());
            n4 += fp.mq(string2);
        }
        vr2.ay(string, (float) n4, (float) (1 + n), ay2.uU.aq(), false, ay2.uU.sc());
        n4 += fp.mq(string);
        if (ay2.vd) {
            vr2.ay(string3, (float) n4, (float) (1 + n), ay2.vB.aq(), false, ay2.vB.sc());
        }
        fp.mm(false);
        fp.aB();
    }

    private void pv(UUID uUID) {
        if (this.vY >= 5) {
            return;
        }
        ++this.vY;
        this.vX.put(uUID, tt.wJ);
        ForkJoinPool.commonPool().execute(() -> {
            JsonObject jsonObject = yc.rf((UUID) uUID, (String) this.ag.yw());
            if (jsonObject == null) {
                return;
            }
            int n = jsonObject.get("networkExp").getAsInt();
            int n2 = (int) (Math.sqrt(2 * n + 30625) / 50.0 - 2.5);
            this.vX.put(uUID, new tt(String.valueOf(n2)));
        });
    }
}
