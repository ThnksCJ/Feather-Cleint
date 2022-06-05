package net.digitalingot.feather;

import org.capnproto.*;

public final class cm$ay$rf
extends StructFactory<cm.ay.ay, cm.ay.uj> {
    public final cm.ay.uj rf(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new cm.ay.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final cm.ay.ay rf(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new cm.ay.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final cm.ay.uj ay(cm.ay.ay ay2) {
        return ay2.pc();
    }

    public StructReader asReader(Object object) {
        return this.ay((cm.ay.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.rf(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.rf(segmentReader, n, n2, n3, s, n4);
    }
}
