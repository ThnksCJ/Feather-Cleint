package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$uj$uj
extends StructFactory<pk.uj.ay, pk.uj.zz> {
    public final pk.uj.zz iu(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.uj.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.uj.ay iu(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.uj.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.uj.zz ay(pk.uj.ay ay2) {
        return ay2.cO();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.uj.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.iu(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.iu(segmentReader, n, n2, n3, s, n4);
    }
}
