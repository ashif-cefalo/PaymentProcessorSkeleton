package com.cefalo.school.processor;


import com.cefalo.school.factory.PaymentProcessorFactory;
import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;

public class PaymentProcessor {

    private PaymentProcessorDelegate paymentProcessor;
    private Instrument instrument;
    public PaymentProcessor(Instrument instrument){
        this.instrument = instrument;
        PaymentProcessorFactory processorFactory= new PaymentProcessorFactory();
        paymentProcessor = processorFactory.getPaymentProcessor(this.instrument .getInstrumentType());

    }
    public void process(double amount) throws Exception{

        try{
            paymentProcessor.process(instrument, amount);
        }
        catch (Exception e){
            throw new Exception("invalid instrument type");
        }
    }

}
