package com.cefalo.school.processor;


import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;

public interface PaymentProcessor {

    public void process(Instrument instrument, double amount) throws Exception;

}
