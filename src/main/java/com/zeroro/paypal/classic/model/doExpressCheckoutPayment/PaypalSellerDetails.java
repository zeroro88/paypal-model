package com.zeroro.paypal.classic.model.doExpressCheckoutPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 11/11/2015.
 */
public class PaypalSellerDetails extends PaypalClassicModel {
    private String sellerId;
    private String sellerUserName;
    private String sellerRegistrationDate;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public String getSellerRegistrationDate() {
        return sellerRegistrationDate;
    }

    public void setSellerRegistrationDate(String sellerRegistrationDate) {
        this.sellerRegistrationDate = sellerRegistrationDate;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("sellerId", sellerId)
                .add("sellerUserName", sellerUserName)
                .add("sellerRegistrationDate", sellerRegistrationDate)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalSellerDetails o = (PaypalSellerDetails) obj;
        return Objects.equal(this.sellerId, o.sellerId)
                && Objects.equal(this.sellerUserName, o.sellerUserName)
                && Objects.equal(this.sellerRegistrationDate, o.sellerRegistrationDate)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(sellerId);
        hash.add(sellerUserName);
        hash.add(sellerRegistrationDate);

    }
}
