package com.zeroro.paypal.classic.model.doDirectPayment;

import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.FMFfilter;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

/**
 * Created on 10/23/2015.
 */
public class DoDirectPaymentResponse extends PaypalClassicResponseModel {
    private String transactionId;
    private String amt;
    private String avscode;
    private String cvv2match;
    @PaypalCollection(format = "L_{name}{index}")
    private List<FMFfilter> FMFfilters;

    private String paymentAdviceCode;
    private ThreeDSecureResponse threeDSecureResponse;

    public List<FMFfilter> getFMFfilters() {
        return FMFfilters;
    }

    public void setFMFfilters(List<FMFfilter> FMFfilters) {
        this.FMFfilters = FMFfilters;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ThreeDSecureResponse getThreeDSecureResponse() {
        return threeDSecureResponse;
    }

    public void setThreeDSecureResponse(ThreeDSecureResponse threeDSecureResponse) {
        this.threeDSecureResponse = threeDSecureResponse;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getAvscode() {
        return avscode;
    }

    public void setAvscode(String avscode) {
        this.avscode = avscode;
    }

    public String getCvv2match() {
        return cvv2match;
    }

    public void setCvv2match(String cvv2match) {
        this.cvv2match = cvv2match;
    }

    public String getPaymentAdviceCode() {
        return paymentAdviceCode;
    }

    public void setPaymentAdviceCode(String paymentAdviceCode) {
        this.paymentAdviceCode = paymentAdviceCode;
    }

    @Override
    protected ToStringHelper toStringHelper() {

        return super.toStringHelper().add("transactionId", transactionId)
                .add("amt", amt)
                .add("avscode", avscode)
                .add("cvv2match", cvv2match)
                .add("FMFfilters", FMFfilters)
                .add("paymentAdviceCode", paymentAdviceCode)
                .add("threeDSecureResponse", threeDSecureResponse)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoDirectPaymentResponse o = (DoDirectPaymentResponse) obj;
        return Objects.equal(this.transactionId, o.transactionId)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.avscode, o.avscode)
                && Objects.equal(this.cvv2match, o.cvv2match)
                && Objects.equal(this.FMFfilters, o.FMFfilters)
                && Objects.equal(this.paymentAdviceCode, o.paymentAdviceCode)
                && Objects.equal(this.threeDSecureResponse, o.threeDSecureResponse)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(transactionId);
        hash.add(amt);
        hash.add(avscode);
        hash.add(cvv2match);
        hash.add(FMFfilters);
        hash.add(paymentAdviceCode);
        hash.add(threeDSecureResponse);

    }

}
