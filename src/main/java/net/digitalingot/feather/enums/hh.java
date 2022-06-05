package net.digitalingot.feather.enums;

import net.digitalingot.feather.ca;
import net.digitalingot.feather.ci;
import net.digitalingot.feather.gc;
import net.digitalingot.feather.ix;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public enum hh {
    INSTANCE;


    public <T> gc<T> create(@NotNull Class<T> clazz, @Nullable Map<String, String> map, @Nullable String string) {
        return this.create(clazz, map, string, null);
    }

    public <T> gc<T> create(@NotNull ca ca2, @Nullable Map<String, String> map, @Nullable String string) {
        return this.create(ca2.wt().getType(), map, string, ca2);
    }

    private <T> gc<T> create(@NotNull Class<T> clazz, @Nullable Map<String, String> map, @Nullable String string, @Nullable ca ca2) {
        String string2;
        String string3 = string2 = string == null || string.isEmpty() ? "" : string + ":";
        if (ci.class.isAssignableFrom(clazz)) {
            if (ca2 == null) {
                throw new IllegalArgumentException("Field cannot be null for HUDElementSubconfig");
            }
            return new ix<T>(clazz, map, string2, ca2);
        }
        return new gc<T>(clazz, map, string2);
    }
}
