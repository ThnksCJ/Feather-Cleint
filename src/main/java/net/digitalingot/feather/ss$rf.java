package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mixin.core.nl;
import net.digitalingot.feather.mixin.core.uj;
import net.digitalingot.feather.mods.impl.Coordinates;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import org.apache.commons.lang3.math.NumberUtils;

public class ss$rf
extends kb {
    private String kO;
    private String kP;
    private int kQ;

    @Override
    public void ay(qx qx2) {
        EntityPlayerSP entityPlayerSP = MINECRAFT.player;
        int n = MathHelper.floor((double)entityPlayerSP.field_70169_q);
        int n2 = MathHelper.floor((double)entityPlayerSP.field_70167_r);
        int n3 = MathHelper.floor((double)entityPlayerSP.field_70166_s);
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
        int n7 = n5 = ((Coordinates.ay)((Coordinates) Coordinates.this).vz).bg ? 2 : 0;
        if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).bg) {
            int n8 = 0;
            int n9 = 0;
            int n10 = this.df();
            int n11 = this.hu();
            this.kw.rf(n8, n9, n10, n11, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kv.getRGB());
        }
        String string3 = jU[n4];
        String string4 = jV[n4];
        String string5 = jW[n4];
        switch (Coordinates .1.jZ[((Coordinates.ay)((Coordinates) Coordinates.this).vz).kA.ordinal()]) {
            case 1: {
                String string6 = "(" + n + ", " + (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? n2 + ", " : "") + n3 + ")";
                this.kw.ay(string6, (float)n5, 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kB.aq(), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kB.sc());
                int n12 = this.kw.on(string6) + 3;
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kG) {
                    this.kw.ay(string, (float)(n5 + n12), 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kH, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    n12 += this.kw.on(string) + 3;
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kJ) {
                    this.kw.ay(string2, (float)(n5 + n12), 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kK, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    n12 += this.kw.on(string2) + 3;
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kC) {
                    this.kw.ay(string4, (float)(n5 + n12), -1.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    this.kw.ay(string5, (float)(n5 + n12), 5.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    n12 += this.kw.on("++");
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kM) {
                    this.kw.ay(string3, (float)(n5 + n12), 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    n12 += this.kw.on("NW");
                }
                this.kQ = n12;
                break;
            }
            case 2: {
                String string7 = "X " + n;
                String string8 = ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? "Y " + n2 : "";
                String string9 = "Z " + n3;
                int n13 = NumberUtils.max(new int[]{this.kw.on(string7), this.kw.on(string8), this.kw.on(string9)});
                this.kw.ay(string7, (float)n5, 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kB, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD) {
                    this.kw.ay(string8, (float)n5, (float)(n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kB, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kM) {
                    if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kC && !((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD) {
                        this.kw.ay(string3, (float)(n5 + n13 + 10 + 15), (float)n6 / 2.0f + 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    } else {
                        this.kw.ay(string3, (float)(n5 + n13 + 10), (float)(n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    }
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kC) {
                    this.kw.ay(string4, (float)(n5 + n13 + 10), 2.0f, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                    this.kw.ay(string5, (float)(n5 + n13 + 10), (float)((((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? 2 : 1) * n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kN, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                }
                this.kw.ay(string9, (float)n5, (float)((((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? 2 : 1) * n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kB, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kG) {
                    this.kw.ay(string, (float)n5, (float)((((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? 3 : 2) * n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kH, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
                }
                if (!((Coordinates.ay)((Coordinates) Coordinates.this).vz).kJ) break;
                int n14 = 0;
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD) {
                    ++n14;
                }
                if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kG) {
                    ++n14;
                }
                this.kw.ay(string2, (float)n5, (float)((2 + n14) * n6 + 2), ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kK, ((Coordinates.ay)((Coordinates) Coordinates.this).vz).ki);
            }
        }
    }

    @Override
    public int df() {
        int n;
        if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kA == Coordinates.ay.ay.VERTICAL) {
            int n2 = this.kw.on("X -17777");
            int n3 = ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kJ ? this.kw.on(this.kP) : 0;
            int n4 = ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kG ? this.kw.on(this.kO) : 0;
            n = NumberUtils.max(new int[]{n2 += ((Coordinates.ay)((Coordinates) Coordinates.this).vz).kM ? 10 + this.kw.on("NW") : 0, n3, n4});
        } else {
            n = this.kQ;
        }
        return ((Coordinates.ay)((Coordinates) Coordinates.this).vz).bg ? 4 + n : n;
    }

    @Override
    public int hu() {
        if (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kA == Coordinates.ay.ay.HORIZONTAL) {
            return 14;
        }
        return (2 + (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kG ? 1 : 0) + (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kD ? 1 : 0) + (((Coordinates.ay)((Coordinates) Coordinates.this).vz).kJ ? 1 : 0)) * 12 + 2;
    }

    private int bu(float f) {
        double d = (double)MathHelper.wrapDegrees(f) + 180.0;
        d += 22.5;
        d %= 360.0;
        return MathHelper.floor(d /= 45.0);
    }

    private String jz() {
        int n = ((nl)MINECRAFT.renderGlobal).getViewFrustum().renderChunks.length;
        int n2 = 0;
        for (Object object : ((nl)MINECRAFT.renderGlobal).getRenderInfos()) {
            uj uj2 = (uj)object;
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
        return ((Coordinates.ay)((Coordinates) Coordinates.this).vz).iO;
    }
}
