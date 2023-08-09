package com.example.springbootdockerexercise.dao;

import java.sql.*;
import java.util.Map;

import static java.lang.System.getenv;

public class NConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
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
