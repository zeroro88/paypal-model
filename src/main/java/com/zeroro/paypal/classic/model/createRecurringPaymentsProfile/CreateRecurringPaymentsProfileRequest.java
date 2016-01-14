package com.zeroro.paypal.classic.model.createRecurringPaymentsProfile;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.*;

import java.util.List;

public class CreateRecurringPaymentsProfileRequest extends PaypalClassicRequestModel {
    private String method = "CreateRecurringPaymentsProfile";
    private String token;
    private String subscriberName;
    private String profileStartDate;
    private String profileReference;
    private String desc;
    private String maxFailedPayments;
    private String autoBillOutAmt;
    //Billing Period Details Fields
    private String billingPeriod;
    private String billingFrequency;
    private String totalBillingCycles;
    private String amt;
    private String trialBillingPeriod;
    private String trialBillingFrequency;
    private String trialTotalBillingCycles;
    private String trialAmt;
    private String currencyCode;
    private String shippingAmt;
    private String taxAmt;
    private String initAmt;
    private String failedInitAmtAction;
    private PaypalShipToAddress shipToAddress;
    private String shipToPhoneNum;
    private PaypalCreditCard creditCard;
    //Payer Information Fields
    private String email;
    private String payerId;
    private String payerStatus;
    private String countryCode;
    private String business;
    private PaypalPayerName payerName;
    private PaypalAddress address;
    private String softDescriptor;
    private String softDescriptorCity;
    private List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItems;

    public String getMethod() {
        return method;
    }

    public List<List<PaypalPaymentDetailItemExt2>> getPaymentDetailsItems() {
        return paymentDetailsItems;
    }

