package net.digitalingot.feather;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface pq {
    xd[] we();

    ay wy() default ay.DISABLE_MODULE_IF_NO_HUD_ELEMENTS;

    enum ay {
        ONLY_HUD_ELEMENT,
        DISABLE_MODULE_IF_NO_HUD_ELEMENTS,
        DISABLE_MODULE

    }
}
