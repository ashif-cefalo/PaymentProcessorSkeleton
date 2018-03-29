package com.cefalo.school.factory;

import com.cefalo.school.instrument.InstrumentType;
import com.cefalo.school.processor.BkashPaymentProcessor;
import com.cefalo.school.processor.CardPaymentProcessor;
import com.cefalo.school.processor.ChequePaymentProcessor;
import com.cefalo.school.processor.PaymentProcessorDelegate;

public class PaymentProcessorFactory {
    public PaymentProcessorDelegate getPaymentProcessor(InstrumentType instrumentType){
        if(instrumentType == null){
            return null;
        }
        if(instrumentType == InstrumentType.Card){
            return new CardPaymentProcessor();

        } else if(instrumentType == InstrumentType.Cheque){
            return new ChequePaymentProcessor();

        } else if(instrumentType == InstrumentType.MobilePayment){
            return new BkashPaymentProcessor();
        }

        return null;
    }
}
