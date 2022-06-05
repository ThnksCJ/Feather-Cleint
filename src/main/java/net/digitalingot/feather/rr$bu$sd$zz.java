package net.digitalingot.feather;

import org.capnproto.*;

public final class rr$bu$sd$zz
        extends StructReader {
    rr$bu$sd$zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public boolean hZ() {
        return !this._pointerFieldIsNull(0);
    }

    public rr.bu.sd.uj.uj iA() {
        return (rr.bu.sd.uj.uj) ((Object) this._getPointerField((FromPointerReaderRefDefault) rr.bu.sd.uj.Dq, 0, null, 0));
    }

    public boolean hF() {
        return !this._pointerFieldIsNull(1);
    }

    public Text.Reader iB() {
        return (Text.Reader) this._getPointerField((FromPointerReaderBlobDefault) Text.factory, 1, null, 0, 0);
    }

    public final boolean hH() {
        return !this._pointerFieldIsNull(2);
    }

    public final TextList.Reader iC() {
        return (TextList.Reader) this._getPointerField((FromPointerReaderRefDefault) TextList.factory, 2, null, 0);
    }

    public final boolean hJ() {
        return !this._pointerFieldIsNull(3);
    }

    public final TextList.Reader iD() {
        return (TextList.Reader) this._getPointerField((FromPointerReaderRefDefault) TextList.factory, 3, null, 0);
    }

    public final boolean hL() {
        return !this._pointerFieldIsNull(4);
    }

    public final TextList.Reader iE() {
        return (TextList.Reader) this._getPointerField((FromPointerReaderRefDefault) TextList.factory, 4, null, 0);
    }
}
