package com.zeroro.paypal.classic.model.doReferenceTransactionNVP;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.FMFfilter;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class DoReferenceTransactionResponse extends PaypalClassicResponseModel {
    private String avsCode;
    private String cvv2match;
    private String billingAgreementId;
    @PaypalCollection(format = "L_{name}{index}")
    private List<FMFfilter> FMFfilters;
    private String paymentAdviceCode;
    private String msgSubId;
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
    private String storeId;
    private String terminalId;
    private String instrumentCategory;
    private String instrumentId;

    public List<FMFfilter> getFMFfilters() {
        return FMFfilters;
    }

    public void setFMFfilters(List<FMFfilter> FMFfilters) {
        this.FMFfilters = FMFfilters;
    }

    public String getAvsCode() {
        return avsCode;
    }

    public void setAvsCode(String avsCode) {
        this.avsCode = avsCode;
    }

    public String getCvv2match() {
        return cvv2match;
    }

    public void setCvv2match(String cvv2match) {
        this.cvv2match = cvv2match;
    }

    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }


    public String getPaymentAdviceCode() {
        return paymentAdviceCode;
    }

    public void setPaymentAdviceCode(String paymentAdviceCode) {
        this.paymentAdviceCode = paymentAdviceCode;
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

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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

        return super.toStringHelper().add("avsCode", avsCode)
                .add("cvv2match", cvv2match)
                .add("billingAgreementId", billingAgreementId)
                .add("FMFfilters", FMFfilters)
                .add("paymentAdviceCode", paymentAdviceCode)
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
                .add("storeId", storeId)
                .add("terminalId", terminalId)
                .add("instrumentCategory", instrumentCategory)
                .add("instrumentId", instrumentId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoReferenceTransactionResponse o = (DoReferenceTransactionResponse) obj;
        return Objects.equal(this.avsCode, o.avsCode)
                && Objects.equal(this.cvv2match, o.cvv2match)
                && Objects.equal(this.billingAgreementId, o.billingAgreementId)
                && Objects.equal(this.FMFfilters, o.FMFfilters)
                && Objects.equal(this.paymentAdviceCode, o.paymentAdviceCode)
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
                && Objects.equal(this.storeId, o.storeId)
                && Objects.equal(this.terminalId, o.terminalId)
                && Objects.equal(this.instrumentCategory, o.instrumentCategory)
                && Objects.equal(this.instrumentId, o.instrumentId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(avsCode);
        hash.add(cvv2match);
        hash.add(billingAgreementId);
        hash.add(FMFfilters);
        hash.add(paymentAdviceCode);
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
        hash.add(storeId);
        hash.add(terminalId);
        hash.add(instrumentCategory);
        hash.add(instrumentId);

    }
}
