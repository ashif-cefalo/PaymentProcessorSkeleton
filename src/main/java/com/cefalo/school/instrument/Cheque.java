package com.cefalo.school.instrument;

public class Cheque extends PaymentMedium{

    private String chequeNumber;

    public Cheque(String financialOrganizationName, String customerName, InstrumentType instrumentType) {
        super(financialOrganizationName, customerName, instrumentType);
    }

    @Override
    public InstrumentType getInstrumentType() {
        return super.getInstrumentType();
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
