package net.digitalingot.feather;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class jl
extends RuntimeException {
    public jl(String string) {
        super(string);
    }

    public jl(Field field, Class<? extends Annotation> clazz) {
        super("Field " + field.getName() + " is missing annotation " + clazz.getName());
    }

    public jl(Class<?> clazz, Class<? extends Annotation> clazz2) {
        super("Class " + clazz.getName() + " is missing annotation " + clazz2.getName());
    }
}
