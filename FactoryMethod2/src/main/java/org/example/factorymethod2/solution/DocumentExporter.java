package org.example.factorymethod2.solution;

public abstract class DocumentExporter {
    protected abstract Document createDocument(String content);

    public void export(String content) {
        Document doc = createDocument(content);
        System.out.println(doc.render());
    }

    protected String normalizeContent(String content) {
        return content == null ? "" : content.trim();
    }
}
