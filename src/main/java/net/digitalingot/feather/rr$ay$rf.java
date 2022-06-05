package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$ay$rf
        extends StructFactory<rr.ay.ay, rr.ay.uj> {
    public final rr.ay.uj ac(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.ay.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.ay.ay ac(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.ay.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.ay.uj ay(rr.ay.ay ay2) {
        return ay2.gL();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.ay.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.ac(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.ac(segmentReader, n, n2, n3, s, n4);
    }
}
