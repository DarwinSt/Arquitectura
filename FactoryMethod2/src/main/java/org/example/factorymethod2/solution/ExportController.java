package org.example.factorymethod2.solution;



@RestController
public class ExportController {

    @GetMapping("/export/pdf")
    public String exportPdf(@RequestParam(value = "content", defaultValue = "Reporte de ejemplo") String content) {
        PdfExporter pdfExporter = new PdfExporter();
        ExportClient client = new ExportClient(pdfExporter);

        client.export(content);
        return "PDF exportado (revisa la consola para la representación).";
    }

    @GetMapping("/export/csv")
    public String exportCsv(@RequestParam(value = "content", defaultValue = "user,book,daysLate\nu1,book9,3") String content) {
        CsvExporter csvExporter = new CsvExporter();
        ExportClient client = new ExportClient(csvExporter);

        client.export(content);
        return "CSV exportado (revisa la consola para la representación).";
    }
}
