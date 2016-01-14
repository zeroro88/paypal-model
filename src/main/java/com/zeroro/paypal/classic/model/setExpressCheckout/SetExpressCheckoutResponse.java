package com.zeroro.paypal.classic.model.setExpressCheckout;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

/**
 * Created on 10/23/2015.
 */
public class SetExpressCheckoutResponse extends PaypalClassicResponseModel {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("token", token)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final SetExpressCheckoutResponse o = (SetExpressCheckoutResponse) obj;
        return Objects.equal(this.token, o.token)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(token);

    }


}
