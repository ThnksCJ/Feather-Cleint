package net.digitalingot.feather;

import org.capnproto.*;

public class mh$zz {
    public static final StructSize AI = new StructSize(1, 1);
    public static final rf AX = new rf();
    public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory) AX);

    public static final class rf
            extends StructFactory<ay, zz> {
        public final zz kl(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new zz(segmentReader, n, n2, n3, s, n4);
        }

        public final ay kl(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final zz ay(ay ay2) {
            return ay2.k();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.kl(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.kl(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static final class zz
            extends StructReader {
        zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public uj.uj z() {
            return new uj.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
        }
    }

    public static final class ay
            extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final zz k() {
            return new zz((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final uj.ay l() {
            return new uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
        }

        public final uj.ay m() {
            this._setShortField(0, (short) 0);
            this._clearPointerField(0);
            return new uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
        }
    }
}
