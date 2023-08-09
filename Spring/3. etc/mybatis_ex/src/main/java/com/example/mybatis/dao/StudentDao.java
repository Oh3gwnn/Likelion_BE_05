package com.example.mybatis.dao;

import com.example.mybatis.mapper.StudentMapper;
import com.example.mybatis.mapper.StudentXmlMapper;
import com.example.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    private final SqlSessionFactory sessionFactory;
    public StudentDao(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Student> readStudentsAll() {
        try (SqlSession session = sessionFactory.openSession()) {
            // Student Mapper - Annotation
//            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//            return studentMapper.selectStudentAll();

            // Student Mapper - XML
            StudentXmlMapper studentXmlMapper = session.getMapper(StudentXmlMapper.class);
            return studentXmlMapper.selectStudentAll();
        }
    }

    public void createStudent(Student student) {
        try (SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
        }
    }

    public Student readStudent(Long id) {
        try (SqlSession session = sessionFactory.openSession()) {
            // Student Mapper - Annotation
//            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//            return studentMapper.selectStudent(id);

            // Student Mapper - XML
            StudentXmlMapper studentXmlMapper = session.getMapper(StudentXmlMapper.class);
            return studentXmlMapper.selectStudentOne(id);
        }
    }

    public void updateStudent(Student student) {
        try (SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            studentMapper.updateStudent(student);
        }
    }

    public void deleteStudent(Long id) {
        try (SqlSession session = sessionFactory.openSession()) {
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            studentMapper.deleteStudent(id);
        }
    }
}
