package net.digitalingot.feather;

import org.capnproto.*;

public class rr$bu {
    public static final StructSize AI = new StructSize(1, 1);
    public static final rf Dn = new rf();
    public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) Dn);

    public static final class rf
            extends StructFactory<ay, uj> {
        public final uj op(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return new uj(segmentReader, n, n2, n3, s, n4);
        }

        public final ay op(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return new ay(segmentBuilder, n, n2, n3, s);
        }

        public final StructSize structSize() {
            return AI;
        }

        public final uj ay(ay ay2) {
            return ay2.gT();
        }

        public StructReader asReader(Object object) {
            return this.ay((ay) object);
        }

        public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            return this.op(segmentBuilder, n, n2, n3, s);
        }

        public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            return this.op(segmentReader, n, n2, n3, s, n4);
        }
    }

    public static class zz {
        public static final StructSize AI = new StructSize(1, 1);
        public static final rf Do = new rf();
        public static final StructList.Factory<ay, uj> AK = new StructList.Factory((StructFactory) Do);

        public static final class rf
                extends StructFactory<ay, uj> {
            public final uj ww(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new uj(segmentReader, n, n2, n3, s, n4);
            }

            public final ay ww(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final uj ay(ay ay2) {
                return ay2.gX();
            }

            public StructReader asReader(Object object) {
                return this.ay((ay) object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.ww(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.ww(segmentReader, n, n2, n3, s, n4);
            }
        }

        public static final class uj
                extends StructReader {
            uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                super(segmentReader, n, n2, n3, s, n4);
            }

            public boolean gY() {
                return !this._pointerFieldIsNull(0);
            }

            public Text.Reader hB() {
                return (Text.Reader) this._getPointerField((FromPointerReaderBlobDefault) Text.factory, 0, null, 0, 0);
            }

            public final short hA() {
                return this._getShortField(0);
            }
        }

        public static final class ay
                extends StructBuilder {
            ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                super(segmentBuilder, n, n2, n3, s);
            }

            public final uj gX() {
                return new uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final boolean gY() {
                return !this._pointerFieldIsNull(0);
            }

            public final Text.Builder gZ() {
                return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 0, null, 0, 0);
            }

            public final void zz(Text.Reader reader) {
                this._setPointerField((SetPointerBuilder) Text.factory, 0, reader);
            }

            public final void jw(String string) {
                this._setPointerField((SetPointerBuilder) Text.factory, 0, new Text.Reader(string));
            }

            public final Text.Builder tf(int n) {
                return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 0, n);
            }

            public final short hA() {
                return this._getShortField(0);
            }

            public final void rf(short s) {
                this._setShortField(0, s);
            }
        }
    }

    public static class sd {
        public static final StructSize AI = new StructSize(0, 5);
        public static final rf Dp = new rf();
        public static final StructList.Factory<ay, zz> AK = new StructList.Factory((StructFactory) Dp);

        public static classrr$bu$sd$uj {
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

        public static final class rf
                extends StructFactory<ay, zz> {
            public final zz hs(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return new zz(segmentReader, n, n2, n3, s, n4);
            }

            public final ay hs(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return new ay(segmentBuilder, n, n2, n3, s);
            }

            public final StructSize structSize() {
                return AI;
            }

            public final zz bu(ay ay2) {
                return ay2.hC();
            }

            public StructReader asReader(Object object) {
                return this.bu((ay) object);
            }

            public Object constructBuilder(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                return this.hs(segmentBuilder, n, n2, n3, s);
            }

            public Object constructReader(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                return this.hs(segmentReader, n, n2, n3, s, n4);
            }
        }

        public static final class zz
                extends StructReader {
            zz(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
                super(segmentReader, n, n2, n3, s, n4);
            }

            public boolean hZ() {
                return !this._pointerFieldIsNull(0);
            }

            public uj.uj iA() {
                return (uj.uj) ((Object) this._getPointerField((FromPointerReaderRefDefault) uj.Dq, 0, null, 0));
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

        public static final class ay
                extends StructBuilder {
            ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
                super(segmentBuilder, n, n2, n3, s);
            }

            public final zz hC() {
                return new zz((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
            }

            public final uj.ay hD() {
                return (uj.ay) ((Object) this._getPointerField((FromPointerBuilderRefDefault) uj.Dq, 0, null, 0));
            }

            public final void ay(uj.uj uj2) {
                this._setPointerField((SetPointerBuilder) uj.Dq, 0, (Object) uj2);
            }

            public final uj.ay hE() {
                return (uj.ay) ((Object) this._initPointerField((FromPointerBuilder) uj.Dq, 0, 0));
            }

            public final boolean hF() {
                return !this._pointerFieldIsNull(1);
            }

            public final Text.Builder hG() {
                return (Text.Builder) this._getPointerField((FromPointerBuilderBlobDefault) Text.factory, 1, null, 0, 0);
            }

            public final void sd(Text.Reader reader) {
                this._setPointerField((SetPointerBuilder) Text.factory, 1, reader);
            }

            public final void pm(String string) {
                this._setPointerField((SetPointerBuilder) Text.factory, 1, new Text.Reader(string));
            }

            public final Text.Builder sw(int n) {
                return (Text.Builder) this._initPointerField((FromPointerBuilder) Text.factory, 1, n);
            }

            public final boolean hH() {
                return !this._pointerFieldIsNull(2);
            }

            public final TextList.Builder hI() {
                return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 2, null, 0);
            }

            public final void rf(TextList.Reader reader) {
                this._setPointerField((SetPointerBuilder) TextList.factory, 2, reader);
            }

            public final TextList.Builder gb(int n) {
                return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 2, n);
            }

            public final boolean hJ() {
                return !this._pointerFieldIsNull(3);
            }

            public final TextList.Builder hK() {
                return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 3, null, 0);
            }

            public final void uj(TextList.Reader reader) {
                this._setPointerField((SetPointerBuilder) TextList.factory, 3, reader);
            }

            public final TextList.Builder yd(int n) {
                return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 3, n);
            }

            public final boolean hL() {
                return !this._pointerFieldIsNull(4);
            }

            public final TextList.Builder hM() {
                return (TextList.Builder) this._getPointerField((FromPointerBuilderRefDefault) TextList.factory, 4, null, 0);
            }

            public final void zz(TextList.Reader reader) {
                this._setPointerField((SetPointerBuilder) TextList.factory, 4, reader);
            }

            public final TextList.Builder wi(int n) {
                return (TextList.Builder) this._initPointerField((FromPointerBuilder) TextList.factory, 4, n);
            }
        }
    }

    public static final class uj
            extends StructReader {
        uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
            super(segmentReader, n, n2, n3, s, n4);
        }

        public bu.uj gW() {
            return new bu.uj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
        }
    }

    public static final class ay
            extends StructBuilder {
        ay(SegmentBuilder segmentBuilder, int n, int n2, int n3, short s) {
            super(segmentBuilder, n, n2, n3, s);
        }

        public final uj gT() {
            return new uj((SegmentReader) this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
        }

        public final bu.ay gU() {
            return new bu.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
        }

        public final bu.ay gV() {
            this._setShortField(0, (short) 0);
            this._clearPointerField(0);
            return new bu.ay(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
        }
    }
}
