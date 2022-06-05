package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;

public final class rr$iu$ay
extends StructBuilder {
    rr$iu$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.iu.zz jY() {
        return new rr.iu.zz((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final rr.iu.sd.ay jZ() {
        return new rr.iu.sd.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }

    public final rr.iu.sd.ay kA() {
        this._setShortField(0, (short)0);
        this._clearPointerField(0);
        return new rr.iu.sd.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
    }
}
