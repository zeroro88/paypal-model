package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

/**
 * Created on 10/23/2015.
 */
public class PaypalPaymentDetailItem extends PaypalClassicModel {
    private String name;
    private String desc;
    private String amt;
    private String number;
    private String taxAmt;
    private String qty;

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("name", name)
                .add("desc", desc)
                .add("amt", amt)
                .add("number", number)
                .add("taxAmt", taxAmt)
                .add("qty", qty)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalPaymentDetailItem o = (PaypalPaymentDetailItem) obj;
        return Objects.equal(this.name, o.name)
                && Objects.equal(this.desc, o.desc)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.number, o.number)
                && Objects.equal(this.taxAmt, o.taxAmt)
                && Objects.equal(this.qty, o.qty)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(name);
        hash.add(desc);
        hash.add(amt);
        hash.add(number);
        hash.add(taxAmt);
        hash.add(qty);

    }
}
