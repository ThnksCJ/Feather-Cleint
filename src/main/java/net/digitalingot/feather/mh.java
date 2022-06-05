package net.digitalingot.feather;

import net.digitalingot.feather.je;
import org.capnproto.*;

public final class mh {

    public static class mh$rf {
        public static final StructSize AI = new StructSize(1, 1);
        public static final rf AS = new rf();
        public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory)AS);

        public static final class rf
        extends StructFactory<ay, uj> {
            public final uj bu(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new uj(segmentReader, n, n2, n3, s, n4);
            }

            public final ay bu(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final uj ay(ay ay2) {
                return ay2.g();
            }

            public StructReader asReader(Object object) {
                return this.ay((ay) object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.bu(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.bu(segmentReader, n, n2, n3, s, n4);
            }
        }

        public static final class uj
        extends StructReader {
            uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
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
                return (DataList.Reader)this._getPointerField((FromPointerReaderRefDefault)DataList.factory, 0, null, 0);
            }
        }

        public static final class ay
        extends StructBuilder {
            ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                super(segmentBuilder, n, n2, n3, s);
            }

            public final uj g() {
                return new uj((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

            public final void ay(je.ay ay2) {
                this._setShortField(0, (short)ay2.ordinal());
            }

            public final boolean h() {
                return !this._pointerFieldIsNull(0);
            }

            public final DataList.Builder i() {
                return (DataList.Builder)this._getPointerField((FromPointerBuilderRefDefault)DataList.factory, 0, null, 0);
            }

            public final void ay(DataList.Reader reader) {
                this._setPointerField((SetPointerBuilder)DataList.factory, 0, reader);
            }

            public final DataList.Builder dy(int n) {
                return (DataList.Builder)this._initPointerField((FromPointerBuilder)DataList.factory, 0, n);
            }
        }
    }

    public static class mh$ay {
        public static final StructSize AI = new StructSize(0, 1);
        public static final rf AR = new rf();
        public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory)AR);

        public static final class rf
        extends StructFactory<ay, uj> {
            public final uj sd(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new uj(segmentReader, n, n2, n3, s, n4);
            }

            public final ay sd(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final uj ay(ay ay2) {
                return ay2.c();
            }

            public StructReader asReader(Object object) {
                return this.ay((ay) object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.sd(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.sd(segmentReader, n, n2, n3, s, n4);
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

            public final uj c() {
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

    public static class mh$zz {
        public static final StructSize AI = new StructSize(1, 1);
        public static final rf AX = new rf();
        public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory)AX);

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
                return new zz((SegmentReader)this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final uj.ay l() {
                return new uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }

            public final uj.ay m() {
                this._setShortField(0, (short)0);
                this._clearPointerField(0);
                return new uj.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
            }
        }
    }
}
