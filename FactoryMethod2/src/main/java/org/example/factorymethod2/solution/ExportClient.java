package org.example.factorymethod2.solution;

public class ExportClient {
    private final DocumentExporter exporter;

    public ExportClient(DocumentExporter exporter) {
        this.exporter = exporter;
    }

    public void export(String content) {
        exporter.export(content);
    }
}

