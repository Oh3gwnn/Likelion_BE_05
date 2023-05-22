package com.example.springbootdockerexercise;

import java.sql.*;
import java.util.Map;

import static java.lang.System.getenv; // DB 접속 정보 환경변수 처리

public class ConnectChecker {
    static Map<String, String> env = getenv();
    static class Env {
        static String dbHost = env.get("DB_HOST");
        static String dbUser = env.get("DB_USER");
        static String dbPass = env.get("DB_PASS");
    }
    public void check() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Env.dbHost, Env.dbUser, Env.dbPass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SHOW DATABASES");
        rs = st.getResultSet();
        while (rs.next()) {
            String str = rs.getString(1);
            System.out.println(str);
        }
    }

    public void add(String id, String name, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Env.dbHost, Env.dbUser, Env.dbPass);

        PreparedStatement pstmt = con.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        pstmt.setString(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, password);

        pstmt.executeUpdate();
    }

    public void select() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Env.dbHost, Env.dbUser, Env.dbPass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from users");
        rs = st.getResultSet();
        while (rs.next()) {
            String str = rs.getString(1);
            String str2 = rs.getString(2);
            String str3 = rs.getString(3);
            System.out.printf("%s %s %s\n", str, str2, str3);
        }
    }

    public void createTable(String tablename) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Env.dbHost, Env.dbUser, Env.dbPass);

        PreparedStatement pstmt = con.prepareStatement("CREATE TABLE " + tablename + " (`id` VARCHAR(45) NOT NULL, " +
                "`name` VARCHAR(45) NOT NULL, `password` VARCHAR(45) NOT NULL, PRIMARY KEY (`id`));");

        pstmt.executeUpdate();
    }

    public void updatePassword(String id, String changepass) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(Env.dbHost, Env.dbUser, Env.dbPass);

        PreparedStatement pstmt = con.prepareStatement("UPDATE `users` SET `password` = " + changepass + " WHERE (`id` = "+ id +");");
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    ConnectChecker cc = new ConnectChecker();
    cc.select();
    }
}