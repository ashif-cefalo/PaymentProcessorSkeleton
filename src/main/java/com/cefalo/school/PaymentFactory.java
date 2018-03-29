package com.cefalo.school;

import com.cefalo.school.processor.PaymentProcessor;
import com.cefalo.school.processor.PaymentProcessorDelegate;

import java.util.Map;

public class PaymentFactory {

    public static PaymentProcessorDelegate getPaymentProcessor(Map<String, String > formData){

        if(formData.get(PaymentFormHandler.PAYMENT_TYPE_KEY).equals("card")){
            return CardPaymentFactory.getPaymentProcessor(formData);
        }
        return MobilePaymentFactory.getMobilePaymentProcessor(formData);

    }
}
