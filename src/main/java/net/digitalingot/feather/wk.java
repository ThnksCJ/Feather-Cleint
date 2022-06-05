package net.digitalingot.feather;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class wk {
    private wk() {
        throw new AssertionError();
    }

    public static DecimalFormat yl(String string) {
        DecimalFormat decimalFormat = new DecimalFormat(string, new DecimalFormatSymbols(Locale.ROOT));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static void ay(DecimalFormat decimalFormat, int n) {
        decimalFormat.setMaximumFractionDigits(n);
        decimalFormat.setMinimumFractionDigits(n);
    }
}
