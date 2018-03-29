package com.cefalo.school;

import com.cefalo.school.processor.*;

import java.util.Map;

public class MobilePaymentFactory {
    public static PaymentProcessorDelegate getMobilePaymentProcessor(Map<String, String > formData){
        if (formData.get(PaymentFormHandler.MOBILE_PAYMENT_VENDOR_KEY).equals("ucash")){
            return new UCashMobileProcessor();
        }
        return new GenericMobileProcessor();
    }
}
