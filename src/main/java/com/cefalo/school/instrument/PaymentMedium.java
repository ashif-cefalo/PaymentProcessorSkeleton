package com.cefalo.school.instrument;

public class PaymentMedium implements Instrument{

    private String financialOrganizationName;
    private String customerName;
    private InstrumentType instrumentType;

    public PaymentMedium(String financialOrganizationName, String customerName, InstrumentType instrumentType) {
        this.financialOrganizationName = financialOrganizationName;
        this.customerName = customerName;
        this.instrumentType = instrumentType;
    }


    @Override
    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
