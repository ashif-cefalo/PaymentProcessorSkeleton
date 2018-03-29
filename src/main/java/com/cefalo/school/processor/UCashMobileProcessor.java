package com.cefalo.school.processor;

import com.cefalo.school.PaymentFormHandler;
import com.thirdparty.api.UcashPaymentHandler;

import java.util.Map;

public class UCashMobileProcessor implements PaymentProcessorDelegate {
    @Override
    public void processPayment(Map<String, String> formdata) {
        UcashPaymentHandler ucashPaymentHandler = new UcashPaymentHandler();
        ucashPaymentHandler.processPayment(formdata.get(PaymentFormHandler.MOBILE_NUMBER_KEY),
                Double.parseDouble(formdata.get(PaymentFormHandler.AMOUNT_KEY)));
    }
}
