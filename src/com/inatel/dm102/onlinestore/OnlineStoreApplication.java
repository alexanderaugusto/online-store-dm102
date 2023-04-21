package com.inatel.dm102.onlinestore;

import com.inatel.dm102.onlinestore.service.OnlineStoreService;

public class OnlineStoreApplication {
    public static void main(String[] args) {
        new OnlineStoreService().simulateOrder();
    }
}
