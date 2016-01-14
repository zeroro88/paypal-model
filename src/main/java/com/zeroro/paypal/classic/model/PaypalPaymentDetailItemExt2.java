package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

public class PaypalPaymentDetailItemExt2 extends PaypalPaymentDetailItemExt {
    private String itemWeightValue;
    private String itemWeightUnit;
    private String itemLengthValue;
    private String itemLengthUnit;
    private String itemWidthValue;
    private String itemWidthUnit;
    private String itemHeightValue;
    private String itemHeightUnit;
    private String itemUrl;

    public String getItemWeightValue() {
        return itemWeightValue;
    }

    public void setItemWeightValue(String itemWeightValue) {
        this.itemWeightValue = itemWeightValue;
    }

    public String getItemWeightUnit() {
        return itemWeightUnit;
    }

    public void setItemWeightUnit(String itemWeightUnit) {
        this.itemWeightUnit = itemWeightUnit;
    }

    public String getItemLengthValue() {
        return itemLengthValue;
    }

    public void setItemLengthValue(String itemLengthValue) {
        this.itemLengthValue = itemLengthValue;
    }

    public String getItemLengthUnit() {
        return itemLengthUnit;
    }

    public void setItemLengthUnit(String itemLengthUnit) {
        this.itemLengthUnit = itemLengthUnit;
    }

    public String getItemWidthValue() {
        return itemWidthValue;
    }

    public void setItemWidthValue(String itemWidthValue) {
        this.itemWidthValue = itemWidthValue;
    }

    public String getItemWidthUnit() {
        return itemWidthUnit;
    }

    public void setItemWidthUnit(String itemWidthUnit) {
        this.itemWidthUnit = itemWidthUnit;
    }

    public String getItemHeightValue() {
        return itemHeightValue;
    }

    public void setItemHeightValue(String itemHeightValue) {
        this.itemHeightValue = itemHeightValue;
    }

    public String getItemHeightUnit() {
        return itemHeightUnit;
    }

    public void setItemHeightUnit(String itemHeightUnit) {
        this.itemHeightUnit = itemHeightUnit;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("itemWeightValue", itemWeightValue)
                .add("itemWeightUnit", itemWeightUnit)
                .add("itemLengthValue", itemLengthValue)
                .add("itemLengthUnit", itemLengthUnit)
                .add("itemWidthValue", itemWidthValue)
                .add("itemWidthUnit", itemWidthUnit)
                .add("itemHeightValue", itemHeightValue)
                .add("itemHeightUnit", itemHeightUnit)
                .add("itemUrl", itemUrl)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalPaymentDetailItemExt2 o = (PaypalPaymentDetailItemExt2) obj;
        return Objects.equal(this.itemWeightValue, o.itemWeightValue)
                && Objects.equal(this.itemWeightUnit, o.itemWeightUnit)
                && Objects.equal(this.itemLengthValue, o.itemLengthValue)
                && Objects.equal(this.itemLengthUnit, o.itemLengthUnit)
                && Objects.equal(this.itemWidthValue, o.itemWidthValue)
                && Objects.equal(this.itemWidthUnit, o.itemWidthUnit)
                && Objects.equal(this.itemHeightValue, o.itemHeightValue)
                && Objects.equal(this.itemHeightUnit, o.itemHeightUnit)
                && Objects.equal(this.itemUrl, o.itemUrl)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(itemWeightValue);
        hash.add(itemWeightUnit);
        hash.add(itemLengthValue);
        hash.add(itemLengthUnit);
        hash.add(itemWidthValue);
        hash.add(itemWidthUnit);
        hash.add(itemHeightValue);
        hash.add(itemHeightUnit);
        hash.add(itemUrl);

    }
}
