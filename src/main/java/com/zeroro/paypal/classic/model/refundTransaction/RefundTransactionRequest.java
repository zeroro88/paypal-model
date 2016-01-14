package com.zeroro.paypal.classic.model.refundTransaction;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class RefundTransactionRequest extends PaypalClassicRequestModel {
    private String method = "RefundTransaction";
    private String transactionId;
    private String payerId;
    private String invocieId;
    private String refundType;
    private String amt;
    private String currencyCode;
    private String note;
    private String retryUntil;
    private String refundSource;
    private String refundAdvice;
    private String shippingAmt;
    private String taxAmt;
//    private String merchantdatankey;
//    private String merchentdatanvalue;

    public String getMsgsubid() {
        return msgsubid;
    }

    public void setMsgsubid(String msgsubid) {
        this.msgsubid = msgsubid;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getInvocieId() {
        return invocieId;
    }

    public void setInvocieId(String invocieId) {
        this.invocieId = invocieId;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRetryUntil() {
        return retryUntil;
    }

    public void setRetryUntil(String retryUntil) {
        this.retryUntil = retryUntil;
    }

    public String getRefundSource() {
        return refundSource;
    }

    public void setRefundSource(String refundSource) {
        this.refundSource = refundSource;
    }

    public String getRefundAdvice() {
        return refundAdvice;
    }

    public void setRefundAdvice(String refundAdvice) {
        this.refundAdvice = refundAdvice;
    }

    public String getShippingAmt() {
        return shippingAmt;
    }

    public void setShippingAmt(String shippingAmt) {
        this.shippingAmt = shippingAmt;
    }

    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    private String msgsubid;

    public String getMethod() {
        return method;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("transactionId", transactionId)
                .add("payerId", payerId)
                .add("invocieId", invocieId)
                .add("refundType", refundType)
                .add("amt", amt)
                .add("currencyCode", currencyCode)
                .add("note", note)
                .add("retryUntil", retryUntil)
                .add("refundSource", refundSource)
                .add("refundAdvice", refundAdvice)
                .add("shippingAmt", shippingAmt)
                .add("taxAmt", taxAmt)
                .add("msgsubid", msgsubid)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final RefundTransactionRequest o = (RefundTransactionRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.transactionId, o.transactionId)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.invocieId, o.invocieId)
                && Objects.equal(this.refundType, o.refundType)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.note, o.note)
                && Objects.equal(this.retryUntil, o.retryUntil)
                && Objects.equal(this.refundSource, o.refundSource)
                && Objects.equal(this.refundAdvice, o.refundAdvice)
                && Objects.equal(this.shippingAmt, o.shippingAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.msgsubid, o.msgsubid)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(transactionId);
        hash.add(payerId);
        hash.add(invocieId);
        hash.add(refundType);
        hash.add(amt);
        hash.add(currencyCode);
        hash.add(note);
        hash.add(retryUntil);
        hash.add(refundSource);
        hash.add(refundAdvice);
        hash.add(shippingAmt);
        hash.add(taxAmt);
        hash.add(msgsubid);

    }
}
