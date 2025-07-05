package com.chicoo.be0920.module2.exception.trywithresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourceDBExample {

    /*
    spring.datasource.url=jdbc:mysql://localhost:3306/classicmodels
    spring.datasource.username=be092024
    spring.datasource.password=be092024
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     */
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USER = "be092024";
    private static final String PASSWORD = "be092024";

    public static void main(String[] args) {
        // Using try-with-resources for automatic resource management
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            // Process the ResultSet
            while (rs.next()) {
                int employeeNumber = rs.getInt("employeeNumber");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                System.out.println("Employee ID: " + employeeNumber + ", Name: " + firstName + " " + lastName);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        }
    }
}

