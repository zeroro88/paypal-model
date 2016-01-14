package com.zeroro.paypal.classic.model.manageRecurringPaymentsProfileStatus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

public class ManageRecurringPaymentsProfileStatusResponse extends PaypalClassicResponseModel {
    private String profileId;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {
        return super.toStringHelper().add("profileId", profileId);
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final ManageRecurringPaymentsProfileStatusResponse o = (ManageRecurringPaymentsProfileStatusResponse) obj;
        return Objects.equal(this.profileId, o.profileId);
    }

    @Override
    protected void hashCode(final HashBuilder hash) {
        hash.add(profileId);

    }
}
