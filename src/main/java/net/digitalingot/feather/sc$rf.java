package net.digitalingot.feather;

import net.digitalingot.feather.enums.qx;
import net.digitalingot.feather.mods.impl.PotionEffects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StringUtils;
import net.minecraft.util.text.translation.I18n;

import java.awt.*;
import java.util.Collection;

public class sc$rf
        extends kb {
    @Override
    public void ay(qx qx2) {
        switch (PotionEffects .1.ef[qx2.ordinal()]){
            case 1: {
                this.render();
                return;
            }
            case 2: {
                this.jy();
                return;
            }
        }
    }

    private void render() {
        this.ay(Minecraft.getMinecraft().player.func_70651_bq(), false);
    }

    private void jy() {
        this.ay(qO, true);
    }

    @Override
    public boolean tv() {
        return ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qT;
    }

    @Override
    public int df() {
        return ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX || ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qY ? 120 : 50;
    }

    @Override
    public int hu() {
        return Minecraft.getMinecraft().player.func_70651_bq().size() * (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 25 : 20);
    }

    @Override
    public int ku() {
        return 5 * (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 25 : 20);
    }

    public boolean xo() {
        return PotionEffects.this.gc() && ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).rv;
    }

    private void ay(Collection<PotionEffect> collection, boolean bl) {
        int n;
        boolean bl2;
        int n2;
        if (collection.isEmpty()) {
            return;
        }
        int n3 = ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 25 : (n2 = ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qY ? 20 : 18);
        if (collection.size() > 5 && ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX) {
            n2 = 132 / (collection.size() - 1);
        }
        if (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX) {
            this.kw.rf(0, 0, this.df(), bl ? this.ku() : this.hu(), new Color(0, 0, 0, 100).getRGB());
        }
        int n4 = 0;
        boolean bl3 = bl2 = this.hh() + this.ch() / 2.0 <= (double) ((float) new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth() / 2.0f);
        if (bl2) {
            n = ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 6 : 0;
        } else {
            n = this.df() - 18;
            n -= ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 6 : 0;
        }
        for (PotionEffect potionEffect : collection) {
            float f;
            int n5 = n4 + (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 5 : 0);
            StringBuilder stringBuilder = new StringBuilder(PotionEffects.yw(I18n.translateToLocal((String) qQ.rf(potionEffect))));
            if (!qP.contains(qQ.ay(potionEffect))) {
                stringBuilder.append(" ").append(jc.mg(potionEffect.getAmplifier() + 1));
            }
            String string = stringBuilder.toString();
            String string2 = "**:**";
            if (!qQ.zz(potionEffect)) {
                string2 = StringUtils.ticksToElapsedTime((int) qQ.uj(potionEffect));
            }
            qQ.ay(potionEffect, n, n5);
            if (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qY) {
                if (bl2) {
                    f = (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 10 : 4) + 18;
                } else {
                    f = (float) (this.df() - this.kw.on(string)) - 18.0f;
                    f -= ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 10.0f : 4.0f;
                }
                this.kw.ay(string, f, (float) (n4 + (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 4 : 0)), ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qW, true);
            }
            if (this.rf(potionEffect, potionEffect.getDuration(), ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qU)) {
                if (bl2) {
                    f = (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 10 : 4) + 18;
                } else {
                    f = (float) (this.df() - this.kw.on(string2)) - 18.0f;
                    f -= ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 10.0f : 4.0f;
                }
                this.kw.ay(string2, f, (float) (n4 + (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qX ? 4 : 0) + (((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qY ? 10 : 5)), ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).qV, true);
            }
            n4 += n2;
        }
    }

    private boolean rf(PotionEffect potionEffect, int n, int n2) {
        if (!potionEffect.getIsAmbient() && n / 20 <= n2) {
            return n % 20 < 10;
        }
        return true;
    }

    @Override
    public ci te() {
        return ((PotionEffects.sd) ((PotionEffects) PotionEffects.this).vz).iO;
    }
}
