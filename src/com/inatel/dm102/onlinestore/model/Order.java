package com.inatel.dm102.onlinestore.model;

import java.util.List;
import java.util.UUID;

public class Order {
    private String id  = UUID.randomUUID().toString();
    private Customer customer;
    private List<ShoppingCartProduct> products;
    private OrderStatus status;
    private double total;
    private Shipping shipping;

    public Order(Customer customer, List<ShoppingCartProduct> products, OrderStatus status, double total, Shipping shipping) {
        this.customer = customer;
        this.products = products;
        this.status = status;
        this.total = total;
        this.shipping = shipping;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<ShoppingCartProduct> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<ShoppingCartProduct> products) {
        this.products = products;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", customer=" + customer + ", products="
                + products + ", status=" + status + ", total=" + total + "]";
    }
}
