package com.cefalo.school;

import com.cefalo.school.processor.EBLCardPayementProcessor;
import com.cefalo.school.processor.GenericCardProcessor;
import com.cefalo.school.processor.PaymentProcessorDelegate;

import java.util.Map;

public class CardPaymentFactory{
    public static PaymentProcessorDelegate getPaymentProcessor(Map<String, String> formData){
        if (formData.get(PaymentFormHandler.ORGANIZATION_KEY).equals("EBL")){
            return new EBLCardPayementProcessor();
        }
        return new GenericCardProcessor();
    }
}
