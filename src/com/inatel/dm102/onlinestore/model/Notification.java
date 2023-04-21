package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notification {
    private String id = UUID.randomUUID().toString();
    private String title;
    private String message;

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending notification..." );
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
}
