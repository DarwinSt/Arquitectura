package org.example.factorymethod;

public class SmsNotificationService extends NotificationService {
    @Override
    protected Notifier createNotifier() {
        return new SmsNotifier();
    }
}