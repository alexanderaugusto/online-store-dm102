package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

public class ShoppingCartProduct {
    private String id = UUID.randomUUID().toString();
    private Product product;
    private int quantity;

    public ShoppingCartProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ShoppingCartProduct() {
    }

    public String getId() {
        return this.id;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
