package net.digitalingot.feather.mods.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import net.digitalingot.feather.ay;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.iv;
import net.digitalingot.feather.mixin.core.rl;
import net.digitalingot.feather.mixin.core.xn;
import net.digitalingot.feather.mods.Mod;
import net.digitalingot.feather.rf;
import net.digitalingot.feather.zi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis ignored.
 */
@sv(aw = qc.NICK_HIDER, jf = @bx(vu = "Nick Hider", jm = "https://assets.feathercdn.net/game/mods/nickhider.svg", mz = "Hide your nick and skin", lq = {}))
public class NickHider
        extends Mod<rf> {
    private static final int bB = 2;
    private static final long bC = 5000L;
    private static final int bD = 999999999;
    private static final String bE = "Player-";
    private static final String bF = "You";
    private final Map<UUID, ay> bH = Maps.newHashMap();
    private final List<ay> bI = Lists.newArrayList();
    private final zz bJ = new zz(5000L, this::rc);
    private int bG = 0;
    private int bK = Integer.MAX_VALUE;
    private GameProfile bL = null;
    private uj bM = null;
    private boolean bN;
    private boolean bO;

    private static NetHandlerPlayClient oi() {
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        return entityPlayerSP == null ? null : entityPlayerSP.connection;
    }

    private static Pattern ac(String string) {
        return Pattern.compile(string, 18);
    }

    static Pattern bz(String string) {
        return NickHider.ac(string);
    }

    @Override
    public void initialize() {
        super.initialize();
        hj.dw.ay((entityPlayer, netHandlerPlayClient) -> {
            if (this.gc()) {
                this.sx();
            }
        });
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            if (this.gc()) {
                this.bj();
            }
        });
        ve.wq.ay(gameProfile -> {
            if (this.gc()) {
                this.ay(gameProfile);
            }
        });
        ve.ub.ay(uUID -> {
            if (this.gc()) {
                this.sd(uUID);
            }
        });
        dl.bo.ay(this::pb);
        gd.bo.ay(iTextComponent -> {
            if (this.gc()) {
                this.uj(iTextComponent);
            }
            return iTextComponent;
        });
    }

    @Override
    public void au() {
        super.au();
        this.sx();
        this.jh();
    }

    @Override
    public void jl() {
        super.jl();
        this.bj();
    }

    @Override
    public void zq() {
        super.zq();
        this.jh();
        this.bO = ((rf) this.vz).bZ || ((rf) this.vz).cA || ((rf) this.vz).cB;
        this.bN = ((rf) this.vz).bV || ((rf) this.vz).bW || ((rf) this.vz).bX;
    }

    public boolean vg() {
        return this.bM.zv();
    }

    public String rg() {
        return this.bM.rg();
    }

    public ResourceLocation tm() {
        return this.bM.ue();
    }

    public ResourceLocation me() {
        return this.bM.dj();
    }

    public ResourceLocation iy() {
        return this.bM.zn();
    }

    public String ja(String string) {
        if (!this.ry()) {
            return string;
        }
        if (string == null || string.length() < this.bK) {
            return string;
        }
        return this.bJ.es(string);
    }

    private String pb(String string) {
        if (!this.ry()) {
            return string;
        }
        if (string == null) {
            return null;
        }
        for (ay ay2 : this.bI) {
            if (this.kl(ay.ay((ay) ay2))) continue;
            Pattern pattern = NickHider.ac(ay.rf((ay) ay2));
            string = pattern.matcher(string).replaceAll(ay.uj((ay) ay2));
        }
        return string;
    }

    @NotNull
    private String rc(String string) {
        String string2 = string;
        for (ay ay2 : this.bI) {
            string2 = ay.zz((ay) ay2).matcher(string2).replaceAll(ay.rf((ay) ay2));
        }
        return string2;
    }

    private boolean uj(ITextComponent iTextComponent) {
        Object object;
        boolean bl = false;
        if (iTextComponent instanceof TextComponentString) {
            object = this.ja(((TextComponentString) iTextComponent).getText());
            ((xn) iTextComponent).setText((String) object);
        } else if (iTextComponent instanceof TextComponentTranslation) {
            object = ((TextComponentTranslation) iTextComponent).getFormatArgs();
            for (int i = 0; i < ((Object) object).length; ++i) {
                String string;
                Object object2 = object[i];
                if (object2 == iTextComponent) continue;
                if (object2 instanceof ITextComponent) {
                    bl |= this.uj((ITextComponent) object2);
                    continue;
                }
                if (!(object2 instanceof String) || (string = this.ja((String) object2)) == null) continue;
                object[i] = string;
                bl = true;
            }
            if (bl) {
                ((rl) iTextComponent).setLastUpdate(-1L);
            }
        }
        for (ITextComponent iTextComponent2 : iTextComponent.getSiblings()) {
            if (iTextComponent2 == iTextComponent) continue;
            bl |= this.uj(iTextComponent2);
        }
        return bl;
    }

    @Override
    protected void ay(GameProfile gameProfile) {
        boolean bl = this.rf(gameProfile);
        if (bl) {
            this.bJ.gm();
        }
    }

    private boolean rf(GameProfile gameProfile) {
        Object object;
        if (this.ot()) {
            return false;
        }
        String string = gameProfile.getName();
        if (string == null || string.length() < 2) {
            return false;
        }
        UUID uUID = gameProfile.getId();
        boolean bl = this.kl(uUID);
        if (bl) {
            boolean bl2;
            boolean bl3 = bl2 = !gameProfile.getName().equalsIgnoreCase(string);
            if (bl2 ? !((rf) this.vz).bV : !((rf) this.vz).bW) {
                return false;
            }
        } else if (!((rf) this.vz).bX) {
            return false;
        }
        if ((object = this.bH.get(uUID)) != null) {
            if (ay.uj((ay) object).equals(string)) {
                return false;
            }
            this.bu(uUID);
        }
        object = bl ? "You" : "Player-" + this.of();
        ay ay2 = new ay(uUID, string, (String) object);
        this.bH.put(uUID, ay2);
        this.bI.add(ay2);
        int n = string.length();
        if (n < this.bK) {
            this.bK = n;
        }
        return true;
    }

    private void sd(UUID uUID) {
        boolean bl = this.bu(uUID);
        if (bl) {
            this.bJ.gm();
        }
    }

    private boolean bu(UUID uUID) {
        if (this.ot()) {
            return false;
        }
        ay ay2 = this.bH.remove(uUID);
        if (ay2 != null) {
            this.bI.remove(ay2);
            return true;
        }
        return false;
    }

    private void ma() {
        NetHandlerPlayClient netHandlerPlayClient = NickHider.oi();
        if (netHandlerPlayClient != null) {
            boolean bl = false;
            for (NetworkPlayerInfo networkPlayerInfo : netHandlerPlayClient.getPlayerInfoMap()) {
                bl |= this.rf(networkPlayerInfo.getGameProfile());
            }
            if (bl) {
                this.bJ.gm();
            }
        }
    }

    private int of() {
        int n = this.bG++;
        if (this.bG > 999999999) {
            this.bG = 0;
        }
        return n;
    }

    private void sx() {
        this.bL = Minecraft.getMinecraft().getSession().getProfile();
        this.bM = new uj(this.bL);
    }

    private void bj() {
        this.bG = 0;
        this.bH.clear();
        this.bI.clear();
        this.bJ.gm();
        this.bK = Integer.MAX_VALUE;
    }

    private void jh() {
        this.bj();
        this.ma();
    }

    private boolean ry() {
        if (!this.gc()) {
            return false;
        }
        if (this.ot()) {
            return false;
        }
        return !this.bI.isEmpty();
    }

    private boolean ot() {
        return !this.bN;
    }

    public boolean ij() {
        return !this.bO;
    }

    public boolean cp(String string) {
        return this.bL.getName().equalsIgnoreCase(string);
    }

    private boolean kl(UUID uUID) {
        return uUID.equals(this.bL.getId());
    }

    static class zz {
        private final LoadingCache<String, String> cI;

        private zz(long l, final ay ay2) {
            this.cI = CacheBuilder.newBuilder().maximumSize(l).build(new CacheLoader<String, String>() {

                @Override
                @NotNull
                public String load(@NotNull String string) {
                    return ay2.load(string);
                }
            });
        }

        public String es(String string) {
            return this.cI.getUnchecked(string);
        }

        public void gm() {
            this.cI.invalidateAll();
        }

        public interface ay {
            @NotNull String load(@NotNull String var1);
        }
    }

    static class uj {
        private final GameProfile cC;
        private boolean cD;
        private String cE;
        private ResourceLocation cF;
        private ResourceLocation cG;
        private ResourceLocation cH;

        public uj(GameProfile gameProfile) {
            this.cC = gameProfile;
        }

        public boolean zv() {
            return this.cF != null;
        }

        public String rg() {
            return this.cE;
        }

        public ResourceLocation ue() {
            this.cl();
            return this.cF;
        }

        public ResourceLocation dj() {
            this.cl();
            return this.cG;
        }

        public ResourceLocation zn() {
            this.cl();
            return this.cH;
        }

        protected void cl() {
            uj uj2 = this;
            synchronized (uj2) {
                if (!this.cD) {
                    this.cD = true;
                    SkinManager.SkinAvailableCallback skinAvailableCallback = (type, resourceLocation, minecraftProfileTexture) -> {
                        switch (1. bP[type.ordinal()]){
                            case 1: {
                                this.cF = resourceLocation;
                                this.cE = minecraftProfileTexture.getMetadata("model");
                                if (this.cE != null) break;
                                this.cE = "default";
                                break;
                            }
                            case 2: {
                                this.cG = resourceLocation;
                                break;
                            }
                            case 3: {
                                this.cH = resourceLocation;
                                break;
                            }
                        }
                    };
                    SkinManager skinManager = Minecraft.getMinecraft().getSkinManager();
                    skinManager.loadProfileTextures(this.cC, skinAvailableCallback, true);
                }
            }
        }
    }

    public static class rf
            extends zi {
        @de(vi = 0)
        public iv bU = new iv("Name Options");
        @au(wd = "hideNick", vu = "Hide Your Nick", pr = "false", yp = @de(vi = 1))
        public boolean bV;
        @au(wd = "hideOwnName", vu = "Hide Your Real Name", pr = "false", yp = @de(vi = 2))
        public boolean bW;
        @au(wd = "hideOtherNames", vu = "Hide Other Names", pr = "false", yp = @de(vi = 3))
        public boolean bX;
        @de(vi = 10)
        public iv bY = new iv("Skin Options");
        @au(wd = "hideSkin", vu = "Hide Your Skin", pr = "false", yp = @de(vi = 11))
        public boolean bZ;
        @au(wd = "showRealSkin", vu = "Show Real Skin", pr = "false", yp = @de(vi = 12))
        public boolean cA;
        @au(wd = "hideOtherSkins", vu = "Hide Other Skins", pr = "false", yp = @de(vi = 13))
        public boolean cB;
    }
}
