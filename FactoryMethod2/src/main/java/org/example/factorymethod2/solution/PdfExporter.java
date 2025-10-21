package org.example.factorymethod2.solution;

public class PdfExporter extends DocumentExporter {
    @Override
    protected Document createDocument(String content) {
        String normalized = normalizeContent(content);
        return new PdfDocument(normalized);
    }
}
