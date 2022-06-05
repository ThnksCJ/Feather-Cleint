package net.digitalingot.feather;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class vq {
    private static final List<tl<?>> co = new ArrayList();

    private vq() {
    }

    public static void sm() {
        co.forEach(tl::yj);
    }

    public static <T> gb<T> ay(Class<? super T> clazz, Function<T[], T> function) {
        tl<? super T> tl2 = new tl<T>(clazz, function);
        co.add(tl2);
        return tl2;
    }

    /*
     * WARNING - void declaration
     */
    private static <T> T rf(Class<T> clazz, Function<T[], T> function) {
        void var3_6;
        Method method2 = null;
        for (Method method3 : clazz.getMethods()) {
            if ((method3.getModifiers() & 0x802) != 0) continue;
            if (method2 != null) {
                throw new IllegalStateException("Multiple virtual methods in " + clazz + "; cannot build empty invoker!");
            }
            method2 = method3;
        }
        if (method2 == null) {
            throw new IllegalStateException("No virtual methods in " + clazz + "; cannot build empty invoker!");
        }
        Object var3_4 = null;
        MethodHandle methodHandle = MethodHandles.lookup().unreflect(method2);
        MethodType methodType = methodHandle.type().dropParameterTypes(0, 1);
        if (methodType.returnType() != Void.TYPE) {
            MethodType methodType2 = MethodType.genericMethodType(methodType.parameterCount()).changeReturnType(methodType.returnType()).insertParameterTypes(0, methodHandle.type().parameterType(0));
            MethodHandle methodHandle2 = MethodHandles.explicitCastArguments(methodHandle, methodType2);
            Object[] objectArray2 = new Object[methodHandle.type().parameterCount()];
            objectArray2[0] = function.apply((Object[][]) Array.newInstance(clazz, 0));
            Object object = methodHandle2.invokeWithArguments(objectArray2);
        }
        methodHandle = var3_6;
        return (T) Proxy.newProxyInstance(vq.class.getClassLoader(), new Class[]{clazz}, (object2, method, objectArray) -> methodArray);
    }
}
