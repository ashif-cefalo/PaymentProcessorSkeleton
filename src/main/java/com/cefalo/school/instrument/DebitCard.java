package com.cefalo.school.instrument;

import com.cefalo.school.processor.CardPaymentProcessor;
import com.cefalo.school.processor.ChequePaymentProcessor;
import com.cefalo.school.processor.PaymentProcessor;

public class DebitCard implements Instrument{
    private String financialOrganizationName;
    private String customerName;
    private InstrumentType instrumentType;
    private String obscuredCardNumber;

    public String getFinancialOrganizationName() {
        return financialOrganizationName;
    }

    public void setFinancialOrganizationName(String financialOrganizationName) {
        this.financialOrganizationName = financialOrganizationName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getObscuredCardNumber() {
        return obscuredCardNumber;
    }

    public void setObscuredCardNumber(String obscuredCardNumber) {
        this.obscuredCardNumber = obscuredCardNumber;
    }

    @Override
    public PaymentProcessor getPaymentProcessor() {

        CardPaymentProcessor processor = new CardPaymentProcessor();
        return processor;
    }
}
