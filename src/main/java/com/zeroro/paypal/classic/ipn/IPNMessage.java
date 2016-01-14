/*
* Copyright 2010 Peter Backx, streamhead.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.zeroro.paypal.classic.ipn;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.ipn.variable.CaseType;
import com.zeroro.paypal.classic.ipn.variable.PaymentStatus;
import com.zeroro.paypal.classic.ipn.variable.TransactionType;
import com.zeroro.paypal.classic.model.PaypalClassicModel;
import com.zeroro.paypal.classic.util.HashBuilder;

import java.util.Map;

public class IPNMessage extends PaypalClassicModel {

    private boolean validated = false;
    private String fullMessage;

    private PaymentStatus paymentStatus;
    private String subscrId;
    private String receiverId;
    private String receiverEmail;
    private String residenceCountry;
    private String testIpn;
    private String transactionSubject;
    private String txnId;
    private TransactionType transactionType;
    private String payerEmail;
    private String payerId;
    private String payerStatus;
    private String firstName;
    private String lastName;
    private String addressCity;
    private String addressCountry;
    private String addressCountryCode;
    private String addressName;
    private String addressState;
    private String addressStatus;
    private String addressStreet;
    private String addressZip;
    private CaseType caseType;
    private String reasonCode;
    private String custom;
    private String handlingAmount;
    private String itemName;
    private String itemNumber;
    private String mcCurrency;
    private String mcFee;
    private String mcGross;
    private String paymentDate;
    private String paymentFee;
    private String paymentGross;
    private String paymentType;
    private String protectionEligibility;
    private String quantity;
    private String shipping;
    private String tax;
    private String verifySign;
    private String notifyVersion;
    private String charset;

    private IPNMessage() {
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
    }

    public String getTestIpn() {
        return testIpn;
    }

    public void setTestIpn(String testIpn) {
        this.testIpn = testIpn;
    }

    public String getTransactionSubject() {
        return transactionSubject;
    }

    public void setTransactionSubject(String transactionSubject) {
        this.transactionSubject = transactionSubject;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerStatus() {
        return payerStatus;
    }

    public void setPayerStatus(String payerStatus) {
        this.payerStatus = payerStatus;
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

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    public String getHandlingAmount() {
        return handlingAmount;
    }

    public void setHandlingAmount(String handlingAmount) {
        this.handlingAmount = handlingAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getMcFee() {
        return mcFee;
    }

    public void setMcFee(String mcFee) {
        this.mcFee = mcFee;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(String paymentFee) {
        this.paymentFee = paymentFee;
    }

    public String getPaymentGross() {
        return paymentGross;
    }

    public void setPaymentGross(String paymentGross) {
        this.paymentGross = paymentGross;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProtectionEligibility() {
        return protectionEligibility;
    }

    public void setProtectionEligibility(String protectionEligibility) {
        this.protectionEligibility = protectionEligibility;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getVerifySign() {
        return verifySign;
    }

    public void setVerifySign(String verifySign) {
        this.verifySign = verifySign;
    }

    public String getNotifyVersion() {
        return notifyVersion;
    }

    public void setNotifyVersion(String notifyVersion) {
        this.notifyVersion = notifyVersion;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public String getFullMessage() {
        return fullMessage;
    }

    public void setFullMessage(String fullMessage) {
        this.fullMessage = fullMessage;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getMcGross() {
        return mcGross;
    }

    public void setMcGross(String mcGross) {
        this.mcGross = mcGross;
    }

    public String getMcCurrency() {
        return mcCurrency;
    }

    public void setMcCurrency(String mcCurrency) {
        this.mcCurrency = mcCurrency;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getSubscrId() {
        return subscrId;
    }

    public void setSubscrId(String subscrId) {
        this.subscrId = subscrId;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper()
                .add("validated", validated)
                .add("fullMessage", fullMessage)
                .add("paymentStatus", paymentStatus)
                .add("subscrId", subscrId)
                .add("receiverId", receiverId)
                .add("receiverEmail", receiverEmail)
                .add("residenceCountry", residenceCountry)
                .add("testIpn", testIpn)
                .add("transactionSubject", transactionSubject)
                .add("txnId", txnId)
                .add("transactionType", transactionType)
                .add("payerEmail", payerEmail)
                .add("payerId", payerId)
                .add("payerStatus", payerStatus)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("addressCity", addressCity)
                .add("addressCountry", addressCountry)
                .add("addressCountryCode", addressCountryCode)
                .add("addressName", addressName)
                .add("addressState", addressState)
                .add("addressStatus", addressStatus)
                .add("addressStreet", addressStreet)
                .add("addressZip", addressZip)
                .add("custom", custom)
                .add("handlingAmount", handlingAmount)
                .add("itemName", itemName)
                .add("itemNumber", itemNumber)
                .add("mcCurrency", mcCurrency)
                .add("mcFee", mcFee)
                .add("mcGross", mcGross)
                .add("paymentDate", paymentDate)
                .add("paymentFee", paymentFee)
                .add("paymentGross", paymentGross)
                .add("paymentType", paymentType)
                .add("protectionEligibility", protectionEligibility)
                .add("quantity", quantity)
                .add("shipping", shipping)
                .add("tax", tax)
                .add("verifySign", verifySign)
                .add("notifyVersion", notifyVersion)
                .add("charset", charset)
                .add("reasonCode", reasonCode)
                .add("caseType", caseType)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final IPNMessage o = (IPNMessage) obj;
        return Objects.equal(this.validated, o.validated)
                && Objects.equal(this.fullMessage, o.fullMessage)
                && Objects.equal(this.paymentStatus, o.paymentStatus)
                && Objects.equal(this.subscrId, o.subscrId)
                && Objects.equal(this.receiverId, o.receiverId)
                && Objects.equal(this.receiverEmail, o.receiverEmail)
                && Objects.equal(this.residenceCountry, o.residenceCountry)
                && Objects.equal(this.testIpn, o.testIpn)
                && Objects.equal(this.transactionSubject, o.transactionSubject)
                && Objects.equal(this.txnId, o.txnId)
                && Objects.equal(this.transactionType, o.transactionType)
                && Objects.equal(this.payerEmail, o.payerEmail)
                && Objects.equal(this.payerId, o.payerId)
                && Objects.equal(this.payerStatus, o.payerStatus)
                && Objects.equal(this.firstName, o.firstName)
                && Objects.equal(this.lastName, o.lastName)
                && Objects.equal(this.addressCity, o.addressCity)
                && Objects.equal(this.addressCountry, o.addressCountry)
                && Objects.equal(this.addressCountryCode, o.addressCountryCode)
                && Objects.equal(this.addressName, o.addressName)
                && Objects.equal(this.addressState, o.addressState)
                && Objects.equal(this.addressStatus, o.addressStatus)
                && Objects.equal(this.addressStreet, o.addressStreet)
                && Objects.equal(this.addressZip, o.addressZip)
                && Objects.equal(this.custom, o.custom)
                && Objects.equal(this.handlingAmount, o.handlingAmount)
                && Objects.equal(this.itemName, o.itemName)
                && Objects.equal(this.itemNumber, o.itemNumber)
                && Objects.equal(this.mcCurrency, o.mcCurrency)
                && Objects.equal(this.mcFee, o.mcFee)
                && Objects.equal(this.mcGross, o.mcGross)
                && Objects.equal(this.paymentDate, o.paymentDate)
                && Objects.equal(this.paymentFee, o.paymentFee)
                && Objects.equal(this.paymentGross, o.paymentGross)
                && Objects.equal(this.paymentType, o.paymentType)
                && Objects.equal(this.protectionEligibility, o.protectionEligibility)
                && Objects.equal(this.quantity, o.quantity)
                && Objects.equal(this.shipping, o.shipping)
                && Objects.equal(this.tax, o.tax)
                && Objects.equal(this.verifySign, o.verifySign)
                && Objects.equal(this.notifyVersion, o.notifyVersion)
                && Objects.equal(this.charset, o.charset)
                && Objects.equal(this.reasonCode, o.reasonCode)
                && Objects.equal(this.caseType, o.caseType)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {


        hash.add(validated);
        hash.add(fullMessage);
        hash.add(paymentStatus);
        hash.add(subscrId);
        hash.add(receiverId);
        hash.add(receiverEmail);
        hash.add(residenceCountry);
        hash.add(testIpn);
        hash.add(transactionSubject);
        hash.add(txnId);
        hash.add(transactionType);
        hash.add(payerEmail);
        hash.add(payerId);
        hash.add(payerStatus);
        hash.add(firstName);
        hash.add(lastName);
        hash.add(addressCity);
        hash.add(addressCountry);
        hash.add(addressCountryCode);
        hash.add(addressName);
        hash.add(addressState);
        hash.add(addressStatus);
        hash.add(addressStreet);
        hash.add(addressZip);
        hash.add(custom);
        hash.add(handlingAmount);
        hash.add(itemName);
        hash.add(itemNumber);
        hash.add(mcCurrency);
        hash.add(mcFee);
        hash.add(mcGross);
        hash.add(paymentDate);
        hash.add(paymentFee);
        hash.add(paymentGross);
        hash.add(paymentType);
        hash.add(protectionEligibility);
        hash.add(quantity);
        hash.add(shipping);
        hash.add(tax);
        hash.add(verifySign);
        hash.add(notifyVersion);
        hash.add(charset);
        hash.add(reasonCode);
        hash.add(caseType);

    }

    public static class Builder {
        private IPNMessage message = new IPNMessage();

        public Builder(Map<String, String> nvp) {
            StringBuffer msg = new StringBuffer();
            for (Map.Entry<String, String> entry : nvp.entrySet()) {
                msg.append(entry.getKey());
                msg.append("=");
                msg.append(entry.getValue());
                msg.append("\n");
            }
            message.fullMessage = msg.toString();
        }

        public Builder transactionType(TransactionType transactionType) {
            this.message.transactionType = transactionType;
            return this;
        }

        public Builder paymentStatus(PaymentStatus paymentStatus) {
            this.message.paymentStatus = paymentStatus;
            return this;
        }

        public Builder mcGross(String mcGross) {
            this.message.mcGross = mcGross;
            return this;
        }

        public Builder mcCurrency(String mcCurrency) {
            this.message.mcCurrency = mcCurrency;
            return this;
        }

        public Builder validated() {
            this.message.validated = true;
            return this;
        }

        public Builder custom(String value) {
            this.message.custom = value;
            return this;
        }

        public Builder itemNumber(String itemNumber) {
            this.message.itemNumber = itemNumber;
            return this;
        }

        public Builder txnId(String txnId) {
            this.message.txnId = txnId;
            return this;
        }

        public Builder subscrId(String subscrId) {
            this.message.subscrId = subscrId;
            return this;
        }

        public Builder payerEmail(String value) {
            this.message.payerEmail = value;
            return this;
        }

        public IPNMessage build() {
            return message;
        }

        public Builder receiverEmail(String value) {
            this.message.receiverEmail = value;
            return this;
        }

        public Builder receiverId(String value) {
            this.message.receiverId = value;
            return this;
        }

        public Builder residenceCountry(String value) {
            this.message.residenceCountry = value;
            return this;
        }

        public Builder testIpn(String value) {
            this.message.testIpn = value;
            return this;
        }

        public Builder transactionSubject(String value) {
            this.message.transactionSubject = value;
            return this;
        }

        public Builder payerId(String value) {
            this.message.payerId = value;
            return this;
        }

        public Builder payerStatus(String value) {
            this.message.payerStatus = value;
            return this;
        }

        public Builder firstName(String value) {
            this.message.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.message.lastName = value;
            return this;
        }

        public Builder addressCity(String value) {
            this.message.addressCity = value;
            return this;
        }

        public Builder addressCountry(String value) {
            this.message.addressCountry = value;
            return this;
        }

        public Builder addressState(String value) {
            this.message.addressState = value;
            return this;
        }

        public Builder addressStatus(String value) {
            this.message.addressStatus = value;
            return this;
        }

        public Builder addressCountryCode(String value) {
            this.message.addressCountryCode = value;
            return this;
        }

        public Builder addressName(String value) {
            this.message.addressName = value;
            return this;
        }

        public Builder addressStreet(String value) {
            this.message.addressStreet = value;
            return this;
        }

        public Builder addressZip(String value) {
            this.message.addressZip = value;
            return this;
        }

        public Builder handlingAmount(String value) {
            this.message.handlingAmount = value;
            return this;
        }

        public Builder itemName(String value) {
            this.message.itemName = value;
            return this;
        }

        public Builder mcFee(String value) {
            this.message.mcFee = value;
            return this;
        }

        public Builder paymentDate(String value) {
            this.message.paymentDate = value;
            return this;
        }

        public Builder paymentFee(String value) {
            this.message.paymentFee = value;
            return this;
        }

        public Builder paymentGross(String value) {
            this.message.paymentGross = value;
            return this;
        }

        public Builder paymentType(String value) {
            this.message.paymentType = value;
            return this;
        }

        public Builder protectionEligibility(String value) {
            this.message.protectionEligibility = value;
            return this;
        }

        public Builder quantity(String value) {
            this.message.quantity = value;
            return this;
        }

        public Builder shipping(String value) {
            this.message.shipping = value;
            return this;
        }

        public Builder tax(String value) {
            this.message.tax = value;
            return this;
        }

        public Builder notifyVersion(String value) {
            this.message.notifyVersion = value;
            return this;
        }

        public Builder charset(String value) {
            this.message.charset = value;
            return this;
        }

        public Builder verifySign(String value) {
            this.message.verifySign = value;
            return this;
        }

        public Builder caseType(CaseType value) {
            this.message.caseType = value;
            return this;
        }

        public Builder reasonCode(String value) {
            this.message.reasonCode = value;
            return this;
        }
    }

}
