package net.digitalingot.feather;

import org.capnproto.*;

public class rr$sd {
    public static final StructSize AI = new StructSize(0, 1);
    public static final rf Dm = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory)Dm);

    /*
     * Illegal identifiers - recommend switching to table mode
     */
    public static final class rf
    extends StructFactory<ay, uj> {
        public final uj do(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay do(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.gS();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.do(segmentBuilder, n, n2, n3, s)
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.do(segmentReader, n, n2, n3, s, n4)
        }
    }

    public static final class uj
    extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public boolean d() {
            return !this._pointerFieldIsNull(0);
        }

        public Text.Reader f() {
            return (Text.Reader)this._getPointerField((FromPointerReaderBlobDefault)Text.factory, 0, null, 0, 0);
        }
    }

    public static final class ay
    extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj gS() {
            return new uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final boolean d() {
            return !this._pointerFieldIsNull(0);
        }

        public final Text.Builder e() {
            return (Text.Builder)this._getPointerField((FromPointerBuilderBlobDefault)Text.factory, 0, null, 0, 0);
        }

        public final void ay(Text.Reader reader) {
            this._setPointerField((SetPointerBuilder)Text.factory, 0, reader);
        }

        public final void hj(String string) {
            this._setPointerField((SetPointerBuilder)Text.factory, 0, new Text.Reader(string));
        }

        public final Text.Builder it(int n) {
            return (Text.Builder)this._initPointerField((FromPointerBuilder)Text.factory, 0, n);
        }
    }
}
