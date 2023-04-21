package com.inatel.dm102.onlinestore.service;

import java.util.List;

import com.inatel.dm102.onlinestore.model.Customer;
import com.inatel.dm102.onlinestore.model.Order;
import com.inatel.dm102.onlinestore.model.OrderStatus;
import com.inatel.dm102.onlinestore.model.Product;
import com.inatel.dm102.onlinestore.model.Review;
import com.inatel.dm102.onlinestore.model.Shipping;
import com.inatel.dm102.onlinestore.model.ShoppingCartProduct;

public class OnlineStoreService extends DataInitializer {
    private List<Product> onlineStoreProducts;
    private Customer customer;
    private Shipping customerShipping;

    public OnlineStoreService() {
        onlineStoreProducts = instantiateProducts();
        customer = instantiateCustomerAlex();
        customerShipping = instantiateShipping(customer.getDefaultAddress());
    }

    public void simulateOrder() {
        System.out.println("Simulating order...");
        System.out.println("\nCustomer: " + customer.getName());

        System.out.println("\nAvailable Products: ");
        for (Product product : onlineStoreProducts) {
            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getQuantity());
        }

        System.out.println("\nAdding " + onlineStoreProducts.get(0).getName() + " to shopping cart...");
        customer.getShoppingCart().addProduct(onlineStoreProducts.get(0), 1);
        System.out.println("Adding " + onlineStoreProducts.get(2).getName() + " to shopping cart...");
        customer.getShoppingCart().addProduct(onlineStoreProducts.get(2), 2);
        System.out.println("Adding " + onlineStoreProducts.get(3).getName() + " to shopping cart...");
        customer.getShoppingCart().addProduct(onlineStoreProducts.get(3), 1);

        System.out.println("\nShopping cart products: ");
        for (ShoppingCartProduct shoppingCartProduct : customer.getShoppingCart().getProducts()) {
            System.out.println(shoppingCartProduct.getProduct().getName() + " - " + shoppingCartProduct.getQuantity());
        }

        System.out.println("\nShopping cart price: " + customer.getShoppingCart().getPrice());

        System.out.println("\nRemoving " + customer.getShoppingCart().getProducts().get(1).getProduct().getName() + " from shopping cart...");
        customer.getShoppingCart().removeProduct(customer.getShoppingCart().getProducts().get(1).getId());

        System.out.println("\nShopping cart products: ");
        for (ShoppingCartProduct shoppingCartProduct : customer.getShoppingCart().getProducts()) {
            System.out.println(shoppingCartProduct.getProduct().getName() + " - " + shoppingCartProduct.getQuantity());
        }

        System.out.println("\nShopping cart price: " + customer.getShoppingCart().getPrice());

        System.out.println("\nSetting shipping address...");
        customer.getShoppingCart().setShipping(customerShipping);
        customer.getShoppingCart().getShipping().calculateShippingPrice();
        customer.getShoppingCart().getShipping().calculateDeliveryTime();
        customer.getShoppingCart().setPrice(customer.getShoppingCart().getPrice() + customer.getShoppingCart().getShipping().getPrice());
        System.out.println("Shipping address: " + customer.getShoppingCart().getShipping().getAddress().getStreet() + ", " + customer.getShoppingCart().getShipping().getAddress().getNumber());
        System.out.println("Shipping price: " + customer.getShoppingCart().getShipping().getPrice());
        System.out.println("Shipping time: " + customer.getShoppingCart().getShipping().getDeliveryTime());

        System.out.println("\nShopping cart price: " + customer.getShoppingCart().getPrice());

        System.out.println("\nSubmitting order...");

        Order order = new Order(customer, customer.getShoppingCart().getProducts(), OrderStatus.PENDING, customer.getShoppingCart().getPrice(), customer.getShoppingCart().getShipping());

        System.out.println("\nOrder created with id: " + order.getId());

        System.out.println("Order products: ");
        for (ShoppingCartProduct shoppingCartProduct : order.getProducts()) {
            System.out.println(shoppingCartProduct.getProduct().getName() + " - " + shoppingCartProduct.getQuantity());
        }

        System.out.println("");

        order.sendNotificationToCustomer();

        System.out.println("\nProcessing order...");
        order.processOrder(customer.getPayment());

        System.out.println("\nDelivering order..");
        order.deliveryOrder();

        Review review = new Review("\nReviewing PS5", "Very good product!", 0, onlineStoreProducts.get(3), customer);
        review.increaseRating();
        review.increaseRating();
        review.increaseRating();
        review.increaseRating();
        review.increaseRating();
        System.out.println("\nReviewing product " + onlineStoreProducts.get(3).getName() + " with " + review.getRating() + " stars...");

        System.out.println("\nFinished order simulation!");
    }
}
