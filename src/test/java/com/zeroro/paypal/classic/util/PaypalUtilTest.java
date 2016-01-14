package com.zeroro.paypal.classic.util;

import com.zeroro.paypal.classic.model.PaypalClassicModel;
import com.zeroro.paypal.classic.model.PaypalEbayItemPaymentDetailsItemExt;
import com.zeroro.paypal.classic.model.createBillingAgreement.CreateBillingAgreementRequest;
import com.zeroro.paypal.classic.model.createBillingAgreement.CreateBillingAgreementResponse;
import com.zeroro.paypal.classic.model.doCapture.DoCaptureRequest;
import com.zeroro.paypal.classic.model.doCapture.DoCaptureResponse;
import com.zeroro.paypal.classic.model.doDirectPayment.DoDirectPaymentRequest;
import com.zeroro.paypal.classic.model.doDirectPayment.DoDirectPaymentResponse;
import com.zeroro.paypal.classic.model.doExpressCheckoutPayment.DoExpressCheckoutPaymentRequest;
import com.zeroro.paypal.classic.model.doExpressCheckoutPayment.DoExpressCheckoutPaymentResponse;
import com.zeroro.paypal.classic.model.doVoid.DoVoidRequest;
import com.zeroro.paypal.classic.model.doVoid.DoVoidResponse;
import com.zeroro.paypal.classic.model.getTransactionDetails.GetTransactionDetailsRequest;
import com.zeroro.paypal.classic.model.getTransactionDetails.GetTransactionDetailsResponse;
import com.zeroro.paypal.classic.model.refundTransaction.RefundTransactionResponse;
import com.zeroro.paypal.classic.model.setExpressCheckout.SetExpressCheckoutRequest;
import com.zeroro.paypal.classic.model.setExpressCheckout.SetExpressCheckoutResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Test
public class PaypalUtilTest {
    private static final Logger logger = LoggerFactory.getLogger(PaypalUtilTest.class);


    @Test
    public void covertToQueryMap_DoVoidRequest() {
        DoVoidRequest doVoidRequest = getTestedObject(DoVoidRequest.class);
        Map<String, String> map = PaypalUtil.toRequestMap(doVoidRequest);
        Assert.assertEquals(map.get("METHOD"), "DoVoid");
        Assert.assertEquals(map.get("AUTHORIZATIONID"), doVoidRequest.getAuthorizationId());
        Assert.assertEquals(map.get("NOTE"), doVoidRequest.getNote());
        Assert.assertEquals(map.get("MSGSUBID"), doVoidRequest.getMsgSubId());
    }

