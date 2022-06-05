package net.digitalingot.feather;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class db
        implements Comparator<Integer> {
    private static final List<Integer> ot = Arrays.asList(18, 17, 16, 10018, 10017, 10016, 524, 10, 10524, 10010);

    db() {
    }

    public int ay(Integer n, Integer n3) {
        Integer n4 = fz.oh(n).oj();
        Integer n5 = fz.oh(n3).oj();
        boolean bl = ot.stream().anyMatch(n2 -> Objects.equals(n2, n4));
        boolean bl2 = ot.stream().anyMatch(n2 -> Objects.equals(n2, n5));
        if (bl && bl2) {
            int n6 = ot.indexOf(n4) - ot.indexOf(n5);
            return n6 != 0 ? n6 : n4.compareTo(n5);
        }
        if (bl) {
            return -1;
        }
        if (bl2) {
            return 1;
        }
        return n4.compareTo(n5);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.ay((Integer) object, (Integer) object2);
    }
}
