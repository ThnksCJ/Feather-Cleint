package net.digitalingot.feather;

import org.capnproto.*;

public final class mh$rf$rf
        extends StructFactory<mh.rf.ay, mh.rf.uj> {
    public final mh.rf.uj bu(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new mh.rf.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final mh.rf.ay bu(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new mh.rf.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final mh.rf.uj ay(mh.rf.ay ay2) {
        return ay2.g();
    }

    public StructReader asReader(Object object) {
        return this.ay((mh.rf.ay) ((Object) object));
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.bu(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.bu(segmentReader, n, n2, n3, s, n4);
    }
}
