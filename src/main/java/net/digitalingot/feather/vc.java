package net.digitalingot.feather;

public interface vc {
    gb<vc> bo = yd.ay(vc.class, (T[] vcArray) -> void_ -> {
        for (vc vc2 : vcArray) {
            vc2.registerCommands(void_);
        }
    });

    void registerCommands(Void var1);
}
