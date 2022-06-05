package net.digitalingot.feather;

import org.cef.Async;

class wg$1
implements Async.Impl {
    wg$1() {
    }

    public void invokeLater(Runnable runnable) {
        wg.this.minecraft.addScheduledTask(runnable);
    }

    public void invokeAndWait(Runnable runnable) {
        if (wg.this.minecraft.isCallingFromMinecraftThread()) {
            runnable.run();
        } else {
            wg.this.minecraft.addScheduledTask(runnable).get();
        }
    }
}
