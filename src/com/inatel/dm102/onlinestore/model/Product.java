package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

public class Product {
    private String id  = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double price;
    private int quantity;
    private ProductCategory category;
    private Promotion promotion;

    public Product(String name, String description, double price, int quantity, ProductCategory category, Promotion promotion) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.promotion = promotion;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescripion() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public ProductCategory getCategory() {
        return this.category;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripion(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description="
                + description + ", price=" + price + ", quantity=" + quantity
                + ", category=" + category + "]";
    }
}
