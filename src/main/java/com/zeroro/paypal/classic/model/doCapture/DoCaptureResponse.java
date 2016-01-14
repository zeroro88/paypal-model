package com.zeroro.paypal.classic.model.doCapture;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

/**
 * Created on 10/23/2015.
 */
public class DoCaptureResponse extends PaypalClassicResponseModel {
    private String authorizationId;
    private String msgSubId;
    //Payment Information Fields
    private String transactionId;
    private String parentTransactionId;
    private String receiptId;
    private String transactionType;
    private String paymentType;
    private String orderTime;
    private String amt;
    private String feeAmt;
    private String settleAmt;
    private String taxAmt;
    private String exchangeRate;
    private String paymentStatus;
    private String pendingReason;
    private String reasonCode;
    private String protectionEligibility;
    private String protectionEligibilityType;
    private String instrumentCategory;
    private String instrumentId;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(String parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(String feeAmt) {
        this.feeAmt = feeAmt;
    }

    public String getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(String settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPendingReason() {
        return pendingReason;
    }

    public void setPendingReason(String pendingReason) {
        this.pendingReason = pendingReason;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getProtectionEligibility() {
        return protectionEligibility;
    }

    public void setProtectionEligibility(String protectionEligibility) {
        this.protectionEligibility = protectionEligibility;
    }

    public String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }

    public void setProtectionEligibilityType(String protectionEligibilityType) {
        this.protectionEligibilityType = protectionEligibilityType;
    }

    public String getInstrumentCategory() {
        return instrumentCategory;
    }

    public void setInstrumentCategory(String instrumentCategory) {
        this.instrumentCategory = instrumentCategory;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("authorizationId", authorizationId)
                .add("msgSubId", msgSubId)
                .add("transactionId", transactionId)
                .add("parentTransactionId", parentTransactionId)
                .add("receiptId", receiptId)
                .add("transactionType", transactionType)
                .add("paymentType", paymentType)
                .add("orderTime", orderTime)
                .add("amt", amt)
                .add("feeAmt", feeAmt)
                .add("settleAmt", settleAmt)
                .add("taxAmt", taxAmt)
                .add("exchangeRate", exchangeRate)
                .add("paymentStatus", paymentStatus)
                .add("pendingReason", pendingReason)
                .add("reasonCode", reasonCode)
                .add("protectionEligibility", protectionEligibility)
                .add("protectionEligibilityType", protectionEligibilityType)
                .add("instrumentCategory", instrumentCategory)
                .add("instrumentId", instrumentId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoCaptureResponse o = (DoCaptureResponse) obj;
        return Objects.equal(this.authorizationId, o.authorizationId)
                && Objects.equal(this.msgSubId, o.msgSubId)
                && Objects.equal(this.transactionId, o.transactionId)
                && Objects.equal(this.parentTransactionId, o.parentTransactionId)
                && Objects.equal(this.receiptId, o.receiptId)
                && Objects.equal(this.transactionType, o.transactionType)
                && Objects.equal(this.paymentType, o.paymentType)
                && Objects.equal(this.orderTime, o.orderTime)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.feeAmt, o.feeAmt)
                && Objects.equal(this.settleAmt, o.settleAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.exchangeRate, o.exchangeRate)
                && Objects.equal(this.paymentStatus, o.paymentStatus)
                && Objects.equal(this.pendingReason, o.pendingReason)
                && Objects.equal(this.reasonCode, o.reasonCode)
                && Objects.equal(this.protectionEligibility, o.protectionEligibility)
                && Objects.equal(this.protectionEligibilityType, o.protectionEligibilityType)
                && Objects.equal(this.instrumentCategory, o.instrumentCategory)
                && Objects.equal(this.instrumentId, o.instrumentId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(authorizationId);
        hash.add(msgSubId);
        hash.add(transactionId);
        hash.add(parentTransactionId);
        hash.add(receiptId);
        hash.add(transactionType);
        hash.add(paymentType);
        hash.add(orderTime);
        hash.add(amt);
        hash.add(feeAmt);
        hash.add(settleAmt);
        hash.add(taxAmt);
        hash.add(exchangeRate);
        hash.add(paymentStatus);
        hash.add(pendingReason);
        hash.add(reasonCode);
        hash.add(protectionEligibility);
        hash.add(protectionEligibilityType);
        hash.add(instrumentCategory);
        hash.add(instrumentId);

    }
}

