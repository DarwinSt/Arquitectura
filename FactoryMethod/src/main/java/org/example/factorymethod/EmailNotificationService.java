package org.example.factorymethod;


public class EmailNotificationService extends NotificationService {
    @Override
    protected Notifier createNotifier() {
        return new EmailNotifier();
    }
}