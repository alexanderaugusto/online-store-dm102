package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Shipping {
    private String id  = UUID.randomUUID().toString();
    private Address address;
    private double price;
    private double deliveryTime;

    private final double DEFAULT_PRICE = 20.0;
    private final double DEFAULT_DELIVERY_TIME = 10.0;

    public Shipping(Address address, double price, double deliveryTime) {
        this.address = address;
        this.price = price;
        this.deliveryTime = deliveryTime;
    }

    public void calculateShippingPrice() {
        this.price = DEFAULT_PRICE;
    }

    public void calculateDeliveryTime() {
        this.deliveryTime = DEFAULT_DELIVERY_TIME;
    }
}
