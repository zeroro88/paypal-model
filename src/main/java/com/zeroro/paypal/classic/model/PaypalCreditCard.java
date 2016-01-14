package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

import javax.validation.constraints.NotNull;

public class PaypalCreditCard extends PaypalClassicModel {
    private String creditCardType;
    @NotNull(message = "acct is required")
    private String acct;
    private String expDate;
    private String cvv2;
    private String startDate;
    private String issueNumber;

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("creditCardType", creditCardType)
                .add("acct", acct)
                .add("expDate", expDate)
                .add("cvv2", cvv2)
                .add("startDate", startDate)
                .add("issueNumber", issueNumber)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalCreditCard o = (PaypalCreditCard) obj;
        return Objects.equal(this.creditCardType, o.creditCardType)
                && Objects.equal(this.acct, o.acct)
                && Objects.equal(this.expDate, o.expDate)
                && Objects.equal(this.cvv2, o.cvv2)
                && Objects.equal(this.startDate, o.startDate)
                && Objects.equal(this.issueNumber, o.issueNumber)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(creditCardType);
        hash.add(acct);
        hash.add(expDate);
        hash.add(cvv2);
        hash.add(startDate);
        hash.add(issueNumber);

    }
}
