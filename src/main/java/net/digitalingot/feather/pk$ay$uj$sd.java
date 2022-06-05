package net.digitalingot.feather;

import org.capnproto.Data;
import org.capnproto.FromPointerReaderBlobDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class pk$ay$uj$sd
        extends StructReader {
    pk$ay$uj$sd(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public boolean bS() {
        return !this._pointerFieldIsNull(0);
    }

    public Data.Reader cH() {
        return (Data.Reader) this._getPointerField((FromPointerReaderBlobDefault) Data.factory, 0, null, 0, 0);
    }

    public pk.ay.uj.rf.uj cI() {
        return new pk.ay.uj.rf.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
    }
}
