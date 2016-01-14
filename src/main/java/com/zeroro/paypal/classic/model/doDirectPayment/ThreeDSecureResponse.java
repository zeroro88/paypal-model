package com.zeroro.paypal.classic.model.doDirectPayment;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicModel;

/**
 * Created on 10/23/2015.
 */
public class ThreeDSecureResponse extends PaypalClassicModel {
    private String vpas;
    private String eciSubmitted3DS;

    public String getVpas() {
        return vpas;
    }

    public void setVpas(String vpas) {
        this.vpas = vpas;
    }

    public String getEciSubmitted3DS() {
        return eciSubmitted3DS;
    }

    public void setEciSubmitted3DS(String eciSubmitted3DS) {
        this.eciSubmitted3DS = eciSubmitted3DS;
    }


    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("vpas", vpas)
                .add("eciSubmitted3DS", eciSubmitted3DS)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final ThreeDSecureResponse o = (ThreeDSecureResponse) obj;
        return Objects.equal(this.vpas, o.vpas)
                && Objects.equal(this.eciSubmitted3DS, o.eciSubmitted3DS)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(vpas);
        hash.add(eciSubmitted3DS);

    }
}
