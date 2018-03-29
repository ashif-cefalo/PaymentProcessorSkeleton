package com.cefalo.school.processor;

import com.cefalo.school.PaymentFormHandler;
import com.thirdparty.api.GenericCardHandler;

import java.util.Map;

public class GenericCardProcessor implements PaymentProcessorDelegate{
    @Override
    public void processPayment(Map<String, String> formdata) {
        GenericCardHandler genericCardHandler = GenericCardHandler.createHandler(
                formdata.get(PaymentFormHandler.CARD_NUMBER_KEY),
                formdata.get(PaymentFormHandler.ACCOUNT_NAME_KEY),
                formdata.get(PaymentFormHandler.EXPIRY_DATE_KEY)
        );
        genericCardHandler.processAmount(Double.parseDouble(formdata.get(PaymentFormHandler.AMOUNT_KEY)));
    }
}
