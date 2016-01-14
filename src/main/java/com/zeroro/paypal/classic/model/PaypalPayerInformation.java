package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

import javax.validation.constraints.NotNull;

/**
 * Created on 10/23/2015.
 */
public class PaypalPayerInformation extends PaypalClassicModel {
    private String email;
    @NotNull(message = "firstName is required")
    private String firstName;
    @NotNull(message = "lastName is required")
    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("email", email)
                .add("firstName", firstName)
                .add("lastName", lastName)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalPayerInformation o = (PaypalPayerInformation) obj;
        return Objects.equal(this.email, o.email)
                && Objects.equal(this.firstName, o.firstName)
                && Objects.equal(this.lastName, o.lastName)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(email);
        hash.add(firstName);
        hash.add(lastName);

    }
}
