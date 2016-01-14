package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;

import javax.validation.constraints.NotNull;

/**
 * Created on 10/23/2015.
 */
public class PaypalShipToAddress extends PaypalClassicModel {
    @NotNull(message = "shipToName is required")
    private String shipToName;
    @NotNull(message = "shipToStreet is required")
    private String shipToStreet;
    private String shipToStreet2;
    @NotNull(message = "shipToStreet2 is required")
    private String shipToCity;
    private String shipToState;
    private String shipToZip;
    private String shipToCountry;

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getShipToStreet() {
        return shipToStreet;
    }

    public void setShipToStreet(String shipToStreet) {
        this.shipToStreet = shipToStreet;
    }

    public String getShipToStreet2() {
        return shipToStreet2;
    }

    public void setShipToStreet2(String shipToStreet2) {
        this.shipToStreet2 = shipToStreet2;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToState() {
        return shipToState;
    }

    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }

    public String getShipToZip() {
        return shipToZip;
    }

    public void setShipToZip(String shipToZip) {
        this.shipToZip = shipToZip;
    }

    public String getShipToCountry() {
        return shipToCountry;
    }

    public void setShipToCountry(String shipToCountry) {
        this.shipToCountry = shipToCountry;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("shipToName", shipToName)
                .add("shipToStreet", shipToStreet)
                .add("shipToStreet2", shipToStreet2)
                .add("shipToCity", shipToCity)
                .add("shipToState", shipToState)
                .add("shipToZip", shipToZip)
                .add("shipToCountry", shipToCountry)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final PaypalShipToAddress o = (PaypalShipToAddress) obj;
        return Objects.equal(this.shipToName, o.shipToName)
                && Objects.equal(this.shipToStreet, o.shipToStreet)
                && Objects.equal(this.shipToStreet2, o.shipToStreet2)
                && Objects.equal(this.shipToCity, o.shipToCity)
                && Objects.equal(this.shipToState, o.shipToState)
                && Objects.equal(this.shipToZip, o.shipToZip)
                && Objects.equal(this.shipToCountry, o.shipToCountry)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(shipToName);
        hash.add(shipToStreet);
        hash.add(shipToStreet2);
        hash.add(shipToCity);
        hash.add(shipToState);
        hash.add(shipToZip);
        hash.add(shipToCountry);

    }
}
