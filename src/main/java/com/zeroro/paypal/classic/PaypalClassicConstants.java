package com.zeroro.paypal.classic;

public class PaypalClassicConstants {

    public static final String CHARSET = "UTF-8";

    public static final String SUCCESS = "Success";
    public static final String DECLINED = "Decline";
    public static final String SUCCESSWITHWARNING = "SuccessWithWarning";
    public static final String PARTIAL = "Partial";
    public static final String FULL = "Full";
    public static final String PENDING = "Pending";

    public static final String TEST_URL = "https://www.sandbox.paypal.com/cgi-bin/webscr";
    public static final String PROD_URL = "https://www.paypal.com/cgi-bin/webscr";

    public static final String TEST_NVP_URL = "https://api-3t.sandbox.paypal.com/nvp";
    public static final String PROD_NVP_URL = "https://api-3t.paypal.com/nvp";

    public static final String TEST_DG_URL = "https://www.sandbox.paypal.com/incontext?token=";
    public static final String PROD_DG_URL = "https://www.paypal.com/incontext?token=";

    public static final String TEST_EC_URL = "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=";
    public static final String PROD_EC_URL = "https://www.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=";

    public static final String TEST_EC_MOBILE_URL = "https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&useraction=commit&token=";
    public static final String PROD_EC_MOBILE_URL = "https://www.paypal.com/cgi-bin/webscr?cmd=_express-checkout&useraction=commit&token=";

    public static final String TEST_IC_URL = "https://www.sandbox.paypal.com/checkoutnow?token=";
    public static final String PROD_IC_URL = "https://www.paypal.com/checkoutnow?token=";

    public static final String WPP_API_VERSION = "112.0";
    public static final String CREDIT_CARD_EXP_DATE_FORMAT = "MMyyyy";



    public interface Field {
        String USER = "USER";
        String PWD = "PWD";
        String SIGNATURE = "SIGNATURE";
        String VERSION = "VERSION";
        String ACCT = "ACCT";
        String EXPDATE = "EXPDATE";
        String CVV2 = "CVV2";

    }

    public interface PaymentStatusType {

        String REFUNDED = "Refunded";
        String PROCESSED = "Processed";
        String COMPLETED = "Completed";
        String PENDING = "Pending";
        String NONE = "None";
        String CANCELREVERSAL = "Canceled-Reversal";
        String DENIED = "Denied";
        String EXPIRED = "Expired";
        String FAILED = "Failed";
        String INPROGRESS = "In-Progress";
        String PARTIALLYREFUNDED = "Partially-Refunded";
        String REVERSED  = "Reversed";
        String VOIDED = "Voided";
    }

    public interface PaymentActionType {
        String AUTHORIZATION = "Authorization";
        String SALE = "Sale";
    }

    public interface CreditCardType {
        String VISA = "Visa";
        String MASTER = "MasterCard";
        String DISCOVER = "Discover";
        String AMEX = "Amex";
        String JCB = "JCB";
        String MAESTRO = "Maestro";
    }

    public interface CompleteType {
        String COMPLETE = "Complete";             /* This is the last capture you intend to make */
        String NOT_COMPLETE = "NotComplete";      /* You intend to make additional captures */
    }
}
