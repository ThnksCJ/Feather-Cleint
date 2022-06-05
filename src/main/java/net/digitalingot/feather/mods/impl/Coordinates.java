package net.digitalingot.feather.mods.impl;

import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mixin.core.nl;
import net.digitalingot.feather.mixin.core.uj;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import org.apache.commons.lang3.math.NumberUtils;

import java.awt.*;

/*
 * Illegal identifiers - recommend switching to table mode
 */
@sv(aw = qc.COORDINATES, jf = @bx(vu = "Coordinates", jm = "https://assets.feathercdn.net/game/mods/coordinates.svg", mz = "Display your location and world info", lq = {ly.ay.PVP, ly.ay.HUD}))
@pq(we = {@xd(bp = rf.class)})
public class Coordinates
        extends HUDMod<ay> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final int jT = 2;
    private static final String[] jU = new String[]{"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
    private static final String[] jV = new String[]{"", "+", "++", "+", "", "-", "--", "-"};
    private static final String[] jW = new String[]{"--", "-", "", "+", "++", "+", "", "-"};
    private static final int jX = 3;
    private static final int jY = 10;

    public static classss$ay
    extends

    zi {
        @de(vi = 0)
        public iv i = new iv("General");
        @au(wd = "orientation", vu = "Orientation", pr = "vertical", yp = @de(vi = 1))
        public ay kA;
        @au(wd = "coordinatesColor", vu = "Color", yp = @de(vi = 2))
        public gp kB;
        @au(wd = "directionDetails", vu = "Direction Details", pr = "true", yp = @de(vi = 3))
        public boolean kC;
        @au(wd = "yCoordinate", vu = "Y Coordinate", pr = "true", yp = @de(vi = 4))
        public boolean kD;
        @au(wd = "textShadow", vu = "Text Shadow", pr = "false", yp = @de(vi = 5))
        public boolean ki;
        @fl(yp = @de(vi = 10))
        @cy(dz = 1.0, ev = 28.0)
        public ci iO;
        @de(vi = 20)
        public iv kE = new iv("Background");
        @au(wd = "background", vu = "Background", pr = "true", yp = @de(vi = 21))
        public boolean bg;
        @au(wd = "backgroundColor", vu = "Color", pr = "7/7/7/146", nu = @ra(wd = "background"), yp = @de(vi = 22))
        public Color kv;
        @de(vi = 30)
        public iv kF = new iv("Biome");
        @au(wd = "biome", vu = "Biome", pr = "true", yp = @de(vi = 31))
        public boolean kG;
        @au(wd = "biomeColor", vu = "Color", nu = @ra(wd = "biome"), yp = @de(vi = 32))
        public gp kH;
        @de(vi = 40)
        public iv kI = new iv("Chunk Counter");
        @au(wd = "chunkCounter", vu = "Chunk Counter", pr = "true", yp = @de(vi = 41))
        public boolean kJ;
        @au(wd = "chunkCounterColor", vu = "Color", nu = @ra(wd = "chunkCounter"), yp = @de(vi = 42))
        public gp kK;
        @de(vi = 50)
        public iv kL = new iv("Directions");
        @au(wd = "directions", vu = "Directions", pr = "true", yp = @de(vi = 51))
        public boolean kM;
        @au(wd = "directionsColor", vu = "Color", pr = "false/0/255/255", nu = @ra(wd = "directions"), yp = @de(vi = 52))
        public gp kN;

        public static enum ay {
            HORIZONTAL,
            VERTICAL

        }
    }

    public class rf
            extends kb {
        private String kO;
        private String kP;
        private int kQ;

        @Override
        public void ay(qx qx2) {
            EntityPlayerSP entityPlayerSP = MINECRAFT.player;
            int n = MathHelper.floor((double) entityPlayerSP.field_70169_q);
            int n2 = MathHelper.floor((double) entityPlayerSP.field_70167_r);
            int n3 = MathHelper.floor((double) entityPlayerSP.field_70166_s);
            BlockPos blockPos = new BlockPos(n, n2, n3);
            Chunk chunk = MINECRAFT.world.func_175726_f(blockPos);
            BiomeProvider biomeProvider = MINECRAFT.world.func_72959_q();
            Biome biome = chunk.getBiome(new BlockPos(n & 0xF, n2, n3 & 0xF), biomeProvider);
            this.kO = biome.getBiomeName();
            this.kP = this.jz();
            this.ay(n, n2, n3, this.bu(entityPlayerSP.field_70177_z), this.kO, this.kP);
        }

        @Override
        public void ms() {
            EntityPlayerSP entityPlayerSP = MINECRAFT.player;
            if (entityPlayerSP != null) {
                this.ay(null);
            } else {
                this.kP = "C: 0 (s)";
                this.ay(100, 100, 100, 0, "Plains", "C: 0 (s)");
            }
        }

        @Override
        public int br() {
            return this.df();
        }

        @Override
        public int to() {
            return this.hu();
        }

        private void ay(int n, int n2, int n3, int n4, String string, String string2) {
            int n5;
            int n6 = 12;
            int n7 = n5 = ((ay) Coordinates.this.vz).bg ? 2 : 0;
            if (((ay) Coordinates.this.vz).bg) {
                int n8 = 0;
                int n9 = 0;
                int n10 = this.df();
                int n11 = this.hu();
                this.kw.rf(n8, n9, n10, n11, ((ay) Coordinates.this.vz).kv.getRGB());
            }
            String string3 = jU[n4];
            String string4 = jV[n4];
            String string5 = jW[n4];
            switch (1. jZ[((ay) Coordinates.this.vz).kA.ordinal()]){
                case 1: {
                    String string6 = "(" + n + ", " + (((ay) Coordinates.this.vz).kD ? n2 + ", " : "") + n3 + ")";
                    this.kw.ay(string6, (float) n5, 2.0f, ((ay) Coordinates.this.vz).kB.aq(), ((ay) Coordinates.this.vz).ki, ((ay) Coordinates.this.vz).kB.sc());
                    int n12 = this.kw.on(string6) + 3;
                    if (((ay) Coordinates.this.vz).kG) {
                        this.kw.ay(string, (float) (n5 + n12), 2.0f, ((ay) Coordinates.this.vz).kH, ((ay) Coordinates.this.vz).ki);
                        n12 += this.kw.on(string) + 3;
                    }
                    if (((ay) Coordinates.this.vz).kJ) {
                        this.kw.ay(string2, (float) (n5 + n12), 2.0f, ((ay) Coordinates.this.vz).kK, ((ay) Coordinates.this.vz).ki);
                        n12 += this.kw.on(string2) + 3;
                    }
                    if (((ay) Coordinates.this.vz).kC) {
                        this.kw.ay(string4, (float) (n5 + n12), -1.0f, ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        this.kw.ay(string5, (float) (n5 + n12), 5.0f, ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        n12 += this.kw.on("++");
                    }
                    if (((ay) Coordinates.this.vz).kM) {
                        this.kw.ay(string3, (float) (n5 + n12), 2.0f, ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        n12 += this.kw.on("NW");
                    }
                    this.kQ = n12;
                    break;
                }
                case 2: {
                    String string7 = "X " + n;
                    String string8 = ((ay) Coordinates.this.vz).kD ? "Y " + n2 : "";
                    String string9 = "Z " + n3;
                    int n13 = NumberUtils.max(new int[]{this.kw.on(string7), this.kw.on(string8), this.kw.on(string9)});
                    this.kw.ay(string7, (float) n5, 2.0f, ((ay) Coordinates.this.vz).kB, ((ay) Coordinates.this.vz).ki);
                    if (((ay) Coordinates.this.vz).kD) {
                        this.kw.ay(string8, (float) n5, (float) (n6 + 2), ((ay) Coordinates.this.vz).kB, ((ay) Coordinates.this.vz).ki);
                    }
                    if (((ay) Coordinates.this.vz).kM) {
                        if (((ay) Coordinates.this.vz).kC && !((ay) Coordinates.this.vz).kD) {
                            this.kw.ay(string3, (float) (n5 + n13 + 10 + 15), (float) n6 / 2.0f + 2.0f, ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        } else {
                            this.kw.ay(string3, (float) (n5 + n13 + 10), (float) (n6 + 2), ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        }
                    }
                    if (((ay) Coordinates.this.vz).kC) {
                        this.kw.ay(string4, (float) (n5 + n13 + 10), 2.0f, ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                        this.kw.ay(string5, (float) (n5 + n13 + 10), (float) ((((ay) Coordinates.this.vz).kD ? 2 : 1) * n6 + 2), ((ay) Coordinates.this.vz).kN, ((ay) Coordinates.this.vz).ki);
                    }
                    this.kw.ay(string9, (float) n5, (float) ((((ay) Coordinates.this.vz).kD ? 2 : 1) * n6 + 2), ((ay) Coordinates.this.vz).kB, ((ay) Coordinates.this.vz).ki);
                    if (((ay) Coordinates.this.vz).kG) {
                        this.kw.ay(string, (float) n5, (float) ((((ay) Coordinates.this.vz).kD ? 3 : 2) * n6 + 2), ((ay) Coordinates.this.vz).kH, ((ay) Coordinates.this.vz).ki);
                    }
                    if (!((ay) Coordinates.this.vz).kJ) break;
                    int n14 = 0;
                    if (((ay) Coordinates.this.vz).kD) {
                        ++n14;
                    }
                    if (((ay) Coordinates.this.vz).kG) {
                        ++n14;
                    }
                    this.kw.ay(string2, (float) n5, (float) ((2 + n14) * n6 + 2), ((ay) Coordinates.this.vz).kK, ((ay) Coordinates.this.vz).ki);
                }
            }
        }

        @Override
        public int df() {
            int n;
            if (((ay) Coordinates.this.vz).kA == ay.ay.VERTICAL) {
                int n2 = this.kw.on("X -17777");
                int n3 = ((ay) Coordinates.this.vz).kJ ? this.kw.on(this.kP) : 0;
                int n4 = ((ay) Coordinates.this.vz).kG ? this.kw.on(this.kO) : 0;
                n = NumberUtils.max(new int[]{n2 += ((ay) Coordinates.this.vz).kM ? 10 + this.kw.on("NW") : 0, n3, n4});
            } else {
                n = this.kQ;
            }
            return ((ay) Coordinates.this.vz).bg ? 4 + n : n;
        }

        @Override
        public int hu() {
            if (((ay) Coordinates.this.vz).kA == ay.ay.HORIZONTAL) {
                return 14;
            }
            return (2 + (((ay) Coordinates.this.vz).kG ? 1 : 0) + (((ay) Coordinates.this.vz).kD ? 1 : 0) + (((ay) Coordinates.this.vz).kJ ? 1 : 0)) * 12 + 2;
        }

        private int bu(float f) {
            double d = (double) MathHelper.wrapDegrees(f) + 180.0;
            d += 22.5;
            d %= 360.0;
            return MathHelper.floor(d /= 45.0);
        }

        private String jz() {
            int n = ((nl) MINECRAFT.renderGlobal).getViewFrustum().renderChunks.length;
            int n2 = 0;
            for (Object object : ((nl) MINECRAFT.renderGlobal).getRenderInfos()) {
                uj uj2 = (uj) object;
                CompiledChunk compiledChunk = CompiledChunk.DUMMY;
                CompiledChunk compiledChunk2 = uj2.getRenderChunk().compiledChunk;
                boolean bl = compiledChunk2.isEmpty();
                if (compiledChunk2 == compiledChunk || bl) continue;
                ++n2;
            }
            return String.format("C %d/%d %s", n2, n, MINECRAFT.renderChunksMany ? "(s)" : "");
        }

        @Override
        public ci te() {
            return ((ay) Coordinates.this.vz).iO;
        }
    }
}
