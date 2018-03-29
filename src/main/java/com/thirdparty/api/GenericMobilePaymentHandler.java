package com.thirdparty.api;

public class GenericMobilePaymentHandler {
    public static void handlePayment(String provider, String mobileNumber, double amount) {
        System.out.printf("\nHandling mobile payment for provider: %s, number: %s, amount: %f", provider, mobileNumber, amount);
    }
}
