package com.cefalo.school;

import com.cefalo.school.processor.PaymentProcessor;


import java.util.Map;

public class DummyPaymentFormHandler implements PaymentFormHandler {
    @Override
    public void handlePaymentFormSubmission(Map<String, String> formdata) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(formdata);
    }
}
