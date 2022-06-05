package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$bu$ay
extends StructBuilder {
    rr$bu$bu$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public rr.bu.bu.zz iF() {
        switch (this._getShortField(0)) {
            case 0: {
                return rr.bu.bu.zz.START_METRICS;
            }
            case 1: {
                return rr.bu.bu.zz.SERVER_JOIN;
            }
            case 2: {
                return rr.bu.bu.zz.SERVER_QUIT;
            }
        }
        return rr.bu.bu.zz._NOT_IN_SCHEMA;
    }

    public final rr.bu.bu.uj iG() {
        return new rr.bu.bu.uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean iH() {
        return this.iF() == rr.bu.bu.zz.START_METRICS;
    }

    public final rr.bu.sd.ay iI() {
        assert (this.iF() == rr.bu.bu.zz.START_METRICS) : "Must check which() before get()ing a union member.";
        return (rr.bu.sd.ay)((Object)this._getPointerField((FromPointerBuilderRefDefault)rr.bu.sd.Dp, 0, null, 0));
    }

    public final void ay(rr.bu.sd.zz zz2) {
        this._setShortField(0, (short)rr.bu.bu.zz.START_METRICS.ordinal());
        this._setPointerField((SetPointerBuilder)rr.bu.sd.Dp, 0, (Object)zz2);
    }

    public final rr.bu.sd.ay iJ() {
        this._setShortField(0, (short)rr.bu.bu.zz.START_METRICS.ordinal());
        return (rr.bu.sd.ay)((Object)this._initPointerField((FromPointerBuilder)rr.bu.sd.Dp, 0, 0));
    }

    public final boolean iK() {
        return this.iF() == rr.bu.bu.zz.SERVER_JOIN;
    }

    public final rr.bu.zz.ay iL() {
        assert (this.iF() == rr.bu.bu.zz.SERVER_JOIN) : "Must check which() before get()ing a union member.";
        return (rr.bu.zz.ay)((Object)this._getPointerField((FromPointerBuilderRefDefault)rr.bu.zz.Do, 0, null, 0));
    }

    public final void ay(rr.bu.zz.uj uj2) {
        this._setShortField(0, (short)rr.bu.bu.zz.SERVER_JOIN.ordinal());
        this._setPointerField((SetPointerBuilder)rr.bu.zz.Do, 0, (Object)uj2);
    }

    public final rr.bu.zz.ay iM() {
        this._setShortField(0, (short)rr.bu.bu.zz.SERVER_JOIN.ordinal());
        return (rr.bu.zz.ay)((Object)this._initPointerField((FromPointerBuilder)rr.bu.zz.Do, 0, 0));
    }

    public final boolean iN() {
        return this.iF() == rr.bu.bu.zz.SERVER_QUIT;
    }

    public final Void iO() {
        assert (this.iF() == rr.bu.bu.zz.SERVER_QUIT) : "Must check which() before get()ing a union member.";
        return Void.VOID;
    }

    public final void zz(Void void_) {
        this._setShortField(0, (short)rr.bu.bu.zz.SERVER_QUIT.ordinal());
    }
}
