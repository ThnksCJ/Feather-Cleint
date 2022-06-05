package net.digitalingot.feather;

import org.capnproto.FromPointerReaderRefDefault;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;

public final class pk$rl$uj$uj
        extends StructReader {
    pk$rl$uj$uj(SegmentReader segmentReader, int n, int n2, int n3, short s, int n4) {
        super(segmentReader, n, n2, n3, s, n4);
    }

    public pk.rl.uj.zz eA() {
        switch (this._getShortField(0)) {
            case 0: {
                return pk.rl.uj.zz.AUTHENTICATION_SUCCESS;
            }
            case 1: {
                return pk.rl.uj.zz.SOFT_ERROR;
            }
            case 2: {
                return pk.rl.uj.zz.EMOTE_UPDATE;
            }
            case 3: {
                return pk.rl.uj.zz.OPTION_REFRESH_PROMPT;
            }
            case 4: {
                return pk.rl.uj.zz.BULK_OPTION_RESPONSE;
            }
            case 5: {
                return pk.rl.uj.zz.COSMETIC_SET;
            }
            case 6: {
                return pk.rl.uj.zz.COSMETIC_OWNED;
            }
            case 7: {
                return pk.rl.uj.zz.PARTY_INFO;
            }
            case 8: {
                return pk.rl.uj.zz.PARTY_INVITE;
            }
            case 9: {
                return pk.rl.uj.zz.PARTY_INVITE_DENIED;
            }
            case 10: {
                return pk.rl.uj.zz.PARTY_LEAVE;
            }
            case 11: {
                return pk.rl.uj.zz.P2P_JOIN_REQUEST;
            }
            case 12: {
                return pk.rl.uj.zz.P2P_JOIN_ACCEPTED;
            }
        }
        return pk.rl.uj.zz._NOT_IN_SCHEMA;
    }

    public final boolean eC() {
        return this.eA() == pk.rl.uj.zz.AUTHENTICATION_SUCCESS;
    }

    public final Void eD() {
        assert (this.eA() == pk.rl.uj.zz.AUTHENTICATION_SUCCESS) : "Must check which() before get()ing a union member.";
        return Void.VOID;
    }

    public final boolean eE() {
        return this.eA() == pk.rl.uj.zz.SOFT_ERROR;
    }

    public boolean fN() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.xn.uj fO() {
        assert (this.eA() == pk.rl.uj.zz.SOFT_ERROR) : "Must check which() before get()ing a union member.";
        return (pk.xn.uj) this._getPointerField((FromPointerReaderRefDefault) pk.xn.Df, 0, null, 0);
    }

    public final boolean eH() {
        return this.eA() == pk.rl.uj.zz.EMOTE_UPDATE;
    }

    public boolean fP() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.zz.uj fQ() {
        assert (this.eA() == pk.rl.uj.zz.EMOTE_UPDATE) : "Must check which() before get()ing a union member.";
        return (pk.zz.uj) this._getPointerField((FromPointerReaderRefDefault) pk.zz.CE, 0, null, 0);
    }

    public final boolean eK() {
        return this.eA() == pk.rl.uj.zz.OPTION_REFRESH_PROMPT;
    }

    public boolean fR() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.sd.uj fS() {
        assert (this.eA() == pk.rl.uj.zz.OPTION_REFRESH_PROMPT) : "Must check which() before get()ing a union member.";
        return (pk.sd.uj) this._getPointerField((FromPointerReaderRefDefault) pk.sd.CF, 0, null, 0);
    }

    public final boolean eN() {
        return this.eA() == pk.rl.uj.zz.BULK_OPTION_RESPONSE;
    }

    public boolean fT() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.ay.zz fU() {
        assert (this.eA() == pk.rl.uj.zz.BULK_OPTION_RESPONSE) : "Must check which() before get()ing a union member.";
        return (pk.ay.zz) ((Object) this._getPointerField((FromPointerReaderRefDefault) pk.ay.Cx, 0, null, 0));
    }

    public final boolean eQ() {
        return this.eA() == pk.rl.uj.zz.COSMETIC_SET;
    }

    public boolean fV() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.uj.zz fW() {
        assert (this.eA() == pk.rl.uj.zz.COSMETIC_SET) : "Must check which() before get()ing a union member.";
        return (pk.uj.zz) ((Object) this._getPointerField((FromPointerReaderRefDefault) pk.uj.CC, 0, null, 0));
    }

    public final boolean eT() {
        return this.eA() == pk.rl.uj.zz.COSMETIC_OWNED;
    }

    public boolean fX() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.rf.uj fY() {
        assert (this.eA() == pk.rl.uj.zz.COSMETIC_OWNED) : "Must check which() before get()ing a union member.";
        return (pk.rf.uj) ((Object) this._getPointerField((FromPointerReaderRefDefault) pk.rf.CB, 0, null, 0));
    }

    public final boolean eW() {
        return this.eA() == pk.rl.uj.zz.PARTY_INFO;
    }

    public boolean fZ() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.nn.uj gl() {
        assert (this.eA() == pk.rl.uj.zz.PARTY_INFO) : "Must check which() before get()ing a union member.";
        return (pk.nn.uj) this._getPointerField((FromPointerReaderRefDefault) pk.nn.CI, 0, null, 0);
    }

    public final boolean eZ() {
        return this.eA() == pk.rl.uj.zz.PARTY_INVITE;
    }

    public boolean gA() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.ed.uj gB() {
        assert (this.eA() == pk.rl.uj.zz.PARTY_INVITE) : "Must check which() before get()ing a union member.";
        return (pk.ed.uj) this._getPointerField((FromPointerReaderRefDefault) pk.ed.CJ, 0, null, 0);
    }

    public final boolean fB() {
        return this.eA() == pk.rl.uj.zz.PARTY_INVITE_DENIED;
    }

    public boolean gC() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.zs.uj gD() {
        assert (this.eA() == pk.rl.uj.zz.PARTY_INVITE_DENIED) : "Must check which() before get()ing a union member.";
        return (pk.zs.uj) this._getPointerField((FromPointerReaderRefDefault) pk.zs.CK, 0, null, 0);
    }

    public final boolean fE() {
        return this.eA() == pk.rl.uj.zz.PARTY_LEAVE;
    }

    public boolean gE() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.nl.uj gF() {
        assert (this.eA() == pk.rl.uj.zz.PARTY_LEAVE) : "Must check which() before get()ing a union member.";
        return (pk.nl.uj) this._getPointerField((FromPointerReaderRefDefault) pk.nl.CL, 0, null, 0);
    }

    public final boolean fH() {
        return this.eA() == pk.rl.uj.zz.P2P_JOIN_REQUEST;
    }

    public boolean gG() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.kl.uj gH() {
        assert (this.eA() == pk.rl.uj.zz.P2P_JOIN_REQUEST) : "Must check which() before get()ing a union member.";
        return (pk.kl.uj) this._getPointerField((FromPointerReaderRefDefault) pk.kl.CH, 0, null, 0);
    }

    public final boolean fK() {
        return this.eA() == pk.rl.uj.zz.P2P_JOIN_ACCEPTED;
    }

    public boolean gI() {
        return !this._pointerFieldIsNull(0);
    }

    public pk.bu.uj gJ() {
        assert (this.eA() == pk.rl.uj.zz.P2P_JOIN_ACCEPTED) : "Must check which() before get()ing a union member.";
        return (pk.bu.uj) this._getPointerField((FromPointerReaderRefDefault) pk.bu.CG, 0, null, 0);
    }
}
