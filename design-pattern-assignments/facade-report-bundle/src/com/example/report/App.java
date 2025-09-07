package com.example.report;
import java.nio.file.Path;
 import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
        ReportBundleFacade facade = new ReportBundleFacade(new AuditLog(), new JsonWriter(), new Zipper());
        // JsonWriter jw = new JsonWriter(); 
        // Zipper z = new Zipper(); 
        // AuditLog log = new AuditLog();
        Path json = facade.export(data, Path.of("out"), "report");
        System.out.println("DONE " + json);
        // TODO: Replace the above with a single call to ReportBundleFacade.export(...)
    }
}
