package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.DataList;
import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class mh$rf$uj
        extends StructReader {
    mh$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public final je.ay uu() {
        switch (this._getShortField(0)) {
            case 0: {
                return je.ay.PARTY_ONLY;
            }
            case 1: {
                return je.ay.EVERYONE;
            }
        }
        return je.ay._NOT_IN_SCHEMA;
    }

    public final boolean h() {
        return !this._pointerFieldIsNull(0);
    }

    public final DataList.Reader j() {
        return (DataList.Reader) this._getPointerField((FromPointerReaderRefDefault) DataList.factory, 0, null, 0);
    }
}
