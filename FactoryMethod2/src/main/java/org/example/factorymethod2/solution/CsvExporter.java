package org.example.factorymethod2.solution;

public class CsvExporter extends DocumentExporter {
    @Override
    protected Document createDocument(String content) {
        String normalized = normalizeContent(content);
        return new CsvDocument(normalized);
    }
}

