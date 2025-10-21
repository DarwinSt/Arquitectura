package org.example.factorymethod;

public class PushNotificationService extends NotificationService {
    @Override
    protected Notifier createNotifier() {
        return new PushNotifier();
    }
}
