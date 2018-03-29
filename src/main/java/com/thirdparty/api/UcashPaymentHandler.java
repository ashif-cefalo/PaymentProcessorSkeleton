package com.thirdparty.api;

public class UcashPaymentHandler {
    public void processPayment(String mobileNumber, double amount) {
        System.out.printf("\nHandling Ucash payment for mobileNumber: %s, amount: %f", mobileNumber, amount );
    }
}
