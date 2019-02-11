package com.sachdeva.ooad.domain.dao;

import com.sachdeva.ooad.domain.Employee;

// For data specific operation
public class EmployeeDAO {

    // Used for data storage, deletion etc.

    public void saveEmployee(Employee emp) {
        /*
         * DatabaseConnectionManager connectionManager =
         * DatabaseConnectionManager.getManagerInstance(); try {
         * connectionManager.connect();
         * connectionManager.getConnectionObject().prepareStatement
         * ("insert into Employee_tbl"); connectionManager.disconnect(); } catch
         * (SQLException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); }
         */

        System.out.println("Saved employee to the database, Employee: " + emp);
    }

    public void deleteEmployee(Employee emp) {
        System.out.println("Deleted employee from database, Employee: " + emp);
    }
}
