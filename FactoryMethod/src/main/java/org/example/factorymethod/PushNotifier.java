package org.example.factorymethod;

public class PushNotifier implements Notifier {
    @Override
    public void send(Notification n) {
        System.out.printf("[PUSH] to=%s | title=%s | body=%s%n", n.to, n.title, n.body);
    }
}