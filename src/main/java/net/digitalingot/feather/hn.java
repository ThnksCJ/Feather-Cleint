package net.digitalingot.feather;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import java.nio.FloatBuffer;

public class hn
        extends gn {
    private static final FloatBuffer sg;

    static {
        float[] fArray = new float[]{0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f};
        sg = BufferUtils.createFloatBuffer(fArray.length);
        sg.put(fArray, 0, fArray.length);
        sg.rewind();
    }

    @Override
    protected boolean et() {
        return GL11.glIsEnabled(3553);
    }

    public void render() {
        if (!this.pt()) {
            return;
        }
        int n = GL11.glGetInteger(32873);
        int n2 = GL11.glGetTexEnvi(8960, 8704);
        int n3 = GL11.glGetInteger(3317);
        GL11.glPushAttrib(61440);
        GL11.glPushClientAttrib(2);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2912);
        GL11.glDisable(2896);
        GL11.glDisable(2884);
        GL11.glDisable(2929);
        GL11.glDisable(2960);
        GL11.glDisable(2903);
        GL11.glEnable(3553);
        GL11.glTexEnvi(8960, 8704, 8448);
        GL11.glHint(3155, 4354);
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glPixelStorei(3317, 1);
        GL11.glBindTexture(3553, this.er);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glInterleavedArrays(10791, 0, sg);
        GL11.glDrawArrays(7, 0, 4);
        GL11.glPixelStorei(3317, n3);
        GL11.glBindTexture(3553, n);
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
        GL11.glPopClientAttrib();
        GL11.glTexEnvi(8960, 8704, n2);
    }
}
