package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.Data;
import org.capnproto.FromPointerReaderBlobDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class lx$rf$uj
extends StructReader {
    lx$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final int ye() {
        return this._getIntField(0);
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

    public final long vk() {
        return this._getLongField(1);
    }

    public boolean ud() {
        return !this._pointerFieldIsNull(0);
    }

    public Data.Reader oe() {
        return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, null, 0, 0);
    }
}
