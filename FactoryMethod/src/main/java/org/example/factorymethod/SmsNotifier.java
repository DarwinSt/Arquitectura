package org.example.factorymethod;

public class SmsNotifier implements Notifier {
    @Override
    public void send(Notification n) {
        System.out.printf("[SMS] to=%s | msg=%s%n", n.to, n.msg);
    }
}