package com.cefalo.school.instrument;

import com.cefalo.school.processor.PaymentProcessor;
import com.cefalo.school.processor.RocketPaymentProcessor;

public class Rocket implements Instrument {
    @Override
    public void setFinancialOrganizationName(String financialOrganizationName) {

    }

    @Override
    public void setCustomerName(String customerName) {

    }

    @Override
    public void setInstrumentType(InstrumentType instrumentType) {

    }

    @Override
    public InstrumentType getInstrumentType() {
        return InstrumentType.MobilePayment;
    }

    @Override
    public PaymentProcessor getPaymentProcessor() {
        return new RocketPaymentProcessor();
    }
}
