package net.digitalingot.feather.enums;

public enum zm {
    BLACK('0'),
    DARK_BLUE('1'),
    DARK_GREEN('2'),
    DARK_AQUA('3'),
    DARK_RED('4'),
    DARK_PURPLE('5'),
    GOLD('6'),
    GRAY('7'),
    DARK_GRAY('8'),
    BLUE('9'),
    GREEN('a'),
    AQUA('b'),
    RED('c'),
    LIGHT_PURPLE('d'),
    YELLOW('e'),
    WHITE('f');

    public static final String PREFIX_CHAR = "\u00a7";
    public final char code;
    public final String toString;

    zm(char c) {
        this.code = c;
        this.toString = PREFIX_CHAR + c;
    }
}
