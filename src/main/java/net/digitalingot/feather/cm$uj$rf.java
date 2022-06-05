package net.digitalingot.feather;

import org.capnproto.*;

public final class cm$uj$rf
extends StructFactory<cm.uj.ay, cm.uj.zz> {
    public final cm.uj.zz uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new cm.uj.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final cm.uj.ay uj(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new cm.uj.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final cm.uj.zz ay(cm.uj.ay ay2) {
        return ay2.jk();
    }

    public StructReader asReader(Object object) {
        return this.ay((cm.uj.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.uj(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.uj(segmentReader, n, n2, n3, s, n4);
    }
}
