package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$iu$sd$ay
        extends StructBuilder {
    rr$iu$sd$ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
        super(segmentBuilder, n, n2, n3, s);
    }

    public rr.iu.sd.zz kJ() {
        switch (this._getShortField(0)) {
            case 0: {
                return rr.iu.sd.zz.LIST_UPDATE;
            }
            case 1: {
                return rr.iu.sd.zz.REMOVE_ALL;
            }
        }
        return rr.iu.sd.zz._NOT_IN_SCHEMA;
    }

    public final rr.iu.sd.uj kK() {
        return new rr.iu.sd.uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
    }

    public final boolean kL() {
        return this.kJ() == rr.iu.sd.zz.LIST_UPDATE;
    }

    public final rr.iu.uj.ay kM() {
        assert (this.kJ() == rr.iu.sd.zz.LIST_UPDATE) : "Must check which() before get()ing a union member.";
        return (rr.iu.uj.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) rr.iu.uj.Ec, 0, null, 0));
    }

    public final void ay(rr.iu.uj.uj uj2) {
        this._setShortField(0, (short) rr.iu.sd.zz.LIST_UPDATE.ordinal());
        this._setPointerField((SetPointerBuilder) rr.iu.uj.Ec, 0, (Object) uj2);
    }

    public final rr.iu.uj.ay kN() {
        this._setShortField(0, (short) rr.iu.sd.zz.LIST_UPDATE.ordinal());
        return (rr.iu.uj.ay) ((Object) this._initPointerField((FromPointerBuilder) rr.iu.uj.Ec, 0, 0));
    }

    public final boolean kO() {
        return this.kJ() == rr.iu.sd.zz.REMOVE_ALL;
    }

    public final Void kP() {
        assert (this.kJ() == rr.iu.sd.zz.REMOVE_ALL) : "Must check which() before get()ing a union member.";
        return Void.VOID;
    }

    public final void kl(Void void_) {
        this._setShortField(0, (short) rr.iu.sd.zz.REMOVE_ALL.ordinal());
    }
}
