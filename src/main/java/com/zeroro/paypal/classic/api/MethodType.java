package com.zeroro.paypal.classic.api;


public enum MethodType {
    //Express Checkout API Operations, Refunds
    RefundTransaction("RefundTransaction"),
    //Express Checkout API Operations, Inventory Management
    GetTransactionDetails("GetTransactionDetails"),
    //Website Payments Pro API Operations, Direct Credit Card Payment or Authorization and Capture
    DoDirectPayment("DoDirectPayment"),
    //Website Payments Pro API Operations, Authorization and Capture
    DoVoid("DoVoid"),
    DoCapture("DoCapture"),
    //Express Checkout API Operations, Express Checkout
    SetExpressCheckout("SetExpressCheckout"),
    GetExpressCheckoutDetails("GetExpressCheckoutDetails"),
    ManageRecurringPaymentsProfileStatus("ManageRecurringPaymentsProfileStatus"),
    CreateRecurringPaymentsProfile("CreateRecurringPaymentsProfile"),
    CreateBillingAgreement("CreateBillingAgreement"),
    DoExpressCheckoutPayment("DoExpressCheckoutPayment"),
    DoReferenceTransaction("DoReferenceTransaction"),
    GetRecurringPaymentsProfileDetails("GetRecurringPaymentsProfileDetails");

    private final String methodType;

    MethodType(String type) {
        methodType = type;
    }

    public String toString() {
        return this.methodType;
    }

}
