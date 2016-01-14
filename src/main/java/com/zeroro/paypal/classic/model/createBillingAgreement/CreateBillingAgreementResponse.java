package com.zeroro.paypal.classic.model.createBillingAgreement;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

public class CreateBillingAgreementResponse extends PaypalClassicResponseModel {
    private String billingAgreementId;

    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("billingAgreementId", billingAgreementId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final CreateBillingAgreementResponse o = (CreateBillingAgreementResponse) obj;
        return Objects.equal(this.billingAgreementId, o.billingAgreementId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(billingAgreementId);

    }
}
