public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator(Reporting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public String generateReport() {
        final String CSV_SEP = ";";
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(transactionObject.getName());
        reportBuilder.append(CSV_SEP);
        reportBuilder.append(transactionObject.getDate());
        reportBuilder.append(CSV_SEP);
        reportBuilder.append(transactionObject.getName());

        return reportBuilder.toString();
    }
}
