package com.zeroro.paypal.classic.model.setExpressCheckout;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

public class PaypalBillingAgreementDetails extends PaypalClassicModel {
    private String billingType;
    private String billingAgreementDescription;
    private String paymentType;
    private String billingAgreementCustom;

    public String getBillingAgreementCustom() {
        return billingAgreementCustom;
    }

    public void setBillingAgreementCustom(String billingAgreementCustom) {
        this.billingAgreementCustom = billingAgreementCustom;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }

    public void setBillingAgreementDescription(String billingAgreementDescription) {
        this.billingAgreementDescription = billingAgreementDescription;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("billingType", billingType)
                .add("billingAgreementDescription", billingAgreementDescription)
                .add("paymentType", paymentType)
                .add("billingAgreementCustom", billingAgreementCustom)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalBillingAgreementDetails o = (PaypalBillingAgreementDetails) obj;
        return Objects.equal(this.billingType, o.billingType)
                && Objects.equal(this.billingAgreementDescription, o.billingAgreementDescription)
                && Objects.equal(this.paymentType, o.paymentType)
                && Objects.equal(this.billingAgreementCustom, o.billingAgreementCustom)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {
        hash.add(billingType);
        hash.add(billingAgreementDescription);
        hash.add(paymentType);
        hash.add(billingAgreementCustom);

    }

}
