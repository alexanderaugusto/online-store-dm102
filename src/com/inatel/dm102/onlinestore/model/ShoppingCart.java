package com.inatel.dm102.onlinestore.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShoppingCart {
    private String id  = UUID.randomUUID().toString();
    private List<ShoppingCartProduct> products = new ArrayList<>();
    private double price;
    private Shipping shipping;

    public ShoppingCart(List<ShoppingCartProduct> products, double price, Shipping shipping) {
        this.price = price;
        this.shipping = shipping;
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
}
