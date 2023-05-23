package com.example.springbootdockerexercise.dao;

import com.example.springbootdockerexercise.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import static java.lang.System.getenv;

public class UserDao {
    public void add() throws ClassNotFoundException, SQLException {
        Map<String, String> env = getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPass = env.get("DB_PASS");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                dbHost, dbUser, dbPass
        );
        PreparedStatement pstmt = conn.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        pstmt.setString(1, "id");
        pstmt.setString(2, "name");
        pstmt.setString(3, "password");

        pstmt.executeUpdate();
        pstmt.close();
        conn.close();
    }

    public User get() {
        return new User();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
