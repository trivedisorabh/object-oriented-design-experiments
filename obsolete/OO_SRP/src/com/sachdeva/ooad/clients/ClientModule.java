package com.sachdeva.ooad.clients;

import com.sachdeva.ooad.domain.Employee;
import com.sachdeva.ooad.domain.dao.EmployeeDAO;
import com.sachdeva.ooad.reporting.EmployeeReportFormatter;
import com.sachdeva.ooad.reporting.FormatType;

// This is acting as a sandbox or a testing ground to test our application
public class ClientModule {

    private EmployeeDAO employeeDAO;

    public ClientModule() {
        employeeDAO = new EmployeeDAO();
    }

    public static void main(String args[]) {

        ClientModule clientModule = new ClientModule();

        // Prepare an employee
        Employee emp = new Employee(1, "Rohan", "IT", true);
        clientModule.hireNewEmployee(emp);
        clientModule.terminateEmployee(emp);
        clientModule.printEmployeeReport(emp, FormatType.CSV);
    }

    private void hireNewEmployee(Employee emp) {
        employeeDAO.saveEmployee(emp);
    }

    private void terminateEmployee(Employee emp) {
        employeeDAO.deleteEmployee(emp);
    }

    private void printEmployeeReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
