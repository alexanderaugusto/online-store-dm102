package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

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

    public Review() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescripion() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescripion(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", title=" + title + ", description="
                + description + ", rating=" + rating + ", product=" + product
                + ", customer=" + customer + "]";
    }
}
