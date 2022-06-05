package net.digitalingot.feather.enums;

import net.digitalingot.feather.df;
import org.jetbrains.annotations.NotNull;

public enum hu {
    INSTANCE;


    public <T> df<T> create(@NotNull T t) {
        return new df<T>(t);
    }
}
