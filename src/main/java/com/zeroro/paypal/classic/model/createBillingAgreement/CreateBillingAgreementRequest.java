package com.zeroro.paypal.classic.model.createBillingAgreement;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class CreateBillingAgreementRequest extends PaypalClassicRequestModel {
    private String method = "CreateBillingAgreement";
    private String token;

    public String getMethod() {
        return method;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("token", token)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final CreateBillingAgreementRequest o = (CreateBillingAgreementRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.token, o.token)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(token);

    }
}
