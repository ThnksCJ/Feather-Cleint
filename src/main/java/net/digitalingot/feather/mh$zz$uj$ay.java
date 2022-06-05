package net.digitalingot.feather;

import org.capnproto.*;

public final class mh$zz$uj$ay
        extends StructBuilder {
    mh$zz$uj$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public mh.zz.uj.zz n() {
        switch (this._getShortField(0)) {
            case 0: {
                return mh.zz.uj.zz.HANDSHAKE;
            }
            case 1: {
                return mh.zz.uj.zz.RECEIVE_SETTINGS;
            }
        }
        return mh.zz.uj.zz._NOT_IN_SCHEMA;
    }

    public final mh.zz.uj.uj o() {
        return new mh.zz.uj.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean p() {
        return this.n() == mh.zz.uj.zz.HANDSHAKE;
    }

    public final mh.ay.ay q() {
        assert (this.n() == mh.zz.uj.zz.HANDSHAKE) : "Must check which() before get()ing a union member.";
        return (mh.ay.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) mh.ay.AR, 0, null, 0));
    }

    public final void ay(mh.ay.uj uj2) {
        this._setShortField(0, (short) mh.zz.uj.zz.HANDSHAKE.ordinal());
        this._setPointerField((SetPointerBuilder) mh.ay.AR, 0, (Object) uj2);
    }

    public final mh.ay.ay r() {
        this._setShortField(0, (short) mh.zz.uj.zz.HANDSHAKE.ordinal());
        return (mh.ay.ay) ((Object) this._initPointerField((FromPointerBuilder) mh.ay.AR, 0, 0));
    }

    public final boolean s() {
        return this.n() == mh.zz.uj.zz.RECEIVE_SETTINGS;
    }

    public final mh.rf.ay t() {
        assert (this.n() == mh.zz.uj.zz.RECEIVE_SETTINGS) : "Must check which() before get()ing a union member.";
        return (mh.rf.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) mh.rf.AS, 0, null, 0));
    }

    public final void ay(mh.rf.uj uj2) {
        this._setShortField(0, (short) mh.zz.uj.zz.RECEIVE_SETTINGS.ordinal());
        this._setPointerField((SetPointerBuilder) mh.rf.AS, 0, (Object) uj2);
    }

    public final mh.rf.ay u() {
        this._setShortField(0, (short) mh.zz.uj.zz.RECEIVE_SETTINGS.ordinal());
        return (mh.rf.ay) ((Object) this._initPointerField((FromPointerBuilder) mh.rf.AS, 0, 0));
    }
}
