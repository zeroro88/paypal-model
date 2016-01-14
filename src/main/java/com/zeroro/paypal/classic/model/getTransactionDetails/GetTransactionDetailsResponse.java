package com.zeroro.paypal.classic.model.getTransactionDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

import java.util.List;

/**
 * Created on 10/23/2015.
 */
public class GetTransactionDetailsResponse extends PaypalClassicResponseModel {
    private String shippingCalculationMode;
    private String insuranceOptionSelected;
    private List<String> l_ShippingOptionIsDefault;
    private List<String> l_ShippingOptionName;
    private List<String> l_ShippingOptionAmount;
    private String giftMessage;
    private String giftReceiptEnable;
    private String giftWrapName;
    private String giftWrapAmount;
    private String buyerMarketingEmail;
    private String surveyQuestion;
    private String surveyChoiceSelected;
    //Receiver Information Fields
    private String receiverBusiness;
    private String receiverEmail;
    private String receiverId;
    private String email;
    private String payerId;
    private String payerStatus;
    private String countryCode;
    private String payerBusiness;
    //Payer Name Fields
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    //TODO:addrssFields;

    private String addressOwner;
    private String addressStatus;
    private String shipToSecondaryName;
    private String shipToName;
    private String shipToStreet;
    private String shipToSecondaryAddressLine1;
    private String shipToStreet2;
    private String shipToSecondaryAddressLine2;
    private String shipToCity;
    private String shipToSecondaryCity;
    private String shipToState;
    private String shipToSecondaryState;
    private String shipToZIP;
    private String shipToSecondaryZIP;
    private String shipToCountryCode;
    private String shipToSecondaryCountryCode;
    private String shipToPhoneNum;
    private String shipToSecondaryPhoneNum;
    //Payment Information Fields
    private String transactionId;
    private String parentTransactionId;
    private String receiptId;
    private String transactionType;
    private String paymentType;
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
    private String protectionEligibility;
    private String protectionEligibilityType;
    private String storeId;
    private String subject;
    private String terminalId;
    private String invNum;
    private String custom;
    private String note;
    private String salesTax;
    private String softDescriptor;
    private List<String> l_ebayItemTxnId;
    private List<String> l_name;
    private List<String> l_number;
    private List<String> l_qty;
    private List<String> l_itemCountUnit;
    private List<String> l_taxable;
    private List<String> l_taxRate;
    //TODO:L_ADDITIONALFEESnTYPE,L_ADDITIONALFEESnAMOUNT,L_ADDITIONALFEESnCURRENCY
    private List<String> l_mpn;
    private List<String> l_isbn;
    private List<String> l_plu;
    private List<String> l_modelNumber;
    private List<String> l_styleNumber;
    private List<String> l_couponId;
    private List<String> l_couponAmount;
    private List<String> l_couponAmountCurrency;
    private List<String> l_loyaltyCardDiscountAmount;
    private List<String> l_loyaltyCardiscountCurrency;
    private List<String> l_amt;
    private List<String> l_optionsName;
    private List<String> l_optionsValue;
    private String buyerId;
    private String closingDate;
    private String multiItem;
    private String subscriptionId;
    private String subscriptionDate;
    private String effectiveDate;
    private String retryTime;
    private String userName;
    private String password;
    private String recurrences;
    private String reattempt;
    private String recurring;
    private String amount;
    private String period;

    public String getAddressOwner() {
        return addressOwner;
    }

