package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

/**
 * Created on 10/23/2015.
 */
public class PaypalEbayItemPaymentDetailsItemExt extends PaypalEbayItemPaymentDetailsItem {
    private String ebayCartId;

    public String getEbayCartId() {
        return ebayCartId;
    }

    public void setEbayCartId(String ebayCartId) {
        this.ebayCartId = ebayCartId;
    }


    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("ebayCartId", ebayCartId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalEbayItemPaymentDetailsItemExt o = (PaypalEbayItemPaymentDetailsItemExt) obj;
        return Objects.equal(this.ebayCartId, o.ebayCartId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {
        hash.add(ebayCartId);
    }
}
