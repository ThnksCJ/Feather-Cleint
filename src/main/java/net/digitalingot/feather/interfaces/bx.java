package net.digitalingot.feather.interfaces;

import net.digitalingot.feather.ly;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Inherited
public @interface bx {
    @NotNull String vu();

    @NotNull String jm();

    @NotNull String mz();

    @NotNull ly.ay[] lq();

    @NotNull ay mc() default @ay;

    @interface ay {
        @NotNull String vu() default "";

        @NotNull de yp() default @de(vi = 0);
    }
}
