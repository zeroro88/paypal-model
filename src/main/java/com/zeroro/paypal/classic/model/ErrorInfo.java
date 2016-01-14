package com.zeroro.paypal.classic.model;

/**
 * Created on 1/8/2016.
 */
public class ErrorInfo extends PaypalClassicModel {
    private String errorCode;
    private String shortMessage;
    private String longMessage;
    private String serverityCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getLongMessage() {
        return longMessage;
    }

    public void setLongMessage(String longMessage) {
        this.longMessage = longMessage;
    }

    public String getServerityCode() {
        return serverityCode;
    }

    public void setServerityCode(String serverityCode) {
        this.serverityCode = serverityCode;
    }
}
