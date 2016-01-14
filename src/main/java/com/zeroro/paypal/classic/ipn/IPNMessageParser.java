/*
* Copyright 2010 Peter Backx, streamhead.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.zeroro.paypal.classic.ipn;

import com.zeroro.paypal.classic.ipn.variable.CaseType;
import com.zeroro.paypal.classic.ipn.variable.PaymentStatus;
import com.zeroro.paypal.classic.ipn.variable.TransactionType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IPNMessageParser {

    private static final Logger logger = LoggerFactory.getLogger(IPNMessageParser.class.getName());

    private Map<String, String> nvp;
    private boolean validated = false;

    public IPNMessageParser(String ipnMessage) {

        nvp = new HashMap<>();

        if (!StringUtils.isEmpty(ipnMessage)) {
            String[] pairs = ipnMessage.split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=", 2); // match only the first =
                try {
                    nvp.put(URLDecoder.decode(keyValue[0], "UTF-8"),
                            URLDecoder.decode(keyValue[1], "UTF-8"));
                } catch (UnsupportedEncodingException e) { // will never happen as UTF-8 is supported
                    logger.error("encoding ipn message error", e);
                }
            }
        }
    }

    public IPNMessageParser(Map<String, String> nvp, boolean validated) {
        this.nvp = nvp;
        this.validated = validated;
    }

    public IPNMessage parse() {
        IPNMessage.Builder builder = new IPNMessage.Builder(nvp);
        if (validated)
            builder.validated();
        for (Entry<String, String> param : nvp.entrySet()) {
            addVariable(builder, param);
        }
        return builder.build();
    }

    private void addVariable(IPNMessage.Builder builder, Entry<String, String> param) {
        String name = param.getKey();
        String value = param.getValue();
        try {
            if (name.equals("txn_type")) {
                builder.transactionType(TransactionType.valueOf(value));
            } else if (name.equals("payment_status")) {
                builder.paymentStatus(PaymentStatus.valueOf(value));
            } else if (name.equals("receiver_email")) {
                builder.receiverEmail(value);
            } else if (name.equals("receiver_id")) {
                builder.receiverId(value);
            } else if (name.equals("residence_country")) {
                builder.residenceCountry(value);
            } else if (name.equals("test_ipn")) {
                builder.testIpn(value);
            } else if (name.equals("transaction_subject")) {
                builder.transactionSubject(value);
            } else if (name.equals("txn_id")) {
                builder.txnId(value);
            } else if (name.equals("payer_email")) {
                builder.payerEmail(value);
            } else if (name.equals("payer_id")) {
                builder.payerId(value);
            } else if (name.equals("payer_status")) {
                builder.payerStatus(value);
            } else if (name.equals("first_name")) {
                builder.firstName(value);
            } else if (name.equals("last_name")) {
                builder.lastName(value);
            } else if (name.equals("address_city")) {
                builder.addressCity(value);
            } else if (name.equals("address_country")) {
                builder.addressCountry(value);
            } else if (name.equals("address_state")) {
                builder.addressState(value);
            } else if (name.equals("address_status")) {
                builder.addressStatus(value);
            } else if (name.equals("address_country_code")) {
                builder.addressCountryCode(value);
            } else if (name.equals("address_name")) {
                builder.addressName(value);
            } else if (name.equals("address_street")) {
                builder.addressStreet(value);
            } else if (name.equals("address_zip")) {
                builder.addressZip(value);
            } else if (name.equals("custom")) {
                builder.custom(value);
            } else if (name.equals("handling_amount")) {
                builder.handlingAmount(value);
            } else if (name.equals("item_name")) {
                builder.itemName(value);
            } else if (name.equals("item_number")) {
                builder.itemNumber(value);
            } else if (name.equals("mc_currency")) {
                builder.mcCurrency(value);
            } else if (name.equals("mc_fee")) {
                builder.mcFee(value);
            } else if (name.equals("mc_gross")) {
                builder.mcGross(value);
            } else if (name.equals("payment_date")) {
                builder.paymentDate(value);
            } else if (name.equals("payment_fee")) {
                builder.paymentFee(value);
            } else if (name.equals("payment_gross")) {
                builder.paymentGross(value);
            } else if (name.equals("payment_type")) {
                builder.paymentType(value);
            } else if (name.equals("protection_eligibility")) {
                builder.protectionEligibility(value);
            } else if (name.equals("quantity")) {
                builder.quantity(value);
            } else if (name.equals("shipping")) {
                builder.shipping(value);
            } else if (name.equals("tax")) {
                builder.tax(value);
            } else if (name.equals("notify_version")) {
                builder.notifyVersion(value);
            } else if (name.equals("charset")) {
                builder.charset(value);
            } else if (name.equals("verify_sign")) {
                builder.verifySign(value);
            } else if (name.equals("case_type")) {
                builder.caseType(CaseType.valueOf(value));
            } else if (name.equals("reason_code")) {
                builder.reasonCode(value);
            }
        } catch (Exception e) {
            // Unknown transaction type
            logger.error("unknown txn_type received, please investigate");
        }
    }

}
