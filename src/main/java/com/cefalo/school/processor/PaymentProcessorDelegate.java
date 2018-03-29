package com.cefalo.school.processor;

import com.cefalo.school.instrument.Instrument;

public interface PaymentProcessorDelegate {
    public void process(Instrument instrument, double amount) throws Exception;
}
