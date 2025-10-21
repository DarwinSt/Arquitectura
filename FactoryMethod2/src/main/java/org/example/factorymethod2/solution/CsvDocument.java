package org.example.factorymethod2.solution;

public class CsvDocument implements Document {
    private final String content;

    public CsvDocument(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        // Mantener formato CSV tal cual
        return "[CSV]\n" + content;
    }
}