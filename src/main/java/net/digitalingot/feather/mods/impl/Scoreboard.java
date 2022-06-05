package net.digitalingot.feather.mods.impl;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.IScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@sv(aw= qc.SCOREBOARD, jf=@bx(vu="Scoreboard", jm="https://assets.feathercdn.net/game/mods/scoreboard.svg", mz="Customize scoreboard", lq={ly.ay.HUD}))
@pq(we={@xd(bp= ay.class)})
public class Scoreboard
extends HUDMod<uj> {
    private static final String rK = "\u00a7eFeather";
    private static final int rL = 5;
    private static final int rM = 15;
    private static final ScoreObjective rN = Scoreboard.mp();
    private static final String rO = "    ";
    private static final int rP = 9;
    private static final String rQ = "#";
    private static final String rR = ": ";
    private rf rS = null;
    private rf rT = null;
    private boolean rU = false;

    @Override
    public void ay(@NotNull uj uj2) {
        super.ay(uj2);
        this.xk();
    }

    private void xk() {
        this.rS = this.ay(rN);
    }

    @Override
    public void initialize() {
        hj.ii.ay((entityPlayer, netHandlerPlayClient) -> {
            this.rT = null;
        });
    }

    @Override
    public void zq() {
        this.rS = this.ay(rN);
        this.rU = true;
    }

    @NotNull
    private rf lk() {
        return this.rT != null ? this.rT : this.rS;
    }

    private rf ay(@NotNull ScoreObjective scoreObjective) {
        Object object;
        Object object2;
        int n;
        List<Score> list = Scoreboard.rf(scoreObjective);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList<AbstractMap.SimpleEntry<Score, String>> arrayList = new ArrayList<AbstractMap.SimpleEntry<Score, String>>(list.size());
        int n2 = n = fp.mq(scoreObjective.getDisplayName());
        int n3 = fp.mq(rR);
        for (Score score : list) {
            object2 = score.getPlayerName();
            ScorePlayerTeam scorePlayerTeam = scoreObjective.getScoreboard().getPlayersTeam((String)object2);
            object = ScorePlayerTeam.formatPlayerName(scorePlayerTeam, (String)object2);
            arrayList.add(new AbstractMap.SimpleEntry<Score, String>(score, (String)object));
            int n4 = fp.mq((String)object);
            if (((uj)this.vz).sB) {
                n4 += n3;
                n4 += fp.mq(String.valueOf(score.getScorePoints()));
            }
            if (n4 <= n2) continue;
            n2 = n4;
        }
        int n5 = (list.size() + 1) * 9 + 1;
        int n6 = n2 + 4;
        object2 = new rf();
        ((rf)object2).wl = n6;
        ((rf)object2).fg = n5;
        ((rf)object2).rW = scoreObjective.getDisplayName();
        ((rf)object2).rX = (float)n6 / 2.0f - (float)n / 2.0f;
        ((rf)object2).rY = new ArrayList(list.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            object = arrayList.get(i);
            rf.ay ay2 = new rf.ay();
            ay2.qv = (String)object.getValue();
            ay2.eg = n5 - (i + 1) * 9;
            if (((uj)this.vz).sB) {
                ay2.rZ = nz.RED.toString() + ((Score)object.getKey()).getScorePoints();
                ay2.se = n6 - fp.mq(ay2.rZ);
            }
            ((rf)object2).rY.add(ay2);
        }
        return object2;
    }

    private static List<Score> rf(@NotNull ScoreObjective scoreObjective) {
        Collection collection = scoreObjective.getScoreboard().getSortedScores(scoreObjective);
        List<Score> list = collection.stream().filter(score -> score.getPlayerName() != null && !score.getPlayerName().startsWith(rQ)).collect(Collectors.toList());
        if (list.size() > 15) {
            return Lists.newArrayList(Iterables.skip(list, collection.size() - 15));
        }
        return list;
    }

    private static ScoreObjective wf() {
        int n;
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.player == null) {
            return null;
        }
        String string = minecraft.player.func_70005_c_();
        net.minecraft.scoreboard.Scoreboard scoreboard = minecraft.world.func_96441_U();
        ScorePlayerTeam scorePlayerTeam = scoreboard.getPlayersTeam(string);
        ScoreObjective scoreObjective = null;
        if (scorePlayerTeam != null && (n = scorePlayerTeam.getColor().getColorIndex()) >= 0) {
            scoreObjective = scoreboard.getObjectiveInDisplaySlot(3 + n);
        }
        return scoreObjective != null ? scoreObjective : scoreboard.getObjectiveInDisplaySlot(1);
    }

    private static ScoreObjective mp() {
        net.minecraft.scoreboard.Scoreboard scoreboard = new net.minecraft.scoreboard.Scoreboard();
        ScoreObjective scoreObjective = scoreboard.addScoreObjective("dummy", IScoreCriteria.DUMMY);
        scoreObjective.setDisplayName(rK);
        StringBuilder stringBuilder = new StringBuilder(rO);
        for (int i = 5; i > 0; --i) {
            scoreboard.getOrCreateScore(stringBuilder.toString(), scoreObjective).setScorePoints(i);
            stringBuilder.append(' ');
        }
        return scoreObjective;
    }

    public void dt() {
        this.rU = true;
    }

    static class rf {
        private int wl;
        private int fg;
        private String rW;
        private float rX;
        private List<ay> rY;

        private rf() {
        }

        static class ay {
            private String qv;
            private float eg;
            private String rZ;
            private float se;

            private ay() {
            }
        }
    }

    @rm(wm=true)
    public static class uj
    extends zi {
        @fl(yp=@de(vi=0))
        @cy(yv= ho.CENTER_RIGHT, dz=-1.0, ev=-0.5)
        public ci iO;
        @de(vi=10)
        public iv sA = new iv("Scoreboard");
        @au(wd="showNumbers", vu="Show Numbers", yp=@de(vi=11))
        public boolean sB;
        @de(vi=20)
        public iv lB = new iv("Colors");
        @au(wd="textColor", vu="Text Color", pr="false/255/255/255", yp=@de(vi=21))
        public gp sa;
        @au(wd="textShadow", vu="Text Shadow", pr="false", yp=@de(vi=22))
        public boolean ki;
        @au(wd="backgroundColor", vu="Background", pr="0/0/0/80", yp=@de(vi=23))
        public Color kv;
        @au(wd="titleBackgroundColor", vu="Title Background", pr="0/0/0/96", yp=@de(vi=24))
        public Color sC;
    }

    public class ay
    extends kb {
        public void ul() {
            if (!Scoreboard.this.gc() || Minecraft.getMinecraft().currentScreen instanceof ov) {
                return;
            }
            float f = (float)this.te().yx();
            GL11.glPushMatrix();
            GL11.glTranslated(this.hh(), this.ix(), 0.0);
            GL11.glScalef(f, f, 1.0f);
            this.vo();
            GL11.glPopMatrix();
        }

        @Override
        public void ay(qx qx2) {
            if (qx2 == qx.MOD_LAYOUT) {
                this.ay(Scoreboard.this.lk());
            }
        }

        @Override
        public void ms() {
            this.ay(Scoreboard.this.lk());
        }

        @Override
        public int df() {
            return Scoreboard.this.lk().wl;
        }

        @Override
        public int hu() {
            return Scoreboard.this.lk().fg;
        }

        private void vo() {
            if (Scoreboard.this.rU) {
                ScoreObjective scoreObjective = Scoreboard.wf();
                Scoreboard.this.rT = scoreObjective != null ? Scoreboard.this.ay(Scoreboard.wf()) : null;
                Scoreboard.this.rU = false;
            }
            if (Scoreboard.this.rT != null) {
                this.ay(Scoreboard.this.lk());
            }
        }

        private void ay(rf rf2) {
            int n = ((uj) Scoreboard.this.vz).sa.aq();
            this.kw.rf(0, 0, rf2.wl, 9, ((uj) Scoreboard.this.vz).sC.getRGB());
            this.kw.rf(0, 9, rf2.wl, rf2.fg, ((uj) Scoreboard.this.vz).kv.getRGB());
            for (rf.ay ay2 : rf2.rY) {
                this.kw.ay(ay2.qv, 2.0f, ay2.eg, n, ((uj) Scoreboard.this.vz).ki);
                if (!((uj) Scoreboard.this.vz).sB) continue;
                this.kw.ay(ay2.rZ, ay2.se, ay2.eg, n, ((uj) Scoreboard.this.vz).ki);
            }
            this.kw.ay(rf2.rW, rf2.rX, 1.0f, n, ((uj) Scoreboard.this.vz).ki);
        }

        @Override
        public ci te() {
            return ((uj) Scoreboard.this.vz).iO;
        }
    }
}
