package com.cefalo.school.processor;

import com.cefalo.school.instrument.Instrument;

public class BkashPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(Instrument instrument, double amount) throws Exception {
        System.out.println("paymentprocessor.bkash");
    }
}
