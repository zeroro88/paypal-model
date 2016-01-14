package com.zeroro.paypal.classic.model.doReferenceTransactionNVP;

import com.zeroro.paypal.classic.model.*;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class DoReferenceTransactionRequest extends PaypalClassicRequestModel {
    private String method = "DoReferenceTransaction";
    private String referenceId;
    private String paymentAction;
    private String paymentType;

    private String ipAddress;
    private String reqConfirmShipping;
    private String riskSessionCorrelationId;
    private String merchantSessionId;
    private String returnFMFDetails;
    private String softDescriptor;
    private String softDescriptorCity;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<String> paymentReason;
    private String msgSubId;

    private PaypalShipToAddress shipToAddress;
    private String shipToPhoneNum;

    private PaypalPaymentDetail paymentDetail;
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalPaymentDetailItemExt> paymentDetailItemExtList;
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalEbayItemPaymentDetailsItem> ebayItemPaymentDetailsItems;
    private PaypalCreditCard creditCard;
    private PaypalPayerInformation payerInformation;
    private PaypalAddress address;

    public String getMethod() {
        return method;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getPaymentAction() {
        return paymentAction;
    }

    public void setPaymentAction(String paymentAction) {
        this.paymentAction = paymentAction;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getReqConfirmShipping() {
        return reqConfirmShipping;
    }

    public void setReqConfirmShipping(String reqConfirmShipping) {
        this.reqConfirmShipping = reqConfirmShipping;
    }

    public String getRiskSessionCorrelationId() {
        return riskSessionCorrelationId;
    }

    public void setRiskSessionCorrelationId(String riskSessionCorrelationId) {
        this.riskSessionCorrelationId = riskSessionCorrelationId;
    }

    public String getMerchantSessionId() {
        return merchantSessionId;
    }

    public void setMerchantSessionId(String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
    }

    public String getReturnFMFDetails() {
        return returnFMFDetails;
    }

    public void setReturnFMFDetails(String returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public String getSoftDescriptorCity() {
        return softDescriptorCity;
    }

    public void setSoftDescriptorCity(String softDescriptorCity) {
        this.softDescriptorCity = softDescriptorCity;
    }


    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public PaypalShipToAddress getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(PaypalShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getShipToPhoneNum() {
        return shipToPhoneNum;
    }

    public void setShipToPhoneNum(String shipToPhoneNum) {
        this.shipToPhoneNum = shipToPhoneNum;
    }

    public PaypalPaymentDetail getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(PaypalPaymentDetail paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public List<PaypalPaymentDetailItemExt> getPaymentDetailItemExtList() {
        return paymentDetailItemExtList;
    }

    public void setPaymentDetailItemExtList(List<PaypalPaymentDetailItemExt> paymentDetailItemExtList) {
        this.paymentDetailItemExtList = paymentDetailItemExtList;
    }

    public List<PaypalEbayItemPaymentDetailsItem> getEbayItemPaymentDetailsItems() {
        return ebayItemPaymentDetailsItems;
    }

    public void setEbayItemPaymentDetailsItems(List<PaypalEbayItemPaymentDetailsItem> ebayItemPaymentDetailsItems) {
        this.ebayItemPaymentDetailsItems = ebayItemPaymentDetailsItems;
    }

    public PaypalCreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(PaypalCreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public PaypalPayerInformation getPayerInformation() {
        return payerInformation;
    }

    public void setPayerInformation(PaypalPayerInformation payerInformation) {
        this.payerInformation = payerInformation;
    }

    public PaypalAddress getAddress() {
        return address;
    }

    public void setAddress(PaypalAddress address) {
        this.address = address;
    }

    public List<String> getPaymentReason() {
        return paymentReason;
    }

    public void setPaymentReason(List<String> paymentReason) {
        this.paymentReason = paymentReason;
    }
}
