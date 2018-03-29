package com.cefalo.school.processor;


import com.cefalo.school.PaymentFactory;
import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;

import java.util.Map;

public class PaymentProcessor {

    private PaymentProcessorDelegate paymentProcessorDelegate;

    public void processPayment(Map<String, String > formdata){
        PaymentProcessorDelegate processorDelegate = PaymentFactory.getPaymentProcessor(formdata);
        processorDelegate.processPayment(formdata);
    }

}
