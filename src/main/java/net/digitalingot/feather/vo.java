package net.digitalingot.feather;

public class vo
extends bc {
    private final long ET;
    private boolean EU;

    public vo(Runnable runnable, boolean bl, long l, long l2) {
        super(runnable, bl, l);
        this.ET = l2;
    }

    public long oJ() {
        return this.ET;
    }

    public void oK() {
        this.EU = true;
    }

    public boolean oL() {
        return this.EU;
    }
}
