package com.zeroro.paypal.classic.model.getRecurringPaymentsProfileDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.PaypalCreditCard;
import com.zeroro.paypal.classic.model.PaypalPayerInformation;
import com.zeroro.paypal.classic.model.PaypalShipToAddress;

public class GetRecurringPaymentsProfileDetailsResponse extends PaypalClassicResponseModel {
    private String profileId;
    private String status;
    private String desc;
    private String autoBillOutAmt;
    private String maxFailedPayments;
    private String aggregateAmount;
    private String aggregateOptionalAmount;
    private String finalPaymentDueDate;
    private String softDescriptor;
    private String softDescriptorCity;
    private String subscriberName;
    private String profileStartDate;
    private String profileReference;
    private PaypalShipToAddress shipToAddress;

    private String billingPeriod;
    private String regularBillingPeriod;
    private String billingFrequency;
    private String regularBillingFrequency;
    private String totalBillingCycles;
    private String regularTotalBillingCycles;
    private String amt;
    private String regularAmt;
    private String shippingAmt;
    private String regularShippingAmt;
    private String taxAmt;
    private String regularTaxAmt;
    private String currencyCode;
    private String regularCurrencyCode;
    private String nextBillingDate;
    private String numCylesCompleted;
    private String numCyclesRemaining;

    private String outStandingBalance;
    private String failedPaymentCount;
    private String lastPaymentDate;
    private String lastPaymentAmt;

    private PaypalCreditCard creditCard;
    private PaypalPayerInformation payerInformation;

    private String addressOwner;
    private String addressStatus;
    private String shipToSecondaryName;
    private String shipToSecondaryAddressLine1;
    private String shipToSecondaryAddressLine2;
    private String shipToSEcondaryCity;
    private String shipToSecondaryState;
    private String shipToSecondaryZIP;
    private String shipToCountryCode;
    private String shipToSecondaryCountryCode;
    private String shipToPhoneNum;
    private String shipToSecondaryPhoneNum;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAutoBillOutAmt() {
        return autoBillOutAmt;
    }

    public void setAutoBillOutAmt(String autoBillOutAmt) {
        this.autoBillOutAmt = autoBillOutAmt;
    }

    public String getMaxFailedPayments() {
        return maxFailedPayments;
    }

    public void setMaxFailedPayments(String maxFailedPayments) {
        this.maxFailedPayments = maxFailedPayments;
    }

    public String getAggregateAmount() {
        return aggregateAmount;
    }

    public void setAggregateAmount(String aggregateAmount) {
        this.aggregateAmount = aggregateAmount;
    }

    public String getAggregateOptionalAmount() {
        return aggregateOptionalAmount;
    }

    public void setAggregateOptionalAmount(String aggregateOptionalAmount) {
        this.aggregateOptionalAmount = aggregateOptionalAmount;
    }

    public String getFinalPaymentDueDate() {
        return finalPaymentDueDate;
    }

