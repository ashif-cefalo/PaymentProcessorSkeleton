package com.cefalo.school.processor;

import com.cefalo.school.PaymentFormHandler;
import com.thirdparty.api.GenericMobilePaymentHandler;

import java.util.Map;

public class GenericMobileProcessor implements PaymentProcessorDelegate {
    @Override
    public void processPayment(Map<String, String> formdata) {
        GenericMobilePaymentHandler.handlePayment(
                formdata.get(PaymentFormHandler.MOBILE_PAYMENT_VENDOR_KEY),
                formdata.get(PaymentFormHandler.MOBILE_NUMBER_KEY),
                Double.parseDouble(formdata.get(PaymentFormHandler.AMOUNT_KEY)));
    }
}
