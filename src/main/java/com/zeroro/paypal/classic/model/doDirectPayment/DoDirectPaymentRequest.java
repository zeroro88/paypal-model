package com.zeroro.paypal.classic.model.doDirectPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.*;
import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class DoDirectPaymentRequest extends PaypalClassicRequestModel {
    private String method = "DoDirectPayment";
    private String paymentAction;
    private String ipAddress;
    /*** 0: Do not receive  Fraud Management Filters (FMF) details (default); 1: Receive FMF details. We always want to receive FMF info */
    private String returnFMFDetails = "1";
    private String softDescriptor;
    private String softDescriptorCity;
    private PaypalCreditCard creditCard;
    private PaypalPayerInformation payerInformation;
    private PaypalAddress address;
    private PaypalPaymentDetail paymentDetail;
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalPaymentDetailItem> paymentDetailItems;
    @PaypalCollection(format = "L_{name}{index}")
    private List<PaypalEbayItemPaymentDetailsItem> ebayItemPaymentDetailsItems;
    private PaypalShipToAddress shipToAddress;
    private ThreeDSecureRequest secureRequest;

    public PaypalPayerInformation getPayerInformation() {
        return payerInformation;
    }

    public void setPayerInformation(PaypalPayerInformation payerInformation) {
        this.payerInformation = payerInformation;
    }

    public PaypalAddress getAddress() {
        return address;
    }

    public void setAddress(PaypalAddress address) {
        this.address = address;
    }

    public PaypalPaymentDetail getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(PaypalPaymentDetail paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public List<PaypalPaymentDetailItem> getPaymentDetailItems() {
        return paymentDetailItems;
    }

    public void setPaymentDetailItems(List<PaypalPaymentDetailItem> paymentDetailItems) {
        this.paymentDetailItems = paymentDetailItems;
    }

    public List<PaypalEbayItemPaymentDetailsItem> getEbayItemPaymentDetailsItems() {
        return ebayItemPaymentDetailsItems;
    }

    public void setEbayItemPaymentDetailsItems(List<PaypalEbayItemPaymentDetailsItem> ebayItemPaymentDetailsItems) {
        this.ebayItemPaymentDetailsItems = ebayItemPaymentDetailsItems;
    }

    public PaypalShipToAddress getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(PaypalShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public ThreeDSecureRequest getSecureRequest() {
        return secureRequest;
    }

    public void setSecureRequest(ThreeDSecureRequest secureRequest) {
        this.secureRequest = secureRequest;
    }

    public String getMethod() {
        return method;
    }

    public String getPaymentAction() {
        return paymentAction;
    }

    public void setPaymentAction(String paymentAction) {
        this.paymentAction = paymentAction;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getReturnFMFDetails() {
        return returnFMFDetails;
    }

    public void setReturnFMFDetails(String returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public String getSoftDescriptorCity() {
        return softDescriptorCity;
    }

    public void setSoftDescriptorCity(String softDescriptorCity) {
        this.softDescriptorCity = softDescriptorCity;
    }

    public PaypalCreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(PaypalCreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("paymentAction", paymentAction)
                .add("ipAddress", ipAddress)
                .add("returnFMFDetails", returnFMFDetails)
                .add("softDescriptor", softDescriptor)
                .add("softDescriptorCity", softDescriptorCity)
                .add("creditCard", creditCard)
                .add("payerInformation", payerInformation)
                .add("address", address)
                .add("paymentDetail", paymentDetail)
                .add("paymentDetailItems", paymentDetailItems)
                .add("ebayItemPaymentDetailsItems", ebayItemPaymentDetailsItems)
                .add("shipToAddress", shipToAddress)
                .add("secureRequest", secureRequest)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoDirectPaymentRequest o = (DoDirectPaymentRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.paymentAction, o.paymentAction)
                && Objects.equal(this.ipAddress, o.ipAddress)
                && Objects.equal(this.returnFMFDetails, o.returnFMFDetails)
                && Objects.equal(this.softDescriptor, o.softDescriptor)
                && Objects.equal(this.softDescriptorCity, o.softDescriptorCity)
                && Objects.equal(this.creditCard, o.creditCard)
                && Objects.equal(this.payerInformation, o.payerInformation)
                && Objects.equal(this.address, o.address)
                && Objects.equal(this.paymentDetail, o.paymentDetail)
                && Objects.equal(this.paymentDetailItems, o.paymentDetailItems)
                && Objects.equal(this.ebayItemPaymentDetailsItems, o.ebayItemPaymentDetailsItems)
                && Objects.equal(this.shipToAddress, o.shipToAddress)
                && Objects.equal(this.secureRequest, o.secureRequest)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(paymentAction);
        hash.add(ipAddress);
        hash.add(returnFMFDetails);
        hash.add(softDescriptor);
        hash.add(softDescriptorCity);
        hash.add(creditCard);
        hash.add(payerInformation);
        hash.add(address);
        hash.add(paymentDetail);
        hash.add(paymentDetailItems);
        hash.add(ebayItemPaymentDetailsItems);
        hash.add(shipToAddress);
        hash.add(secureRequest);

    }

}
