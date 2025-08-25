public class Demo10 {
    public static void main(String[] args) {
        Logger conLogger = new ConsoleLogger();
        ReportService reportService = new ReportService(conLogger);
        reportService.generate();
    }
}
