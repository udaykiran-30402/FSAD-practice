package com.fsads52.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/testdb";
; // your database name
        String user = "root";       // your MySQL username
        String password = "uday1234,.";   // your MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL command to create table
            String sql = "CREATE TABLE students ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY, "
                       + "name VARCHAR(50), "
                       + "age INT, "
                       + "city VARCHAR(50)"
                       + ")";

            // Execute SQL command
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");
            con.close(); // Close connection

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
