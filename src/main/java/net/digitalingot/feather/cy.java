package net.digitalingot.feather;

import net.digitalingot.feather.enums.ho;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface cy {
    String jj() default "";

    boolean wm() default true;

    double dz() default 0.0;

    double ev() default 0.0;

    ho yv() default ho.TOP_LEFT;

    double bw() default 1.0;
}
