package net.digitalingot.feather;

import org.capnproto.*;

public class rr$bu$sd$uj {
    public static final StructSize AI = new StructSize(1, 3);
    public static final rf Dq = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) Dq);

    public static final class rf
            extends StructFactory<ay, uj> {
        public final uj on(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay on(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.hN();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.on(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.on(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class uj
            extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public boolean hO() {
            return !this._pointerFieldIsNull(0);
        }

        public Text.Reader hW() {
            return (Text.Reader) this._getPointerField((FromPointerReaderBlobDefault) Text.factory, 0, null, 0, 0);
        }

        public final short hQ() {
            return this._getShortField(0);
        }

        public final int hR() {
            return this._getIntField(1);
        }

        public boolean hS() {
            return !this._pointerFieldIsNull(1);
        }

        public Text.Reader hX() {
            return (Text.Reader) this._getPointerField((FromPointerReaderBlobDefault) Text.factory, 1, null, 0, 0);
        }

        public boolean hU() {
            return !this._pointerFieldIsNull(2);
        }

        public Text.Reader hY() {
            return (Text.Reader) this._getPointerField((FromPointerReaderBlobDefault) Text.factory, 2, null, 0, 0);
        }
    }

    public static final class ay
            extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj hN() {
            return new uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final boolean hO() {
            return !this._pointerFieldIsNull(0);
        }

        public final Text.Builder hP() {
            return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 0, null, 0, 0);
        }

        public final void bu(Text.Reader reader) {
            this._setPointerField((SetPointerBuilder) Text.factory, 0, reader);
        }

        public final void gv(String string) {
            this._setPointerField((SetPointerBuilder) Text.factory, 0, new Text.Reader(string));
        }

        public final Text.Builder tl(int n) {
            return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 0, n);
        }

        public final short hQ() {
            return this._getShortField(0);
        }

        public final void uj(short s) {
            this._setShortField(0, s);
        }

        public final int hR() {
            return this._getIntField(1);
        }

        public final void vq(int n) {
            this._setIntField(1, n);
        }

        public final boolean hS() {
            return !this._pointerFieldIsNull(1);
        }

        public final Text.Builder hT() {
            return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 1, null, 0, 0);
        }

        public final void kl(Text.Reader reader) {
            this._setPointerField((SetPointerBuilder) Text.factory, 1, reader);
        }

        public final void ei(String string) {
            this._setPointerField((SetPointerBuilder) Text.factory, 1, new Text.Reader(string));
        }

        public final Text.Builder or(int n) {
            return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 1, n);
        }

        public final boolean hU() {
            return !this._pointerFieldIsNull(2);
        }

        public final Text.Builder hV() {
            return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 2, null, 0, 0);
        }

        public final void nn(Text.Reader reader) {
            this._setPointerField((SetPointerBuilder) Text.factory, 2, reader);
        }

        public final void nb(String string) {
            this._setPointerField((SetPointerBuilder) Text.factory, 2, new Text.Reader(string));
        }

        public final Text.Builder ff(int n) {
            return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 2, n);
        }
    }
}
