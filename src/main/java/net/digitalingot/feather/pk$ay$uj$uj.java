package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$ay$uj$uj
extends StructFactory<pk.ay.uj.ay, pk.ay.uj.sd> {
    public final pk.ay.uj.sd pv(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.ay.uj.sd(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.ay.uj.ay pv(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.ay.uj.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.ay.uj.sd ay(pk.ay.uj.ay ay2) {
        return ay2.bR();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.ay.uj.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.pv(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.pv(segmentReader, n, n2, n3, s, n4);
    }
}
