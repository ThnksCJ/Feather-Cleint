package net.digitalingot.feather;

import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class pk$ay$uj$rf$uj
extends StructReader {
    pk$ay$uj$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public pk.ay.uj.rf.zz bW() {
        switch (this._getShortField(0)) {
            case 0: {
                return pk.ay.uj.rf.zz.FEATHER;
            }
            case 1: {
                return pk.ay.uj.rf.zz.OTHER;
            }
        }
        return pk.ay.uj.rf.zz._NOT_IN_SCHEMA;
    }

    public final boolean bY() {
        return this.bW() == pk.ay.uj.rf.zz.FEATHER;
    }

    public boolean cD() {
        return !this._pointerFieldIsNull(1);
    }

    public pk.ay.uj.zz.zz cE() {
        assert (this.bW() == pk.ay.uj.rf.zz.FEATHER) : "Must check which() before get()ing a union member.";
        return (pk.ay.uj.zz.zz)this._getPointerField((FromPointerReaderRefDefault)pk.ay.uj.zz.CA, 1, null, 0);
    }

    public final boolean cB() {
        return this.bW() == pk.ay.uj.rf.zz.OTHER;
    }

    public final Void cC() {
        assert (this.bW() == pk.ay.uj.rf.zz.OTHER) : "Must check which() before get()ing a union member.";
        return Void.VOID;
    }
}
