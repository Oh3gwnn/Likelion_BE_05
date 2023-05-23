package com.example.springbootdockerexercise.db;

import java.sql.*;

// 데베 주소, 이름 비번땜에 push용 따로 만듦
// + 공부용으로 주석 너무 많이 달아서
public class ConnectChecker_toPush {

    // 테이블 목록 조회
    public void check() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // com.mysql.cj.jdbc.Driver()
        // MySQL 드라이버 로드를 위해 Class.forName() 사용

        Connection con = DriverManager.getConnection("path", "user", "password");
        // DriverManager.getConnection() 메서드를 사용하여 데이터베이스에 연결

        Statement st = con.createStatement();
        // Connection 객체를 사용하여 SQL 문을 실행하는 Statement 객체 생성
        // Statement 객체는 SQL 쿼리를 데이터베이스로 전송하는 데 사용

        ResultSet rs = st.executeQuery("SHOW DATABASES");
        // Statement 객체를 사용하여 "SHOW DATABASES"라는 SQL 쿼리를 실행
        // 결과를 ResultSet 객체에 저장

        rs = st.getResultSet();
        // SQL 문을 실행한 결과로 생성된 ResultSet 객체를 반환

        while (rs.next()) {
            String str = rs.getString(1);
            System.out.println(str);
        }
    }

    // 데이터 추가
    public void add(String id, String name, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("path", "user", "password");

        // PreparedStatement는 동일한 SQL 쿼리를 반복적으로 실행하거나
        // 사용자 입력과 같은 변수 데이터를 SQL 쿼리에 쉽게 삽입할 수 있다.
        PreparedStatement pstmt = con.prepareStatement("insert into users(id, name, password) values(?, ?, ?)");
        pstmt.setString(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, password);

        pstmt.executeUpdate();
        // SQL 문을 실행하고 영향을 받은 행의 수를 반환한다.
    }

    // select * from users
    public void select() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("path", "user", "password");

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

    // tablename 테이블 생성
    public void createTable(String tablename) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("path", "user", "password");

        PreparedStatement pstmt = con.prepareStatement("CREATE TABLE " + tablename + " (`id` VARCHAR(45) NOT NULL, " +
                "`name` VARCHAR(45) NOT NULL, `password` VARCHAR(45) NOT NULL, PRIMARY KEY (`id`));");

        pstmt.executeUpdate();
    }

    // update문 (해당 id의 password 변경)
    public void updatePassword(String id, String changepass) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("path", "user", "password");

        PreparedStatement pstmt = con.prepareStatement("UPDATE `users` SET `password` = " + changepass + " WHERE (`id` = "+ id +");");
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    ConnectChecker_toPush cc = new ConnectChecker_toPush();
    cc.select();
    }
}