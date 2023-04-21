package com.inatel.dm102.onlinestore.service;

import java.util.ArrayList;
import java.util.List;

import com.inatel.dm102.onlinestore.model.Address;
import com.inatel.dm102.onlinestore.model.Customer;
import com.inatel.dm102.onlinestore.model.Payment;
import com.inatel.dm102.onlinestore.model.Product;
import com.inatel.dm102.onlinestore.model.ProductCategory;
import com.inatel.dm102.onlinestore.model.Promotion;
import com.inatel.dm102.onlinestore.model.Shipping;

public class DataInitializer {
    public List<Product> instantiateProducts() {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Headphone", "Headphone", 300.00, 50, ProductCategory.ELETRONICS, instantiateBlackFridayPromotion());
        Product product2 = new Product("T-shirt", "T-shirt", 50.00, 200, ProductCategory.CLOTHES, null);
        Product product3 = new Product("Tennis", "Tennis", 200.00, 100, ProductCategory.SHOES, instantiateChristmasPromotion());
        Product product4 = new Product("PS5", "PS5", 4200.00, 30, ProductCategory.GAMES, null);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        return products;
    }

    public Promotion instantiateBlackFridayPromotion() {
        return new Promotion("Black Friday", "Black Friday", 0.2, "2023-11-27", "2023-11-30");
    }

    public Promotion instantiateChristmasPromotion() {
        return new Promotion("Christmas", "Christmas", 0.1, "2023-12-01", "2023-12-25");
    }

    public Customer instantiateCustomerAlex() {
        Customer customer = new Customer("Alex", "111.111.111-11", "alex@email.com", "123456789");
        Address customerAddress = instantiateAlexAddress();
        customer.addAddress(customerAddress);
        customer.setPayment(instantiateAlexPayment());
        customer.setDefaultAddress(customerAddress);
        return customer;
    }

    public Address instantiateAlexAddress() {
        return new Address("Rua 1", "123", "Apartamento", "Centro", "Santa Rita do Sapucaí", "MG", "Brasil", "12345-678");
    }

    public Payment instantiateAlexPayment() {
        return new Payment("credit-card", "5162922459547681", "ALEX FERNANDES", "01/2030", "123", "MASTERCARD");
    }

    public Shipping instantiateShipping(Address address) {
        return new Shipping(address, 20.00,  10);
    }
}
