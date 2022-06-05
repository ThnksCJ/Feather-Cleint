package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;

public final class mh$zz$ay
        extends StructBuilder {
    mh$zz$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final mh.zz.zz k() {
        return new mh.zz.zz((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final mh.zz.uj.ay l() {
        return new mh.zz.uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }

    public final mh.zz.uj.ay m() {
        this._setShortField(0, (short) 0);
        this._clearPointerField(0);
        return new mh.zz.uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }
}
