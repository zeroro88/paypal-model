package com.zeroro.paypal.classic.model.doExpressCheckoutPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.*;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class DoExpressCheckoutPaymentRequest extends PaypalClassicRequestModel {
    private String method = "DoExpressCheckoutPayment";
    private String token;
    private String payerId;
    private String msgSubId;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<String> paymentAction;
    private String giftMessage;
    private String giftReceiptEnable;
    private String giftWrapName;
    private String giftWrapAmount;
    private String buyerMarketingEmail;
    private String surveyQuestion;
    private String surveyChoiceSelected;
    private String buttonSource;
    private String skipBACreation;
    private String returnFMFDetails;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaypalPaymentDetail> paymentDetails;

    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaypalShipToAddressExt> shipToAdderssExts;
    @PaypalCollection(format = "L_PAYMENTREQUEST_{index}_{name}")
    private List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItems;
    @PaypalCollection(format = "L_PAYMENTREQUEST_{index}_{name}")
    private List<List<PaypalEbayItemPaymentDetailsItemExt>> ebayItemPaymentDetailsItems;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}{name}")
    private List<PaypalDiscountInfoType> discountInfoTypes;

    private String insuranceOptionSelected;

    private String shippingOptionIsDefault;
    private String shippingOptionAmount;
    private String shippingOptionName;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaypalSellerDetails> sellerDetailses;

    public String getMethod() {
        return method;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public String getGiftReceiptEnable() {
        return giftReceiptEnable;
    }

    public void setGiftReceiptEnable(String giftReceiptEnable) {
        this.giftReceiptEnable = giftReceiptEnable;
    }

    public String getGiftWrapName() {
        return giftWrapName;
    }

    public void setGiftWrapName(String giftWrapName) {
        this.giftWrapName = giftWrapName;
    }

    public String getGiftWrapAmount() {
        return giftWrapAmount;
    }

    public void setGiftWrapAmount(String giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }

    public String getBuyerMarketingEmail() {
        return buyerMarketingEmail;
    }

    public void setBuyerMarketingEmail(String buyerMarketingEmail) {
        this.buyerMarketingEmail = buyerMarketingEmail;
    }

    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public String getSurveyChoiceSelected() {
        return surveyChoiceSelected;
    }

    public void setSurveyChoiceSelected(String surveyChoiceSelected) {
        this.surveyChoiceSelected = surveyChoiceSelected;
    }

    public String getButtonSource() {
        return buttonSource;
    }

    public void setButtonSource(String buttonSource) {
        this.buttonSource = buttonSource;
    }

    public String getSkipBACreation() {
        return skipBACreation;
    }

    public void setSkipBACreation(String skipBACreation) {
        this.skipBACreation = skipBACreation;
    }

    public String getReturnFMFDetails() {
        return returnFMFDetails;
    }

    public void setReturnFMFDetails(String returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    public List<PaypalPaymentDetail> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaypalPaymentDetail> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<PaypalShipToAddressExt> getShipToAdderssExts() {
        return shipToAdderssExts;
    }

    public void setShipToAdderssExts(List<PaypalShipToAddressExt> shipToAdderssExts) {
        this.shipToAdderssExts = shipToAdderssExts;
    }

    public List<List<PaypalPaymentDetailItemExt2>> getPaymentDetailsItems() {
        return paymentDetailsItems;
    }

    public void setPaymentDetailsItems(List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItems) {
        this.paymentDetailsItems = paymentDetailsItems;
    }

    public List<List<PaypalEbayItemPaymentDetailsItemExt>> getEbayItemPaymentDetailsItems() {
        return ebayItemPaymentDetailsItems;
    }

    public void setEbayItemPaymentDetailsItems(List<List<PaypalEbayItemPaymentDetailsItemExt>> ebayItemPaymentDetailsItems) {
        this.ebayItemPaymentDetailsItems = ebayItemPaymentDetailsItems;
    }

    public List<PaypalDiscountInfoType> getDiscountInfoTypes() {
        return discountInfoTypes;
    }

    public void setDiscountInfoTypes(List<PaypalDiscountInfoType> discountInfoTypes) {
        this.discountInfoTypes = discountInfoTypes;
    }

    public String getInsuranceOptionSelected() {
        return insuranceOptionSelected;
    }

    public void setInsuranceOptionSelected(String insuranceOptionSelected) {
        this.insuranceOptionSelected = insuranceOptionSelected;
    }

    public String getShippingOptionIsDefault() {
        return shippingOptionIsDefault;
    }

    public void setShippingOptionIsDefault(String shippingOptionIsDefault) {
        this.shippingOptionIsDefault = shippingOptionIsDefault;
    }

    public String getShippingOptionAmount() {
        return shippingOptionAmount;
    }

    public void setShippingOptionAmount(String shippingOptionAmount) {
        this.shippingOptionAmount = shippingOptionAmount;
    }

    public String getShippingOptionName() {
        return shippingOptionName;
    }

    public void setShippingOptionName(String shippingOptionName) {
        this.shippingOptionName = shippingOptionName;
    }

    public List<PaypalSellerDetails> getSellerDetailses() {
        return sellerDetailses;
    }

    public void setSellerDetailses(List<PaypalSellerDetails> sellerDetailses) {
        this.sellerDetailses = sellerDetailses;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("token", token)
                .add("payerId", payerId)
                .add("msgSubId", msgSubId)
                .add("giftMessage", giftMessage)
                .add("paymentAction", paymentAction)
                .add("giftReceiptEnable", giftReceiptEnable)
                .add("giftWrapName", giftWrapName)
                .add("giftWrapAmount", giftWrapAmount)
                .add("buyerMarketingEmail", buyerMarketingEmail)
                .add("surveyQuestion", surveyQuestion)
                .add("surveyChoiceSelected", surveyChoiceSelected)
                .add("buttonSource", buttonSource)
                .add("skipBACreation", skipBACreation)
                .add("returnFMFDetails", returnFMFDetails)
                .add("paymentDetails", paymentDetails)
                .add("shipToAdderssExts", shipToAdderssExts)
                .add("paymentDetailsItems", paymentDetailsItems)
                .add("ebayItemPaymentDetailsItems", ebayItemPaymentDetailsItems)
                .add("discountInfoTypes", discountInfoTypes)
                .add("insuranceOptionSelected", insuranceOptionSelected)
                .add("shippingOptionIsDefault", shippingOptionIsDefault)
                .add("shippingOptionAmount", shippingOptionAmount)
                .add("shippingOptionName", shippingOptionName)
                .add("sellerDetailses", sellerDetailses)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoExpressCheckoutPaymentRequest o = (DoExpressCheckoutPaymentRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.token, o.token)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.msgSubId, o.msgSubId)
                && Objects.equal(this.paymentAction, o.paymentAction)
                && Objects.equal(this.giftMessage, o.giftMessage)
                && Objects.equal(this.giftReceiptEnable, o.giftReceiptEnable)
                && Objects.equal(this.giftWrapName, o.giftWrapName)
                && Objects.equal(this.giftWrapAmount, o.giftWrapAmount)
                && Objects.equal(this.buyerMarketingEmail, o.buyerMarketingEmail)
                && Objects.equal(this.surveyQuestion, o.surveyQuestion)
                && Objects.equal(this.surveyChoiceSelected, o.surveyChoiceSelected)
                && Objects.equal(this.buttonSource, o.buttonSource)
                && Objects.equal(this.skipBACreation, o.skipBACreation)
                && Objects.equal(this.returnFMFDetails, o.returnFMFDetails)
                && Objects.equal(this.paymentDetails, o.paymentDetails)
                && Objects.equal(this.shipToAdderssExts, o.shipToAdderssExts)
                && Objects.equal(this.paymentDetailsItems, o.paymentDetailsItems)
                && Objects.equal(this.ebayItemPaymentDetailsItems, o.ebayItemPaymentDetailsItems)
                && Objects.equal(this.discountInfoTypes, o.discountInfoTypes)
                && Objects.equal(this.insuranceOptionSelected, o.insuranceOptionSelected)
                && Objects.equal(this.shippingOptionIsDefault, o.shippingOptionIsDefault)
                && Objects.equal(this.shippingOptionAmount, o.shippingOptionAmount)
                && Objects.equal(this.shippingOptionName, o.shippingOptionName)
                && Objects.equal(this.sellerDetailses, o.sellerDetailses)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(token);
        hash.add(payerId);
        hash.add(msgSubId);
        hash.add(paymentAction);
        hash.add(giftMessage);
        hash.add(giftReceiptEnable);
        hash.add(giftWrapName);
        hash.add(giftWrapAmount);
        hash.add(buyerMarketingEmail);
        hash.add(surveyQuestion);
        hash.add(surveyChoiceSelected);
        hash.add(buttonSource);
        hash.add(skipBACreation);
        hash.add(returnFMFDetails);
        hash.add(paymentDetails);
        hash.add(shipToAdderssExts);
        hash.add(paymentDetailsItems);
        hash.add(ebayItemPaymentDetailsItems);
        hash.add(discountInfoTypes);
        hash.add(insuranceOptionSelected);
        hash.add(shippingOptionIsDefault);
        hash.add(shippingOptionAmount);
        hash.add(shippingOptionName);
        hash.add(sellerDetailses);

    }

    public List<String> getPaymentAction() {
        return paymentAction;
    }

    public void setPaymentAction(List<String> paymentAction) {
        this.paymentAction = paymentAction;
    }
}
