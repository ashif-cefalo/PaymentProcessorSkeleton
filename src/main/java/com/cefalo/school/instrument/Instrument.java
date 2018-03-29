package com.cefalo.school.instrument;

import com.cefalo.school.processor.PaymentProcessor;

public interface Instrument {
    public void setFinancialOrganizationName(String financialOrganizationName);
    public void setCustomerName(String customerName);
    public void setInstrumentType(InstrumentType instrumentType);
    public InstrumentType getInstrumentType();
    public PaymentProcessor getPaymentProcessor();
}
