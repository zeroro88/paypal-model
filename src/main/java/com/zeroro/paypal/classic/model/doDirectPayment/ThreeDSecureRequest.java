package com.zeroro.paypal.classic.model.doDirectPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 10/23/2015.
 */
public class ThreeDSecureRequest extends PaypalClassicModel {
    private String authStatus3DS;
    private String mpiVendor3DS;
    private String cavv;
    private String eci3ds;
    private String xId;

    public String getAuthStatus3DS() {
        return authStatus3DS;
    }

    public void setAuthStatus3DS(String authStatus3DS) {
        this.authStatus3DS = authStatus3DS;
    }

    public String getMpiVendor3DS() {
        return mpiVendor3DS;
    }

    public void setMpiVendor3DS(String mpiVendor3DS) {
        this.mpiVendor3DS = mpiVendor3DS;
    }

    public String getCavv() {
        return cavv;
    }

    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    public String getEci3ds() {
        return eci3ds;
    }

    public void setEci3ds(String eci3ds) {
        this.eci3ds = eci3ds;
    }

    public String getxId() {
        return xId;
    }

    public void setxId(String xId) {
        this.xId = xId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("authStatus3DS", authStatus3DS)
                .add("mpiVendor3DS", mpiVendor3DS)
                .add("cavv", cavv)
                .add("eci3ds", eci3ds)
                .add("xId", xId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final ThreeDSecureRequest o = (ThreeDSecureRequest) obj;
        return Objects.equal(this.authStatus3DS, o.authStatus3DS)
                && Objects.equal(this.mpiVendor3DS, o.mpiVendor3DS)
                && Objects.equal(this.cavv, o.cavv)
                && Objects.equal(this.eci3ds, o.eci3ds)
                && Objects.equal(this.xId, o.xId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(authStatus3DS);
        hash.add(mpiVendor3DS);
        hash.add(cavv);
        hash.add(eci3ds);
        hash.add(xId);

    }
}
