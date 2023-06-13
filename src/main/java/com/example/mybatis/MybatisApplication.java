package com.example.mybatis;

import com.example.mybatis.dao.StudentDao;
import com.example.mybatis.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MybatisApplication.class, args);
		StudentDao dao = applicationContext.getBean(StudentDao.class);

		// SELECT ALL
		System.out.println(dao.readStudentsAll());

		// INSERT
//		Student student = new Student();
//		student.setName("dave");
//		student.setAge(22);
//		student.setPhone("011-1213-1415");
//		student.setEmail("dave@daven.com");
//		dao.createStudent(student);
//		System.out.println(dao.readStudentsAll());

		// SELECT ONE
		System.out.println(dao.readStudent(1L));
		System.out.println(dao.readStudent(2L));
		System.out.println(dao.readStudent(3L));

		// UPDATE
		Student student2 = new Student();
		student2.setId(2L);
		student2.setName("gaven");
		student2.setAge(42);
		student2.setPhone("031-5223-6415");
		student2.setEmail("gaven@gmail.com");
		dao.updateStudent(student2);
		System.out.println(dao.readStudentsAll());

		// DELETE
		dao.deleteStudent(6L);
		System.out.println(dao.readStudentsAll());
	}

}
