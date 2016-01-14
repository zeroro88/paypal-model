package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

/**
 * Created on 10/23/2015.
 */
public class PaypalEbayItemPaymentDetailsItem extends PaypalClassicModel {
    private String ebayItemNumber;
    private String ebayItemAuctionTxnId;
    private String ebayItemOrderId;

    public String getEbayItemNumber() {
        return ebayItemNumber;
    }

    public void setEbayItemNumber(String ebayItemNumber) {
        this.ebayItemNumber = ebayItemNumber;
    }

    public String getEbayItemAuctionTxnId() {
        return ebayItemAuctionTxnId;
    }

    public void setEbayItemAuctionTxnId(String ebayItemAuctionTxnId) {
        this.ebayItemAuctionTxnId = ebayItemAuctionTxnId;
    }

    public String getEbayItemOrderId() {
        return ebayItemOrderId;
    }

    public void setEbayItemOrderId(String ebayItemOrderId) {

        this.ebayItemOrderId = ebayItemOrderId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("ebayItemNumber", ebayItemNumber)
                .add("ebayItemAuctionTxnId", ebayItemAuctionTxnId)
                .add("ebayItemOrderId", ebayItemOrderId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalEbayItemPaymentDetailsItem o = (PaypalEbayItemPaymentDetailsItem) obj;
        return Objects.equal(this.ebayItemNumber, o.ebayItemNumber)
                && Objects.equal(this.ebayItemAuctionTxnId, o.ebayItemAuctionTxnId)
                && Objects.equal(this.ebayItemOrderId, o.ebayItemOrderId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(ebayItemNumber);
        hash.add(ebayItemAuctionTxnId);
        hash.add(ebayItemOrderId);

    }
}
