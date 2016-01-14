package com.zeroro.paypal.classic.model.doCapture;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

import static com.zeroro.paypal.classic.PaypalClassicConstants.CompleteType;

public class DoCaptureRequest extends PaypalClassicRequestModel {

    private String method = "DoCapture";
    private String authorizationId;
    private String amt;
    private String currencyCode;
    private String completeType = CompleteType.COMPLETE;
    private String invNum;
    private String note;
    private String softDescriptor;
    private String msgSubId;
    //Merchant Store Details Fields
    private String storeId;
    private String terminalId;

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCompleteType() {
        return completeType;
    }

    public void setCompleteType(String completeType) {
        this.completeType = completeType;
    }

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    public String getMethod() {
        return method;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("authorizationId", authorizationId)
                .add("amt", amt)
                .add("currencyCode", currencyCode)
                .add("completeType", completeType)
                .add("invNum", invNum)
                .add("note", note)
                .add("softDescriptor", softDescriptor)
                .add("msgSubId", msgSubId)
                .add("storeId", storeId)
                .add("terminalId", terminalId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoCaptureRequest o = (DoCaptureRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.authorizationId, o.authorizationId)
                && Objects.equal(this.amt, o.amt)
                && Objects.equal(this.currencyCode, o.currencyCode)
                && Objects.equal(this.completeType, o.completeType)
                && Objects.equal(this.invNum, o.invNum)
                && Objects.equal(this.note, o.note)
                && Objects.equal(this.softDescriptor, o.softDescriptor)
                && Objects.equal(this.msgSubId, o.msgSubId)
                && Objects.equal(this.storeId, o.storeId)
                && Objects.equal(this.terminalId, o.terminalId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(authorizationId);
        hash.add(amt);
        hash.add(currencyCode);
        hash.add(completeType);
        hash.add(invNum);
        hash.add(note);
        hash.add(softDescriptor);
        hash.add(msgSubId);
        hash.add(storeId);
        hash.add(terminalId);

    }
}
