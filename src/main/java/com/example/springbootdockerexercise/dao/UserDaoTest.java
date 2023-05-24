package com.example.springbootdockerexercise.dao;

import com.example.springbootdockerexercise.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new NConnectionMaker();
        UserDao dao = new UserDao(cm);

        User user = new User();
        user.setId("6");
        user.setName("dlagud");
        user.setPassword("11423");
        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");

        User selectedUser = dao.get(user.getId());
        System.out.println(selectedUser.getName());
        System.out.println(selectedUser.getPassword());
        System.out.println(user.getId() + " 조회 성공");
    }
}
