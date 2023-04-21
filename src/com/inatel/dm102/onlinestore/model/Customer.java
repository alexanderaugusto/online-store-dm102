package com.inatel.dm102.onlinestore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private String id = UUID.randomUUID().toString();
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
        this.adresses = new ArrayList<>();
        this.orders = new ArrayList<>();
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
}
