package com.zeroro.paypal.classic.model.createRecurringPaymentsProfile;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

public class PaypalPayerName extends PaypalClassicModel {
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

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

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("salutation", salutation)
                .add("firstName", firstName)
                .add("middleName", middleName)
                .add("lastName", lastName)
                .add("suffix", suffix)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalPayerName o = (PaypalPayerName) obj;
        return Objects.equal(this.salutation, o.salutation)
                && Objects.equal(this.firstName, o.firstName)
                && Objects.equal(this.middleName, o.middleName)
                && Objects.equal(this.lastName, o.lastName)
                && Objects.equal(this.suffix, o.suffix)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(salutation);
        hash.add(firstName);
        hash.add(middleName);
        hash.add(lastName);
        hash.add(suffix);

    }
}
