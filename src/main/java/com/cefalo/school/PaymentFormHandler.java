package com.cefalo.school;

import java.util.Map;

public interface PaymentFormHandler {
    String PAYMENT_TYPE_KEY = "paymentType";
    String ORGANIZATION_KEY = "organization";
    String CARD_NUMBER_KEY = "cardnumber";
    String ACCOUNT_NAME_KEY = "accountName";
    String EXPIRY_DATE_KEY = "expirtyDate";
    String AMOUNT_KEY = "amount";
    String MOBILE_NUMBER_KEY = "mobileNumber";
    String MOBILE_PAYMENT_VENDOR_KEY = "mobilePaymentVendor";

    void handlePaymentFormSubmission(Map<String, String> formdata);
}
