package com.sachdeva.ooad.reporting;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {

        switch (formatType) {
        case XML:
            formattedOutput = this.convertObjectToXML(object);
            break;

        case CSV:
            formattedOutput = this.convertObjectToCSV(object);
            break;
        default:
            formattedOutput = "Invalid Type";
            break;
        }
    }

    protected String getFormattedValue() {
        return formattedOutput;
    }

    private String convertObjectToXML(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: ,,," + object.toString() + ",,,";
    }

}
