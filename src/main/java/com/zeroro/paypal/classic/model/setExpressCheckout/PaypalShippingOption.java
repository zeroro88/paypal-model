package com.zeroro.paypal.classic.model.setExpressCheckout;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

public class PaypalShippingOption extends PaypalClassicModel {
    private String shippingOptionIsDefault;
    private String shippingOptionName;
    private String shippingOptionAmount;

    public String getShippingOptionIsDefault() {
        return shippingOptionIsDefault;
    }

    public void setShippingOptionIsDefault(String shippingOptionIsDefault) {
        this.shippingOptionIsDefault = shippingOptionIsDefault;
    }

    public String getShippingOptionName() {
        return shippingOptionName;
    }

    public void setShippingOptionName(String shippingOptionName) {
        this.shippingOptionName = shippingOptionName;
    }

    public String getShippingOptionAmount() {
        return shippingOptionAmount;
    }

    public void setShippingOptionAmount(String shippingOptionAmount) {
        this.shippingOptionAmount = shippingOptionAmount;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("shippingOptionIsDefault", shippingOptionIsDefault)
                .add("shippingOptionName", shippingOptionName)
                .add("shippingOptionAmount", shippingOptionAmount)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalShippingOption o = (PaypalShippingOption) obj;
        return Objects.equal(this.shippingOptionIsDefault, o.shippingOptionIsDefault)
                && Objects.equal(this.shippingOptionName, o.shippingOptionName)
                && Objects.equal(this.shippingOptionAmount, o.shippingOptionAmount)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(shippingOptionIsDefault);
        hash.add(shippingOptionName);
        hash.add(shippingOptionAmount);

    }
}
