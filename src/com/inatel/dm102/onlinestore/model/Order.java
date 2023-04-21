package com.inatel.dm102.onlinestore.model;

import java.util.List;
import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private String id = UUID.randomUUID().toString();
    private Customer customer;
    private List<ShoppingCartProduct> products;
    private OrderStatus status;
    private double total;
    private Shipping shipping;

    public Order(Customer customer, List<ShoppingCartProduct> products, OrderStatus status, double total,
            Shipping shipping) {
        this.customer = customer;
        this.products = products;
        this.status = status;
        this.total = total;
        this.shipping = shipping;
    }

    public void processOrder(Payment payment) {
        payment.processPayment();
        deacreseStock();
        status = OrderStatus.APPROVED;
        sendNotificationToCustomer();
    }

    public void deliveryOrder() {
        status = OrderStatus.DELIVERED;
        sendNotificationToCustomer();
    }

    public void sendNotificationToCustomer() {
        Notification notification = new Notification("Order " + id, "Your order was " + status);
        notification.sendNotification();
    }

    public void cancelOrder() {
        status = OrderStatus.CANCELED;
        sendNotificationToCustomer();
    }

    private void deacreseStock() {
        for (ShoppingCartProduct product : products) {
            product.getProduct().deacreseStock(product.getQuantity());
        }
    }
}
