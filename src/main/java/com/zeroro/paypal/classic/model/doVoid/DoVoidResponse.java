package com.zeroro.paypal.classic.model.doVoid;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

/**
 * Created on 10/23/2015.
 */
public class DoVoidResponse extends PaypalClassicResponseModel {
    private String authorizationId;
    private String msgSubId;

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }

    public String getMsgSubId() {
        return msgSubId;
    }

    public void setMsgSubId(String msgSubId) {
        this.msgSubId = msgSubId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("authorizationId", authorizationId)
                .add("msgSubId", msgSubId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final DoVoidResponse o = (DoVoidResponse) obj;
        return Objects.equal(this.authorizationId, o.authorizationId)
                && Objects.equal(this.msgSubId, o.msgSubId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(authorizationId);
        hash.add(msgSubId);

    }

}
