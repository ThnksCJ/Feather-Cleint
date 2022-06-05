package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$rf$rf
extends StructFactory<rr.rf.ay, rr.rf.uj> {
    public final rr.rf.uj bz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new rr.rf.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final rr.rf.ay bz(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new rr.rf.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final rr.rf.uj ay(rr.rf.ay ay2) {
        return ay2.gP();
    }

    public StructReader asReader(Object object) {
        return this.ay((rr.rf.ay)((Object)object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.bz(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.bz(segmentReader, n, n2, n3, s, n4);
    }
}
