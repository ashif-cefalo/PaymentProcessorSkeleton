package com.thirdparty.api;

public class EBLCardHandler {
    public static void processPayment(String cardNumber, String account, String expiry, double amount) {
        System.out.printf("\nHandling Eastern payment for account: %s, amount: %f", account, amount);
    }
}
