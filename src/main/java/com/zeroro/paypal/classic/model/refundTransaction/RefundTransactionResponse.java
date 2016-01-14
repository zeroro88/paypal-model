package com.zeroro.paypal.classic.model.refundTransaction;

import com.google.common.base.MoreObjects;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

/**
 * Created on 10/23/2015.
 */
public class RefundTransactionResponse extends PaypalClassicResponseModel {
    private String refundTransactionId;
    private String feerefundAmt;
    private String grossRefundAmt;
    private String netRefundAmt;
    //It is named totalRefundedAmt in paypal online doc.
    private String totalRefundedAmount;
    private String currencyCode;
    private String refundInfo;
    private String msgSubId;
    //    RefundInfoType
    private String refundStatus;
    private String pendingReason;

    public String getRefundTransactionId() {
        return refundTransactionId;
    }

    public void setRefundTransactionId(String refundTransactionId) {
        this.refundTransactionId = refundTransactionId;
    }

    public String getFeerefundAmt() {
        return feerefundAmt;
    }

    public void setFeerefundAmt(String feerefundAmt) {
        this.feerefundAmt = feerefundAmt;
    }

    public String getGrossRefundAmt() {
        return grossRefundAmt;
    }

    public void setGrossRefundAmt(String grossRefundAmt) {
        this.grossRefundAmt = grossRefundAmt;
    }

    public String getNetRefundAmt() {
        return netRefundAmt;
    }

    public void setNetRefundAmt(String netRefundAmt) {
        this.netRefundAmt = netRefundAmt;
    }

    public String getTotalRefundedAmount() {
        return totalRefundedAmount;
    }

    public void setTotalRefundedAmount(String totalRefundedAmount) {
        this.totalRefundedAmount = totalRefundedAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(String refundInfo) {
        this.refundInfo = refundInfo;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getPendingReason() {
        return pendingReason;
    }

    public void setPendingReason(String pendingReason) {
        this.pendingReason = pendingReason;
    }

    protected MoreObjects.ToStringHelper toStringHelper() {
        return MoreObjects.toStringHelper(this);
    }

    @Override
    public String toString(){
        return toStringHelper().toString();
    }
}

