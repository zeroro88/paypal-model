package com.zeroro.paypal.classic.model.getTransactionDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class GetTransactionDetailsRequest extends PaypalClassicRequestModel {
    private String method = "GetTransactionDetails";
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMethod() {
        return method;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("transactionId", transactionId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final GetTransactionDetailsRequest o = (GetTransactionDetailsRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.transactionId, o.transactionId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(transactionId);

    }
}