    public void setAddressOwner(String addressOwner) {
        this.addressOwner = addressOwner;
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

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getShipToStreet() {
        return shipToStreet;
    }

    public void setShipToStreet(String shipToStreet) {
        this.shipToStreet = shipToStreet;
    }

    public String getShipToSecondaryAddressLine1() {
        return shipToSecondaryAddressLine1;
    }

    public void setShipToSecondaryAddressLine1(String shipToSecondaryAddressLine1) {
        this.shipToSecondaryAddressLine1 = shipToSecondaryAddressLine1;
    }

    public String getShipToStreet2() {
        return shipToStreet2;
    }

    public void setShipToStreet2(String shipToStreet2) {
        this.shipToStreet2 = shipToStreet2;
    }

    public String getShipToSecondaryAddressLine2() {
        return shipToSecondaryAddressLine2;
    }

    public void setShipToSecondaryAddressLine2(String shipToSecondaryAddressLine2) {
        this.shipToSecondaryAddressLine2 = shipToSecondaryAddressLine2;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToSecondaryCity() {
        return shipToSecondaryCity;
    }

    public void setShipToSecondaryCity(String shipToSecondaryCity) {
        this.shipToSecondaryCity = shipToSecondaryCity;
    }

    public String getShipToState() {
        return shipToState;
    }

    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    public String getShipToSecondaryState() {
        return shipToSecondaryState;
    }

    public void setShipToSecondaryState(String shipToSecondaryState) {
        this.shipToSecondaryState = shipToSecondaryState;
    }

    public String getShipToZIP() {
        return shipToZIP;
    }

    public void setShipToZIP(String shipToZIP) {
        this.shipToZIP = shipToZIP;
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

    public List<String> getL_ShippingOptionIsDefault() {
        return l_ShippingOptionIsDefault;
    }

    public void setL_ShippingOptionIsDefault(List<String> l_ShippingOptionIsDefault) {
        this.l_ShippingOptionIsDefault = l_ShippingOptionIsDefault;
    }

    public List<String> getL_ShippingOptionName() {
        return l_ShippingOptionName;
    }

    public void setL_ShippingOptionName(List<String> l_ShippingOptionName) {
        this.l_ShippingOptionName = l_ShippingOptionName;
    }

    public List<String> getL_ShippingOptionAmount() {
        return l_ShippingOptionAmount;
    }

    public void setL_ShippingOptionAmount(List<String> l_ShippingOptionAmount) {
        this.l_ShippingOptionAmount = l_ShippingOptionAmount;
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

    public String getReceiverBusiness() {
        return receiverBusiness;
    }

    public void setReceiverBusiness(String receiverBusiness) {
        this.receiverBusiness = receiverBusiness;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
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

    public String getPayerBusiness() {
        return payerBusiness;
    }

    public void setPayerBusiness(String payerBusiness) {
        this.payerBusiness = payerBusiness;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(String salesTax) {
        this.salesTax = salesTax;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public List<String> getL_ebayItemTxnId() {
        return l_ebayItemTxnId;
    }

    public void setL_ebayItemTxnId(List<String> l_ebayItemTxnId) {
        this.l_ebayItemTxnId = l_ebayItemTxnId;
    }

    public List<String> getL_name() {
        return l_name;
    }

    public void setL_name(List<String> l_name) {
        this.l_name = l_name;
    }

    public List<String> getL_number() {
        return l_number;
    }

    public void setL_number(List<String> l_number) {
        this.l_number = l_number;
    }

    public List<String> getL_qty() {
        return l_qty;
    }

    public void setL_qty(List<String> l_qty) {
        this.l_qty = l_qty;
    }

    public List<String> getL_itemCountUnit() {
        return l_itemCountUnit;
    }

    public void setL_itemCountUnit(List<String> l_itemCountUnit) {
        this.l_itemCountUnit = l_itemCountUnit;
    }

    public List<String> getL_taxable() {
        return l_taxable;
    }

    public void setL_taxable(List<String> l_taxable) {
        this.l_taxable = l_taxable;
    }

    public List<String> getL_taxRate() {
        return l_taxRate;
    }

    public void setL_taxRate(List<String> l_taxRate) {
        this.l_taxRate = l_taxRate;
    }

    public List<String> getL_mpn() {
        return l_mpn;
    }

    public void setL_mpn(List<String> l_mpn) {
        this.l_mpn = l_mpn;
    }

    public List<String> getL_isbn() {
        return l_isbn;
    }

    public void setL_isbn(List<String> l_isbn) {
        this.l_isbn = l_isbn;
    }

    public List<String> getL_plu() {
        return l_plu;
    }

    public void setL_plu(List<String> l_plu) {
        this.l_plu = l_plu;
    }

    public List<String> getL_modelNumber() {
        return l_modelNumber;
    }

    public void setL_modelNumber(List<String> l_modelNumber) {
        this.l_modelNumber = l_modelNumber;
    }

    public List<String> getL_styleNumber() {
        return l_styleNumber;
    }

    public void setL_styleNumber(List<String> l_styleNumber) {
        this.l_styleNumber = l_styleNumber;
    }

    public List<String> getL_couponId() {
        return l_couponId;
    }

    public void setL_couponId(List<String> l_couponId) {
        this.l_couponId = l_couponId;
    }

    public List<String> getL_couponAmount() {
        return l_couponAmount;
    }

    public void setL_couponAmount(List<String> l_couponAmount) {
        this.l_couponAmount = l_couponAmount;
    }

    public List<String> getL_couponAmountCurrency() {
        return l_couponAmountCurrency;
    }

    public void setL_couponAmountCurrency(List<String> l_couponAmountCurrency) {
        this.l_couponAmountCurrency = l_couponAmountCurrency;
    }

    public List<String> getL_loyaltyCardDiscountAmount() {
        return l_loyaltyCardDiscountAmount;
    }

    public void setL_loyaltyCardDiscountAmount(List<String> l_loyaltyCardDiscountAmount) {
        this.l_loyaltyCardDiscountAmount = l_loyaltyCardDiscountAmount;
    }

    public List<String> getL_loyaltyCardiscountCurrency() {
        return l_loyaltyCardiscountCurrency;
    }

    public void setL_loyaltyCardiscountCurrency(List<String> l_loyaltyCardiscountCurrency) {
        this.l_loyaltyCardiscountCurrency = l_loyaltyCardiscountCurrency;
    }

    public List<String> getL_amt() {
        return l_amt;
    }

    public void setL_amt(List<String> l_amt) {
        this.l_amt = l_amt;
    }

    public List<String> getL_optionsName() {
        return l_optionsName;
    }

    public void setL_optionsName(List<String> l_optionsName) {
        this.l_optionsName = l_optionsName;
    }

    public List<String> getL_optionsValue() {
        return l_optionsValue;
    }

    public void setL_optionsValue(List<String> l_optionsValue) {
        this.l_optionsValue = l_optionsValue;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getMultiItem() {
        return multiItem;
    }

    public void setMultiItem(String multiItem) {
        this.multiItem = multiItem;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(String retryTime) {
        this.retryTime = retryTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecurrences() {
        return recurrences;
    }

    public void setRecurrences(String recurrences) {
        this.recurrences = recurrences;
    }

    public String getReattempt() {
        return reattempt;
    }

    public void setReattempt(String reattempt) {
        this.reattempt = reattempt;
    }

    public String getRecurring() {
        return recurring;
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("shippingCalculationMode", shippingCalculationMode)
                .add("insuranceOptionSelected", insuranceOptionSelected)
                .add("l_ShippingOptionIsDefault", l_ShippingOptionIsDefault)
                .add("l_ShippingOptionName", l_ShippingOptionName)
                .add("l_ShippingOptionAmount", l_ShippingOptionAmount)
                .add("giftMessage", giftMessage)
                .add("giftReceiptEnable", giftReceiptEnable)
                .add("giftWrapName", giftWrapName)
                .add("giftWrapAmount", giftWrapAmount)
                .add("buyerMarketingEmail", buyerMarketingEmail)
                .add("surveyQuestion", surveyQuestion)
                .add("surveyChoiceSelected", surveyChoiceSelected)
                .add("receiverBusiness", receiverBusiness)
                .add("receiverEmail", receiverEmail)
                .add("receiverId", receiverId)
                .add("email", email)
                .add("payerId", payerId)
                .add("payerStatus", payerStatus)
                .add("countryCode", countryCode)
                .add("payerBusiness", payerBusiness)
                .add("salutation", salutation)
                .add("firstName", firstName)
                .add("middleName", middleName)
                .add("lastName", lastName)
                .add("suffix", suffix)
                .add("addressOwner", addressOwner)
                .add("addressStatus", addressStatus)
                .add("shipToSecondaryName", shipToSecondaryName)
                .add("shipToName", shipToName)
                .add("shipToStreet", shipToStreet)
                .add("shipToSecondaryAddressLine1", shipToSecondaryAddressLine1)
                .add("shipToStreet2", shipToStreet2)
                .add("shipToSecondaryAddressLine2", shipToSecondaryAddressLine2)
                .add("shipToCity", shipToCity)
                .add("shipToSecondaryCity", shipToSecondaryCity)
                .add("shipToState", shipToState)
                .add("shipToSecondaryState", shipToSecondaryState)
                .add("shipToZIP", shipToZIP)
                .add("shipToSecondaryZIP", shipToSecondaryZIP)
                .add("shipToCountryCode", shipToCountryCode)
                .add("shipToSecondaryCountryCode", shipToSecondaryCountryCode)
                .add("shipToPhoneNum", shipToPhoneNum)
                .add("shipToSecondaryPhoneNum", shipToSecondaryPhoneNum)
                .add("transactionId", transactionId)
                .add("parentTransactionId", parentTransactionId)
                .add("receiptId", receiptId)
                .add("transactionType", transactionType)
                .add("paymentType", paymentType)
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
                .add("protectionEligibility", protectionEligibility)
                .add("protectionEligibilityType", protectionEligibilityType)
                .add("storeId", storeId)
                .add("subject", subject)
                .add("terminalId", terminalId)
                .add("invNum", invNum)
                .add("custom", custom)
                .add("note", note)
                .add("salesTax", salesTax)
                .add("softDescriptor", softDescriptor)
                .add("l_ebayItemTxnId", l_ebayItemTxnId)
                .add("l_name", l_name)
                .add("l_number", l_number)
                .add("l_qty", l_qty)
                .add("l_itemCountUnit", l_itemCountUnit)
                .add("l_taxable", l_taxable)
                .add("l_taxRate", l_taxRate)
                .add("l_mpn", l_mpn)
                .add("l_isbn", l_isbn)
                .add("l_plu", l_plu)
                .add("l_modelNumber", l_modelNumber)
                .add("l_styleNumber", l_styleNumber)
                .add("l_couponId", l_couponId)
                .add("l_couponAmount", l_couponAmount)
                .add("l_couponAmountCurrency", l_couponAmountCurrency)
                .add("l_loyaltyCardDiscountAmount", l_loyaltyCardDiscountAmount)
                .add("l_loyaltyCardiscountCurrency", l_loyaltyCardiscountCurrency)
                .add("l_amt", l_amt)
                .add("l_optionsName", l_optionsName)
                .add("l_optionsValue", l_optionsValue)
                .add("buyerId", buyerId)
                .add("closingDate", closingDate)
                .add("multiItem", multiItem)
                .add("subscriptionId", subscriptionId)
                .add("subscriptionDate", subscriptionDate)
                .add("effectiveDate", effectiveDate)
                .add("retryTime", retryTime)
                .add("userName", userName)
                .add("password", password)
                .add("recurrences", recurrences)
                .add("reattempt", reattempt)
                .add("recurring", recurring)
                .add("amount", amount)
                .add("period", period)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final GetTransactionDetailsResponse o = (GetTransactionDetailsResponse) obj;
        return Objects.equal(this.shippingCalculationMode, o.shippingCalculationMode)
                && Objects.equal(this.insuranceOptionSelected, o.insuranceOptionSelected)
                && Objects.equal(this.l_ShippingOptionIsDefault, o.l_ShippingOptionIsDefault)
                && Objects.equal(this.l_ShippingOptionName, o.l_ShippingOptionName)
                && Objects.equal(this.l_ShippingOptionAmount, o.l_ShippingOptionAmount)
                && Objects.equal(this.giftMessage, o.giftMessage)
                && Objects.equal(this.giftReceiptEnable, o.giftReceiptEnable)
                && Objects.equal(this.giftWrapName, o.giftWrapName)
                && Objects.equal(this.giftWrapAmount, o.giftWrapAmount)
                && Objects.equal(this.buyerMarketingEmail, o.buyerMarketingEmail)
                && Objects.equal(this.surveyQuestion, o.surveyQuestion)
                && Objects.equal(this.surveyChoiceSelected, o.surveyChoiceSelected)
                && Objects.equal(this.receiverBusiness, o.receiverBusiness)
                && Objects.equal(this.receiverEmail, o.receiverEmail)
                && Objects.equal(this.receiverId, o.receiverId)
                && Objects.equal(this.email, o.email)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.payerStatus, o.payerStatus)
                && Objects.equal(this.countryCode, o.countryCode)
                && Objects.equal(this.payerBusiness, o.payerBusiness)
                && Objects.equal(this.salutation, o.salutation)
                && Objects.equal(this.firstName, o.firstName)
                && Objects.equal(this.middleName, o.middleName)
                && Objects.equal(this.lastName, o.lastName)
                && Objects.equal(this.suffix, o.suffix)
                && Objects.equal(this.addressOwner, o.addressOwner)
                && Objects.equal(this.addressStatus, o.addressStatus)
                && Objects.equal(this.shipToSecondaryName, o.shipToSecondaryName)
                && Objects.equal(this.shipToName, o.shipToName)
                && Objects.equal(this.shipToStreet, o.shipToStreet)
                && Objects.equal(this.shipToSecondaryAddressLine1, o.shipToSecondaryAddressLine1)
                && Objects.equal(this.shipToStreet2, o.shipToStreet2)
                && Objects.equal(this.shipToSecondaryAddressLine2, o.shipToSecondaryAddressLine2)
                && Objects.equal(this.shipToCity, o.shipToCity)
                && Objects.equal(this.shipToSecondaryCity, o.shipToSecondaryCity)
                && Objects.equal(this.shipToState, o.shipToState)
                && Objects.equal(this.shipToSecondaryState, o.shipToSecondaryState)
                && Objects.equal(this.shipToZIP, o.shipToZIP)
                && Objects.equal(this.shipToSecondaryZIP, o.shipToSecondaryZIP)
                && Objects.equal(this.shipToCountryCode, o.shipToCountryCode)
                && Objects.equal(this.shipToSecondaryCountryCode, o.shipToSecondaryCountryCode)
                && Objects.equal(this.shipToPhoneNum, o.shipToPhoneNum)
                && Objects.equal(this.shipToSecondaryPhoneNum, o.shipToSecondaryPhoneNum)
                && Objects.equal(this.transactionId, o.transactionId)
                && Objects.equal(this.parentTransactionId, o.parentTransactionId)
                && Objects.equal(this.receiptId, o.receiptId)
                && Objects.equal(this.transactionType, o.transactionType)
                && Objects.equal(this.paymentType, o.paymentType)
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
                && Objects.equal(this.protectionEligibility, o.protectionEligibility)
                && Objects.equal(this.protectionEligibilityType, o.protectionEligibilityType)
                && Objects.equal(this.storeId, o.storeId)
                && Objects.equal(this.subject, o.subject)
                && Objects.equal(this.terminalId, o.terminalId)
                && Objects.equal(this.invNum, o.invNum)
                && Objects.equal(this.custom, o.custom)
                && Objects.equal(this.note, o.note)
                && Objects.equal(this.salesTax, o.salesTax)
                && Objects.equal(this.softDescriptor, o.softDescriptor)
                && Objects.equal(this.l_ebayItemTxnId, o.l_ebayItemTxnId)
                && Objects.equal(this.l_name, o.l_name)
                && Objects.equal(this.l_number, o.l_number)
                && Objects.equal(this.l_qty, o.l_qty)
                && Objects.equal(this.l_itemCountUnit, o.l_itemCountUnit)
                && Objects.equal(this.l_taxable, o.l_taxable)
                && Objects.equal(this.l_taxRate, o.l_taxRate)
                && Objects.equal(this.l_mpn, o.l_mpn)
                && Objects.equal(this.l_isbn, o.l_isbn)
                && Objects.equal(this.l_plu, o.l_plu)
                && Objects.equal(this.l_modelNumber, o.l_modelNumber)
                && Objects.equal(this.l_styleNumber, o.l_styleNumber)
                && Objects.equal(this.l_couponId, o.l_couponId)
                && Objects.equal(this.l_couponAmount, o.l_couponAmount)
                && Objects.equal(this.l_couponAmountCurrency, o.l_couponAmountCurrency)
                && Objects.equal(this.l_loyaltyCardDiscountAmount, o.l_loyaltyCardDiscountAmount)
                && Objects.equal(this.l_loyaltyCardiscountCurrency, o.l_loyaltyCardiscountCurrency)
                && Objects.equal(this.l_amt, o.l_amt)
                && Objects.equal(this.l_optionsName, o.l_optionsName)
                && Objects.equal(this.l_optionsValue, o.l_optionsValue)
                && Objects.equal(this.buyerId, o.buyerId)
                && Objects.equal(this.closingDate, o.closingDate)
                && Objects.equal(this.multiItem, o.multiItem)
                && Objects.equal(this.subscriptionId, o.subscriptionId)
                && Objects.equal(this.subscriptionDate, o.subscriptionDate)
                && Objects.equal(this.effectiveDate, o.effectiveDate)
                && Objects.equal(this.retryTime, o.retryTime)
                && Objects.equal(this.userName, o.userName)
                && Objects.equal(this.password, o.password)
                && Objects.equal(this.recurrences, o.recurrences)
                && Objects.equal(this.reattempt, o.reattempt)
                && Objects.equal(this.recurring, o.recurring)
                && Objects.equal(this.amount, o.amount)
                && Objects.equal(this.period, o.period)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(shippingCalculationMode);
        hash.add(insuranceOptionSelected);
        hash.add(l_ShippingOptionIsDefault);
        hash.add(l_ShippingOptionName);
        hash.add(l_ShippingOptionAmount);
        hash.add(giftMessage);
        hash.add(giftReceiptEnable);
        hash.add(giftWrapName);
        hash.add(giftWrapAmount);
        hash.add(buyerMarketingEmail);
        hash.add(surveyQuestion);
        hash.add(surveyChoiceSelected);
        hash.add(receiverBusiness);
        hash.add(receiverEmail);
        hash.add(receiverId);
        hash.add(email);
        hash.add(payerId);
        hash.add(payerStatus);
        hash.add(countryCode);
        hash.add(payerBusiness);
        hash.add(salutation);
        hash.add(firstName);
        hash.add(middleName);
        hash.add(lastName);
        hash.add(suffix);
        hash.add(addressOwner);
        hash.add(addressStatus);
        hash.add(shipToSecondaryName);
        hash.add(shipToName);
        hash.add(shipToStreet);
        hash.add(shipToSecondaryAddressLine1);
        hash.add(shipToStreet2);
        hash.add(shipToSecondaryAddressLine2);
        hash.add(shipToCity);
        hash.add(shipToSecondaryCity);
        hash.add(shipToState);
        hash.add(shipToSecondaryState);
        hash.add(shipToZIP);
        hash.add(shipToSecondaryZIP);
        hash.add(shipToCountryCode);
        hash.add(shipToSecondaryCountryCode);
        hash.add(shipToPhoneNum);
        hash.add(shipToSecondaryPhoneNum);
        hash.add(transactionId);
        hash.add(parentTransactionId);
        hash.add(receiptId);
        hash.add(transactionType);
        hash.add(paymentType);
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
        hash.add(protectionEligibility);
        hash.add(protectionEligibilityType);
        hash.add(storeId);
        hash.add(subject);
        hash.add(terminalId);
        hash.add(invNum);
        hash.add(custom);
        hash.add(note);
        hash.add(salesTax);
        hash.add(softDescriptor);
        hash.add(l_ebayItemTxnId);
        hash.add(l_name);
        hash.add(l_number);
        hash.add(l_qty);
        hash.add(l_itemCountUnit);
        hash.add(l_taxable);
        hash.add(l_taxRate);
        hash.add(l_mpn);
        hash.add(l_isbn);
        hash.add(l_plu);
        hash.add(l_modelNumber);
        hash.add(l_styleNumber);
        hash.add(l_couponId);
        hash.add(l_couponAmount);
        hash.add(l_couponAmountCurrency);
        hash.add(l_loyaltyCardDiscountAmount);
        hash.add(l_loyaltyCardiscountCurrency);
        hash.add(l_amt);
        hash.add(l_optionsName);
        hash.add(l_optionsValue);
        hash.add(buyerId);
        hash.add(closingDate);
        hash.add(multiItem);
        hash.add(subscriptionId);
        hash.add(subscriptionDate);
        hash.add(effectiveDate);
        hash.add(retryTime);
        hash.add(userName);
        hash.add(password);
        hash.add(recurrences);
        hash.add(reattempt);
        hash.add(recurring);
        hash.add(amount);
        hash.add(period);

    }
}

