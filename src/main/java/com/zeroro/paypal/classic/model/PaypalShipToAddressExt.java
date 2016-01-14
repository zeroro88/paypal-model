package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

/**
 * Created on 11/11/2015.
 */
public class PaypalShipToAddressExt extends PaypalShipToAddress {
    private String shiptophonenum;
    private String shipToCountryCode;

    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    public String getShiptophonenum() {
        return shiptophonenum;
    }

    public void setShiptophonenum(String shiptophonenum) {
        this.shiptophonenum = shiptophonenum;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("shiptophonenum", shiptophonenum).add("shipToCountryCode", shipToCountryCode)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalShipToAddressExt o = (PaypalShipToAddressExt) obj;
        return Objects.equal(this.shiptophonenum, o.shiptophonenum)
                && Objects.equal(this.shipToCountryCode, o.shipToCountryCode)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(shiptophonenum);
        hash.add(shipToCountryCode);

    }
}
