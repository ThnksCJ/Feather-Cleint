package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$rf$rf
extends StructFactory<pk.rf.ay, pk.rf.uj> {
    public final pk.rf.uj rl(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.rf.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.rf.ay rl(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.rf.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.rf.uj ay(pk.rf.ay ay2) {
        return ay2.cK();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.rf.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.rl(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.rl(segmentReader, n, n2, n3, s, n4);
    }
}
