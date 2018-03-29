package com.cefalo.school.processor;

import java.util.Map;

public interface PaymentProcessorDelegate {
    public void processPayment(Map<String, String > formData);
}
