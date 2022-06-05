package net.digitalingot.feather;

import net.digitalingot.feather.aj;
import net.digitalingot.feather.bz;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public class rc {
    public void ay(bz bz2, aj aj2) {
        int n = aj2.ff();
        int n2 = n % aj2.uf() * bz2.gb();
        long l = bz2.or() + (long)n2;
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.enableDepth();
        rc.rf(515);
        rc.uj(aj2.bu(n));
        GL15.glBindBuffer(34962, (int)bz2.yd());
        GL11.glVertexPointer(3, 5126, 0, 0L);
        GL11.glNormalPointer(5126, 0, (long)bz2.vq());
        GL11.glTexCoordPointer(2, 5126, 0, l);
        GL15.glBindBuffer(34962, 0);
        GL11.glEnableClientState(32884);
        GL11.glEnableClientState(32888);
        GL11.glEnableClientState(32885);
        GL15.glBindBuffer(34963, (int)bz2.wi());
        GL11.glDrawElements(4, (int)bz2.tl(), 5125, 0L);
        GL15.glBindBuffer(34963, 0);
        GL11.glDisableClientState(32885);
        GL11.glDisableClientState(32888);
        GL11.glDisableClientState(32884);
        GlStateManager.enableDepth();
    }

    private static void rf(int n) {
        GlStateManager.depthFunc(n);
    }

    private static void uj(int n) {
        GlStateManager.bindTexture(n);
    }
}
