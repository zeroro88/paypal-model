package com.zeroro.paypal.classic.model;

public class PaypalPaymentDetailItemExt extends PaypalPaymentDetailItem {
    private String itemCategory;

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }
}
