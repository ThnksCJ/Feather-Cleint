package net.digitalingot.feather.enums;

public enum vp {
    SHORT(2),
    INTEGER(4);

    private final int size;

    vp(int n2) {
        this.size = n2;
    }

    public int getSize() {
        return this.size;
    }
}
