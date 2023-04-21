package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double price;
    private int quantity;
    private ProductCategory category;

    public Product(String name, String description, double price, int quantity, ProductCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void deacreseStock(int quantity) {
        this.quantity -= quantity;
    }
}
