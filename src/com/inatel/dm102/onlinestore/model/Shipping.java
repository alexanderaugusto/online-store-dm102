package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

public class Shipping {
    private String id  = UUID.randomUUID().toString();
    private Address address;
    private double price;
    private double deliveryTime;

    public Shipping(Address address, double price, double deliveryTime) {
        this.address = address;
        this.price = price;
        this.deliveryTime = deliveryTime;
    }

    public Shipping() {
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public double getDeliveryTime() {
        return deliveryTime;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeliveryTime(double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "Shipping [id=" + id + ", address=" + address + ", price="
                + price + ", deliveryTime=" + deliveryTime + "]";
    }
}
