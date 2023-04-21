package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private String id  = UUID.randomUUID().toString();
    private String title;
    private String description;
    private int rating;
    private Product product;
    private Customer customer;

    public Review(String title, String description, int rating, Product product, Customer customer) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.product = product;
        this.customer = customer;
    }

    public void increaseRating() {
        this.rating++;
    }

    public void decreaseRating() {
        this.rating--;
    }
}
