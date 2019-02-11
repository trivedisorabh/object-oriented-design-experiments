package com.sachdeva.ooad.db;

import java.sql.*;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager myInstance;
    private static final String dbUrl = "jdbc:mysql://localhost:3306/demo";
    private static final String user = "student";
    private static final String pass = "12345678";
    private Connection myConn;

    private DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getManagerInstance() {
        if (null == myInstance) {
            synchronized (DatabaseConnectionManager.class) {
                if (null == myInstance) {
                    myInstance = new DatabaseConnectionManager();
                }
            }
        }
        return myInstance;
    }

    public void connect() throws SQLException {
        myConn = DriverManager.getConnection(dbUrl, user, pass);
        System.out.println("Established Database Connection...");
    }

    public Connection getConnectionObject() {
        return myConn;
    }

    public void disconnect() throws SQLException {
        if (null != myConn) {
            myConn.close();
        }
        
        System.out.println("Destroying Database Connection...");
    }

}
