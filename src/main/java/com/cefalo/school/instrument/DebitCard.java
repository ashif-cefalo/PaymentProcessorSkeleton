package com.cefalo.school.instrument;

public class DebitCard extends PaymentMedium{

    private String cardNumber;

    public DebitCard(String financialOrganizationName, String customerName, InstrumentType instrumentType) {
        super(financialOrganizationName, customerName, instrumentType);
    }

    @Override
    public InstrumentType getInstrumentType() {
        return super.getInstrumentType();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
