package com.zeroro.paypal.classic.model.getExpressCheckoutDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

/**
 * Created on 10/23/2015.
 */
public class GetExpressCheckoutDetailsResponse extends PaypalClassicResponseModel {
    private String custom;
    private String invNum;
    private String phoneNum;
    private String billingAgreementAcceptedStatus;
    private String redirectRequired;
    private String checkoutStatus;
    private String paypalAdjustment;
    private String giftMessage;
    private String giftReceiptEnable;
    private String giftWrapName;
    private String giftWrapAmount;
    private String buyerMarketingEmail;
    private String surveyQuestion;
    private String surveyChoiceSelected;
    private String cartChangeTolerance;
    private String email;
    private String payerId;
    private String payerStatus;
    private String countryCode;
    private String business;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    @PaypalCollection(format = "PAYMENTREQUEST_{index}_{name}")
    private List<PaymentRequestInfoForGetExpressCheckoutRes> paymentRequestInfoForGetExpressCheckoutRes;
    @PaypalCollection(format = "PAYMENTINFO_{index}_{name}")
    private List<PaymentInfoForGetExpressCheckoutRes> paymentInfoForGetExpressCheckoutRes;
    @PaypalCollection(format = "{name}{index}")
    private List<String> walletType;
    @PaypalCollection(format = "{name}{index}")
    private List<String> walletId;
    @PaypalCollection(format = "{name}{index}")
    private List<String> walletDescription;

    private String instrumentCategory;
    private String instrumentId;

    //TODO: other field not use now
    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("custom", custom)
                .add("invNum", invNum)
                .add("phoneNum", phoneNum)
                .add("billingAgreementAcceptedStatus", billingAgreementAcceptedStatus)
                .add("redirectRequired", redirectRequired)
                .add("checkoutStatus", checkoutStatus)
                .add("paypalAdjustment", paypalAdjustment)
                .add("giftMessage", giftMessage)
                .add("giftReceiptEnable", giftReceiptEnable)
                .add("giftWrapName", giftWrapName)
                .add("giftWrapAmount", giftWrapAmount)
                .add("buyerMarketingEmail", buyerMarketingEmail)
                .add("surveyQuestion", surveyQuestion)
                .add("surveyChoiceSelected", surveyChoiceSelected)
                .add("cartChangeTolerance", cartChangeTolerance)
                .add("email", email)
                .add("payerId", payerId)
                .add("payerStatus", payerStatus)
                .add("countryCode", countryCode)
                .add("business", business)
                .add("firstName", firstName)
                .add("middleName", middleName)
                .add("lastName", lastName)
                .add("suffix", suffix)
                .add("paymentRequestInfoForGetExpressCheckoutResponses", paymentRequestInfoForGetExpressCheckoutRes)
                .add("paymentInfoForGetExpressCheckoutResponses", paymentInfoForGetExpressCheckoutRes)
                .add("walletType", walletType)
                .add("walletId", walletId)
                .add("walletDescription", walletDescription)
                .add("instrumentCategory", instrumentCategory)
                .add("instrumentId", instrumentId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final GetExpressCheckoutDetailsResponse o = (GetExpressCheckoutDetailsResponse) obj;
        return Objects.equal(this.custom, o.custom)
                && Objects.equal(this.invNum, o.invNum)
                && Objects.equal(this.phoneNum, o.phoneNum)
                && Objects.equal(this.billingAgreementAcceptedStatus, o.billingAgreementAcceptedStatus)
                && Objects.equal(this.redirectRequired, o.redirectRequired)
                && Objects.equal(this.checkoutStatus, o.checkoutStatus)
                && Objects.equal(this.paypalAdjustment, o.paypalAdjustment)
                && Objects.equal(this.giftMessage, o.giftMessage)
                && Objects.equal(this.giftReceiptEnable, o.giftReceiptEnable)
                && Objects.equal(this.giftWrapName, o.giftWrapName)
                && Objects.equal(this.giftWrapAmount, o.giftWrapAmount)
                && Objects.equal(this.buyerMarketingEmail, o.buyerMarketingEmail)
                && Objects.equal(this.surveyQuestion, o.surveyQuestion)
                && Objects.equal(this.surveyChoiceSelected, o.surveyChoiceSelected)
                && Objects.equal(this.cartChangeTolerance, o.cartChangeTolerance)
                && Objects.equal(this.email, o.email)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.payerStatus, o.payerStatus)
                && Objects.equal(this.countryCode, o.countryCode)
                && Objects.equal(this.business, o.business)
                && Objects.equal(this.firstName, o.firstName)
                && Objects.equal(this.middleName, o.middleName)
                && Objects.equal(this.lastName, o.lastName)
                && Objects.equal(this.suffix, o.suffix)
                && Objects.equal(this.paymentRequestInfoForGetExpressCheckoutRes, o.paymentRequestInfoForGetExpressCheckoutRes)
                && Objects.equal(this.paymentInfoForGetExpressCheckoutRes, o.paymentInfoForGetExpressCheckoutRes)
                && Objects.equal(this.walletType, o.walletType)
                && Objects.equal(this.walletId, o.walletId)
                && Objects.equal(this.walletDescription, o.walletDescription)
                && Objects.equal(this.instrumentCategory, o.instrumentCategory)
                && Objects.equal(this.instrumentId, o.instrumentId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(custom);
        hash.add(invNum);
        hash.add(phoneNum);
        hash.add(billingAgreementAcceptedStatus);
        hash.add(redirectRequired);
        hash.add(checkoutStatus);
        hash.add(paypalAdjustment);
        hash.add(giftMessage);
        hash.add(giftReceiptEnable);
        hash.add(giftWrapName);
        hash.add(giftWrapAmount);
        hash.add(buyerMarketingEmail);
        hash.add(surveyQuestion);
        hash.add(surveyChoiceSelected);
        hash.add(cartChangeTolerance);
        hash.add(email);
        hash.add(payerId);
        hash.add(payerStatus);
        hash.add(countryCode);
        hash.add(business);
        hash.add(firstName);
        hash.add(middleName);
        hash.add(lastName);
        hash.add(suffix);
        hash.add(paymentRequestInfoForGetExpressCheckoutRes);
        hash.add(paymentInfoForGetExpressCheckoutRes);
        hash.add(walletType);
        hash.add(walletId);
        hash.add(walletDescription);
        hash.add(instrumentCategory);
        hash.add(instrumentId);

    }

}
