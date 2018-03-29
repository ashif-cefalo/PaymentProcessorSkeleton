package com.thirdparty.api;

public class GenericCardHandler {
    private String cardNumber;
    private String accountName;
    private String expiryDate;

    private GenericCardHandler(String cardNumber, String accountName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.accountName = accountName;
        this.expiryDate = expiryDate;
    }

    public static GenericCardHandler createHandler(String cardNumber, String accountName, String expiryDate) {
        return new GenericCardHandler(cardNumber, accountName, expiryDate);
    }

    public void processAmount(double amount) {
        System.out.printf("\nHandling generic payment for account %s, amount %f", accountName, amount);
    }
}
