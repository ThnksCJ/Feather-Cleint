package net.digitalingot.feather.interfaces;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface au {
    @NotNull String wd();

    @NotNull String vu();

    @NotNull String pr() default "";

    @NotNull ra nu() default @ra(wd = "");

    @NotNull de yp();
}
