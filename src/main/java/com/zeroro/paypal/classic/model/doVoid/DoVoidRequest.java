package com.zeroro.paypal.classic.model.doVoid;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class DoVoidRequest extends PaypalClassicRequestModel {
    private String method = "DoVoid";
    private String authorizationId;
    private String note;
    private String msgSubId;

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
                .add("note", note)
                .add("msgSubId", msgSubId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoVoidRequest o = (DoVoidRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.authorizationId, o.authorizationId)
                && Objects.equal(this.note, o.note)
                && Objects.equal(this.msgSubId, o.msgSubId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(authorizationId);
        hash.add(note);
        hash.add(msgSubId);

    }
}
