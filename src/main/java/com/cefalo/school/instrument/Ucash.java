package com.cefalo.school.instrument;

public class Ucash extends PaymentMedium{

    private String phoneNumber;

    public Ucash(String financialOrganizationName, String customerName, InstrumentType instrumentType) {
        super(financialOrganizationName, customerName, instrumentType);
    }

    @Override
    public InstrumentType getInstrumentType() {
        return super.getInstrumentType();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
