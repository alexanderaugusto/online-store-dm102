package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShoppingCartProduct {
    private String id = UUID.randomUUID().toString();
    private Product product;
    private int quantity;

    public ShoppingCartProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }
}
