package net.digitalingot.feather;

import net.digitalingot.feather.je;
import net.digitalingot.feather.lx;
import org.capnproto.*;

public final class lx$rf$ay
extends StructBuilder {
    lx$rf$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public final lx.rf.uj A() {
        return new lx.rf.uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final int ye() {
        return this._getIntField(0);
    }

    public final void jo(int n) {
        this._setIntField(0, n);
    }

    public final je.uj xt() {
        switch (this._getShortField(2)) {
            case 0: {
                return je.uj.PROXIMITY;
            }
            case 1: {
                return je.uj.PARTY;
            }
        }
        return je.uj._NOT_IN_SCHEMA;
    }

    public final void ay(je.uj uj2) {
        this._setShortField(2, (short)uj2.ordinal());
    }

    public final long vk() {
        return this._getLongField(1);
    }

    public final void kl(long l) {
        this._setLongField(1, l);
    }

    public final boolean ud() {
        return !this._pointerFieldIsNull(0);
    }

    public final Data.Builder my() {
        return (Data.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Data.factory, 0, null, 0, 0);
    }

    public final void rf(Data.Reader reader) {
        this._setPointerField((SetPointerBuilder)Data.factory, 0, reader);
    }

    public final void nn(byte[] byArray) {
        this._setPointerField((SetPointerBuilder)Data.factory, 0, new Data.Reader(byArray));
    }

    public final Data.Builder bv(int n) {
        return (Data.Builder)this._initPointerField((FromPointerBuilder)Data.factory, 0, n);
    }
}
