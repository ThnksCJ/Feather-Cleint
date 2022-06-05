package net.digitalingot.feather;

public class bc {
    private final Runnable EV;
    private final boolean EW;
    private long EX;

    public bc(Runnable runnable, boolean bl, long l) {
        this.EV = runnable;
        this.EW = bl;
        this.EX = l;
    }

    public boolean oM() {
        return --this.EX <= 0L;
    }

    public Runnable oN() {
        return this.EV;
    }

    public boolean oO() {
        return this.EW;
    }

    public void ed(long l) {
        this.EX = l;
    }

    public long oP() {
        return this.EX;
    }
}
