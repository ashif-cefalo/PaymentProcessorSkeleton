package com.cefalo.school.processor;

import com.cefalo.school.instrument.Instrument;

public class BkashPaymentProcessor implements PaymentProcessorDelegate {
    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("bkash processor.process");
    }
}
