package com.cefalo.school.processor;

import com.cefalo.school.PaymentFormHandler;
import com.thirdparty.api.EBLCardHandler;

import java.util.Map;

public class EBLCardPayementProcessor implements PaymentProcessorDelegate{

    @Override
    public void processPayment(Map<String, String> formdata) {
        EBLCardHandler eblCardHandler = new EBLCardHandler();
        eblCardHandler.processPayment(formdata.get(PaymentFormHandler.CARD_NUMBER_KEY),
                formdata.get(PaymentFormHandler.ACCOUNT_NAME_KEY),
                formdata.get(PaymentFormHandler.EXPIRY_DATE_KEY),
                Double.parseDouble(formdata.get(PaymentFormHandler.AMOUNT_KEY)));
    }
}
