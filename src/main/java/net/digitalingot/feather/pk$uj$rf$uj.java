package net.digitalingot.feather;

import org.capnproto.*;

public final class pk$uj$rf$uj
extends StructReader {
    pk$uj$rf$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public boolean bS() {
        return !this._pointerFieldIsNull(0);
    }

    public Data.Reader cH() {
        return (Data.Reader)this._getPointerField((FromPointerReaderBlobDefault)Data.factory, 0, null, 0, 0);
    }

    public final boolean cL() {
        return !this._pointerFieldIsNull(1);
    }

    public final TextList.Reader cN() {
        return (TextList.Reader)this._getPointerField((FromPointerReaderRefDefault)TextList.factory, 1, null, 0);
    }
}
