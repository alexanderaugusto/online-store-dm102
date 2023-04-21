package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

public class Promotion {
    private String id  = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double discount;
    private String startDate;
    private String endDate;

    public Promotion(String name, String description, double discount, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promotion() {
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

    public double getDiscount() {
        return this.discount;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripion(String description) {
        this.description = description;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate= endDate;
    }

    @Override
    public String toString() {
        return "Promotion [id=" + id + ", name=" + name + ", description=" + description + ", discount=" + discount + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }
}
