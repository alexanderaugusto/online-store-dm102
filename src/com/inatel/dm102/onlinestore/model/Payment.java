package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Payment {
    private String id  = UUID.randomUUID().toString();
    private String type;
    private String cardNumber;
    private String cardHolder;
    private String cardExpirationDate;
    private String cardSecurityCode;
    private String cardBrand;

    public Payment(String type, String cardNumber, String cardHolder, String cardExpirationDate, String cardSecurityCode, String cardBrand) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardExpirationDate = cardExpirationDate;
        this.cardSecurityCode = cardSecurityCode;
        this.cardBrand = cardBrand;
    }

    public void processPayment() {
        System.out.println("Processing payment...");
        System.out.println("Type: " + type);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Expiration Date: " + cardExpirationDate);
        System.out.println("Card Security Code: " + cardSecurityCode);
        System.out.println("Card Brand: " + cardBrand);
    }
}
