package com.zeroro.paypal.classic.model;

public class FMFfilter extends PaypalClassicModel {
    private String FMFFilterId;
    private String FMFFilterName;

    public String getFMFFilterId() {
        return FMFFilterId;
    }

    public void setFMFFilterId(String FMFFilterId) {
        this.FMFFilterId = FMFFilterId;
    }

    public String getFMFFilterName() {
        return FMFFilterName;
    }

    public void setFMFFilterName(String FMFFilterName) {
        this.FMFFilterName = FMFFilterName;
    }
}
