package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$uj$rf$rf
extends StructFactory<pk.uj.rf.ay, pk.uj.rf.uj> {
    public final pk.uj.rf.uj sb(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return new pk.uj.rf.uj(segmentReader, n, n2, n3, s, n4);
    }

    public final pk.uj.rf.ay sb(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return new pk.uj.rf.ay(segmentBuilder, n, n2, n3, s);
    }

    public final StructSize structSize() {
        return AI;
    }

    public final pk.uj.rf.uj ay(pk.uj.rf.ay ay2) {
        return ay2.cR();
    }

    public StructReader asReader(Object object) {
        return this.ay((pk.uj.rf.ay)object);
    }

    public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        return this.sb(segmentBuilder, n, n2, n3, s);
    }

    public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        return this.sb(segmentReader, n, n2, n3, s, n4);
    }
}
