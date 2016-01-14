package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

/**
 * Created on 10/23/2015.
 */
public class PaypalPaymentDetail extends PaypalClassicModel {
    private String amt;
    private String currencyCode;
    private String itemAmt;
    private String shippingAmt;
    private String insuranceAmt;
    private String shipDiscAmt;
    private String handlingAmt;
    private String taxAmt;
    private String desc;
    private String custom;
    private String invNum;
    private String buttonSource;
    private String notifyUrl;
    private String recurring;
    private String bucketCategoryType;

    private String insuranceOptionOffered;
    private String multiShipping;
    private String noteText;
    private String transactionId;
    private String allowedPaymentMethod;
    private String paymentAction;
    private String paymentRequestId;
    private String location_type;
    private String location_id;

    public String getInsuranceOptionOffered() {
        return insuranceOptionOffered;
    }

    public void setInsuranceOptionOffered(String insuranceOptionOffered) {
        this.insuranceOptionOffered = insuranceOptionOffered;
    }

    public String getMultiShipping() {
        return multiShipping;
    }

    public void setMultiShipping(String multiShipping) {
        this.multiShipping = multiShipping;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAllowedPaymentMethod() {
        return allowedPaymentMethod;
    }

    public void setAllowedPaymentMethod(String allowedPaymentMethod) {
        this.allowedPaymentMethod = allowedPaymentMethod;
    }

    public String getPaymentAction() {
        return paymentAction;
    }

    public void setPaymentAction(String paymentAction) {
        this.paymentAction = paymentAction;
    }

    public String getPaymentRequestId() {
        return paymentRequestId;
    }

    public void setPaymentRequestId(String paymentRequestId) {
        this.paymentRequestId = paymentRequestId;
    }


    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
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

    public String getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(String itemAmt) {
        this.itemAmt = itemAmt;
    }

    public String getShippingAmt() {
        return shippingAmt;
    }

    public void setShippingAmt(String shippingAmt) {
        this.shippingAmt = shippingAmt;
    }

    public String getInsuranceAmt() {
        return insuranceAmt;
    }

    public void setInsuranceAmt(String insuranceAmt) {
        this.insuranceAmt = insuranceAmt;
    }

    public String getShipDiscAmt() {
        return shipDiscAmt;
    }

    public void setShipDiscAmt(String shipDiscAmt) {
        this.shipDiscAmt = shipDiscAmt;
    }

    public String getHandlingAmt() {
        return handlingAmt;
    }

    public void setHandlingAmt(String handlingAmt) {
        this.handlingAmt = handlingAmt;
    }

    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
    }

    public String getButtonSource() {
        return buttonSource;
    }

    public void setButtonSource(String buttonSource) {
        this.buttonSource = buttonSource;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getRecurring() {
        return recurring;
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    public String getBucketCategoryType() {
        return bucketCategoryType;
    }

    public void setBucketCategoryType(String bucketCategoryType) {
        this.bucketCategoryType = bucketCategoryType;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("amt", amt)
                .add("currencyCode", currencyCode)
                .add("itemAmt", itemAmt)
                .add("shippingAmt", shippingAmt)
                .add("insuranceAmt", insuranceAmt)
                .add("shipDiscAmt", shipDiscAmt)
                .add("handlingAmt", handlingAmt)
                .add("taxAmt", taxAmt)
                .add("desc", desc)
                .add("custom", custom)
                .add("invNum", invNum)
                .add("buttonSource", buttonSource)
                .add("notifyUrl", notifyUrl)
                .add("recurring", recurring)
                .add("bucketCategoryType", bucketCategoryType)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalPaymentDetail o = (PaypalPaymentDetail) obj;
        return Objects.equal(this.amt, o.amt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.itemAmt, o.itemAmt)
                && Objects.equal(this.shippingAmt, o.shippingAmt)
                && Objects.equal(this.insuranceAmt, o.insuranceAmt)
                && Objects.equal(this.shipDiscAmt, o.shipDiscAmt)
                && Objects.equal(this.handlingAmt, o.handlingAmt)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.desc, o.desc)
                && Objects.equal(this.custom, o.custom)
                && Objects.equal(this.invNum, o.invNum)
                && Objects.equal(this.buttonSource, o.buttonSource)
                && Objects.equal(this.notifyUrl, o.notifyUrl)
                && Objects.equal(this.recurring, o.recurring)
                && Objects.equal(this.bucketCategoryType, o.bucketCategoryType)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(amt);
        hash.add(currencyCode);
        hash.add(itemAmt);
        hash.add(shippingAmt);
        hash.add(insuranceAmt);
        hash.add(shipDiscAmt);
        hash.add(handlingAmt);
        hash.add(taxAmt);
        hash.add(desc);
        hash.add(custom);
        hash.add(invNum);
        hash.add(buttonSource);
        hash.add(notifyUrl);
        hash.add(recurring);
        hash.add(bucketCategoryType);

    }
}
