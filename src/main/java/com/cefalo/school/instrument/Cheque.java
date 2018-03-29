package com.cefalo.school.instrument;

import com.cefalo.school.processor.ChequePaymentProcessor;
import com.cefalo.school.processor.PaymentProcessor;

public class Cheque implements Instrument {

    private String financialOrganizationName;
    private String customerName;
    private InstrumentType instrumentType;
    private String chequeNumber;



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
        return InstrumentType.Cheque;
    }

    @Override
    public PaymentProcessor getPaymentProcessor() {

        ChequePaymentProcessor processor = new ChequePaymentProcessor();
        return processor;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getFinancialOrganizationName() {
        return financialOrganizationName;
    }

    public String getCustomerName() {
        return customerName;
    }
}
