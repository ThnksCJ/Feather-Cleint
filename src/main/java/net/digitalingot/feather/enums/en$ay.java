package net.digitalingot.feather.enums;

public enum en$ay {
    IDE(4),
    DEVELOPMENT(3),
    BETA(2),
    RELEASE(1);

    private final int priority;

    en$ay(int n2) {
        this.priority = n2;
    }

    public int getPriority() {
        return this.priority;
    }
}
