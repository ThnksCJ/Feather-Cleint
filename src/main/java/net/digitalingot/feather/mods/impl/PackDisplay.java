package net.digitalingot.feather.mods.impl;

import com.google.common.collect.Iterables;
import net.digitalingot.feather.*;
import net.digitalingot.feather.enums.ho;
import net.digitalingot.feather.enums.qc;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.interfaces.*;
import net.digitalingot.feather.mods.HUDMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.ResourcePackRepository;

import java.awt.*;
import java.util.List;

@sv(aw = qc.PACK_DISPLAY, jf = @bx(vu = "Pack Display", jm = "https://assets.feathercdn.net/game/mods/packdisplay.svg", mz = "Displays your current texture pack", lq = {ly.ay.HUD}))
@pq(we = {@xd(bp = ay.class)})
public class PackDisplay
        extends HUDMod<rf> {
    private static final Minecraft MINECRAFT = Minecraft.getMinecraft();
    private static final int pV = 22;

    public static class rf
            extends zi {
        @fl(yp = @de(vi = 0))
        @cy(yv = ho.TOP_RIGHT, dz = 1.0, ev = 15.0)
        public fw jQ;
        @de(vi = 10)
        public iv cq = new iv("General Style");
        @au(wd = "showIcon", vu = "Show Icon", pr = "true", yp = @de(vi = 11))
        public boolean pY;
        @au(wd = "showBackground", vu = "Show Background", pr = "true", yp = @de(vi = 12))
        public boolean pZ;
        @au(wd = "backgroundColor", vu = "Background Color", pr = "0/0/0/100", nu = @ra(wd = "showBackground"), yp = @de(vi = 13))
        public Color kv;
        @de(vi = 20)
        public iv qz = new iv("Title Style");
        @au(wd = "titleColor", vu = "Text Color", pr = "false/255/255/255/255", yp = @de(vi = 21))
        public gp qA;
        @au(wd = "titleShadow", vu = "Text Shadow", pr = "true", yp = @de(vi = 22))
        public boolean qB;
        @de(vi = 30)
        public iv qC = new iv("Description Style");
        @au(wd = "showDescription", vu = "Show Description", pr = "true", yp = @de(vi = 31))
        public boolean qD;
        @au(wd = "descriptionColor", vu = "Text Color", pr = "128/128/128", nu = @ra(wd = "showDescription"), yp = @de(vi = 32))
        public Color qE;
        @au(wd = "descriptionShadow", vu = "Text Shadow", pr = "true", nu = @ra(wd = "showDescription"), yp = @de(vi = 33))
        public boolean qF;
    }

    public class ay
            extends kb {
        private final ln pW = new ln();

        @Override
        public void ay(qx qx2) {
            switch (1.ef[qx2.ordinal()]) {
                case 1: {
                    this.ky();
                    break;
                }
                case 2: {
                    this.ad();
                }
            }
        }

        private void ad() {
            List list = MINECRAFT.getResourcePackRepository().getRepositoryEntries();
            if (list.size() == 0) {
                return;
            }
            ResourcePackRepository.Entry entry = (ResourcePackRepository.Entry) Iterables.getLast(list);
            boolean bl = ((rf) PackDisplay.this.vz).pY;
            boolean bl2 = ((rf) PackDisplay.this.vz).qD;
            if (((rf) PackDisplay.this.vz).pZ) {
                this.kw.rf(0, 0, this.df(), this.hu(), ((rf) PackDisplay.this.vz).kv.getRGB());
            }
            if (bl) {
                this.pW.ay(entry);
                this.pW.ay(this.kw, 0, 0, 22);
            }
            int n = bl ? 22 : 0;
            this.pW.ay(this.kw, entry, (float) (n + 2), bl2 ? 1.0f : (float) this.hu() / 2.0f - (float) MINECRAFT.fontRenderer.FONT_HEIGHT / 2.0f, ((rf) PackDisplay.this.vz).qA, ((rf) PackDisplay.this.vz).qB);
            if (bl2) {
                this.pW.ay(this.kw, entry, (float) (n + 2), 12.0f, ((rf) PackDisplay.this.vz).qE.getRGB(), ((rf) PackDisplay.this.vz).qF);
            }
        }

        private void ky() {
            boolean bl = ((rf) PackDisplay.this.vz).pY;
            boolean bl2 = ((rf) PackDisplay.this.vz).qD;
            if (((rf) PackDisplay.this.vz).pZ) {
                this.kw.rf(0, 0, this.df(), this.hu(), ((rf) PackDisplay.this.vz).kv.getRGB());
            }
            if (bl) {
                this.pW.py();
                this.pW.ay(this.kw, 0, 0, 22);
            }
            int n = bl ? 22 : 0;
            this.kw.ay("Feather", (float) (n + 2), bl2 ? 1.0f : (float) this.hu() / 2.0f - (float) MINECRAFT.fontRenderer.FONT_HEIGHT / 2.0f, ((rf) PackDisplay.this.vz).qA, ((rf) PackDisplay.this.vz).qB);
            if (bl2) {
                this.kw.ay("Pack Display", (float) (n + 2), 12.0f, ((rf) PackDisplay.this.vz).qE.getRGB(), ((rf) PackDisplay.this.vz).qF, false);
            }
        }

        @Override
        public int df() {
            return 157 + (((rf) PackDisplay.this.vz).pY ? 22 : 0);
        }

        @Override
        public int hu() {
            return 22;
        }

        @Override
        public ci te() {
            return ((rf) PackDisplay.this.vz).jQ;
        }
    }
}
