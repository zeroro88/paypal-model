package com.zeroro.paypal.classic.model.getRecurringPaymentsProfileDetails;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class GetRecurringPaymentsProfileDetailsRequest extends PaypalClassicRequestModel {
    private String method = "GetRecurringPaymentsProfileDetails";
    private String profileId;

    public String getMethod() {
        return method;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("profileId", profileId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final GetRecurringPaymentsProfileDetailsRequest o = (GetRecurringPaymentsProfileDetailsRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.profileId, o.profileId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(profileId);

    }

}
