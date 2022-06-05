package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$iu$uj$ay
extends StructBuilder {
    rr$iu$uj$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final rr.iu.uj.uj kB() {
        return new rr.iu.uj.uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean kC() {
        return !this._pointerFieldIsNull(0);
    }

    public final DataList.Builder kD() {
        return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, null, 0);
    }

    public final void zz(DataList.Reader reader) {
        this._setPointerField((SetPointerBuilder)DataList.factory, 0, reader);
    }

    public final DataList.Builder yl(int n) {
        return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
    }

    public final boolean kE() {
        return !this._pointerFieldIsNull(1);
    }

    public final DataList.Builder kF() {
        return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 1, null, 0);
    }

    public final void sd(DataList.Reader reader) {
        this._setPointerField((SetPointerBuilder)DataList.factory, 1, reader);
    }

    public final DataList.Builder ek(int n) {
        return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 1, n);
    }
}
