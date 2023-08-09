package com.example.springbootdockerexercise.dao;

import java.sql.*;
import java.util.Map;

import static java.lang.System.getenv;

public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {

        Map<String, String> env = getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPass = env.get("DB_PASS");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                dbHost, dbUser, dbPass
        );

        return conn;
    }

}
