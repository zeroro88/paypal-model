package com.zeroro.paypal.classic.model.getExpressCheckoutDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 1/8/2016.
 */
public class PaymentRequestInfoForGetExpressCheckoutRes extends PaypalClassicModel {
    //Address Type Fields
    private String shipToName;
    private String shipToStreet;
    private String shipToStreet2;
    private String shipToCity;
    private String shipToState;
    private String shipToZIP;
    private String shipToCountryCode;
    private String shipToCountryName;
    private String shipToPhoneNum;
    private String addressStatus;
    private String addressNormalizationStatus;

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

    public String getShipToZIP() {
        return shipToZIP;
    }

    public void setShipToZIP(String shipToZIP) {
        this.shipToZIP = shipToZIP;
    }

    public String getShipToCountryCode() {
        return shipToCountryCode;
    }

    public void setShipToCountryCode(String shipToCountryCode) {
        this.shipToCountryCode = shipToCountryCode;
    }

    public String getShipToCountryName() {
        return shipToCountryName;
    }

    public void setShipToCountryName(String shipToCountryName) {
        this.shipToCountryName = shipToCountryName;
    }

    public String getShipToPhoneNum() {
        return shipToPhoneNum;
    }

    public void setShipToPhoneNum(String shipToPhoneNum) {
        this.shipToPhoneNum = shipToPhoneNum;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getAddressNormalizationStatus() {
        return addressNormalizationStatus;
    }

    public void setAddressNormalizationStatus(String addressNormalizationStatus) {
        this.addressNormalizationStatus = addressNormalizationStatus;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("shipToName", shipToName)
                .add("shipToStreet", shipToStreet)
                .add("shipToStreet2", shipToStreet2)
                .add("shipToCity", shipToCity)
                .add("shipToState", shipToState)
                .add("shipToZIP", shipToZIP)
                .add("shipToCountryCode", shipToCountryCode)
                .add("shipToCountryName", shipToCountryName)
                .add("shipToPhoneNum", shipToPhoneNum)
                .add("addressStatus", addressStatus)
                .add("addressNormalizationStatus", addressNormalizationStatus)
                ;
    }
    @Override
    public boolean equals (Object obj) {

        if (!super.equals(obj)) return false;
        final PaymentRequestInfoForGetExpressCheckoutRes o = (PaymentRequestInfoForGetExpressCheckoutRes) obj;
        return Objects.equal(this.shipToName, o.shipToName)
                && Objects.equal(this.shipToStreet, o.shipToStreet)
                && Objects.equal(this.shipToStreet2, o.shipToStreet2)
                && Objects.equal(this.shipToCity, o.shipToCity)
                && Objects.equal(this.shipToState, o.shipToState)
                && Objects.equal(this.shipToZIP, o.shipToZIP)
                && Objects.equal(this.shipToCountryCode, o.shipToCountryCode)
                && Objects.equal(this.shipToCountryName, o.shipToCountryName)
                && Objects.equal(this.shipToPhoneNum, o.shipToPhoneNum)
                && Objects.equal(this.addressStatus, o.addressStatus)
                && Objects.equal(this.addressNormalizationStatus, o.addressNormalizationStatus)
                ;
    }
    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(shipToName);
        hash.add(shipToStreet);
        hash.add(shipToStreet2);
        hash.add(shipToCity);
        hash.add(shipToState);
        hash.add(shipToZIP);
        hash.add(shipToCountryCode);
        hash.add(shipToCountryName);
        hash.add(shipToPhoneNum);
        hash.add(addressStatus);
        hash.add(addressNormalizationStatus);

    }
}
