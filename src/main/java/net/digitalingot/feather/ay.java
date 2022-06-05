package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ay extends zi {
    @Nullable
    public static en.ay ay;

    public static void ay() {
        new Thread(null, null, "Feather-DRM") {

            @Override
            public void run() {
                Thread.sleep(2000L);
                if (ay == null || ay.getPriority() < net.digitalingot.feather.ay.rf().getPriority()) {
                    vm.Fq.error("DRM check failed.");
                } else {
                    vm.Fq.info("Passed DRM check");
                }
            }
        }.start();
        zz.nw().pv().rf(new zg(), new Consumer<en>() {

            public void ay(en en2) {
                ay = en2.rf();
            }

            @Override
            public void accept(Object object) {
                this.ay((en) object);
            }
        }, null);
    }

    @NotNull
    public static en.ay rf() {
        return en.ay.RELEASE;
    }
}
