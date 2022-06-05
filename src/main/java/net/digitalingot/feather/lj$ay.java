package net.digitalingot.feather;

import com.google.common.collect.Iterables;
import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.PackDisplay;
import net.minecraft.client.resources.ResourcePackRepository;

import java.util.List;

public class lj$ay
extends kb {
    private final ln pW = new ln();

    @Override
    public void ay(qx qx2) {
        switch (PackDisplay .1.ef[qx2.ordinal()]) {
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
        ResourcePackRepository.Entry entry = (ResourcePackRepository.Entry)Iterables.getLast(list);
        boolean bl = ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).pY;
        boolean bl2 = ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qD;
        if (((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).pZ) {
            this.kw.rf(0, 0, this.df(), this.hu(), ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).kv.getRGB());
        }
        if (bl) {
            this.pW.ay(entry);
            this.pW.ay(this.kw, 0, 0, 22);
        }
        int n = bl ? 22 : 0;
        this.pW.ay(this.kw, entry, (float)(n + 2), bl2 ? 1.0f : (float)this.hu() / 2.0f - (float)MINECRAFT.fontRenderer.FONT_HEIGHT / 2.0f, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qA, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qB);
        if (bl2) {
            this.pW.ay(this.kw, entry, (float)(n + 2), 12.0f, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qE.getRGB(), ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qF);
        }
    }

    private void ky() {
        boolean bl = ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).pY;
        boolean bl2 = ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qD;
        if (((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).pZ) {
            this.kw.rf(0, 0, this.df(), this.hu(), ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).kv.getRGB());
        }
        if (bl) {
            this.pW.py();
            this.pW.ay(this.kw, 0, 0, 22);
        }
        int n = bl ? 22 : 0;
        this.kw.ay("Feather", (float)(n + 2), bl2 ? 1.0f : (float)this.hu() / 2.0f - (float)MINECRAFT.fontRenderer.FONT_HEIGHT / 2.0f, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qA, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qB);
        if (bl2) {
            this.kw.ay("Pack Display", (float)(n + 2), 12.0f, ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qE.getRGB(), ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).qF, false);
        }
    }

    @Override
    public int df() {
        return 157 + (((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).pY ? 22 : 0);
    }

    @Override
    public int hu() {
        return 22;
    }

    @Override
    public ci te() {
        return ((PackDisplay.rf)((PackDisplay) PackDisplay.this).vz).jQ;
    }
}