    @Test
    public void convertToAPIResponse_DoVoidResponse() {
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",
                "AUTHORIZATIONID",
                "MSGSUBID"
        });
        DoVoidResponse doVoidResponse = PaypalUtil.convertToAPIResponse(testResponseMap, DoVoidResponse.class);
        Assert.assertEquals(doVoidResponse.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(doVoidResponse.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(doVoidResponse.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(doVoidResponse.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(doVoidResponse.getBuild(), testResponseMap.get("BUILD"));
        Assert.assertEquals(doVoidResponse.getAuthorizationId(), testResponseMap.get("AUTHORIZATIONID"));
        Assert.assertEquals(doVoidResponse.getMsgSubId(), testResponseMap.get("MSGSUBID"));

    }

    @Test
    public void covertToQueryMap_CreateBillingAgreementRequest() {
        CreateBillingAgreementRequest createBilingAgreementRequest = getTestedObject(CreateBillingAgreementRequest.class);
        Map<String, String> map = PaypalUtil.toRequestMap(createBilingAgreementRequest);
        Assert.assertEquals(map.get("METHOD"), "CreateBillingAgreement");
        Assert.assertEquals(map.get("TOKEN"), createBilingAgreementRequest.getToken());
    }

    @Test
    public void convertToAPIResponse_CreateBillingAgreementResponse() {
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",
                "BILLINGAGREEMENTID"
        });
        CreateBillingAgreementResponse createBillingAgreementResponse = PaypalUtil.convertToAPIResponse(testResponseMap,
                CreateBillingAgreementResponse.class);
        Assert.assertEquals(createBillingAgreementResponse.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(createBillingAgreementResponse.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(createBillingAgreementResponse.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(createBillingAgreementResponse.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(createBillingAgreementResponse.getBuild(), testResponseMap.get("BUILD"));
        Assert.assertEquals(createBillingAgreementResponse.getBillingAgreementId(), testResponseMap.get("BILLINGAGREEMENTID"));

    }

    @Test
    public void covertToQueryMap_checkDoDirectPaymentRequest() {
        String randomStr = RandomStringUtils.randomAlphabetic(10);
        DoDirectPaymentRequest doDirectPaymentRequest = getTestedObject(DoDirectPaymentRequest.class, randomStr);
        Map<String, String> map = PaypalUtil.toRequestMap(doDirectPaymentRequest);
        Assert.assertEquals(map.get("METHOD"), "DoDirectPayment");
        Assert.assertEquals(map.get("PAYMENTACTION"), doDirectPaymentRequest.getPaymentAction());
        Assert.assertEquals(map.get("IPADDRESS"), doDirectPaymentRequest.getIpAddress());
        Assert.assertEquals(map.get("RETURNFMFDETAILS"), doDirectPaymentRequest.getReturnFMFDetails());
        Assert.assertEquals(map.get("SOFTDESCRIPTOR"), doDirectPaymentRequest.getSoftDescriptor());
        Assert.assertEquals(map.get("SOFTDESCRIPTORCITY"), doDirectPaymentRequest.getSoftDescriptorCity());
        Assert.assertEquals(map.get("CREDITCARDTYPE"), doDirectPaymentRequest.getCreditCard().getCreditCardType());
        Assert.assertEquals(map.get("ACCT"), doDirectPaymentRequest.getCreditCard().getAcct());
        Assert.assertEquals(map.get("EXPDATE"), doDirectPaymentRequest.getCreditCard().getExpDate());
        Assert.assertEquals(map.get("CVV2"), doDirectPaymentRequest.getCreditCard().getCvv2());
        Assert.assertEquals(map.get("STARTDATE"), doDirectPaymentRequest.getCreditCard().getStartDate());
        Assert.assertEquals(map.get("ISSUENUMBER"), doDirectPaymentRequest.getCreditCard().getIssueNumber());

        Assert.assertEquals(map.get("EMAIL"), doDirectPaymentRequest.getPayerInformation().getEmail());
        Assert.assertEquals(map.get("FIRSTNAME"), doDirectPaymentRequest.getPayerInformation().getFirstName());
        Assert.assertEquals(map.get("LASTNAME"), doDirectPaymentRequest.getPayerInformation().getLastName());

        Assert.assertEquals(map.get("STREET"), doDirectPaymentRequest.getAddress().getStreet());
        Assert.assertEquals(map.get("STREET2"), doDirectPaymentRequest.getAddress().getStreet2());
        Assert.assertEquals(map.get("CITY"), doDirectPaymentRequest.getAddress().getCity());
        Assert.assertEquals(map.get("STATE"), doDirectPaymentRequest.getAddress().getState());
        Assert.assertEquals(map.get("COUNTRYCODE"), doDirectPaymentRequest.getAddress().getCountryCode());
        Assert.assertEquals(map.get("ZIP"), doDirectPaymentRequest.getAddress().getZip());

        Assert.assertEquals(map.get("AMT"), doDirectPaymentRequest.getPaymentDetail().getAmt());
        Assert.assertEquals(map.get("CURRENCYCODE"), doDirectPaymentRequest.getPaymentDetail().getCurrencyCode());
        Assert.assertEquals(map.get("ITEMAMT"), doDirectPaymentRequest.getPaymentDetail().getItemAmt());
        Assert.assertEquals(map.get("SHIPPINGAMT"), doDirectPaymentRequest.getPaymentDetail().getShippingAmt());
        Assert.assertEquals(map.get("INSURANCEAMT"), doDirectPaymentRequest.getPaymentDetail().getInsuranceAmt());
        Assert.assertEquals(map.get("SHIPDISCAMT"), doDirectPaymentRequest.getPaymentDetail().getShipDiscAmt());
        Assert.assertEquals(map.get("HANDLINGAMT"), doDirectPaymentRequest.getPaymentDetail().getHandlingAmt());
        Assert.assertEquals(map.get("TAXAMT"), doDirectPaymentRequest.getPaymentDetail().getTaxAmt());
        Assert.assertEquals(map.get("DESC"), doDirectPaymentRequest.getPaymentDetail().getDesc());
        Assert.assertEquals(map.get("CUSTOM"), doDirectPaymentRequest.getPaymentDetail().getCustom());
        Assert.assertEquals(map.get("INVNUM"), doDirectPaymentRequest.getPaymentDetail().getInvNum());
        Assert.assertEquals(map.get("BUTTONSOURCE"), doDirectPaymentRequest.getPaymentDetail().getButtonSource());
        Assert.assertEquals(map.get("NOTIFYURL"), doDirectPaymentRequest.getPaymentDetail().getNotifyUrl());
        Assert.assertEquals(map.get("RECURRING"), doDirectPaymentRequest.getPaymentDetail().getRecurring());
        Assert.assertEquals(map.get("BUCKETCATEGORYTYPE"), doDirectPaymentRequest.getPaymentDetail()
                .getBucketCategoryType());

        Assert.assertEquals(map.get("L_NAME0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getName());
        Assert.assertEquals(map.get("L_DESC0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getDesc());
        Assert.assertEquals(map.get("L_AMT0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getAmt());
        Assert.assertEquals(map.get("L_NUMBER0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getNumber());
        Assert.assertEquals(map.get("L_QTY0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getQty());
        Assert.assertEquals(map.get("L_TAXAMT0"), doDirectPaymentRequest.getPaymentDetailItems().get(0).getTaxAmt());

        Assert.assertEquals(map.get("L_EBAYITEMNUMBER0"), doDirectPaymentRequest.getEbayItemPaymentDetailsItems().get
                (0).getEbayItemNumber());
        Assert.assertEquals(map.get("L_EBAYITEMAUCTIONTXNID0"), doDirectPaymentRequest.getEbayItemPaymentDetailsItems
                ().get(0).getEbayItemAuctionTxnId());
        Assert.assertEquals(map.get("L_EBAYITEMORDERID0"), doDirectPaymentRequest.getEbayItemPaymentDetailsItems()
                .get(0).getEbayItemOrderId());

        Assert.assertEquals(map.get("SHIPTONAME"), doDirectPaymentRequest.getShipToAddress().getShipToName());
        Assert.assertEquals(map.get("SHIPTOSTREET"), doDirectPaymentRequest.getShipToAddress().getShipToStreet());
        Assert.assertEquals(map.get("SHIPTOSTREET2"), doDirectPaymentRequest.getShipToAddress().getShipToStreet2());
        Assert.assertEquals(map.get("SHIPTOCITY"), doDirectPaymentRequest.getShipToAddress().getShipToCity());
        Assert.assertEquals(map.get("SHIPTOSTATE"), doDirectPaymentRequest.getShipToAddress().getShipToState());
        Assert.assertEquals(map.get("SHIPTOZIP"), doDirectPaymentRequest.getShipToAddress().getShipToZip());
        Assert.assertEquals(map.get("SHIPTOCOUNTRY"), doDirectPaymentRequest.getShipToAddress().getShipToCountry());

        Assert.assertEquals(map.get("AUTHSTATUS3DS"), doDirectPaymentRequest.getSecureRequest().getAuthStatus3DS());
        Assert.assertEquals(map.get("MPIVENDOR3DS"), doDirectPaymentRequest.getSecureRequest().getMpiVendor3DS());
        Assert.assertEquals(map.get("CAVV"), doDirectPaymentRequest.getSecureRequest().getCavv());
        Assert.assertEquals(map.get("ECI3DS"), doDirectPaymentRequest.getSecureRequest().getEci3ds());
        Assert.assertEquals(map.get("XID"), doDirectPaymentRequest.getSecureRequest().getxId());
    }

    @Test
    public void convertToAPIResponse_DoDirectPaymentResponse() {
        String randomStr = RandomStringUtils.randomAlphabetic(10);
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",
                "TRANSACTIONID",
                "AMT",
                "AVSCODE",
                "CVV2MATCH",
                "L_FMFfilterID0",
                "L_FMFfilterID1",
                "L_FMFfilterNAME0",
                "L_FMFfilterNAME1",
                "L_FMFfilterNAME2",
                "PAYMENTADVICECODE",
                "VPAS",
                "ECISUBMITTED3DS"
        }, randomStr);

        DoDirectPaymentResponse actulldoDirectPaymentResponse = PaypalUtil.convertToAPIResponse
                (testResponseMap, DoDirectPaymentResponse.class);
        Assert.assertEquals(actulldoDirectPaymentResponse.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getBuild(), testResponseMap.get("BUILD"));

        Assert.assertEquals(actulldoDirectPaymentResponse.getTransactionId(), testResponseMap.get("TRANSACTIONID"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getAmt(), testResponseMap.get("AMT"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getAvscode(), testResponseMap.get("AVSCODE"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getCvv2match(), testResponseMap.get("CVV2MATCH"));

        Assert.assertEquals(actulldoDirectPaymentResponse.getFMFfilters().get(0).getFMFFilterId(), testResponseMap.get
                ("L_FMFfilterID0"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getFMFfilters().get(0).getFMFFilterName(), testResponseMap.get
                ("L_FMFfilterNAME0"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getFMFfilters().get(1).getFMFFilterId(), testResponseMap.get
                ("L_FMFfilterID1"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getFMFfilters().get(1).getFMFFilterName(), testResponseMap.get
                ("L_FMFfilterNAME1"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getFMFfilters().get(2).getFMFFilterName(), testResponseMap.get
                ("L_FMFfilterNAME2"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getPaymentAdviceCode(), testResponseMap.get
                ("PAYMENTADVICECODE"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getThreeDSecureResponse().getVpas(), testResponseMap.get
                ("VPAS"));
        Assert.assertEquals(actulldoDirectPaymentResponse.getThreeDSecureResponse().getEciSubmitted3DS(),
                testResponseMap.get("ECISUBMITTED3DS"));
    }

    @Test
    public void covertToQueryMap_checkDoCaptureRequest() {
        String randomStr = RandomStringUtils.randomAlphabetic(10);
        DoCaptureRequest doCaptureRequest = getTestedObject(DoCaptureRequest.class, randomStr);
        Map<String, String> map = PaypalUtil.toRequestMap(doCaptureRequest);
        Assert.assertEquals(map.get("METHOD"), "DoCapture");
        Assert.assertEquals(map.get("AUTHORIZATIONID"), doCaptureRequest.getAuthorizationId());
        Assert.assertEquals(map.get("CURRENCYCODE"), doCaptureRequest.getCurrencyCode());
        Assert.assertEquals(map.get("COMPLETETYPE"), doCaptureRequest.getCompleteType());
        Assert.assertEquals(map.get("INVNUM"), doCaptureRequest.getInvNum());
        Assert.assertEquals(map.get("NOTE"), doCaptureRequest.getNote());
        Assert.assertEquals(map.get("SOFTDESCRIPTOR"), doCaptureRequest.getSoftDescriptor());
        Assert.assertEquals(map.get("MSGSUBID"), doCaptureRequest.getMsgSubId());
        Assert.assertEquals(map.get("STOREID"), doCaptureRequest.getStoreId());
        Assert.assertEquals(map.get("TERMINALID"), doCaptureRequest.getTerminalId());

    }

    @Test
    public void convertToAPIResponse_DoCaptureResponse() {
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",

                "TRANSACTIONID",
                "PARENTTRANSACTIONID",
                "RECEIPTID",
                "TRANSACTIONTYPE",
                "PAYMENTTYPE",
                "ORDERTIME",
                "AMT",
                "FEEAMT",
                "SETTLEAMT",
                "TAXAMT",
                "EXCHANGERATE",
                "PAYMENTSTATUS",
                "PENDINGREASON",
                "PROTECTIONELIGIBILITY",
                "PROTECTIONELIGIBILITYTYPE",
                "INSTRUMENTCATEGORY",
                "INSTRUMENTID"
        });

        DoCaptureResponse dcr = PaypalUtil.convertToAPIResponse(testResponseMap, DoCaptureResponse.class);
        Assert.assertEquals(dcr.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(dcr.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(dcr.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(dcr.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(dcr.getBuild(), testResponseMap.get("BUILD"));

        Assert.assertEquals(dcr.getTransactionId(), testResponseMap.get("TRANSACTIONID"));
        Assert.assertEquals(dcr.getParentTransactionId(), testResponseMap.get("PARENTTRANSACTIONID"));
        Assert.assertEquals(dcr.getReceiptId(), testResponseMap.get("RECEIPTID"));
        Assert.assertEquals(dcr.getTransactionType(), testResponseMap.get("TRANSACTIONTYPE"));
        Assert.assertEquals(dcr.getPaymentType(), testResponseMap.get("PAYMENTTYPE"));
        Assert.assertEquals(dcr.getOrderTime(), testResponseMap.get("ORDERTIME"));
        Assert.assertEquals(dcr.getAmt(), testResponseMap.get("AMT"));
        Assert.assertEquals(dcr.getFeeAmt(), testResponseMap.get("FEEAMT"));
        Assert.assertEquals(dcr.getSettleAmt(), testResponseMap.get("SETTLEAMT"));
        Assert.assertEquals(dcr.getTaxAmt(), testResponseMap.get("TAXAMT"));
        Assert.assertEquals(dcr.getExchangeRate(), testResponseMap.get("EXCHANGERATE"));
        Assert.assertEquals(dcr.getPaymentStatus(), testResponseMap.get("PAYMENTSTATUS"));
        Assert.assertEquals(dcr.getPendingReason(), testResponseMap.get("PENDINGREASON"));
        Assert.assertEquals(dcr.getProtectionEligibility(), testResponseMap.get("PROTECTIONELIGIBILITY"));
        Assert.assertEquals(dcr.getProtectionEligibilityType(), testResponseMap.get("PROTECTIONELIGIBILITYTYPE"));
        Assert.assertEquals(dcr.getInstrumentCategory(), testResponseMap.get("INSTRUMENTCATEGORY"));
        Assert.assertEquals(dcr.getInstrumentId(), testResponseMap.get("INSTRUMENTID"));

    }

    @Test
    public void convertToAPIResponse_ErrorInfo() {
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",

                "L_ERRORCODE0",
                "L_SHORTMESSAGE0",
                "L_LONGMESSAGE0",
                "L_SERVERITYCODE0",
                "L_ERRORCODE1",
                "L_SHORTMESSAGE1",
                "L_LONGMESSAGE1",
                "L_SERVERITYCODE1"

        });

        DoCaptureResponse dcr = PaypalUtil.convertToAPIResponse(testResponseMap, DoCaptureResponse.class);
        Assert.assertEquals(dcr.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(dcr.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(dcr.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(dcr.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(dcr.getBuild(), testResponseMap.get("BUILD"));
        Assert.assertEquals(dcr.getErrorInfos().get(0).getErrorCode(), testResponseMap.get("L_ERRORCODE0"));
        Assert.assertEquals(dcr.getErrorInfos().get(0).getShortMessage(), testResponseMap.get("L_SHORTMESSAGE0"));
        Assert.assertEquals(dcr.getErrorInfos().get(0).getLongMessage(), testResponseMap.get("L_LONGMESSAGE0"));
        Assert.assertEquals(dcr.getErrorInfos().get(0).getServerityCode(), testResponseMap.get("L_SERVERITYCODE0"));
        Assert.assertEquals(dcr.getErrorInfos().get(1).getErrorCode(), testResponseMap.get("L_ERRORCODE1"));
        Assert.assertEquals(dcr.getErrorInfos().get(1).getShortMessage(), testResponseMap.get("L_SHORTMESSAGE1"));
        Assert.assertEquals(dcr.getErrorInfos().get(1).getLongMessage(), testResponseMap.get("L_LONGMESSAGE1"));
        Assert.assertEquals(dcr.getErrorInfos().get(1).getServerityCode(), testResponseMap.get("L_SERVERITYCODE1"));
    }

    @Test
    public void convertToAPIResponse_RefundTransaction() {
        Map<String, String> testResponseMap = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",

                "REFUNDTRANSACTIONID",
                "FEEREFUNDAMT",
                "GROSSREFUNDAMT",
                "NETREFUNDAMT",
                "TOTALREFUNDEDAMOUNT",
                "CURRENCYCODE",
                "REFUNDINFO",
                "MSGSUBID",
                "REFUNDSTATUS",
                "PENDINGREASON"

        });

        RefundTransactionResponse rtr = PaypalUtil.convertToAPIResponse(testResponseMap, RefundTransactionResponse.class);
        Assert.assertEquals(rtr.getAck(), testResponseMap.get("ACK"));
        Assert.assertEquals(rtr.getCorrelationId(), testResponseMap.get("CORRELATIONID"));
        Assert.assertEquals(rtr.getTimeStamp(), testResponseMap.get("TIMESTAMP"));
        Assert.assertEquals(rtr.getVersion(), testResponseMap.get("VERSION"));
        Assert.assertEquals(rtr.getBuild(), testResponseMap.get("BUILD"));
        Assert.assertEquals(rtr.getRefundTransactionId(), testResponseMap.get("REFUNDTRANSACTIONID"));
        Assert.assertEquals(rtr.getFeerefundAmt(), testResponseMap.get("FEEREFUNDAMT"));
        Assert.assertEquals(rtr.getGrossRefundAmt(), testResponseMap.get("GROSSREFUNDAMT"));
        Assert.assertEquals(rtr.getNetRefundAmt(), testResponseMap.get("NETREFUNDAMT"));
        Assert.assertEquals(rtr.getTotalRefundedAmount(), testResponseMap.get("TOTALREFUNDEDAMOUNT"));
        Assert.assertEquals(rtr.getCurrencyCode(), testResponseMap.get("CURRENCYCODE"));
        Assert.assertEquals(rtr.getRefundInfo(), testResponseMap.get("REFUNDINFO"));
        Assert.assertEquals(rtr.getMsgSubId(), testResponseMap.get("MSGSUBID"));
        Assert.assertEquals(rtr.getRefundStatus(), testResponseMap.get("REFUNDSTATUS"));
        Assert.assertEquals(rtr.getPendingReason(), testResponseMap.get("PENDINGREASON"));

    }

    @Test
    public void covertToQueryMap_DoExpressCheckoutPaymentRequest() {
        DoExpressCheckoutPaymentRequest decpr = getTestedObject(DoExpressCheckoutPaymentRequest.class);
        Map map = PaypalUtil.toRequestMap(decpr);
        Assert.assertEquals(map.get("METHOD"), "DoExpressCheckoutPayment");
        Assert.assertEquals(map.get("TOKEN"), decpr.getToken());
        Assert.assertEquals(map.get("PAYERID"), decpr.getPayerId());
        Assert.assertEquals(map.get("MSGSUBID"), decpr.getMsgSubId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTACTION"), decpr.getPaymentAction().get(0));
        Assert.assertEquals(map.get("GIFTMESSAGE"), decpr.getGiftMessage());
        Assert.assertEquals(map.get("GIFTRECEIPTENABLE"), decpr.getGiftReceiptEnable());
        Assert.assertEquals(map.get("GIFTWRAPNAME"), decpr.getGiftWrapName());
        Assert.assertEquals(map.get("GIFTWRAPAMOUNT"), decpr.getGiftWrapAmount());
        Assert.assertEquals(map.get("BUYERMARKETINGEMAIL"), decpr.getBuyerMarketingEmail());
        Assert.assertEquals(map.get("SURVEYQUESTION"), decpr.getSurveyQuestion());
        Assert.assertEquals(map.get("SURVEYCHOICESELECTED"), decpr.getSurveyChoiceSelected());
        Assert.assertEquals(map.get("BUTTONSOURCE"), decpr.getButtonSource());
        Assert.assertEquals(map.get("SKIPBACREATION"), decpr.getSkipBACreation());
        Assert.assertEquals(map.get("RETURNFMFDETAILS"), decpr.getReturnFMFDetails());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_AMT"), decpr.getPaymentDetails().get(0).getAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_CURRENCYCODE"), decpr.getPaymentDetails().get(0)
                .getCurrencyCode());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_ITEMAMT"), decpr.getPaymentDetails().get(0).getItemAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPPINGAMT"), decpr.getPaymentDetails().get(0).getShippingAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INSURANCEAMT"), decpr.getPaymentDetails().get(0)
                .getInsuranceAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPDISCAMT"), decpr.getPaymentDetails().get(0).getShipDiscAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INSURANCEOPTIONOFFERED"), decpr.getPaymentDetails().get(0)
                .getInsuranceOptionOffered());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_HANDLINGAMT"), decpr.getPaymentDetails().get(0).getHandlingAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_TAXAMT"), decpr.getPaymentDetails().get(0).getTaxAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_DESC"), decpr.getPaymentDetails().get(0).getDesc());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_CUSTOM"), decpr.getPaymentDetails().get(0).getCustom());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INVNUM"), decpr.getPaymentDetails().get(0).getInvNum());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_NOTIFYURL"), decpr.getPaymentDetails().get(0).getNotifyUrl());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_MULTISHIPPING"), decpr.getPaymentDetails().get(0)
                .getMultiShipping());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_BUCKETCATEGORYTYPE"), decpr.getPaymentDetails().get(0)
                .getBucketCategoryType());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_NOTETEXT"), decpr.getPaymentDetails().get(0).getNoteText());
//        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SOFTDESCRIPTOR"), decpr.getPaymentDetails().get(0).get());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_TRANSACTIONID"), decpr.getPaymentDetails().get(0)
                .getTransactionId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_ALLOWEDPAYMENTMETHOD"), decpr.getPaymentDetails().get(0)
                .getAllowedPaymentMethod());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTACTION"), decpr.getPaymentDetails().get(0)
                .getPaymentAction());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTREQUESTID"), decpr.getPaymentDetails().get(0)
                .getPaymentRequestId());

        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_NAME0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getName());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_DESC0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getDesc());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_AMT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getAmt());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_NUMBER0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_QTY0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getQty());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_TAXAMT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getTaxAmt());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWEIGHTVALUE0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemWeightValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWEIGHTUNIT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemWeightUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMLENGTHVALUE0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemLengthValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMLENGTHUNIT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemLengthUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWIDTHVALUE0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemWidthValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWIDTHUNIT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemWidthUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMHEIGHTVALUE0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemHeightValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMHEIGHTUNIT0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemHeightUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMURL0"), decpr.getPaymentDetailsItems().get(0)
                .get(0).getItemUrl
                        ());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMCATEGORY0"), decpr.getPaymentDetailsItems().get(0)
                .get(0)
                .getItemCategory());

        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMNUMBER0"), decpr.getEbayItemPaymentDetailsItems().get
                (0).get(0).getEbayItemNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMNUMBER1"), decpr.getEbayItemPaymentDetailsItems().get
                (0).get(1).getEbayItemNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_1_EBAYITEMNUMBER0"), decpr.getEbayItemPaymentDetailsItems().get
                (1).get(0).getEbayItemNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_1_EBAYITEMNUMBER1"), decpr.getEbayItemPaymentDetailsItems().get
                (1).get(1).getEbayItemNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMAUCTIONTXNID0"), decpr.getEbayItemPaymentDetailsItems
                ().get(0).get(0).getEbayItemAuctionTxnId());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMORDERID0"), decpr.getEbayItemPaymentDetailsItems()
                .get(0).get(0).getEbayItemOrderId());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYCARTID0"), decpr.getEbayItemPaymentDetailsItems().get
                (0).get(0).getEbayCartId());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERNAME"), decpr.getDiscountInfoTypes().get(0)
                .getRedeemedOfferName());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERDESCRIPTION"), decpr.getDiscountInfoTypes().get(0)
                .getRedeemedOfferDescription());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERAMOUNT"), decpr.getDiscountInfoTypes().get(0)
                .getRedeemedOfferAmount());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERTYPE"), decpr.getDiscountInfoTypes().get(0)
                .getRedeemedOfferType());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERID"), decpr.getDiscountInfoTypes().get(0)
                .getRedeemedOfferId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0REDEEMEDOFFERPOINTSACCRUED"), decpr.getDiscountInfoTypes().get
                (0).getRedeemedOfferPointsAccrued());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0CUMMULATIVEPOINTSNAME"), decpr.getDiscountInfoTypes().get(0)
                .getCummulativePointsName());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0CUMMULATIVEPOINTSDESCRIPTION"), decpr.getDiscountInfoTypes().get
                (0).getCummulativePointsDescription());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0CUMMULATIVEPOINTSTYPE"), decpr.getDiscountInfoTypes().get(0)
                .getCummulativePointsType());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0CUMMULATIVEPOINTSID"), decpr.getDiscountInfoTypes().get(0)
                .getCummulativePointsId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0CUMMULATIVEPOINTSACCRUED"), decpr.getDiscountInfoTypes().get(0)
                .getCummulativePointsAccrued());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0MERCHANTDATAKEY0"), decpr.getDiscountInfoTypes().get(0)
                .getMerchantDataKey().get(0));
        Assert.assertEquals(map.get("PAYMENTREQUEST_0MERCHANTDATAVALUE0"), decpr.getDiscountInfoTypes().get(0)
                .getMerchantDataValue().get(0));

        Assert.assertEquals(map.get("INSURANCEOPTIONSELECTED"), decpr.getInsuranceOptionSelected());
        Assert.assertEquals(map.get("SHIPPINGOPTIONISDEFAULT"), decpr.getShippingOptionIsDefault());
        Assert.assertEquals(map.get("SHIPPINGOPTIONAMOUNT"), decpr.getShippingOptionAmount());
        Assert.assertEquals(map.get("SHIPPINGOPTIONNAME"), decpr.getShippingOptionName());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SELLERID"), decpr.getSellerDetailses().get(0).getSellerId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SELLERUSERNAME"), decpr.getSellerDetailses().get(0)
                .getSellerUserName());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SELLERREGISTRATIONDATE"), decpr.getSellerDetailses().get(0)
                .getSellerRegistrationDate());
    }

    @Test
    public void convertToAPIResponse_DoExpressCheckoutPaymentResponse() {
        Map<String, String> mapdata = getTestResponseMap(new String[]{
                "ACK",
                "CORRELATIONID",
                "TIMESTAMP",
                "VERSION",
                "BUILD",
                "TOKEN",
                "BILLINGAGREEMENTID",
                "REDIRECTREQUIRED",
                "NOTE",
                "MSGSUBID",
                "SUCCESSPAGEREDIRECTREQUESTED",
                "PAYMENTINFO_0_TRANSACTIONID",
                "PAYMENTINFO_0_EBAYITEMAUCTIONTXNID",
                "PAYMENTINFO_0_PARENTTRANSACTIONID",
                "PAYMENTINFO_0_RECEIPTID",
                "PAYMENTINFO_0_TRANSACTIONTYPE",
                "PAYMENTINFO_0_PAYMENTTYPE",
                "PAYMENTINFO_0_EXPECTEDECHECKCLEARDATE",
                "PAYMENTINFO_0_ORDERTIME",
                "PAYMENTINFO_0_AMT",
                "PAYMENTINFO_0_FEEAMT",
                "PAYMENTINFO_0_CURRENCYCODE",
                "PAYMENTINFO_0_SETTLEAMT",
                "PAYMENTINFO_0_TAXAMT",
                "PAYMENTINFO_0_EXCHANGERATE",
                "PAYMENTINFO_0_PAYMENTSTATUS",
                "PAYMENTINFO_0_PENDINGREASON",
                "PAYMENTINFO_0_REASONCODE",
                "PAYMENTINFO_0_HOLDDECISION",
                "PAYMENTINFO_0_SHIPPINGMETHOD",
                "PAYMENTINFO_0_PROTECTIONELIGIBILITY",
                "PAYMENTINFO_0_PROTECTIONELIGIBILITYTYPE",
                "PAYMENTINFO_0_RECEIPTREFERENCENUMBER",
                "PAYMENTINFO_0_SHIPPINGAMT",
                "PAYMENTINFO_0_HANDLINGAMT",
                "STOREID",
                "TERMINALID",
                "PAYMENTINFO_0_PAYMENTREQUESTID",
                "PAYMENTINFO_0_INSTRUMENTCATEGORY",
                "PAYMENTINFO_0_INSTRUMENTID",
                "PAYMENTINFO_0_OFFERCODE",
                "PAYMENTINFO_0_OFFERTRACKINGID",
                "SHIPPINGCALCULATIONMODE",
                "INSURANCEOPTIONSELECTED",
                "SHIPPINGOPTIONISDEFAULT",
                "SHIPPINGOPTIONAMOUNT",
                "SHIPPINGOPTIONNAME",
                "PAYMENTINFO_0_SHORTMESSAGE",
                "PAYMENTINFO_0_LONGMESSAGE",
                "PAYMENTINFO_0_ERRORCODE",
                "PAYMENTINFO_0_SEVERITYCODE",
                "PAYMENTINFO_0_ACK",
                "PAYMENTINFO_0_SELLERPAYPALACCOUNTID",
                "PAYMENTINFO_0_SECUREMERCHANTACCOUNTID",
                "PAYMENTINFO_0_SELLERID",
                "PAYMENTINFO_0_SELLERUSERNAME",
                "PAYMENTINFO_0_SELLERREGISTRATIONDATE",
                "L_PAYMENTINFO_0_FMFfilterID0",
                "L_PAYMENTINFO_0_FMFfilterNAME0"
        });
        DoExpressCheckoutPaymentResponse decpr = PaypalUtil.convertToAPIResponse(mapdata,
                DoExpressCheckoutPaymentResponse.class);
        Assert.assertEquals(decpr.getAck(), mapdata.get("ACK"));
        Assert.assertEquals(decpr.getCorrelationId(), mapdata.get("CORRELATIONID"));
        Assert.assertEquals(decpr.getTimeStamp(), mapdata.get("TIMESTAMP"));
        Assert.assertEquals(decpr.getVersion(), mapdata.get("VERSION"));
        Assert.assertEquals(decpr.getBuild(), mapdata.get("BUILD"));

        Assert.assertEquals(decpr.getToken(), mapdata.get("TOKEN"));
        Assert.assertEquals(decpr.getBillingAgreementId(), mapdata.get("BILLINGAGREEMENTID"));
        Assert.assertEquals(decpr.getRedirectRequired(), mapdata.get("REDIRECTREQUIRED"));
        Assert.assertEquals(decpr.getNote(), mapdata.get("NOTE"));
        Assert.assertEquals(decpr.getMsgSubId(), mapdata.get("MSGSUBID"));
        Assert.assertEquals(decpr.getSuccessPageRedirectRequested(), mapdata.get("SUCCESSPAGEREDIRECTREQUESTED"));

        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getTransactionId(), mapdata.get
                ("PAYMENTINFO_0_TRANSACTIONID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getEbayItemAuctionTxnId(), mapdata.get
                ("PAYMENTINFO_0_EBAYITEMAUCTIONTXNID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getParentTransactionId(), mapdata.get
                ("PAYMENTINFO_0_PARENTTRANSACTIONID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getReceiptId(), mapdata.get("PAYMENTINFO_0_RECEIPTID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getTransactionType(), mapdata.get
                ("PAYMENTINFO_0_TRANSACTIONTYPE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getPaymentType(), mapdata.get
                ("PAYMENTINFO_0_PAYMENTTYPE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getExpectedEcheckClearDate(), mapdata.get
                ("PAYMENTINFO_0_EXPECTEDECHECKCLEARDATE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getOrderTime(), mapdata.get("PAYMENTINFO_0_ORDERTIME"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getAmt(), mapdata.get("PAYMENTINFO_0_AMT"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getCurrencyCode(), mapdata.get
                ("PAYMENTINFO_0_CURRENCYCODE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getFeeAmt(), mapdata.get("PAYMENTINFO_0_FEEAMT"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSettleAmt(), mapdata.get("PAYMENTINFO_0_SETTLEAMT"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getTaxAmt(), mapdata.get("PAYMENTINFO_0_TAXAMT"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getExchangeRate(), mapdata.get
                ("PAYMENTINFO_0_EXCHANGERATE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getPaymentStatus(), mapdata.get
                ("PAYMENTINFO_0_PAYMENTSTATUS"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getPendingReason(), mapdata.get
                ("PAYMENTINFO_0_PENDINGREASON"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getReasonCode(), mapdata.get("PAYMENTINFO_0_REASONCODE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getHoldDecision(), mapdata.get
                ("PAYMENTINFO_0_HOLDDECISION"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getShippingMethod(), mapdata.get
                ("PAYMENTINFO_0_SHIPPINGMETHOD"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getProtectionEligibility(), mapdata.get
                ("PAYMENTINFO_0_PROTECTIONELIGIBILITY"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getProtectionEligibilityType(), mapdata.get
                ("PAYMENTINFO_0_PROTECTIONELIGIBILITYTYPE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getReceiptReferenceNumber(), mapdata.get
                ("PAYMENTINFO_0_RECEIPTREFERENCENUMBER"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getShippingAmt(), mapdata.get
                ("PAYMENTINFO_0_SHIPPINGAMT"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getHandlingAmt(), mapdata.get
                ("PAYMENTINFO_0_HANDLINGAMT"));
        Assert.assertEquals(decpr.getStoreId(), mapdata.get("STOREID"));
        Assert.assertEquals(decpr.getTerminalId(), mapdata.get("TERMINALID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getPaymentRequestId(), mapdata.get
                ("PAYMENTINFO_0_PAYMENTREQUESTID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getInstrumentCategory(), mapdata.get
                ("PAYMENTINFO_0_INSTRUMENTCATEGORY"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getInstrumentId(), mapdata.get
                ("PAYMENTINFO_0_INSTRUMENTID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getOfferCode(), mapdata.get("PAYMENTINFO_0_OFFERCODE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getOfferTrackingId(), mapdata.get
                ("PAYMENTINFO_0_OFFERTRACKINGID"));
        Assert.assertEquals(decpr.getShippingCalculationMode(), mapdata.get("SHIPPINGCALCULATIONMODE"));
        Assert.assertEquals(decpr.getInsuranceOptionSelected(), mapdata.get("INSURANCEOPTIONSELECTED"));
        Assert.assertEquals(decpr.getShippingOptionIsDefault(), mapdata.get("SHIPPINGOPTIONISDEFAULT"));
        Assert.assertEquals(decpr.getShippingOptionAmount(), mapdata.get("SHIPPINGOPTIONAMOUNT"));
        Assert.assertEquals(decpr.getShippingOptionName(), mapdata.get("SHIPPINGOPTIONNAME"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getShortMessage(), mapdata.get
                ("PAYMENTINFO_0_SHORTMESSAGE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getLongMessage(), mapdata.get
                ("PAYMENTINFO_0_LONGMESSAGE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getErrorCode(), mapdata.get("PAYMENTINFO_0_ERRORCODE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSeverityCode(), mapdata.get
                ("PAYMENTINFO_0_SEVERITYCODE"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getAck(), mapdata.get("PAYMENTINFO_0_ACK"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSellerPaypalAccountId(), mapdata.get
                ("PAYMENTINFO_0_SELLERPAYPALACCOUNTID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSecureMerchantAccountId(), mapdata.get
                ("PAYMENTINFO_0_SECUREMERCHANTACCOUNTID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSellerId(), mapdata.get("PAYMENTINFO_0_SELLERID"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSellerUserName(), mapdata.get
                ("PAYMENTINFO_0_SELLERUSERNAME"));
        Assert.assertEquals(decpr.getPaymentInfoForDoExpressCheckoutRes().get(0).getSellerRegistrationDate(), mapdata.get
                ("PAYMENTINFO_0_SELLERREGISTRATIONDATE"));
//        Assert.assertEquals(decpr, mapdata.get("L_PAYMENTINFO_0_FMFfilterID0"));
//        Assert.assertEquals(decpr.getSuccessPageRedirectRequested(), mapdata.get("L_PAYMENTINFO_0_FMFfilterNAME0"));

    }

    @Test
    public void covertToQueryMap_SetExpressCheckoutRequest() {
        SetExpressCheckoutRequest secr = getTestedObject(SetExpressCheckoutRequest.class);
        Map map = PaypalUtil.toRequestMap(secr);

        Assert.assertEquals(map.get("METHOD"), "SetExpressCheckout");

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_AMT"), secr.getPaymentDetailList().get(0).getAmt());
        Assert.assertEquals(map.get("MAXAMT"), secr.getMaxAmt());
        Assert.assertEquals(map.get("RETURNURL"), secr.getReturnUrl());
        Assert.assertEquals(map.get("CANCELURL"), secr.getCancelUrl());
        Assert.assertEquals(map.get("CALLBACK"), secr.getCallback());
        Assert.assertEquals(map.get("CALLBACKTIMEOUT"), secr.getCallbackTimeout());
        Assert.assertEquals(map.get("REQCONFIRMSHIPPING"), secr.getReqConfirmShipping());
        Assert.assertEquals(map.get("NOSHIPPING"), secr.getNoShipping());
        Assert.assertEquals(map.get("ALLOWNOTE"), secr.getAllowNote());
        Assert.assertEquals(map.get("ADDROVERRIDE"), secr.getAddrOverride());
        Assert.assertEquals(map.get("CALLBACKVERSION"), secr.getCallbackVersion());
        Assert.assertEquals(map.get("LOCALECODE"), secr.getLocaleCode());
        Assert.assertEquals(map.get("PAGESTYLE"), secr.getPageStyle());
        Assert.assertEquals(map.get("HDRIMG"), secr.getHdrImg());
        Assert.assertEquals(map.get("PAYFLOWCOLOR"), secr.getPayFlowColor());
        Assert.assertEquals(map.get("CARTBORDERCOLOR"), secr.getCartBorderColor());
        Assert.assertEquals(map.get("LOGOIMG"), secr.getLogoImg());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTACTION"), secr.getPaymentDetailList().get(0)
                .getPaymentAction());
        Assert.assertEquals(map.get("EMAIL"), secr.getEmail());
        Assert.assertEquals(map.get("SOLUTIONTYPE"), secr.getSolutionType());
        Assert.assertEquals(map.get("LANDINGPAGE"), secr.getLandingPage());
        Assert.assertEquals(map.get("CHANNELTYPE"), secr.getChannelType());
        Assert.assertEquals(map.get("TOTALTYPE"), secr.getTotalType());
        Assert.assertEquals(map.get("GIROPAYSUCCESSURL"), secr.getGiroPaySuccessUrl());
        Assert.assertEquals(map.get("GIROPAYCANCELURL"), secr.getGiroPayCancelUrl());
        Assert.assertEquals(map.get("BANKTXNPENDINGURL"), secr.getBankTxnPendingUrl());
        Assert.assertEquals(map.get("BRANDNAME"), secr.getBrandName());
        Assert.assertEquals(map.get("CUSTOMERSERVICENUMBER"), secr.getCustomerServiceNumber());
        Assert.assertEquals(map.get("GIFTMESSAGEENABLE"), secr.getGiftMessageEnable());
        Assert.assertEquals(map.get("GIFTRECEIPTENABLE"), secr.getGiftReceiptenable());
        Assert.assertEquals(map.get("GIFTWRAPENABLE"), secr.getGiftWrapEnable());
        Assert.assertEquals(map.get("GIFTWRAPNAME"), secr.getGiftWrapName());
        Assert.assertEquals(map.get("GIFTWRAPAMOUNT"), secr.getGiftWrapAmount());
        Assert.assertEquals(map.get("BUYEREMAILOPTINENABLE"), secr.getBuyerEmailOptinEnable());
        Assert.assertEquals(map.get("SURVEYQUESTION"), secr.getSurveyQuestion());
        Assert.assertEquals(map.get("SURVEYENABLE"), secr.getSurveyEnable());
        Assert.assertEquals(map.get("L_SURVEYCHOICE0"), secr.getSurveyChoice().get(0));
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTREASON"), secr.getPaymentReason().get(0));

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTONAME"), secr.getShipToAdderssExts().get(0).getShipToName());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOSTREET"), secr.getShipToAdderssExts().get(0)
                .getShipToStreet());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOSTREET2"), secr.getShipToAdderssExts().get(0)
                .getShipToStreet2());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOCITY"), secr.getShipToAdderssExts().get(0).getShipToCity());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOSTATE"), secr.getShipToAdderssExts().get(0)
                .getShipToState());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOZIP"), secr.getShipToAdderssExts().get(0).getShipToZip());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOCOUNTRYCODE"), secr.getShipToAdderssExts().get(0)
                .getShipToCountryCode());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPTOPHONENUM"), secr.getShipToAdderssExts().get(0)
                .getShiptophonenum());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_AMT"), secr.getPaymentDetailList().get(0).getAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_CURRENCYCODE"), secr.getPaymentDetailList().get(0)
                .getCurrencyCode());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_ITEMAMT"), secr.getPaymentDetailList().get(0).getItemAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPPINGAMT"), secr.getPaymentDetailList().get(0)
                .getShippingAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INSURANCEAMT"), secr.getPaymentDetailList().get(0)
                .getInsuranceAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SHIPDISCAMT"), secr.getPaymentDetailList().get(0)
                .getShipDiscAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INSURANCEOPTIONOFFERED"), secr.getPaymentDetailList().get(0)
                .getInsuranceOptionOffered());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_HANDLINGAMT"), secr.getPaymentDetailList().get(0)
                .getHandlingAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_TAXAMT"), secr.getPaymentDetailList().get(0).getTaxAmt());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_DESC"), secr.getPaymentDetailList().get(0).getDesc());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_CUSTOM"), secr.getPaymentDetailList().get(0).getCustom());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_INVNUM"), secr.getPaymentDetailList().get(0).getInvNum());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_NOTIFYURL"), secr.getPaymentDetailList().get(0).getNotifyUrl());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_MULTISHIPPING"), secr.getPaymentDetailList().get(0)
                .getMultiShipping());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_BUCKETCATEGORYTYPE"), secr.getPaymentDetailList().get(0)
                .getBucketCategoryType());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_NOTETEXT"), secr.getPaymentDetailList().get(0).getNoteText());

        Assert.assertEquals(map.get("NOTETOBUYER"), secr.getNoteToBuyer());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_TRANSACTIONID"), secr.getPaymentDetailList().get(0)
                .getTransactionId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_ALLOWEDPAYMENTMETHOD"), secr.getPaymentDetailList().get(0)
                .getAllowedPaymentMethod());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTACTION"), secr.getPaymentDetailList().get(0)
                .getPaymentAction());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_PAYMENTREQUESTID"), secr.getPaymentDetailList().get(0)
                .getPaymentRequestId());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_BUCKETCATEGORYTYPE"), secr.getPaymentDetailList().get(0)
                .getBucketCategoryType());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_LOCATION_TYPE"), secr.getPaymentDetailList().get(0)
                .getLocation_type());
        Assert.assertEquals(map.get("PAYMENTREQUEST_0_LOCATION_ID"), secr.getPaymentDetailList().get(0)
                .getLocation_id());

        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_NAME0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getName()
        );
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_DESC0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getDesc()
        );
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_AMT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getAmt());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_NUMBER0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getNumber
                        ());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_QTY0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getQty());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_TAXAMT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0).getTaxAmt
                        ());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWEIGHTVALUE0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemWeightValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWEIGHTUNIT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemWeightUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMLENGTHVALUE0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemLengthValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMLENGTHUNIT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemLengthUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWIDTHVALUE0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemWidthValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMWIDTHUNIT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemWidthUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMHEIGHTVALUE0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemHeightValue());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMHEIGHTUNIT0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemHeightUnit());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMURL0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemUrl());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_ITEMCATEGORY0"), secr.getPaymentDetailsItemList().get(0)
                .get(0)
                .getItemCategory());

        Assert.assertEquals(map.get("PAYMENTREQUEST_0_SELLERPAYPALACCOUNTID"), secr.getSellerPaypalAccountId().get(0));

        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMNUMBER0"), secr.getEbayItemPaymentDetailsItems().get
                (0).get(0).getEbayItemNumber());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMAUCTIONTXNID0"), secr.getEbayItemPaymentDetailsItems
                ().get(0).get(0).getEbayItemAuctionTxnId());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYITEMORDERID0"), secr.getEbayItemPaymentDetailsItems().get
                (0).get(0).getEbayItemOrderId());
        Assert.assertEquals(map.get("L_PAYMENTREQUEST_0_EBAYCARTID0"), secr.getEbayItemPaymentDetailsItems().get
                (0).get(0).getEbayCartId());

        Assert.assertEquals(map.get("BUYERID"), secr.getBuyerId());
        Assert.assertEquals(map.get("BUYERUSERNAME"), secr.getBuyerUserName());
        Assert.assertEquals(map.get("BUYERREGISTRATIONDATE"), secr.getBuyerRegistrationDate());

        Assert.assertEquals(map.get("ALLOWPUSHFUNDING"), secr.getAllowPushFunding());
        Assert.assertEquals(map.get("USERSELECTEDFUNDINGSOURCE"), secr.getUserSelectedFundingSource());

        Assert.assertEquals(map.get("L_SHIPPINGOPTIONISDEFAULT0"), secr.getShippingOptions().get(0)
                .getShippingOptionIsDefault());
        Assert.assertEquals(map.get("L_SHIPPINGOPTIONNAME0"), secr.getShippingOptions().get(0).getShippingOptionName());
        Assert.assertEquals(map.get("L_SHIPPINGOPTIONAMOUNT0"), secr.getShippingOptions().get(0)
                .getShippingOptionAmount());

        Assert.assertEquals(map.get("L_BILLINGTYPE0"), secr.getBillingAgreementDetailses().get(0).getBillingType());
        Assert.assertEquals(map.get("L_BILLINGAGREEMENTDESCRIPTION0"), secr.getBillingAgreementDetailses().get(0)
                .getBillingAgreementDescription());
        Assert.assertEquals(map.get("L_PAYMENTTYPE0"), secr.getBillingAgreementDetailses().get(0).getPaymentType());
        Assert.assertEquals(map.get("L_BILLINGAGREEMENTCUSTOM0"), secr.getBillingAgreementDetailses().get(0)
                .getBillingAgreementCustom());

        Assert.assertEquals(map.get("TAXIDTYPE"), secr.getTaxIdType());
        Assert.assertEquals(map.get("TAXID"), secr.getTaxId());
    }

    @Test
    public void convertToAPIResponse_SetExpressCheckoutResponse() {
        Map<String, String> mapdata = getTestResponseMap(new String[]{
                "TOKEN"
        });
        SetExpressCheckoutResponse setExpressCheckoutPaymentResponse = PaypalUtil.convertToAPIResponse(mapdata,
                SetExpressCheckoutResponse.class);
        Assert.assertEquals(setExpressCheckoutPaymentResponse.getAck(), mapdata.get("ACK"));
        Assert.assertEquals(setExpressCheckoutPaymentResponse.getCorrelationId(), mapdata.get("CORRELATIONID"));
        Assert.assertEquals(setExpressCheckoutPaymentResponse.getTimeStamp(), mapdata.get("TIMESTAMP"));
        Assert.assertEquals(setExpressCheckoutPaymentResponse.getVersion(), mapdata.get("VERSION"));
        Assert.assertEquals(setExpressCheckoutPaymentResponse.getBuild(), mapdata.get("BUILD"));

        Assert.assertEquals(setExpressCheckoutPaymentResponse.getToken(), mapdata.get("TOKEN"));
    }

    @Test
    public void covertToQueryMap_GetTransactionDetailsRequest() {
        String randomStr = RandomStringUtils.randomAlphabetic(10);
        GetTransactionDetailsRequest getTransactionDetailsRequest = getTestedObject(GetTransactionDetailsRequest
                .class, randomStr);
        Map<String, String> map = PaypalUtil.toRequestMap(getTransactionDetailsRequest);
        Assert.assertEquals(map.get("METHOD"), "GetTransactionDetails");
        Assert.assertEquals(map.get("TRANSACTIONID"), getTransactionDetailsRequest.getTransactionId());
    }

    @Test
    public void convertToAPIResponse_GetTransactionDetailsResponse() {
        Map<String, String> mapdata = getTestResponseMap(new String[]{
                "SHIPPINGCALCULATIONMODE",
                "INSURANCEOPTIONSELECTED",
                "L_SHIPPINGOPTIONISDEFAULT0",
                "L_SHIPPINGOPTIONNAME0",
                "L_SHIPPINGOPTIONAMOUNT0",
                "GIFTMESSAGE",
                "GIFTRECEIPTENABLE",
                "GIFTWRAPNAME",
                "GIFTWRAPAMOUNT",
                "BUYERMARKETINGEMAIL",
                "SURVEYQUESTION",
                "SURVEYCHOICESELECTED",
                "RECEIVERBUSINESS",
                "RECEIVEREMAIL",
                "RECEIVERID",
                "EMAIL",
                "PAYERID",
                "PAYERSTATUS",
                "COUNTRYCODE",
                "PAYERBUSINESS",
                "SALUTATION",
                "FIRSTNAME",
                "MIDDLENAME",
                "LASTNAME",
                "SUFFIX",
                "ADDRESSOWNER",
                "ADDRESSSTATUS",
                "SHIPTOSECONDARYNAME",
                "SHIPTONAME",
                "SHIPTOSTREET",
                "SHIPTOSECONDARYADDRESSLINE1",
                "SHIPTOSTREET2",
                "SHIPTOSECONDARYADDRESSLINE2",
                "SHIPTOCITY",
                "SHIPTOSECONDARYCITY",
                "SHIPTOSTATE",
                "SHIPTOSECONDARYSTATE",
                "SHIPTOZIP",
                "SHIPTOSECONDARYZIP",
                "SHIPTOCOUNTRYCODE",
                "SHIPTOSECONDARYCOUNTRYCODE",
                "SHIPTOPHONENUM",
                "SHIPTOSECONDARYPHONENUM",
                "TRANSACTIONID",
                "PARENTTRANSACTIONID",
                "RECEIPTID",
                "TRANSACTIONTYPE",
                "PAYMENTTYPE",
                "ORDERTIME",
                "AMT",
                "CURRENCYCODE",
                "FEEAMT",
                "SETTLEAMT",
                "TAXAMT",
                "EXCHANGERATE",
                "PAYMENTSTATUS",
                "PENDINGREASON",
                "REASONCODE",
                "PROTECTIONELIGIBILITY",
                "PROTECTIONELIGIBILITYTYPE",
                "STOREID",
                "SUBJECT",
                "TERMINALID",
                "INVNUM",
                "CUSTOM",
                "NOTE",
                "SALESTAX",
                "SOFTDESCRIPTOR",
                "L_EBAYITEMTXNID0",
                "L_NAME0",
                "L_NUMBER0",
                "L_QTY0",
                "L_ITEMCOUNTUNIT0",
                "L_TAXABLE0",
                "L_TAXRATE0",
                "L_ADDITIONALFEES0TYPE",
                "L_ADDITIONALFEES0AMOUNT",
                "L_ADDITIONALFEES0CURRENCY",
                "L_MPN0",
                "L_ISBN0",
                "L_PLU0",
                "L_MODELNUMBER0",
                "L_STYLENUMBER0",
                "L_COUPONID0",
                "L_COUPONAMOUNT0",
                "L_COUPONAMOUNTCURRENCY0",
                "L_LOYALTYCARDDISCOUNTAMOUNT0",
                "L_LOYALTYCARDISCOUNTCURRENCY0",
                "L_AMT0",
                "L_OPTIONSNAME0",
                "L_OPTIONSVALUE0",
                "BUYERID",
                "CLOSINGDATE",
                "MULTIITEM",
                "SUBSCRIPTIONID",
                "SUBSCRIPTIONDATE",
                "EFFECTIVEDATE",
                "RETRYTIME",
                "USERNAME",
                "PASSWORD",
                "RECURRENCES",
                "REATTEMPT",
                "RECURRING",
                "AMOUNT",
                "PERIOD"
        });
        GetTransactionDetailsResponse getTransactionDetailsResponse = PaypalUtil.convertToAPIResponse(mapdata,
                GetTransactionDetailsResponse.class);
        Assert.assertEquals(getTransactionDetailsResponse.getAck(), mapdata.get("ACK"));
        Assert.assertEquals(getTransactionDetailsResponse.getCorrelationId(), mapdata.get("CORRELATIONID"));
        Assert.assertEquals(getTransactionDetailsResponse.getTimeStamp(), mapdata.get("TIMESTAMP"));
        Assert.assertEquals(getTransactionDetailsResponse.getVersion(), mapdata.get("VERSION"));
        Assert.assertEquals(getTransactionDetailsResponse.getBuild(), mapdata.get("BUILD"));

        Assert.assertEquals(getTransactionDetailsResponse.getShippingCalculationMode(), mapdata.get
                ("SHIPPINGCALCULATIONMODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getInsuranceOptionSelected(), mapdata.get
                ("INSURANCEOPTIONSELECTED"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_ShippingOptionIsDefault().get(0), mapdata.get
                ("L_SHIPPINGOPTIONISDEFAULT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_ShippingOptionName().get(0), mapdata.get
                ("L_SHIPPINGOPTIONNAME0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_ShippingOptionAmount().get(0), mapdata.get
                ("L_SHIPPINGOPTIONAMOUNT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getGiftMessage(), mapdata.get("GIFTMESSAGE"));
        Assert.assertEquals(getTransactionDetailsResponse.getGiftReceiptEnable(), mapdata.get("GIFTRECEIPTENABLE"));
        Assert.assertEquals(getTransactionDetailsResponse.getGiftWrapName(), mapdata.get("GIFTWRAPNAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getGiftWrapAmount(), mapdata.get("GIFTWRAPAMOUNT"));
        Assert.assertEquals(getTransactionDetailsResponse.getBuyerMarketingEmail(), mapdata.get("BUYERMARKETINGEMAIL"));
        Assert.assertEquals(getTransactionDetailsResponse.getSurveyQuestion(), mapdata.get("SURVEYQUESTION"));
        Assert.assertEquals(getTransactionDetailsResponse.getSurveyChoiceSelected(), mapdata.get
                ("SURVEYCHOICESELECTED"));
        Assert.assertEquals(getTransactionDetailsResponse.getReceiverBusiness(), mapdata.get("RECEIVERBUSINESS"));
        Assert.assertEquals(getTransactionDetailsResponse.getReceiverEmail(), mapdata.get("RECEIVEREMAIL"));
        Assert.assertEquals(getTransactionDetailsResponse.getReceiverId(), mapdata.get("RECEIVERID"));
        Assert.assertEquals(getTransactionDetailsResponse.getEmail(), mapdata.get("EMAIL"));
        Assert.assertEquals(getTransactionDetailsResponse.getPayerId(), mapdata.get("PAYERID"));
        Assert.assertEquals(getTransactionDetailsResponse.getPayerStatus(), mapdata.get("PAYERSTATUS"));
        Assert.assertEquals(getTransactionDetailsResponse.getCountryCode(), mapdata.get("COUNTRYCODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getPayerBusiness(), mapdata.get("PAYERBUSINESS"));
        Assert.assertEquals(getTransactionDetailsResponse.getSalutation(), mapdata.get("SALUTATION"));
        Assert.assertEquals(getTransactionDetailsResponse.getFirstName(), mapdata.get("FIRSTNAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getMiddleName(), mapdata.get("MIDDLENAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getLastName(), mapdata.get("LASTNAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getSuffix(), mapdata.get("SUFFIX"));
        Assert.assertEquals(getTransactionDetailsResponse.getAddressOwner(), mapdata.get("ADDRESSOWNER"));
        Assert.assertEquals(getTransactionDetailsResponse.getAddressStatus(), mapdata.get("ADDRESSSTATUS"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryName(), mapdata.get("SHIPTOSECONDARYNAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToName(), mapdata.get("SHIPTONAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToStreet(), mapdata.get("SHIPTOSTREET"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryAddressLine1(), mapdata.get
                ("SHIPTOSECONDARYADDRESSLINE1"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToStreet2(), mapdata.get("SHIPTOSTREET2"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryAddressLine2(), mapdata.get
                ("SHIPTOSECONDARYADDRESSLINE2"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToCity(), mapdata.get("SHIPTOCITY"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryCity(), mapdata.get("SHIPTOSECONDARYCITY"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToState(), mapdata.get("SHIPTOSTATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryState(), mapdata.get
                ("SHIPTOSECONDARYSTATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToZIP(), mapdata.get("SHIPTOZIP"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryZIP(), mapdata.get("SHIPTOSECONDARYZIP"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToCountryCode(), mapdata.get("SHIPTOCOUNTRYCODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryCountryCode(), mapdata.get
                ("SHIPTOSECONDARYCOUNTRYCODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToPhoneNum(), mapdata.get("SHIPTOPHONENUM"));
        Assert.assertEquals(getTransactionDetailsResponse.getShipToSecondaryPhoneNum(), mapdata.get
                ("SHIPTOSECONDARYPHONENUM"));
        Assert.assertEquals(getTransactionDetailsResponse.getTransactionId(), mapdata.get("TRANSACTIONID"));
        Assert.assertEquals(getTransactionDetailsResponse.getParentTransactionId(), mapdata.get("PARENTTRANSACTIONID"));
        Assert.assertEquals(getTransactionDetailsResponse.getReceiptId(), mapdata.get("RECEIPTID"));
        Assert.assertEquals(getTransactionDetailsResponse.getTransactionType(), mapdata.get("TRANSACTIONTYPE"));
        Assert.assertEquals(getTransactionDetailsResponse.getPaymentType(), mapdata.get("PAYMENTTYPE"));
        Assert.assertEquals(getTransactionDetailsResponse.getOrderTime(), mapdata.get("ORDERTIME"));
        Assert.assertEquals(getTransactionDetailsResponse.getAmt(), mapdata.get("AMT"));
        Assert.assertEquals(getTransactionDetailsResponse.getCurrencyCode(), mapdata.get("CURRENCYCODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getFeeAmt(), mapdata.get("FEEAMT"));
        Assert.assertEquals(getTransactionDetailsResponse.getSettleAmt(), mapdata.get("SETTLEAMT"));
        Assert.assertEquals(getTransactionDetailsResponse.getTaxAmt(), mapdata.get("TAXAMT"));
        Assert.assertEquals(getTransactionDetailsResponse.getExchangeRate(), mapdata.get("EXCHANGERATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getPaymentStatus(), mapdata.get("PAYMENTSTATUS"));
        Assert.assertEquals(getTransactionDetailsResponse.getPendingReason(), mapdata.get("PENDINGREASON"));
        Assert.assertEquals(getTransactionDetailsResponse.getReasonCode(), mapdata.get("REASONCODE"));
        Assert.assertEquals(getTransactionDetailsResponse.getProtectionEligibility(), mapdata.get
                ("PROTECTIONELIGIBILITY"));
        Assert.assertEquals(getTransactionDetailsResponse.getProtectionEligibilityType(), mapdata.get
                ("PROTECTIONELIGIBILITYTYPE"));
        Assert.assertEquals(getTransactionDetailsResponse.getStoreId(), mapdata.get("STOREID"));
        Assert.assertEquals(getTransactionDetailsResponse.getSubject(), mapdata.get("SUBJECT"));
        Assert.assertEquals(getTransactionDetailsResponse.getTerminalId(), mapdata.get("TERMINALID"));
        Assert.assertEquals(getTransactionDetailsResponse.getInvNum(), mapdata.get("INVNUM"));
        Assert.assertEquals(getTransactionDetailsResponse.getCustom(), mapdata.get("CUSTOM"));
        Assert.assertEquals(getTransactionDetailsResponse.getNote(), mapdata.get("NOTE"));
        Assert.assertEquals(getTransactionDetailsResponse.getSalesTax(), mapdata.get("SALESTAX"));
        Assert.assertEquals(getTransactionDetailsResponse.getSoftDescriptor(), mapdata.get("SOFTDESCRIPTOR"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_ebayItemTxnId().get(0), mapdata.get("L_EBAYITEMTXNID0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_name().get(0), mapdata.get("L_NAME0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_number().get(0), mapdata.get("L_NUMBER0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_qty().get(0), mapdata.get("L_QTY0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_itemCountUnit().get(0), mapdata.get("L_ITEMCOUNTUNIT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_taxable().get(0), mapdata.get("L_TAXABLE0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_taxRate().get(0), mapdata.get("L_TAXRATE0"));
//        Assert.assertEquals(getTransactionDetailsResponse.getBuild(), mapdata.get("L_ADDITIONALFEES0TYPE"));
//        Assert.assertEquals(getTransactionDetailsResponse.getBuild(), mapdata.get("L_ADDITIONALFEES0AMOUNT"));
//        Assert.assertEquals(getTransactionDetailsResponse.getBuild(), mapdata.get("L_ADDITIONALFEES0CURRENCY"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_mpn().get(0), mapdata.get("L_MPN0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_isbn().get(0), mapdata.get("L_ISBN0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_plu().get(0), mapdata.get("L_PLU0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_modelNumber().get(0), mapdata.get("L_MODELNUMBER0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_styleNumber().get(0), mapdata.get("L_STYLENUMBER0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_couponId().get(0), mapdata.get("L_COUPONID0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_couponAmount().get(0), mapdata.get("L_COUPONAMOUNT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_couponAmountCurrency().get(0), mapdata.get
                ("L_COUPONAMOUNTCURRENCY0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_loyaltyCardDiscountAmount().get(0), mapdata.get
                ("L_LOYALTYCARDDISCOUNTAMOUNT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_loyaltyCardiscountCurrency().get(0), mapdata.get
                ("L_LOYALTYCARDISCOUNTCURRENCY0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_amt().get(0), mapdata.get("L_AMT0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_optionsName().get(0), mapdata.get("L_OPTIONSNAME0"));
        Assert.assertEquals(getTransactionDetailsResponse.getL_optionsValue().get(0), mapdata.get("L_OPTIONSVALUE0"));
        Assert.assertEquals(getTransactionDetailsResponse.getBuyerId(), mapdata.get("BUYERID"));
        Assert.assertEquals(getTransactionDetailsResponse.getClosingDate(), mapdata.get("CLOSINGDATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getMultiItem(), mapdata.get("MULTIITEM"));
        Assert.assertEquals(getTransactionDetailsResponse.getSubscriptionId(), mapdata.get("SUBSCRIPTIONID"));
        Assert.assertEquals(getTransactionDetailsResponse.getSubscriptionDate(), mapdata.get("SUBSCRIPTIONDATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getEffectiveDate(), mapdata.get("EFFECTIVEDATE"));
        Assert.assertEquals(getTransactionDetailsResponse.getRetryTime(), mapdata.get("RETRYTIME"));
        Assert.assertEquals(getTransactionDetailsResponse.getUserName(), mapdata.get("USERNAME"));
        Assert.assertEquals(getTransactionDetailsResponse.getPassword(), mapdata.get("PASSWORD"));
        Assert.assertEquals(getTransactionDetailsResponse.getRecurrences(), mapdata.get("RECURRENCES"));
        Assert.assertEquals(getTransactionDetailsResponse.getReattempt(), mapdata.get("REATTEMPT"));
        Assert.assertEquals(getTransactionDetailsResponse.getRecurring(), mapdata.get("RECURRING"));
        Assert.assertEquals(getTransactionDetailsResponse.getAmount(), mapdata.get("AMOUNT"));
        Assert.assertEquals(getTransactionDetailsResponse.getPeriod(), mapdata.get("PERIOD"));

    }


    private <T> T getTestedObject(Class<T> needTestClazz) {
        return getTestedObject(needTestClazz, RandomStringUtils.randomAlphabetic(10));
    }

    @Test
    public void testDoExpress() {
        DoExpressCheckoutPaymentRequest doExpressCheckoutPaymentRequest = new DoExpressCheckoutPaymentRequest();
        List<List<PaypalEbayItemPaymentDetailsItemExt>> eipdis = new ArrayList<>();
        List<PaypalEbayItemPaymentDetailsItemExt> ppeipdies = new ArrayList<>();
        PaypalEbayItemPaymentDetailsItemExt peipdie = new PaypalEbayItemPaymentDetailsItemExt();
        peipdie.setEbayCartId("ecardId");
        peipdie.setEbayItemNumber("number");
        ppeipdies.add(peipdie);
        eipdis.add(ppeipdies);
        doExpressCheckoutPaymentRequest.setEbayItemPaymentDetailsItems(eipdis);
        Map dataMap = PaypalUtil.toRequestMap(doExpressCheckoutPaymentRequest);
        Assert.assertEquals(dataMap.get("ACK"), doExpressCheckoutPaymentRequest.getButtonSource());
    }

    /**
     * Use for preapre test data, max collection depth is 2.
     *
     * @param needTestClazz
     * @param randomString
     * @param <T>
     * @return
     */
    private <T> T getTestedObject(Class<T> needTestClazz, String randomString) {
        try {
            T clazzObj = needTestClazz.newInstance();
            List<Field> lists = FieldUtils.getAllFieldsList(needTestClazz);
            for (Field field : lists) {
                if (!"method".equalsIgnoreCase(field.getName()) && String.class.isAssignableFrom(field.getType())) {
                    FieldUtils.writeField(clazzObj, field.getName(), field.getName() + randomString, true);
                }
                if (PaypalClassicModel.class.isAssignableFrom(field.getType())) {
                    FieldUtils.writeField(clazzObj, field.getName(), getTestedObject(field.getType(), randomString),
                            true);
                }
                if (List.class.isAssignableFrom(field.getType())) {
                    List list = new ArrayList();

                    ParameterizedType ty = ((ParameterizedType) field.getGenericType());
                    if (ty.getActualTypeArguments()[0] instanceof Class) {
                        Class subClazz = (Class<?>) ty.getActualTypeArguments()[0];
                        if (String.class.isAssignableFrom(subClazz)) {
                            list.add(field.getName() + "_0_" + randomString);
                            list.add(field.getName() + "_1_" + randomString);
                        }
                        if (PaypalClassicModel.class.isAssignableFrom(subClazz)) {
                            list.add(getTestedObject(subClazz, "_0_" + randomString));
                            list.add(getTestedObject(subClazz, "_1_" + randomString));
                        }
                    }
                    if (ty.getActualTypeArguments()[0] instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) ty.getActualTypeArguments()[0];
                        Class<?> containerParam = (Class<?>) parameterizedType.getRawType();
                        if (List.class.isAssignableFrom(containerParam)) {
                            Class subSubClazz = (Class<?>) parameterizedType.getActualTypeArguments()[0];
                            List subList0 = new ArrayList();
                            subList0.add(getTestedObject(subSubClazz, "_00_" + randomString));
                            subList0.add(getTestedObject(subSubClazz, "_01_" + randomString));
                            list.add(subList0);
                            List subList1 = new ArrayList();
                            subList1.add(getTestedObject(subSubClazz, "_10_" + randomString));
                            subList1.add(getTestedObject(subSubClazz, "_11_" + randomString));
                            list.add(subList1);
                        }
                    }
                    FieldUtils.writeField(clazzObj, field.getName(), list, true);
                }
            }
            return clazzObj;

        } catch (Exception e) {
            logger.error("getTestedObject fail", e);
        }
        return null;
    }

    private Map<String, String> getTestResponseMap(String[] testList, String randomStr) {
        Map testResponseMap = new HashMap();
        for (String keyName : testList) {
            testResponseMap.put(keyName, keyName + randomStr);
        }
        return testResponseMap;
    }

    private Map<String, String> getTestResponseMap(String[] testList) {
        return getTestResponseMap(testList, RandomStringUtils.randomAlphabetic(10));
    }
}