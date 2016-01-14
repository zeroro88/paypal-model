package com.zeroro.paypal.classic.model.doExpressCheckoutPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

import java.util.List;

/**
 * Created on 11/11/2015.
 */
public class PaypalDiscountInfoType extends PaypalClassicModel {
    private String redeemedOfferName;
    private String redeemedOfferDescription;
    private String redeemedOfferAmount;
    private String redeemedOfferType;
    private String redeemedOfferId;
    private String redeemedOfferPointsAccrued;
    private String cummulativePointsName;
    private String cummulativePointsAccrued;
    private String cummulativePointsDescription;
    private String cummulativePointsType;
    private String cummulativePointsId;
    private List<String> merchantDataKey;
    private List<String> merchantDataValue;

    public String getCummulativePointsAccrued() {
        return cummulativePointsAccrued;
    }

    public void setCummulativePointsAccrued(String cummulativePointsAccrued) {
        this.cummulativePointsAccrued = cummulativePointsAccrued;
    }

    public String getRedeemedOfferName() {
        return redeemedOfferName;
    }

    public void setRedeemedOfferName(String redeemedOfferName) {
        this.redeemedOfferName = redeemedOfferName;
    }

    public String getRedeemedOfferDescription() {
        return redeemedOfferDescription;
    }

    public void setRedeemedOfferDescription(String redeemedOfferDescription) {
        this.redeemedOfferDescription = redeemedOfferDescription;
    }

    public String getRedeemedOfferAmount() {
        return redeemedOfferAmount;
    }

    public void setRedeemedOfferAmount(String redeemedOfferAmount) {
        this.redeemedOfferAmount = redeemedOfferAmount;
    }

    public String getRedeemedOfferType() {
        return redeemedOfferType;
    }

    public void setRedeemedOfferType(String redeemedOfferType) {
        this.redeemedOfferType = redeemedOfferType;
    }

    public String getRedeemedOfferId() {
        return redeemedOfferId;
    }

    public void setRedeemedOfferId(String redeemedOfferId) {
        this.redeemedOfferId = redeemedOfferId;
    }

    public String getRedeemedOfferPointsAccrued() {
        return redeemedOfferPointsAccrued;
    }

    public void setRedeemedOfferPointsAccrued(String redeemedOfferPointsAccrued) {
        this.redeemedOfferPointsAccrued = redeemedOfferPointsAccrued;
    }

    public String getCummulativePointsName() {
        return cummulativePointsName;
    }

    public void setCummulativePointsName(String cummulativePointsName) {
        this.cummulativePointsName = cummulativePointsName;
    }

    public String getCummulativePointsDescription() {
        return cummulativePointsDescription;
    }

    public void setCummulativePointsDescription(String cummulativePointsDescription) {
        this.cummulativePointsDescription = cummulativePointsDescription;
    }

    public String getCummulativePointsType() {
        return cummulativePointsType;
    }

    public void setCummulativePointsType(String cummulativePointsType) {
        this.cummulativePointsType = cummulativePointsType;
    }

    public String getCummulativePointsId() {
        return cummulativePointsId;
    }

    public void setCummulativePointsId(String cummulativePointsId) {
        this.cummulativePointsId = cummulativePointsId;
    }

    public List<String> getMerchantDataKey() {
        return merchantDataKey;
    }

    public void setMerchantDataKey(List<String> merchantDataKey) {
        this.merchantDataKey = merchantDataKey;
    }

    public List<String> getMerchantDataValue() {
        return merchantDataValue;
    }

    public void setMerchantDataValue(List<String> merchantDataValue) {
        this.merchantDataValue = merchantDataValue;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("redeemedOfferName", redeemedOfferName)
                .add("redeemedOfferDescription", redeemedOfferDescription)
                .add("redeemedOfferAmount", redeemedOfferAmount)
                .add("redeemedOfferType", redeemedOfferType)
                .add("redeemedOfferId", redeemedOfferId)
                .add("redeemedOfferPointsAccrued", redeemedOfferPointsAccrued)
                .add("cummulativePointsName", cummulativePointsName)
                .add("cummulativePointsDescription", cummulativePointsDescription)
                .add("cummulativePointsType", cummulativePointsType)
                .add("cummulativePointsId", cummulativePointsId)
                .add("merchantDataKey", merchantDataKey)
                .add("merchantDataValue", merchantDataValue)
                .add("cummulativePointsAccrued", cummulativePointsAccrued)
                ;
    }
    @Override
    public boolean equals (Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalDiscountInfoType o = (PaypalDiscountInfoType) obj;
        return Objects.equal(this.redeemedOfferName, o.redeemedOfferName)
                && Objects.equal(this.redeemedOfferDescription, o.redeemedOfferDescription)
                && Objects.equal(this.redeemedOfferAmount, o.redeemedOfferAmount)
                && Objects.equal(this.redeemedOfferType, o.redeemedOfferType)
                && Objects.equal(this.redeemedOfferId, o.redeemedOfferId)
                && Objects.equal(this.redeemedOfferPointsAccrued, o.redeemedOfferPointsAccrued)
                && Objects.equal(this.cummulativePointsName, o.cummulativePointsName)
                && Objects.equal(this.cummulativePointsDescription, o.cummulativePointsDescription)
                && Objects.equal(this.cummulativePointsType, o.cummulativePointsType)
                && Objects.equal(this.cummulativePointsId, o.cummulativePointsId)
                && Objects.equal(this.merchantDataKey, o.merchantDataKey)
                && Objects.equal(this.merchantDataValue, o.merchantDataValue)
                && Objects.equal(this.cummulativePointsAccrued, o.cummulativePointsAccrued)
                ;
    }
    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(redeemedOfferName);
        hash.add(redeemedOfferDescription);
        hash.add(redeemedOfferAmount);
        hash.add(redeemedOfferType);
        hash.add(redeemedOfferId);
        hash.add(redeemedOfferPointsAccrued);
        hash.add(cummulativePointsName);
        hash.add(cummulativePointsDescription);
        hash.add(cummulativePointsType);
        hash.add(cummulativePointsId);
        hash.add(merchantDataKey);
        hash.add(merchantDataValue);
        hash.add(cummulativePointsAccrued);

    }
}
