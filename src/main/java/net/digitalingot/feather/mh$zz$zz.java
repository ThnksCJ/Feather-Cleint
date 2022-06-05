package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class mh$zz$zz
extends StructReader {
    mh$zz$zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public mh.zz.uj.uj z() {
        return new mh.zz.uj.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
    }
}
