package org.example.factorymethod2.solution;

public class PdfDocument implements Document {
    private final String content;

    public PdfDocument(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return "[PDF]\n" + content;
    }
}

