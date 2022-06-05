package net.digitalingot.feather;

class ay$1
        extends Thread {
    ay$1(ThreadGroup threadGroup, Runnable runnable, String string) {
        super(threadGroup, runnable, string);
    }

    @Override
    public void run() {
        Thread.sleep(2000L);
        if (ay == null || ay.getPriority() < ay.rf().getPriority()) {
            vm.Fq.error("DRM check failed.");
        } else {
            vm.Fq.info("Passed DRM check");
        }
    }
}
