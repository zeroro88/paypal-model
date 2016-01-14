package com.zeroro.paypal.classic.model.manageRecurringPaymentsProfileStatus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.zeroro.paypal.classic.util.HashBuilder;
import com.zeroro.paypal.classic.model.PaypalClassicRequestModel;

public class ManageRecurringPaymentsProfileStatusRequest extends PaypalClassicRequestModel {
    private String method = "CreateRecurringPaymentsProfile";
    private String profileId;
    private String action;
    private String note;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    protected MoreObjects.ToStringHelper toStringHelper() {

        return super.toStringHelper().add("method", method)
                .add("profileId", profileId)
                .add("action", action)
                .add("note", note)
                ;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;
        final ManageRecurringPaymentsProfileStatusRequest o = (ManageRecurringPaymentsProfileStatusRequest) obj;
        return Objects.equal(this.method, o.method)
                && Objects.equal(this.profileId, o.profileId)
                && Objects.equal(this.action, o.action)
                && Objects.equal(this.note, o.note)
                ;
    }

    @Override
    protected void hashCode(final HashBuilder hash) {

        hash.add(method);
        hash.add(profileId);
        hash.add(action);
        hash.add(note);

    }
}
