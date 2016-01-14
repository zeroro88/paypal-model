package com.zeroro.paypal.classic.model.createRecurringPaymentsProfile;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicResponseModel;

public class CreateRecurringPaymentsProfileResponse extends PaypalClassicResponseModel {
    private String profileId;
    private String profileStatus;
    private String transactionId;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("profileId", profileId)
                .add("profileStatus", profileStatus)
                .add("transactionId", transactionId)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final CreateRecurringPaymentsProfileResponse o = (CreateRecurringPaymentsProfileResponse) obj;
        return Objects.equal(this.profileId, o.profileId)
                && Objects.equal(this.profileStatus, o.profileStatus)
                && Objects.equal(this.transactionId, o.transactionId)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(profileId);
        hash.add(profileStatus);
        hash.add(transactionId);

    }
}
