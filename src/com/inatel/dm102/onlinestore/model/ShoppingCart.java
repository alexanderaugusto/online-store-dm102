package com.inatel.dm102.onlinestore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShoppingCart {
    private String id  = UUID.randomUUID().toString();
    private List<ShoppingCartProduct> products = new ArrayList<>();
    private double price;
    private Shipping shipping;

    public ShoppingCart(List<ShoppingCartProduct> products, double price, Shipping shipping) {
        this.price = price;
        this.shipping = shipping;
    }

    public ShoppingCart() {
    }

    public void addProduct(Product product, int quantity) {
        ShoppingCartProduct shoppingCartProduct = new ShoppingCartProduct(product, quantity);
        this.products.add(shoppingCartProduct);

        price += product.getPrice() * quantity;
    }

    public void removeProduct(String productId) {
        for (ShoppingCartProduct shoppingCartProduct : products) {
            if (shoppingCartProduct.getId().equals(productId)) {
                price -= shoppingCartProduct.getProduct().getPrice() * shoppingCartProduct.getQuantity();
                products.remove(shoppingCartProduct);
                break;
            }
        }
    }

    public String getId() {
        return id;
    }

    public List<ShoppingCartProduct> getProducts() {
        return products;
    }

    public double getPrice() {
        return price;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setProducts(List<ShoppingCartProduct> products) {
        this.products = products;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "ShoppingCart [id=" + id + ", products=" + products + ", price=" + price + ", shipping=" + shipping + "]";
    }
}