    public void setPaymentDetailsItems(List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItems) {
        this.paymentDetailsItems = paymentDetailsItems;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getProfileStartDate() {
        return profileStartDate;
    }

    public void setProfileStartDate(String profileStartDate) {
        this.profileStartDate = profileStartDate;
    }

    public String getProfileReference() {
        return profileReference;
    }

    public void setProfileReference(String profileReference) {
        this.profileReference = profileReference;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMaxFailedPayments() {
        return maxFailedPayments;
    }

    public void setMaxFailedPayments(String maxFailedPayments) {
        this.maxFailedPayments = maxFailedPayments;
    }

    public String getAutoBillOutAmt() {
        return autoBillOutAmt;
    }

    public void setAutoBillOutAmt(String autoBillOutAmt) {
        this.autoBillOutAmt = autoBillOutAmt;
    }

    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public String getBillingFrequency() {
        return billingFrequency;
    }

    public void setBillingFrequency(String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    public String getTotalBillingCycles() {
        return totalBillingCycles;
    }

    public void setTotalBillingCycles(String totalBillingCycles) {
        this.totalBillingCycles = totalBillingCycles;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getTrialBillingPeriod() {
        return trialBillingPeriod;
    }

    public void setTrialBillingPeriod(String trialBillingPeriod) {
        this.trialBillingPeriod = trialBillingPeriod;
    }

    public String getTrialBillingFrequency() {
        return trialBillingFrequency;
    }

    public void setTrialBillingFrequency(String trialBillingFrequency) {
        this.trialBillingFrequency = trialBillingFrequency;
    }

    public String getTrialTotalBillingCycles() {
        return trialTotalBillingCycles;
    }

    public void setTrialTotalBillingCycles(String trialTotalBillingCycles) {
        this.trialTotalBillingCycles = trialTotalBillingCycles;
    }

    public String getTrialAmt() {
        return trialAmt;
    }

    public void setTrialAmt(String trialAmt) {
        this.trialAmt = trialAmt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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

    public String getInitAmt() {
        return initAmt;
    }

    public void setInitAmt(String initAmt) {
        this.initAmt = initAmt;
    }

    public String getFailedInitAmtAction() {
        return failedInitAmtAction;
    }

    public void setFailedInitAmtAction(String failedInitAmtAction) {
        this.failedInitAmtAction = failedInitAmtAction;
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

    public PaypalCreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(PaypalCreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerStatus() {
        return payerStatus;
    }

    public void setPayerStatus(String payerStatus) {
        this.payerStatus = payerStatus;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public PaypalPayerName getPayerName() {
        return payerName;
    }

    public void setPayerName(PaypalPayerName payerName) {
        this.payerName = payerName;
    }

    public PaypalAddress getAddress() {
        return address;
    }

    public void setAddress(PaypalAddress address) {
        this.address = address;
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


    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("token", token)
                .add("subscriberName", subscriberName)
                .add("profileStartDate", profileStartDate)
                .add("profileReference", profileReference)
                .add("desc", desc)
                .add("maxFailedPayments", maxFailedPayments)
                .add("autoBillOutAmt", autoBillOutAmt)
                .add("billingPeriod", billingPeriod)
                .add("billingFrequency", billingFrequency)
                .add("totalBillingCycles", totalBillingCycles)
                .add("amt", amt)
                .add("trialBillingPeriod", trialBillingPeriod)
                .add("trialBillingFrequency", trialBillingFrequency)
                .add("trialTotalBillingCycles", trialTotalBillingCycles)
                .add("trialAmt", trialAmt)
                .add("currencyCode", currencyCode)
                .add("shippingAmt", shippingAmt)
                .add("taxAmt", taxAmt)
                .add("initAmt", initAmt)
                .add("failedInitAmtAction", failedInitAmtAction)
                .add("shipToAddress", shipToAddress)
                .add("shipToPhoneNum", shipToPhoneNum)
                .add("creditCard", creditCard)
                .add("email", email)
                .add("payerId", payerId)
                .add("payerStatus", payerStatus)
                .add("countryCode", countryCode)
                .add("business", business)
                .add("payerName", payerName)
                .add("address", address)
                .add("softDescriptor", softDescriptor)
                .add("softDescriptorCity", softDescriptorCity)
                .add("paymentDetailsItems", paymentDetailsItems)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final CreateRecurringPaymentsProfileRequest o = (CreateRecurringPaymentsProfileRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.token, o.token)
                && Objects.equal(this.subscriberName, o.subscriberName)
                && Objects.equal(this.profileStartDate, o.profileStartDate)
                && Objects.equal(this.profileReference, o.profileReference)
                && Objects.equal(this.desc, o.desc)
                && Objects.equal(this.maxFailedPayments, o.maxFailedPayments)
                && Objects.equal(this.autoBillOutAmt, o.autoBillOutAmt)
                && Objects.equal(this.billingPeriod, o.billingPeriod)
                && Objects.equal(this.billingFrequency, o.billingFrequency)
                && Objects.equal(this.totalBillingCycles, o.totalBillingCycles)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.trialBillingPeriod, o.trialBillingPeriod)
                && Objects.equal(this.trialBillingFrequency, o.trialBillingFrequency)
                && Objects.equal(this.trialTotalBillingCycles, o.trialTotalBillingCycles)
                && Objects.equal(this.trialAmt, o.trialAmt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.shippingAmt, o.shippingAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.initAmt, o.initAmt)
                && Objects.equal(this.failedInitAmtAction, o.failedInitAmtAction)
                && Objects.equal(this.shipToAddress, o.shipToAddress)
                && Objects.equal(this.shipToPhoneNum, o.shipToPhoneNum)
                && Objects.equal(this.creditCard, o.creditCard)
                && Objects.equal(this.email, o.email)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.payerStatus, o.payerStatus)
                && Objects.equal(this.countryCode, o.countryCode)
                && Objects.equal(this.business, o.business)
                && Objects.equal(this.payerName, o.payerName)
                && Objects.equal(this.address, o.address)
                && Objects.equal(this.softDescriptor, o.softDescriptor)
                && Objects.equal(this.softDescriptorCity, o.softDescriptorCity)
                && Objects.equal(this.paymentDetailsItems, o.paymentDetailsItems)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(token);
        hash.add(subscriberName);
        hash.add(profileStartDate);
        hash.add(profileReference);
        hash.add(desc);
        hash.add(maxFailedPayments);
        hash.add(autoBillOutAmt);
        hash.add(billingPeriod);
        hash.add(billingFrequency);
        hash.add(totalBillingCycles);
        hash.add(amt);
        hash.add(trialBillingPeriod);
        hash.add(trialBillingFrequency);
        hash.add(trialTotalBillingCycles);
        hash.add(trialAmt);
        hash.add(currencyCode);
        hash.add(shippingAmt);
        hash.add(taxAmt);
        hash.add(initAmt);
        hash.add(failedInitAmtAction);
        hash.add(shipToAddress);
        hash.add(shipToPhoneNum);
        hash.add(creditCard);
        hash.add(email);
        hash.add(payerId);
        hash.add(payerStatus);
        hash.add(countryCode);
        hash.add(business);
        hash.add(payerName);
        hash.add(address);
        hash.add(softDescriptor);
        hash.add(softDescriptorCity);
        hash.add(paymentDetailsItems);

    }


}
