package com.cefalo.school;

import com.cefalo.school.processor.PaymentProcessor;

import java.util.HashMap;

public class TestApplication {
    public static void main(String[] args) {

        PaymentFormHandler handler = new DummyPaymentFormHandler();

        HashMap<String, String> testForm = cardTypeForm();
//        HashMap<String, String> testForm = mobilePaymentTypeForm();
//        HashMap<String, String> testForm = ucashPaymentTypeForm();
//        HashMap<String, String> testForm = eblCardTypeForm();

        handler.handlePaymentFormSubmission(testForm);
    }

    private static HashMap<String, String> eblCardTypeForm() {
        HashMap<String, String> testForm = new HashMap<String, String>();
        testForm.put(PaymentFormHandler.PAYMENT_TYPE_KEY, "card");
        testForm.put(PaymentFormHandler.ACCOUNT_NAME_KEY, "jobaer");
        testForm.put(PaymentFormHandler.ORGANIZATION_KEY, "EBL");
        testForm.put(PaymentFormHandler.CARD_NUMBER_KEY, "12123121");
        testForm.put(PaymentFormHandler.EXPIRY_DATE_KEY, "2019");
        testForm.put(PaymentFormHandler.AMOUNT_KEY, "4000");
        return testForm;
    }

    private static HashMap<String, String> cardTypeForm() {
        HashMap<String, String> testForm = new HashMap<String, String>();
        testForm.put(PaymentFormHandler.PAYMENT_TYPE_KEY, "card");
        testForm.put(PaymentFormHandler.ACCOUNT_NAME_KEY, "jobaer");
        testForm.put(PaymentFormHandler.ORGANIZATION_KEY, "BRAC");
        testForm.put(PaymentFormHandler.CARD_NUMBER_KEY, "63452237842");
        testForm.put(PaymentFormHandler.EXPIRY_DATE_KEY, "2019");
        testForm.put(PaymentFormHandler.AMOUNT_KEY, "4000");
        return testForm;
    }

    private static HashMap<String, String> mobilePaymentTypeForm() {
        HashMap<String, String> testForm = new HashMap<String, String>();
        testForm.put(PaymentFormHandler.PAYMENT_TYPE_KEY, "mobile");
        testForm.put(PaymentFormHandler.MOBILE_PAYMENT_VENDOR_KEY, "Rocket");
        testForm.put(PaymentFormHandler.MOBILE_NUMBER_KEY, "0993993");
        testForm.put(PaymentFormHandler.AMOUNT_KEY, "5000");
        return testForm;
    }

    private static HashMap<String, String> ucashPaymentTypeForm() {
        HashMap<String, String> testForm = new HashMap<String, String>();
        testForm.put(PaymentFormHandler.PAYMENT_TYPE_KEY, "mobile");
        testForm.put(PaymentFormHandler.MOBILE_PAYMENT_VENDOR_KEY, "ucash");
        testForm.put(PaymentFormHandler.MOBILE_NUMBER_KEY, "0993993");
        testForm.put(PaymentFormHandler.AMOUNT_KEY, "2000");
        return testForm;
    }
}
