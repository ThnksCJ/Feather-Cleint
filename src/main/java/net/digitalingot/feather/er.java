package net.digitalingot.feather;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class er
        implements ExclusionStrategy {
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return fieldAttributes.getDeclaredClass().isAssignableFrom(iv.class);
    }

    public boolean shouldSkipClass(Class<?> clazz) {
        return clazz.isAssignableFrom(iv.class);
    }
}
