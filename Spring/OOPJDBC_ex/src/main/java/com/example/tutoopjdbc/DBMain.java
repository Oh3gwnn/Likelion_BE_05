package com.example.tutoopjdbc;

import com.example.tutoopjdbc.model.BaseDAO;
import com.example.tutoopjdbc.model.Person;
import com.example.tutoopjdbc.model.PersonDAO;

import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println( personDAO.insertPerson("leo") );
        System.out.println( personDAO.insertPerson("yui") );
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
    }
}