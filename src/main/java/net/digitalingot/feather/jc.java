package net.digitalingot.feather;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class jc {
    private static final NavigableMap<Integer, String> FS;
    private static final TreeMap<Integer, String> FT;

    static {
        FT = new TreeMap();
        FT.put(1, "I");
        FT.put(4, "IV");
        FT.put(5, "V");
        FT.put(9, "IX");
        FT.put(10, "X");
        FT.put(40, "XL");
        FT.put(50, "L");
        FT.put(90, "XC");
        FT.put(100, "C");
        FT.put(400, "CD");
        FT.put(500, "D");
        FT.put(900, "CM");
        FT.put(1000, "M");
        FT.put(4000, "MV\u0305");
        FT.put(5000, "V\u0305");
        FT.put(9000, "MX\u0305");
        FT.put(10000, "X\u0305");
        FT.put(40000, "X\u0305L\u0305");
        FT.put(50000, "L\u0305");
        FT.put(90000, "X\u0305C\u0305");
        FT.put(100000, "C\u0305");
        FT.put(400000, "C\u0305D\u0305");
        FT.put(500000, "D\u0305");
        FT.put(900000, "C\u0305M\u0305");
        FT.put(1000000, "M\u0305");
        FS = FT.descendingMap();
    }

    public static int pd(String string) {
        string = string.toUpperCase();
        int n = 0;
        for (Map.Entry entry : FS.entrySet()) {
            String string2 = (String) entry.getValue();
            int n2 = (Integer) entry.getKey();
            while (string.startsWith(string2)) {
                n += n2;
                string = string.substring(string2.length());
            }
        }
        return n;
    }

    public static String mg(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            Map.Entry<Integer, String> entry = FT.floorEntry(n);
            n -= entry.getKey().intValue();
            stringBuilder.append(entry.getValue());
        }
        return stringBuilder.toString();
    }
}
