package com.zeroro.paypal.classic.model.setExpressCheckout;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.*;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class SetExpressCheckoutRequest extends PaypalClassicRequestModel {
    private String method = "SetExpressCheckout";
    private String maxAmt;
    private String returnUrl;
    private String cancelUrl;
    private String callback;
    private String callbackTimeout;
    private String reqConfirmShipping;
    private String noShipping;
    private String allowNote;
    private String addrOverride;
    private String callbackVersion;
    private String localeCode;
    private String pageStyle;
    private String hdrImg;
    private String payFlowColor;
    private String cartBorderColor;
    private String logoImg;
    private String email;
    private String solutionType;
    private String landingPage;
    private String channelType;
    private String totalType;
    private String giroPaySuccessUrl;
    private String giroPayCancelUrl;
    private String bankTxnPendingUrl;
    private String brandName;
    private String customerServiceNumber;
    private String giftMessageEnable;
    private String giftReceiptenable;
    private String giftWrapEnable;
    private String giftWrapName;
    private String giftWrapAmount;
    private String buyerEmailOptinEnable;
    private String surveyQuestion;
    private String surveyEnable;
    @PaypalCollection(format = "l_{name}{index}")
    private List<String> surveyChoice;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<String> paymentReason;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaypalShipToAddressExt> shipToAdderssExts;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaypalPaymentDetail> paymentDetailList;
    private String noteToBuyer;
    //Payment Details Item Type Fields
    @PaypalCollection(format = "L_PAYMENTREQUEST_{index}_{name}")
    private List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItemList;
    //Seller Details Type Field
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<String> sellerPaypalAccountId;
    @PaypalCollection(format = "L_PAYMENTREQUEST_{index}_{name}")
    private List<List<PaypalEbayItemPaymentDetailsItemExt>> ebayItemPaymentDetailsItems;
    private String buyerId;
    private String buyerUserName;
    private String buyerRegistrationDate;
    private String allowPushFunding;
    private String userSelectedFundingSource;
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalShippingOption> shippingOptions;
    //Billing Agreement Details Type Fields
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalBillingAgreementDetails> billingAgreementDetailses;
    private String taxIdType;
    private String taxId;

    public List<String> getSurveyChoice() {
        return surveyChoice;
    }

    public void setSurveyChoice(List<String> surveyChoice) {
        this.surveyChoice = surveyChoice;
    }

    public List<String> getPaymentReason() {
        return paymentReason;
    }

    public void setPaymentReason(List<String> paymentReason) {
        this.paymentReason = paymentReason;
    }

    public String getMethod() {
        return method;
    }

    public List<List<PaypalEbayItemPaymentDetailsItemExt>> getEbayItemPaymentDetailsItems() {
        return ebayItemPaymentDetailsItems;
    }

    public void setEbayItemPaymentDetailsItems(List<List<PaypalEbayItemPaymentDetailsItemExt>> ebayItemPaymentDetailsItems) {
        this.ebayItemPaymentDetailsItems = ebayItemPaymentDetailsItems;
    }

    public String getMaxAmt() {
        return maxAmt;
    }

    public void setMaxAmt(String maxAmt) {
        this.maxAmt = maxAmt;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getCallbackTimeout() {
        return callbackTimeout;
    }

    public void setCallbackTimeout(String callbackTimeout) {
        this.callbackTimeout = callbackTimeout;
    }

    public String getReqConfirmShipping() {
        return reqConfirmShipping;
    }

    public void setReqConfirmShipping(String reqConfirmShipping) {
        this.reqConfirmShipping = reqConfirmShipping;
    }

    public String getNoShipping() {
        return noShipping;
    }

    public void setNoShipping(String noShipping) {
        this.noShipping = noShipping;
    }

    public String getAllowNote() {
        return allowNote;
    }

    public void setAllowNote(String allowNote) {
        this.allowNote = allowNote;
    }

    public String getAddrOverride() {
        return addrOverride;
    }

    public void setAddrOverride(String addrOverride) {
        this.addrOverride = addrOverride;
    }

    public String getCallbackVersion() {
        return callbackVersion;
    }

    public void setCallbackVersion(String callbackVersion) {
        this.callbackVersion = callbackVersion;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getPageStyle() {
        return pageStyle;
    }

    public void setPageStyle(String pageStyle) {
        this.pageStyle = pageStyle;
    }

    public String getHdrImg() {
        return hdrImg;
    }

    public void setHdrImg(String hdrImg) {
        this.hdrImg = hdrImg;
    }

    public String getPayFlowColor() {
        return payFlowColor;
    }

    public void setPayFlowColor(String payFlowColor) {
        this.payFlowColor = payFlowColor;
    }

    public String getCartBorderColor() {
        return cartBorderColor;
    }

    public void setCartBorderColor(String cartBorderColor) {
        this.cartBorderColor = cartBorderColor;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSolutionType() {
        return solutionType;
    }

    public void setSolutionType(String solutionType) {
        this.solutionType = solutionType;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getTotalType() {
        return totalType;
    }

    public void setTotalType(String totalType) {
        this.totalType = totalType;
    }

    public String getGiroPaySuccessUrl() {
        return giroPaySuccessUrl;
    }

    public void setGiroPaySuccessUrl(String giroPaySuccessUrl) {
        this.giroPaySuccessUrl = giroPaySuccessUrl;
    }

    public String getGiroPayCancelUrl() {
        return giroPayCancelUrl;
    }

    public void setGiroPayCancelUrl(String giroPayCancelUrl) {
        this.giroPayCancelUrl = giroPayCancelUrl;
    }

    public String getBankTxnPendingUrl() {
        return bankTxnPendingUrl;
    }

    public void setBankTxnPendingUrl(String bankTxnPendingUrl) {
        this.bankTxnPendingUrl = bankTxnPendingUrl;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCustomerServiceNumber() {
        return customerServiceNumber;
    }

    public void setCustomerServiceNumber(String customerServiceNumber) {
        this.customerServiceNumber = customerServiceNumber;
    }

    public String getGiftMessageEnable() {
        return giftMessageEnable;
    }

    public void setGiftMessageEnable(String giftMessageEnable) {
        this.giftMessageEnable = giftMessageEnable;
    }

    public String getGiftReceiptenable() {
        return giftReceiptenable;
    }

    public void setGiftReceiptenable(String giftReceiptenable) {
        this.giftReceiptenable = giftReceiptenable;
    }

    public String getGiftWrapEnable() {
        return giftWrapEnable;
    }

    public void setGiftWrapEnable(String giftWrapEnable) {
        this.giftWrapEnable = giftWrapEnable;
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

    public String getBuyerEmailOptinEnable() {
        return buyerEmailOptinEnable;
    }

    public void setBuyerEmailOptinEnable(String buyerEmailOptinEnable) {
        this.buyerEmailOptinEnable = buyerEmailOptinEnable;
    }

    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public String getSurveyEnable() {
        return surveyEnable;
    }

    public void setSurveyEnable(String surveyEnable) {
        this.surveyEnable = surveyEnable;
    }


    public List<PaypalShipToAddressExt> getShipToAdderssExts() {
        return shipToAdderssExts;
    }

    public void setShipToAdderssExts(List<PaypalShipToAddressExt> shipToAdderssExts) {
        this.shipToAdderssExts = shipToAdderssExts;
    }

    public List<PaypalPaymentDetail> getPaymentDetailList() {
        return paymentDetailList;
    }

    public void setPaymentDetailList(List<PaypalPaymentDetail> paymentDetailList) {
        this.paymentDetailList = paymentDetailList;
    }

    public String getNoteToBuyer() {
        return noteToBuyer;
    }

    public void setNoteToBuyer(String noteToBuyer) {
        this.noteToBuyer = noteToBuyer;
    }

    public List<List<PaypalPaymentDetailItemExt2>> getPaymentDetailsItemList() {
        return paymentDetailsItemList;
    }

    public void setPaymentDetailsItemList(List<List<PaypalPaymentDetailItemExt2>> paymentDetailsItemList) {
        this.paymentDetailsItemList = paymentDetailsItemList;
    }

    public List<String> getSellerPaypalAccountId() {
        return sellerPaypalAccountId;
    }

    public void setSellerPaypalAccountId(List<String> sellerPaypalAccountId) {
        this.sellerPaypalAccountId = sellerPaypalAccountId;
    }


    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerUserName() {
        return buyerUserName;
    }

    public void setBuyerUserName(String buyerUserName) {
        this.buyerUserName = buyerUserName;
    }

    public String getBuyerRegistrationDate() {
        return buyerRegistrationDate;
    }

    public void setBuyerRegistrationDate(String buyerRegistrationDate) {
        this.buyerRegistrationDate = buyerRegistrationDate;
    }

    public String getAllowPushFunding() {
        return allowPushFunding;
    }

    public void setAllowPushFunding(String allowPushFunding) {
        this.allowPushFunding = allowPushFunding;
    }

    public String getUserSelectedFundingSource() {
        return userSelectedFundingSource;
    }

    public void setUserSelectedFundingSource(String userSelectedFundingSource) {
        this.userSelectedFundingSource = userSelectedFundingSource;
    }

    public List<PaypalShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<PaypalShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public List<PaypalBillingAgreementDetails> getBillingAgreementDetailses() {
        return billingAgreementDetailses;
    }

    public void setBillingAgreementDetailses(List<PaypalBillingAgreementDetails> billingAgreementDetailses) {
        this.billingAgreementDetailses = billingAgreementDetailses;
    }

    public String getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(String taxIdType) {
        this.taxIdType = taxIdType;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("maxAmt", maxAmt)
                .add("returnUrl", returnUrl)
                .add("cancelUrl", cancelUrl)
                .add("callback", callback)
                .add("callbackTimeout", callbackTimeout)
                .add("reqConfirmShipping", reqConfirmShipping)
                .add("noShipping", noShipping)
                .add("allowNote", allowNote)
                .add("addrOverride", addrOverride)
                .add("callbackVersion", callbackVersion)
                .add("localeCode", localeCode)
                .add("pageStyle", pageStyle)
                .add("hdrImg", hdrImg)
                .add("payFlowColor", payFlowColor)
                .add("cartBorderColor", cartBorderColor)
                .add("logoImg", logoImg)
                .add("email", email)
                .add("solutionType", solutionType)
                .add("landingPage", landingPage)
                .add("channelType", channelType)
                .add("totalType", totalType)
                .add("giroPaySuccessUrl", giroPaySuccessUrl)
                .add("giroPayCancelUrl", giroPayCancelUrl)
                .add("bankTxnPendingUrl", bankTxnPendingUrl)
                .add("brandName", brandName)
                .add("customerServiceNumber", customerServiceNumber)
                .add("giftMessageEnable", giftMessageEnable)
                .add("giftReceiptenable", giftReceiptenable)
                .add("giftWrapEnable", giftWrapEnable)
                .add("giftWrapName", giftWrapName)
                .add("giftWrapAmount", giftWrapAmount)
                .add("buyerEmailOptinEnable", buyerEmailOptinEnable)
                .add("surveyQuestion", surveyQuestion)
                .add("surveyEnable", surveyEnable)
                .add("surveyChoice", surveyChoice)
                .add("paymentReason", paymentReason)
                .add("shipToAdderssExts", shipToAdderssExts)
                .add("paymentDetailList", paymentDetailList)
                .add("noteToBuyer", noteToBuyer)
                .add("paymentDetailsItemList", paymentDetailsItemList)
                .add("sellerPaypalAccountId", sellerPaypalAccountId)
                .add("ebayItemPaymentDetailsItems", ebayItemPaymentDetailsItems)
                .add("buyerId", buyerId)
                .add("buyerUserName", buyerUserName)
                .add("buyerRegistrationDate", buyerRegistrationDate)
                .add("allowPushFunding", allowPushFunding)
                .add("userSelectedFundingSource", userSelectedFundingSource)
                .add("shippingOptions", shippingOptions)
                .add("billingAgreementDetailses", billingAgreementDetailses)
                .add("taxIdType", taxIdType)
                .add("taxId", taxId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final SetExpressCheckoutRequest o = (SetExpressCheckoutRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.maxAmt, o.maxAmt)
                && Objects.equal(this.returnUrl, o.returnUrl)
                && Objects.equal(this.cancelUrl, o.cancelUrl)
                && Objects.equal(this.callback, o.callback)
                && Objects.equal(this.callbackTimeout, o.callbackTimeout)
                && Objects.equal(this.reqConfirmShipping, o.reqConfirmShipping)
                && Objects.equal(this.noShipping, o.noShipping)
                && Objects.equal(this.allowNote, o.allowNote)
                && Objects.equal(this.addrOverride, o.addrOverride)
                && Objects.equal(this.callbackVersion, o.callbackVersion)
                && Objects.equal(this.localeCode, o.localeCode)
                && Objects.equal(this.pageStyle, o.pageStyle)
                && Objects.equal(this.hdrImg, o.hdrImg)
                && Objects.equal(this.payFlowColor, o.payFlowColor)
                && Objects.equal(this.cartBorderColor, o.cartBorderColor)
                && Objects.equal(this.logoImg, o.logoImg)
                && Objects.equal(this.email, o.email)
                && Objects.equal(this.solutionType, o.solutionType)
                && Objects.equal(this.landingPage, o.landingPage)
                && Objects.equal(this.channelType, o.channelType)
                && Objects.equal(this.totalType, o.totalType)
                && Objects.equal(this.giroPaySuccessUrl, o.giroPaySuccessUrl)
                && Objects.equal(this.giroPayCancelUrl, o.giroPayCancelUrl)
                && Objects.equal(this.bankTxnPendingUrl, o.bankTxnPendingUrl)
                && Objects.equal(this.brandName, o.brandName)
                && Objects.equal(this.customerServiceNumber, o.customerServiceNumber)
                && Objects.equal(this.giftMessageEnable, o.giftMessageEnable)
                && Objects.equal(this.giftReceiptenable, o.giftReceiptenable)
                && Objects.equal(this.giftWrapEnable, o.giftWrapEnable)
                && Objects.equal(this.giftWrapName, o.giftWrapName)
                && Objects.equal(this.giftWrapAmount, o.giftWrapAmount)
                && Objects.equal(this.buyerEmailOptinEnable, o.buyerEmailOptinEnable)
                && Objects.equal(this.surveyQuestion, o.surveyQuestion)
                && Objects.equal(this.surveyEnable, o.surveyEnable)
                && Objects.equal(this.surveyChoice, o.surveyChoice)
                && Objects.equal(this.paymentReason, o.paymentReason)
                && Objects.equal(this.shipToAdderssExts, o.shipToAdderssExts)
                && Objects.equal(this.paymentDetailList, o.paymentDetailList)
                && Objects.equal(this.noteToBuyer, o.noteToBuyer)
                && Objects.equal(this.paymentDetailsItemList, o.paymentDetailsItemList)
                && Objects.equal(this.sellerPaypalAccountId, o.sellerPaypalAccountId)
                && Objects.equal(this.ebayItemPaymentDetailsItems, o.ebayItemPaymentDetailsItems)
                && Objects.equal(this.buyerId, o.buyerId)
                && Objects.equal(this.buyerUserName, o.buyerUserName)
                && Objects.equal(this.buyerRegistrationDate, o.buyerRegistrationDate)
                && Objects.equal(this.allowPushFunding, o.allowPushFunding)
                && Objects.equal(this.userSelectedFundingSource, o.userSelectedFundingSource)
                && Objects.equal(this.shippingOptions, o.shippingOptions)
                && Objects.equal(this.billingAgreementDetailses, o.billingAgreementDetailses)
                && Objects.equal(this.taxIdType, o.taxIdType)
                && Objects.equal(this.taxId, o.taxId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(maxAmt);
        hash.add(returnUrl);
        hash.add(cancelUrl);
        hash.add(callback);
        hash.add(callbackTimeout);
        hash.add(reqConfirmShipping);
        hash.add(noShipping);
        hash.add(allowNote);
        hash.add(addrOverride);
        hash.add(callbackVersion);
        hash.add(localeCode);
        hash.add(pageStyle);
        hash.add(hdrImg);
        hash.add(payFlowColor);
        hash.add(cartBorderColor);
        hash.add(logoImg);
        hash.add(email);
        hash.add(solutionType);
        hash.add(landingPage);
        hash.add(channelType);
        hash.add(totalType);
        hash.add(giroPaySuccessUrl);
        hash.add(giroPayCancelUrl);
        hash.add(bankTxnPendingUrl);
        hash.add(brandName);
        hash.add(customerServiceNumber);
        hash.add(giftMessageEnable);
        hash.add(giftReceiptenable);
        hash.add(giftWrapEnable);
        hash.add(giftWrapName);
        hash.add(giftWrapAmount);
        hash.add(buyerEmailOptinEnable);
        hash.add(surveyQuestion);
        hash.add(surveyEnable);
        hash.add(surveyChoice);
        hash.add(paymentReason);
        hash.add(shipToAdderssExts);
        hash.add(paymentDetailList);
        hash.add(noteToBuyer);
        hash.add(paymentDetailsItemList);
        hash.add(sellerPaypalAccountId);
        hash.add(ebayItemPaymentDetailsItems);
        hash.add(buyerId);
        hash.add(buyerUserName);
        hash.add(buyerRegistrationDate);
        hash.add(allowPushFunding);
        hash.add(userSelectedFundingSource);
        hash.add(shippingOptions);
        hash.add(billingAgreementDetailses);
        hash.add(taxIdType);
        hash.add(taxId);

    }

}
