package com.zeroro.paypal.classic.model.doExpressCheckoutPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 1/8/2016.
 */
public class PaymentInfoForDoExpressCheckoutRes extends PaypalClassicModel {
    private String transactionId;
    private String ebayItemAuctionTxnId;
    private String parentTransactionId;
    private String receiptId;
    private String transactionType;
    private String paymentType;
    private String expectedEcheckClearDate;
    private String orderTime;
    private String amt;
    private String currencyCode;
    private String feeAmt;
    private String settleAmt;
    private String taxAmt;
    private String exchangeRate;
    private String paymentStatus;
    private String pendingReason;
    private String reasonCode;
    private String holdDecision;
    private String shippingMethod;
    private String protectionEligibility;
    private String protectionEligibilityType;
    private String receiptReferenceNumber;
    private String shippingAmt;
    private String handlingAmt;
    private String paymentRequestId;
    private String instrumentCategory;
    private String instrumentId;
    private String offerCode;
    private String offerTrackingId;
    private String shortMessage;
    private String longMessage;
    private String errorCode;
    private String severityCode;
    private String ack;
    private String sellerPaypalAccountId;
    private String secureMerchantAccountId;
    private String sellerId;
    private String sellerUserName;
    private String sellerRegistrationDate;
    //Not support n,m type
//    @PaypalCollection(format = "L_PAYMENTINFO_{index}_{name}")
//    private String L_PAYMENTINFO_n_FMFfilterIDm;
//    @PaypalCollection(format = "L_PAYMENTINFO_{index}_{name}")
//    private String L_PAYMENTINFO_n_FMFfilterNAMEm;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getEbayItemAuctionTxnId() {
        return ebayItemAuctionTxnId;
    }

    public void setEbayItemAuctionTxnId(String ebayItemAuctionTxnId) {
        this.ebayItemAuctionTxnId = ebayItemAuctionTxnId;
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

    public String getExpectedEcheckClearDate() {
        return expectedEcheckClearDate;
    }

    public void setExpectedEcheckClearDate(String expectedEcheckClearDate) {
        this.expectedEcheckClearDate = expectedEcheckClearDate;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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

    public String getHoldDecision() {
        return holdDecision;
    }

    public void setHoldDecision(String holdDecision) {
        this.holdDecision = holdDecision;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
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

    public String getReceiptReferenceNumber() {
        return receiptReferenceNumber;
    }

    public void setReceiptReferenceNumber(String receiptReferenceNumber) {
        this.receiptReferenceNumber = receiptReferenceNumber;
    }

    public String getShippingAmt() {
        return shippingAmt;
    }

    public void setShippingAmt(String shippingAmt) {
        this.shippingAmt = shippingAmt;
    }

    public String getHandlingAmt() {
        return handlingAmt;
    }

    public void setHandlingAmt(String handlingAmt) {
        this.handlingAmt = handlingAmt;
    }

    public String getPaymentRequestId() {
        return paymentRequestId;
    }

    public void setPaymentRequestId(String paymentRequestId) {
        this.paymentRequestId = paymentRequestId;
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

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public String getOfferTrackingId() {
        return offerTrackingId;
    }

    public void setOfferTrackingId(String offerTrackingId) {
        this.offerTrackingId = offerTrackingId;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getLongMessage() {
        return longMessage;
    }

    public void setLongMessage(String longMessage) {
        this.longMessage = longMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getSeverityCode() {
        return severityCode;
    }

    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public String getSellerPaypalAccountId() {
        return sellerPaypalAccountId;
    }

    public void setSellerPaypalAccountId(String sellerPaypalAccountId) {
        this.sellerPaypalAccountId = sellerPaypalAccountId;
    }

    public String getSecureMerchantAccountId() {
        return secureMerchantAccountId;
    }

    public void setSecureMerchantAccountId(String secureMerchantAccountId) {
        this.secureMerchantAccountId = secureMerchantAccountId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public String getSellerRegistrationDate() {
        return sellerRegistrationDate;
    }

    public void setSellerRegistrationDate(String sellerRegistrationDate) {
        this.sellerRegistrationDate = sellerRegistrationDate;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("transactionId", transactionId)
                .add("ebayItemAuctionTxnId", ebayItemAuctionTxnId)
                .add("parentTransactionId", parentTransactionId)
                .add("receiptId", receiptId)
                .add("transactionType", transactionType)
                .add("paymentType", paymentType)
                .add("expectedEcheckClearDate", expectedEcheckClearDate)
                .add("orderTime", orderTime)
                .add("amt", amt)
                .add("currencyCode", currencyCode)
                .add("feeAmt", feeAmt)
                .add("settleAmt", settleAmt)
                .add("taxAmt", taxAmt)
                .add("exchangeRate", exchangeRate)
                .add("paymentStatus", paymentStatus)
                .add("pendingReason", pendingReason)
                .add("reasonCode", reasonCode)
                .add("holdDecision", holdDecision)
                .add("shippingMethod", shippingMethod)
                .add("protectionEligibility", protectionEligibility)
                .add("protectionEligibilityType", protectionEligibilityType)
                .add("receiptReferenceNumber", receiptReferenceNumber)
                .add("shippingAmt", shippingAmt)
                .add("handlingAmt", handlingAmt)
                .add("paymentRequestId", paymentRequestId)
                .add("instrumentCategory", instrumentCategory)
                .add("instrumentId", instrumentId)
                .add("offerCode", offerCode)
                .add("offerTrackingId", offerTrackingId)
                .add("shortMessage", shortMessage)
                .add("longMessage", longMessage)
                .add("errorCode", errorCode)
                .add("severityCode", severityCode)
                .add("ack", ack)
                .add("sellerPaypalAccountId", sellerPaypalAccountId)
                .add("secureMerchantAccountId", secureMerchantAccountId)
                .add("sellerId", sellerId)
                .add("sellerUserName", sellerUserName)
                .add("sellerRegistrationDate", sellerRegistrationDate)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaymentInfoForDoExpressCheckoutRes o = (PaymentInfoForDoExpressCheckoutRes) obj;
        return Objects.equal(this.transactionId, o.transactionId)
                && Objects.equal(this.ebayItemAuctionTxnId, o.ebayItemAuctionTxnId)
                && Objects.equal(this.parentTransactionId, o.parentTransactionId)
                && Objects.equal(this.receiptId, o.receiptId)
                && Objects.equal(this.transactionType, o.transactionType)
                && Objects.equal(this.paymentType, o.paymentType)
                && Objects.equal(this.expectedEcheckClearDate, o.expectedEcheckClearDate)
                && Objects.equal(this.orderTime, o.orderTime)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.feeAmt, o.feeAmt)
                && Objects.equal(this.settleAmt, o.settleAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.exchangeRate, o.exchangeRate)
                && Objects.equal(this.paymentStatus, o.paymentStatus)
                && Objects.equal(this.pendingReason, o.pendingReason)
                && Objects.equal(this.reasonCode, o.reasonCode)
                && Objects.equal(this.holdDecision, o.holdDecision)
                && Objects.equal(this.shippingMethod, o.shippingMethod)
                && Objects.equal(this.protectionEligibility, o.protectionEligibility)
                && Objects.equal(this.protectionEligibilityType, o.protectionEligibilityType)
                && Objects.equal(this.receiptReferenceNumber, o.receiptReferenceNumber)
                && Objects.equal(this.shippingAmt, o.shippingAmt)
                && Objects.equal(this.handlingAmt, o.handlingAmt)
                && Objects.equal(this.paymentRequestId, o.paymentRequestId)
                && Objects.equal(this.instrumentCategory, o.instrumentCategory)
                && Objects.equal(this.instrumentId, o.instrumentId)
                && Objects.equal(this.offerCode, o.offerCode)
                && Objects.equal(this.offerTrackingId, o.offerTrackingId)
                && Objects.equal(this.shortMessage, o.shortMessage)
                && Objects.equal(this.longMessage, o.longMessage)
                && Objects.equal(this.errorCode, o.errorCode)
                && Objects.equal(this.severityCode, o.severityCode)
                && Objects.equal(this.ack, o.ack)
                && Objects.equal(this.sellerPaypalAccountId, o.sellerPaypalAccountId)
                && Objects.equal(this.secureMerchantAccountId, o.secureMerchantAccountId)
                && Objects.equal(this.sellerId, o.sellerId)
                && Objects.equal(this.sellerUserName, o.sellerUserName)
                && Objects.equal(this.sellerRegistrationDate, o.sellerRegistrationDate)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(transactionId);
        hash.add(ebayItemAuctionTxnId);
        hash.add(parentTransactionId);
        hash.add(receiptId);
        hash.add(transactionType);
        hash.add(paymentType);
        hash.add(expectedEcheckClearDate);
        hash.add(orderTime);
        hash.add(amt);
        hash.add(currencyCode);
        hash.add(feeAmt);
        hash.add(settleAmt);
        hash.add(taxAmt);
        hash.add(exchangeRate);
        hash.add(paymentStatus);
        hash.add(pendingReason);
        hash.add(reasonCode);
        hash.add(holdDecision);
        hash.add(shippingMethod);
        hash.add(protectionEligibility);
        hash.add(protectionEligibilityType);
        hash.add(receiptReferenceNumber);
        hash.add(shippingAmt);
        hash.add(handlingAmt);
        hash.add(paymentRequestId);
        hash.add(instrumentCategory);
        hash.add(instrumentId);
        hash.add(offerCode);
        hash.add(offerTrackingId);
        hash.add(shortMessage);
        hash.add(longMessage);
        hash.add(errorCode);
        hash.add(severityCode);
        hash.add(ack);
        hash.add(sellerPaypalAccountId);
        hash.add(secureMerchantAccountId);
        hash.add(sellerId);
        hash.add(sellerUserName);
        hash.add(sellerRegistrationDate);

    }
}
