package org.example.factorymethod;

public abstract class NotificationService {
    // Método factory
    protected abstract Notifier createNotifier();

    // Lógica común que usa el Notifier creado
    public void sendNotification(Notification notification) {
        // ejemplo de normalización simple: lower-case recipient
        String normalizedTo = normalizeRecipient(notification.to);
        Notification nNormalized = new Notification(
                normalizedTo, notification.title, notification.subject, notification.body, notification.msg
        );

        Notifier notifier = createNotifier();
        notifier.send(nNormalized);
    }

    protected String normalizeRecipient(String to) {
        if (to == null) return "";
        return to.trim().toLowerCase();
    }
}
