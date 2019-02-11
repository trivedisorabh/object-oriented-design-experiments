package com.sachdeva.ooad.reporting;

import com.sachdeva.ooad.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return this.getFormattedValue();
    }
}
