package org.example;

import java.sql.*;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    final String URL = "jdbc:postgresql://localhost:5432/new_db";
    final String USER_NAME = "postgres";
    final String PASSWORD = "hr";
    Connection connection;

    public Connection connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        return connection;
    }

    public void test() throws SQLException {
        try {
            connection = connect();

        } finally {
            connection.close();
        }
    }
}
