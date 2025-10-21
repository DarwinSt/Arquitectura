package org.example.factorymethod2.solution;

public class PdfDocument implements Document {
    private final String content;

    public PdfDocument(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        // En un caso real podrías generar bytes de PDF; aquí devolvemos texto para la demo.
        return "[PDF]\n" + content;
    }
}

