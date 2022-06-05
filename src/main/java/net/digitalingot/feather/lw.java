package net.digitalingot.feather;

import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

public class lw {
    @NotNull
    public static final vf gm = new vf(0, 0);
    @NotNull
    public static final vf ey = new vf(100000, 100000);
    public static final vf[] tx = new vf[]{gm, ey, new vf(11, 48), new vf(2, 49), new vf(3, 50), new vf(4, 51), new vf(5, 52), new vf(6, 53), new vf(7, 54), new vf(8, 55), new vf(9, 56), new vf(10, 57), new vf(30, 65), new vf(48, 66), new vf(46, 67), new vf(32, 68), new vf(18, 69), new vf(33, 70), new vf(34, 71), new vf(35, 72), new vf(23, 73), new vf(36, 74), new vf(37, 75), new vf(38, 76), new vf(50, 77), new vf(49, 78), new vf(24, 79), new vf(25, 80), new vf(16, 81), new vf(19, 82), new vf(31, 83), new vf(20, 84), new vf(22, 85), new vf(47, 86), new vf(17, 87), new vf(45, 88), new vf(21, 89), new vf(44, 90), new vf(59, 112), new vf(60, 113), new vf(61, 114), new vf(62, 115), new vf(63, 116), new vf(64, 117), new vf(65, 118), new vf(66, 119), new vf(67, 120), new vf(68, 121), new vf(87, 122), new vf(88, 123), new vf(100, 61440), new vf(101, 61441), new vf(102, 61442), new vf(103, 61443), new vf(104, 61444), new vf(105, 61445), new vf(113, 61446), new vf(10114, 61447), new vf(10115, 61448), new vf(10116, 61449), new vf(10117, 61450), new vf(10118, 61451), new vf(10119, 71452), new vf(69, 144), new vf(82, 96), new vf(79, 97), new vf(80, 98), new vf(81, 99), new vf(75, 100), new vf(76, 101), new vf(77, 102), new vf(71, 103), new vf(72, 104), new vf(73, 105), new vf(78, 107), new vf(83, 110), new vf(156, 10), new vf(141, 61), new vf(55, 106), new vf(181, 111), new vf(74, 109), new vf(208, 40), new vf(203, 37), new vf(205, 39), new vf(200, 38), new vf(40, 222), new vf(43, 92), new vf(51, 44), new vf(13, 10061), new vf(41, 192), new vf(26, 91), new vf(12, 45), new vf(52, 46), new vf(27, 93), new vf(39, 59), new vf(53, 47), new vf(57, 32), new vf(15, 9), new vf(56, 18), new vf(29, 17), new vf(42, 16), new vf(219, 524), new vf(184, 10018), new vf(157, 10017), new vf(54, 10016), new vf(220, 10524), new vf(28, 10010), new vf(1, 27), new vf(14, 8), new vf(211, 127), new vf(207, 35), new vf(199, 36), new vf(210, 155), new vf(209, 34), new vf(201, 33), new vf(58, 20), new vf(197, 19), new vf(70, 145), new vf(221, 525), new vf(183, 154), new vf(121, 10001), new vf(123, 10002), new vf(100001, 100001), new vf(100002, 100002), new vf(100003, 100003), new vf(100004, 100004), new vf(100005, 100005), new vf(100006, 100006), new vf(100007, 100007), new vf(100008, 100008)};

    public static String ay(@NotNull vf vf2) {
        int n = vf2.fy();
        if (n == 0 || n == 100000) {
            return "Unknown";
        }
        if (n >= 100000) {
            return "Mouse " + (n - 100000);
        }
        String string = n < 256 ? Keyboard.getKeyName(n) : String.format("%c", Character.valueOf((char)(n - 256))).toUpperCase();
        return string != null ? string : "Unknown";
    }
}
