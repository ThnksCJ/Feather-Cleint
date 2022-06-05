package net.digitalingot.feather;

public class pb {
    public final int gv;
    public final int ei;
    public final int textureWidth;
    public final int textureHeight;
    public final int nb;
    public final int tf;

    public pb(int n, int n2, int n3, int n4, int n5, int n6) {
        this.gv = n;
        this.ei = n2;
        this.textureWidth = n3;
        this.textureHeight = n4;
        this.nb = n5;
        this.tf = n6;
    }

    public static pb ay(int n, int n2, int n3) {
        int n4 = (int) Math.floor((float) n3 / (float) n);
        int n5 = (int) Math.floor((float) n3 / (float) n2);
        int n6 = n4 * n5;
        int n7 = n4 * n;
        int n8 = n5 * n2;
        return new pb(n, n2, n7, n8, n4, n6);
    }
}
