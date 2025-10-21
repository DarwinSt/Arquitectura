package org.example.factorymethod2.solution;

public class CsvDocument implements Document {
    private final String content;

    public CsvDocument(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return "[CSV]\n" + content;
    }
}