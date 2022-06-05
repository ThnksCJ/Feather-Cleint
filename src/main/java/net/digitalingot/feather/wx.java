package net.digitalingot.feather;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;

public class wx
implements FieldNamingStrategy {
    public String translateName(Field field) {
        au au2 = field.getDeclaredAnnotation(au.class);
        if (au2 != null) {
            return au2.wd();
        }
        fl fl2 = field.getDeclaredAnnotation(fl.class);
        if (fl2 != null) {
            return "nested_" + fl2.fd();
        }
        SerializedName serializedName = field.getDeclaredAnnotation(SerializedName.class);
        if (serializedName != null) {
            return serializedName.value();
        }
        if (!field.getType().isAssignableFrom(iv.class)) {
            vm.Fq.error(field + " translated using FieldNamingPolicy.IDENTITY");
        }
        return FieldNamingPolicy.IDENTITY.translateName(field);
    }
}
