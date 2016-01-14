package com.zeroro.paypal.classic.model.getExpressCheckoutDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 1/8/2016.
 */
public class PaymentInfoForGetExpressCheckoutRes extends PaypalClassicModel {
    private String currencyCode;
    private String isFinancing;
    private String financingFeeAmt;
    private String financingTerm;
    private String financingMonthlyPayment;
    private String financingTotalCost;
    private String financingDiscountAmount;
    private String regularTakeFeeAmount;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getIsFinancing() {
        return isFinancing;
    }

    public void setIsFinancing(String isFinancing) {
        this.isFinancing = isFinancing;
    }

    public String getFinancingFeeAmt() {
        return financingFeeAmt;
    }

    public void setFinancingFeeAmt(String financingFeeAmt) {
        this.financingFeeAmt = financingFeeAmt;
    }

    public String getFinancingTerm() {
        return financingTerm;
    }

    public void setFinancingTerm(String financingTerm) {
        this.financingTerm = financingTerm;
    }

    public String getFinancingMonthlyPayment() {
        return financingMonthlyPayment;
    }

    public void setFinancingMonthlyPayment(String financingMonthlyPayment) {
        this.financingMonthlyPayment = financingMonthlyPayment;
    }

    public String getFinancingTotalCost() {
        return financingTotalCost;
    }

    public void setFinancingTotalCost(String financingTotalCost) {
        this.financingTotalCost = financingTotalCost;
    }

    public String getFinancingDiscountAmount() {
        return financingDiscountAmount;
    }

    public void setFinancingDiscountAmount(String financingDiscountAmount) {
        this.financingDiscountAmount = financingDiscountAmount;
    }

    public String getRegularTakeFeeAmount() {
        return regularTakeFeeAmount;
    }

    public void setRegularTakeFeeAmount(String regularTakeFeeAmount) {
        this.regularTakeFeeAmount = regularTakeFeeAmount;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("currencyCode", currencyCode)
                .add("isFinancing", isFinancing)
                .add("financingFeeAmt", financingFeeAmt)
                .add("financingTerm", financingTerm)
                .add("financingMonthlyPayment", financingMonthlyPayment)
                .add("financingTotalCost", financingTotalCost)
                .add("financingDiscountAmount", financingDiscountAmount)
                .add("regularTakeFeeAmount", regularTakeFeeAmount)
                ;
    }
    @Override
    public boolean equals (Object obj) {

        if (!super.equals(obj)) return false;
        final PaymentInfoForGetExpressCheckoutRes o = (PaymentInfoForGetExpressCheckoutRes) obj;
        return Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.isFinancing, o.isFinancing)
                && Objects.equal(this.financingFeeAmt, o.financingFeeAmt)
                && Objects.equal(this.financingTerm, o.financingTerm)
                && Objects.equal(this.financingMonthlyPayment, o.financingMonthlyPayment)
                && Objects.equal(this.financingTotalCost, o.financingTotalCost)
                && Objects.equal(this.financingDiscountAmount, o.financingDiscountAmount)
                && Objects.equal(this.regularTakeFeeAmount, o.regularTakeFeeAmount)
                ;
    }
    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(currencyCode);
        hash.add(isFinancing);
        hash.add(financingFeeAmt);
        hash.add(financingTerm);
        hash.add(financingMonthlyPayment);
        hash.add(financingTotalCost);
        hash.add(financingDiscountAmount);
        hash.add(regularTakeFeeAmount);

    }

}
