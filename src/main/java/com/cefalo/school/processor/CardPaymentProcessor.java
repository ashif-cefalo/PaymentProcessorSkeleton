package com.cefalo.school.processor;

import com.cefalo.school.instrument.Instrument;

public class CardPaymentProcessor implements PaymentProcessorDelegate {
    @Override
    public void process(Instrument instrument, double amount) throws Exception{
        System.out.println("card processor.process");
    }
}
