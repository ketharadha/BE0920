package com.chicoo.be0920.module2.exception.trywithresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FinallyBlockDBExample {
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USER = "be092024";
    private static final String PASSWORD = "be092024";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");

            // Process the ResultSet
            while (rs.next()) {
                int employeeNumber = rs.getInt("employeeNumber");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                System.out.println("Employee ID: " + employeeNumber + ", Name: " + firstName + " " + lastName);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        } finally {
            // Close ResultSet
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Close Statement
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Close Connection
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
