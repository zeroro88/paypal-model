package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

import javax.validation.constraints.NotNull;

/**
 * Created on 10/23/2015.
 */
public class PaypalAddress extends PaypalClassicModel {
    @NotNull(message = "street is required")
    private String street;
    private String street2;
    //    @NotNull(message = "city is required")
    private String city;
    //    @NotNull(message = "state is required")
    private String state;
    @NotNull(message = "countryCode is required")
    private String countryCode;
    @NotNull(message = "zip is required")
    private String zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("street", street)
                .add("street2", street2)
                .add("city", city)
                .add("state", state)
                .add("countryCode", countryCode)
                .add("zip", zip)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalAddress o = (PaypalAddress) obj;
        return Objects.equal(this.street, o.street)
                && Objects.equal(this.street2, o.street2)
                && Objects.equal(this.city, o.city)
                && Objects.equal(this.state, o.state)
                && Objects.equal(this.countryCode, o.countryCode)
                && Objects.equal(this.zip, o.zip)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(street);
        hash.add(street2);
        hash.add(city);
        hash.add(state);
        hash.add(countryCode);
        hash.add(zip);

    }
}
