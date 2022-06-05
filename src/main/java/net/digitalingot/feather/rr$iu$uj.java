package net.digitalingot.feather;

import org.capnproto.*;

public class rr$iu$uj {
    public static final StructSize AI = new StructSize(0, 2);
    public static final rf Ec = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory)Ec);

    public static final class rf
    extends StructFactory<ay, uj> {
        public final uj bv(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay bv(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.kB();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.bv(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.bv(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class uj
    extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public final boolean kC() {
            return !this._pointerFieldIsNull(0);
        }

        public final DataList.Reader kG() {
            return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, null, 0);
        }

        public final boolean kE() {
            return !this._pointerFieldIsNull(1);
        }

        public final DataList.Reader kH() {
            return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 1, null, 0);
        }
    }

    public static final class ay
    extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj kB() {
            return new uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final boolean kC() {
            return !this._pointerFieldIsNull(0);
        }

        public final DataList.Builder kD() {
            return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, null, 0);
        }

        public final void zz(DataList.Reader reader) {
            this._setPointerField((SetPointerBuilder)DataList.factory, 0, reader);
        }

        public final DataList.Builder yl(int n) {
            return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
        }

        public final boolean kE() {
            return !this._pointerFieldIsNull(1);
        }

        public final DataList.Builder kF() {
            return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 1, null, 0);
        }

        public final void sd(DataList.Reader reader) {
            this._setPointerField((SetPointerBuilder)DataList.factory, 1, reader);
        }

        public final DataList.Builder ek(int n) {
            return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 1, n);
        }
    }
}
