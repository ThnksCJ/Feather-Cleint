package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.*;

public class lx$rf {
    public static final StructSize AI = new StructSize(2, 1);
    public static final rf Ba = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) Ba);

    public static final class rf
            extends StructFactory<ay, uj> {
        public final uj ed(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay ed(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.A();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.ed(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.ed(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class uj
            extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
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
            return (Data.Reader) this._getPointerField((FromPointerReaderBlobDefault) Data.factory, 0, null, 0, 0);
        }
    }

    public static final class ay
            extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj A() {
            return new uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final int ye() {
            return this._getIntField(0);
        }

        public final void jo(int n) {
            this._setIntField(0, n);
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

        public final void ay(je.uj uj2) {
            this._setShortField(2, (short) uj2.ordinal());
        }

        public final long vk() {
            return this._getLongField(1);
        }

        public final void kl(long l) {
            this._setLongField(1, l);
        }

        public final boolean ud() {
            return !this._pointerFieldIsNull(0);
        }

        public final Data.Builder my() {
            return (Data.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Data.factory, 0, null, 0, 0);
        }

        public final void rf(Data.Reader reader) {
            this._setPointerField((SetPointerBuilder) Data.factory, 0, reader);
        }

        public final void nn(byte[] byArray) {
            this._setPointerField((SetPointerBuilder) Data.factory, 0, new Data.Reader(byArray));
        }

        public final Data.Builder bv(int n) {
            return (Data.Builder) this._initPointerField((FromPointerBuilder) Data.factory, 0, n);
        }
    }
}
