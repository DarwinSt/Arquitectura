package org.example.factorymethod;

public class Notification {
    public final String to;
    public final String title;
    public final String subject;
    public final String body;
    public final String msg;

    public Notification(String to, String title, String subject, String body, String msg) {
        this.to = to;
        this.title = title;
        this.subject = subject;
        this.body = body;
        this.msg = msg;
    }
}
