package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$ay$rf
        extends StructFactory<pk.ay.ay, pk.ay.zz> {
    public final pk.ay.zz zs(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.ay.zz(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.ay.ay zs(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.ay.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.ay.zz ay(pk.ay.ay ay2) {
        return ay2.bO();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.ay.ay) object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.zs(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.zs(segmentReader, n, n2, n3, s, n4);
    }
}