    public void setFinalPaymentDueDate(String finalPaymentDueDate) {
        this.finalPaymentDueDate = finalPaymentDueDate;
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

    public PaypalShipToAddress getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(PaypalShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getShipToSecondaryName() {
        return shipToSecondaryName;
    }

    public void setShipToSecondaryName(String shipToSecondaryName) {
        this.shipToSecondaryName = shipToSecondaryName;
    }

    public String getShipToSecondaryAddressLine1() {
        return shipToSecondaryAddressLine1;
    }

    public void setShipToSecondaryAddressLine1(String shipToSecondaryAddressLine1) {
        this.shipToSecondaryAddressLine1 = shipToSecondaryAddressLine1;
    }

    public String getShipToSecondaryAddressLine2() {
        return shipToSecondaryAddressLine2;
    }

    public void setShipToSecondaryAddressLine2(String shipToSecondaryAddressLine2) {
        this.shipToSecondaryAddressLine2 = shipToSecondaryAddressLine2;
    }

    public String getShipToSEcondaryCity() {
        return shipToSEcondaryCity;
    }

    public void setShipToSEcondaryCity(String shipToSEcondaryCity) {
        this.shipToSEcondaryCity = shipToSEcondaryCity;
    }

    public String getShipToSecondaryState() {
        return shipToSecondaryState;
    }

    public void setShipToSecondaryState(String shipToSecondaryState) {
        this.shipToSecondaryState = shipToSecondaryState;
    }

    public String getShipToSecondaryZIP() {
        return shipToSecondaryZIP;
    }

    public void setShipToSecondaryZIP(String shipToSecondaryZIP) {
        this.shipToSecondaryZIP = shipToSecondaryZIP;
    }

    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    public String getShipToSecondaryCountryCode() {
        return shipToSecondaryCountryCode;
    }

    public void setShipToSecondaryCountryCode(String shipToSecondaryCountryCode) {
        this.shipToSecondaryCountryCode = shipToSecondaryCountryCode;
    }

    public String getShipToPhoneNum() {
        return shipToPhoneNum;
    }

    public void setShipToPhoneNum(String shipToPhoneNum) {
        this.shipToPhoneNum = shipToPhoneNum;
    }

    public String getShipToSecondaryPhoneNum() {
        return shipToSecondaryPhoneNum;
    }

    public void setShipToSecondaryPhoneNum(String shipToSecondaryPhoneNum) {
        this.shipToSecondaryPhoneNum = shipToSecondaryPhoneNum;
    }

    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public String getRegularBillingPeriod() {
        return regularBillingPeriod;
    }

    public void setRegularBillingPeriod(String regularBillingPeriod) {
        this.regularBillingPeriod = regularBillingPeriod;
    }

    public String getBillingFrequency() {
        return billingFrequency;
    }

    public void setBillingFrequency(String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    public String getRegularBillingFrequency() {
        return regularBillingFrequency;
    }

    public void setRegularBillingFrequency(String regularBillingFrequency) {
        this.regularBillingFrequency = regularBillingFrequency;
    }

    public String getTotalBillingCycles() {
        return totalBillingCycles;
    }

    public void setTotalBillingCycles(String totalBillingCycles) {
        this.totalBillingCycles = totalBillingCycles;
    }

    public String getRegularTotalBillingCycles() {
        return regularTotalBillingCycles;
    }

    public void setRegularTotalBillingCycles(String regularTotalBillingCycles) {
        this.regularTotalBillingCycles = regularTotalBillingCycles;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getRegularAmt() {
        return regularAmt;
    }

    public void setRegularAmt(String regularAmt) {
        this.regularAmt = regularAmt;
    }

    public String getShippingAmt() {
        return shippingAmt;
    }

    public void setShippingAmt(String shippingAmt) {
        this.shippingAmt = shippingAmt;
    }

    public String getRegularShippingAmt() {
        return regularShippingAmt;
    }

    public void setRegularShippingAmt(String regularShippingAmt) {
        this.regularShippingAmt = regularShippingAmt;
    }

    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getRegularTaxAmt() {
        return regularTaxAmt;
    }

    public void setRegularTaxAmt(String regularTaxAmt) {
        this.regularTaxAmt = regularTaxAmt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRegularCurrencyCode() {
        return regularCurrencyCode;
    }

    public void setRegularCurrencyCode(String regularCurrencyCode) {
        this.regularCurrencyCode = regularCurrencyCode;
    }

    public String getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getNumCylesCompleted() {
        return numCylesCompleted;
    }

    public void setNumCylesCompleted(String numCylesCompleted) {
        this.numCylesCompleted = numCylesCompleted;
    }

    public String getNumCyclesRemaining() {
        return numCyclesRemaining;
    }

    public void setNumCyclesRemaining(String numCyclesRemaining) {
        this.numCyclesRemaining = numCyclesRemaining;
    }

    public String getOutStandingBalance() {
        return outStandingBalance;
    }

    public void setOutStandingBalance(String outStandingBalance) {
        this.outStandingBalance = outStandingBalance;
    }

    public String getFailedPaymentCount() {
        return failedPaymentCount;
    }

    public void setFailedPaymentCount(String failedPaymentCount) {
        this.failedPaymentCount = failedPaymentCount;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public String getLastPaymentAmt() {
        return lastPaymentAmt;
    }

    public void setLastPaymentAmt(String lastPaymentAmt) {
        this.lastPaymentAmt = lastPaymentAmt;
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

    public String getAddressOwner() {
        return addressOwner;
    }

    public void setAddressOwner(String addressOwner) {
        this.addressOwner = addressOwner;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("profileId", profileId)
                .add("status", status)
                .add("desc", desc)
                .add("autoBillOutAmt", autoBillOutAmt)
                .add("maxFailedPayments", maxFailedPayments)
                .add("aggregateAmount", aggregateAmount)
                .add("aggregateOptionalAmount", aggregateOptionalAmount)
                .add("finalPaymentDueDate", finalPaymentDueDate)
                .add("softDescriptor", softDescriptor)
                .add("softDescriptorCity", softDescriptorCity)
                .add("subscriberName", subscriberName)
                .add("profileStartDate", profileStartDate)
                .add("profileReference", profileReference)
                .add("shipToAddress", shipToAddress)
                .add("billingPeriod", billingPeriod)
                .add("regularBillingPeriod", regularBillingPeriod)
                .add("billingFrequency", billingFrequency)
                .add("regularBillingFrequency", regularBillingFrequency)
                .add("totalBillingCycles", totalBillingCycles)
                .add("regularTotalBillingCycles", regularTotalBillingCycles)
                .add("amt", amt)
                .add("regularAmt", regularAmt)
                .add("shippingAmt", shippingAmt)
                .add("regularShippingAmt", regularShippingAmt)
                .add("taxAmt", taxAmt)
                .add("regularTaxAmt", regularTaxAmt)
                .add("currencyCode", currencyCode)
                .add("regularCurrencyCode", regularCurrencyCode)
                .add("nextBillingDate", nextBillingDate)
                .add("numCylesCompleted", numCylesCompleted)
                .add("numCyclesRemaining", numCyclesRemaining)
                .add("outStandingBalance", outStandingBalance)
                .add("failedPaymentCount", failedPaymentCount)
                .add("lastPaymentDate", lastPaymentDate)
                .add("lastPaymentAmt", lastPaymentAmt)
                .add("creditCard", creditCard)
                .add("payerInformation", payerInformation)
                .add("addressOwner", addressOwner)
                .add("addressStatus", addressStatus)
                .add("shipToSecondaryName", shipToSecondaryName)
                .add("shipToSecondaryAddressLine1", shipToSecondaryAddressLine1)
                .add("shipToSecondaryAddressLine2", shipToSecondaryAddressLine2)
                .add("shipToSEcondaryCity", shipToSEcondaryCity)
                .add("shipToSecondaryState", shipToSecondaryState)
                .add("shipToSecondaryZIP", shipToSecondaryZIP)
                .add("shipToCountryCode", shipToCountryCode)
                .add("shipToSecondaryCountryCode", shipToSecondaryCountryCode)
                .add("shipToPhoneNum", shipToPhoneNum)
                .add("shipToSecondaryPhoneNum", shipToSecondaryPhoneNum)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final GetRecurringPaymentsProfileDetailsResponse o = (GetRecurringPaymentsProfileDetailsResponse) obj;
        return Objects.equal(this.profileId, o.profileId)
                && Objects.equal(this.status, o.status)
                && Objects.equal(this.desc, o.desc)
                && Objects.equal(this.autoBillOutAmt, o.autoBillOutAmt)
                && Objects.equal(this.maxFailedPayments, o.maxFailedPayments)
                && Objects.equal(this.aggregateAmount, o.aggregateAmount)
                && Objects.equal(this.aggregateOptionalAmount, o.aggregateOptionalAmount)
                && Objects.equal(this.finalPaymentDueDate, o.finalPaymentDueDate)
                && Objects.equal(this.softDescriptor, o.softDescriptor)
                && Objects.equal(this.softDescriptorCity, o.softDescriptorCity)
                && Objects.equal(this.subscriberName, o.subscriberName)
                && Objects.equal(this.profileStartDate, o.profileStartDate)
                && Objects.equal(this.profileReference, o.profileReference)
                && Objects.equal(this.shipToAddress, o.shipToAddress)
                && Objects.equal(this.billingPeriod, o.billingPeriod)
                && Objects.equal(this.regularBillingPeriod, o.regularBillingPeriod)
                && Objects.equal(this.billingFrequency, o.billingFrequency)
                && Objects.equal(this.regularBillingFrequency, o.regularBillingFrequency)
                && Objects.equal(this.totalBillingCycles, o.totalBillingCycles)
                && Objects.equal(this.regularTotalBillingCycles, o.regularTotalBillingCycles)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.regularAmt, o.regularAmt)
                && Objects.equal(this.shippingAmt, o.shippingAmt)
                && Objects.equal(this.regularShippingAmt, o.regularShippingAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.regularTaxAmt, o.regularTaxAmt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.regularCurrencyCode, o.regularCurrencyCode)
                && Objects.equal(this.nextBillingDate, o.nextBillingDate)
                && Objects.equal(this.numCylesCompleted, o.numCylesCompleted)
                && Objects.equal(this.numCyclesRemaining, o.numCyclesRemaining)
                && Objects.equal(this.outStandingBalance, o.outStandingBalance)
                && Objects.equal(this.failedPaymentCount, o.failedPaymentCount)
                && Objects.equal(this.lastPaymentDate, o.lastPaymentDate)
                && Objects.equal(this.lastPaymentAmt, o.lastPaymentAmt)
                && Objects.equal(this.creditCard, o.creditCard)
                && Objects.equal(this.payerInformation, o.payerInformation)
                && Objects.equal(this.addressOwner, o.addressOwner)
                && Objects.equal(this.addressStatus, o.addressStatus)
                && Objects.equal(this.shipToSecondaryName, o.shipToSecondaryName)
                && Objects.equal(this.shipToSecondaryAddressLine1, o.shipToSecondaryAddressLine1)
                && Objects.equal(this.shipToSecondaryAddressLine2, o.shipToSecondaryAddressLine2)
                && Objects.equal(this.shipToSEcondaryCity, o.shipToSEcondaryCity)
                && Objects.equal(this.shipToSecondaryState, o.shipToSecondaryState)
                && Objects.equal(this.shipToSecondaryZIP, o.shipToSecondaryZIP)
                && Objects.equal(this.shipToCountryCode, o.shipToCountryCode)
                && Objects.equal(this.shipToSecondaryCountryCode, o.shipToSecondaryCountryCode)
                && Objects.equal(this.shipToPhoneNum, o.shipToPhoneNum)
                && Objects.equal(this.shipToSecondaryPhoneNum, o.shipToSecondaryPhoneNum)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(profileId);
        hash.add(status);
        hash.add(desc);
        hash.add(autoBillOutAmt);
        hash.add(maxFailedPayments);
        hash.add(aggregateAmount);
        hash.add(aggregateOptionalAmount);
        hash.add(finalPaymentDueDate);
        hash.add(softDescriptor);
        hash.add(softDescriptorCity);
        hash.add(subscriberName);
        hash.add(profileStartDate);
        hash.add(profileReference);
        hash.add(shipToAddress);
        hash.add(billingPeriod);
        hash.add(regularBillingPeriod);
        hash.add(billingFrequency);
        hash.add(regularBillingFrequency);
        hash.add(totalBillingCycles);
        hash.add(regularTotalBillingCycles);
        hash.add(amt);
        hash.add(regularAmt);
        hash.add(shippingAmt);
        hash.add(regularShippingAmt);
        hash.add(taxAmt);
        hash.add(regularTaxAmt);
        hash.add(currencyCode);
        hash.add(regularCurrencyCode);
        hash.add(nextBillingDate);
        hash.add(numCylesCompleted);
        hash.add(numCyclesRemaining);
        hash.add(outStandingBalance);
        hash.add(failedPaymentCount);
        hash.add(lastPaymentDate);
        hash.add(lastPaymentAmt);
        hash.add(creditCard);
        hash.add(payerInformation);
        hash.add(addressOwner);
        hash.add(addressStatus);
        hash.add(shipToSecondaryName);
        hash.add(shipToSecondaryAddressLine1);
        hash.add(shipToSecondaryAddressLine2);
        hash.add(shipToSEcondaryCity);
        hash.add(shipToSecondaryState);
        hash.add(shipToSecondaryZIP);
        hash.add(shipToCountryCode);
        hash.add(shipToSecondaryCountryCode);
        hash.add(shipToPhoneNum);
        hash.add(shipToSecondaryPhoneNum);

    }

}

