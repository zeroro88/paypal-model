package com.zeroro.paypal.classic.model;

import com.zeroro.paypal.classic.model.annotation.PaypalCollection;

import java.util.List;

public class PaypalClassicResponseModel extends PaypalClassicModel {
    private String ack;
    private String timeStamp;
    private String correlationId;
    private String version;
    private String build;
    @PaypalCollection(format = "L_{name}{index}")
    private List<ErrorInfo> errorInfos;

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public List<ErrorInfo> getErrorInfos() {
        return errorInfos;
    }

    public void setErrorInfos(List<ErrorInfo> errorInfos) {
        this.errorInfos = errorInfos;
    }
}
