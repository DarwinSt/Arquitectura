package org.example.factorymethod;

public class NotificationClient {
    private final NotificationService service;

    public NotificationClient(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(Notification notification) {
        service.sendNotification(notification);
    }
}