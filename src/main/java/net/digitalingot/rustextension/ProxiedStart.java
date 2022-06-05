package net.digitalingot.rustextension;

public class ProxiedStart {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("No start class provided");
        }
        String startClass = args[0];
        String[] startArgs = new String[args.length - 1];
        System.arraycopy(args, 1, startArgs, 0, startArgs.length);
        Class<?> clazz = Class.forName(startClass);
        clazz.getMethod("main", String[].class).invoke(null, new Object[]{startArgs});
    }
}
