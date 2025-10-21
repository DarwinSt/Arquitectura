package org.example.factorymethod;

public class EmailNotifier implements Notifier {
    @Override
    public void send(Notification n) {
        System.out.printf("[EMAIL] to=%s | subject=%s | body=%s%n", n.to, n.subject, n.body);
    }
}