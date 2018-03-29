package com.cefalo.school;

import com.thirdparty.api.EBLCardHandler;
import com.thirdparty.api.GenericCardHandler;
import com.thirdparty.api.GenericMobilePaymentHandler;
import com.thirdparty.api.UcashPaymentHandler;

public class TestThirdPartyApi {
    public static void main(String[] args) {
        testEasternCardPayment();
        testGenericCardPayment();
        testGenericMobilePayment();
        testUcashPayment();
    }

    private static void testUcashPayment() {
        UcashPaymentHandler paymentHandler = new UcashPaymentHandler();
        paymentHandler.processPayment("0494949", 4000);
    }

    private static void testGenericMobilePayment() {
        GenericMobilePaymentHandler.handlePayment("blink", "003930", 2000);
    }

    private static void testGenericCardPayment() {
        GenericCardHandler handler = GenericCardHandler.createHandler("232323", "Zaki", "2022");
        handler.processAmount(9000);
    }

    private static void testEasternCardPayment() {
        EBLCardHandler.processPayment("112312", "Jobaer", "2019", 2000);
    }
}
