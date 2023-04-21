package com.inatel.dm102.onlinestore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private String id  = UUID.randomUUID().toString();
    private String name;
    private String cpf;
    private String email;
    private String password;
    private ShoppingCart shoppingCart;
    private Payment payment;
    private Address defaultAddress;
    private List<Address> adresses;
    private List<Order> orders;

    public Customer(String name, String cpf, String email, String password) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.shoppingCart = new ShoppingCart();
        this.payment = new Payment();
        this.adresses = new ArrayList<Address>();
        this.orders = new ArrayList<Order>();
    }

    public Customer() {
    }

    public void addAddress(Address address) {
        this.adresses.add(address);
    }

    public void removeAddress(String addressId) {
        for (Address address : this.adresses) {
            if (address.getId().equals(addressId)) {
                this.adresses.remove(address);
                break;
            }
        }
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public List<Address> getAdresses() {
        return adresses;
    }

    public Address getDefaultAddress() {
        return defaultAddress;
    }

    public Payment getPayment() {
        return payment;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setAdresses(List<Address> adresses) {
        this.adresses = adresses;
    }

    public void setDefaultAddress(Address defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", cpf=" + cpf
                + ", email=" + email + ", password=" + password
                + ", shoppingCart=" + shoppingCart + ", adresses=" + adresses
                + ", defaultAddress=" + defaultAddress + ", payment="
                + payment + ", orders=" + orders + "]";
    }
}
