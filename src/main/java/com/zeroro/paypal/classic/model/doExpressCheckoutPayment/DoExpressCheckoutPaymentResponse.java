package com.zeroro.paypal.classic.model.doExpressCheckoutPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class DoExpressCheckoutPaymentResponse extends PaypalClassicResponseModel {
    private String token;
    private String billingAgreementId;
    private String redirectRequired;
    private String note;
    private String msgSubId;
    private String successPageRedirectRequested;

    @PaypalCollection(format = "PAYMENTINFO_{index}_{name}")
    private List<PaymentInfoForDoExpressCheckoutRes> paymentInfoForDoExpressCheckoutRes;

    private String storeId;
    private String terminalId;
    private String shippingCalculationMode;
    private String insuranceOptionSelected;
    private String shippingOptionIsDefault;
    private String shippingOptionAmount;
    private String shippingOptionName;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }

    public String getRedirectRequired() {
        return redirectRequired;
    }

    public void setRedirectRequired(String redirectRequired) {
        this.redirectRequired = redirectRequired;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public String getSuccessPageRedirectRequested() {
        return successPageRedirectRequested;
    }

    public void setSuccessPageRedirectRequested(String successPageRedirectRequested) {
        this.successPageRedirectRequested = successPageRedirectRequested;
    }

    public List<PaymentInfoForDoExpressCheckoutRes> getPaymentInfoForDoExpressCheckoutRes() {
        return paymentInfoForDoExpressCheckoutRes;
    }

    public void setPaymentInfoForDoExpressCheckoutRes(List<PaymentInfoForDoExpressCheckoutRes> paymentInfoForDoExpressCheckoutRes) {
        this.paymentInfoForDoExpressCheckoutRes = paymentInfoForDoExpressCheckoutRes;
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

    public String getShippingCalculationMode() {
        return shippingCalculationMode;
    }

    public void setShippingCalculationMode(String shippingCalculationMode) {
        this.shippingCalculationMode = shippingCalculationMode;
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

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("token", token)
                .add("billingAgreementId", billingAgreementId)
                .add("redirectRequired", redirectRequired)
                .add("note", note)
                .add("msgSubId", msgSubId)
                .add("successPageRedirectRequested", successPageRedirectRequested)
                .add("paymentInformations", paymentInfoForDoExpressCheckoutRes)
                .add("storeId", storeId)
                .add("terminalId", terminalId)
                .add("shippingCalculationMode", shippingCalculationMode)
                .add("insuranceOptionSelected", insuranceOptionSelected)
                .add("shippingOptionIsDefault", shippingOptionIsDefault)
                .add("shippingOptionAmount", shippingOptionAmount)
                .add("shippingOptionName", shippingOptionName)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoExpressCheckoutPaymentResponse o = (DoExpressCheckoutPaymentResponse) obj;
        return Objects.equal(this.token, o.token)
                && Objects.equal(this.billingAgreementId, o.billingAgreementId)
                && Objects.equal(this.redirectRequired, o.redirectRequired)
                && Objects.equal(this.note, o.note)
                && Objects.equal(this.msgSubId, o.msgSubId)
                && Objects.equal(this.successPageRedirectRequested, o.successPageRedirectRequested)
                && Objects.equal(this.paymentInfoForDoExpressCheckoutRes, o.paymentInfoForDoExpressCheckoutRes)
                && Objects.equal(this.storeId, o.storeId)
                && Objects.equal(this.terminalId, o.terminalId)
                && Objects.equal(this.shippingCalculationMode, o.shippingCalculationMode)
                && Objects.equal(this.insuranceOptionSelected, o.insuranceOptionSelected)
                && Objects.equal(this.shippingOptionIsDefault, o.shippingOptionIsDefault)
                && Objects.equal(this.shippingOptionAmount, o.shippingOptionAmount)
                && Objects.equal(this.shippingOptionName, o.shippingOptionName)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(token);
        hash.add(billingAgreementId);
        hash.add(redirectRequired);
        hash.add(note);
        hash.add(msgSubId);
        hash.add(successPageRedirectRequested);
        hash.add(paymentInfoForDoExpressCheckoutRes);
        hash.add(storeId);
        hash.add(terminalId);
        hash.add(shippingCalculationMode);
        hash.add(insuranceOptionSelected);
        hash.add(shippingOptionIsDefault);
        hash.add(shippingOptionAmount);
        hash.add(shippingOptionName);

    }
}
