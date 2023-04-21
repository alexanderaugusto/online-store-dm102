package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

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

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", type=" + type + ", cardNumber="
                + cardNumber + ", cardHolder=" + cardHolder
                + ", cardExpirationDate=" + cardExpirationDate
                + ", cardSecurityCode=" + cardSecurityCode + ", cardBrand="
                + cardBrand + ", cardType=" + "]";
    }
}
