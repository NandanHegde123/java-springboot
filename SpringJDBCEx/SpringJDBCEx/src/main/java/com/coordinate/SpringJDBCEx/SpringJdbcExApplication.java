package com.coordinate.SpringJDBCEx;

import com.coordinate.SpringJDBCEx.model.Student;
import com.coordinate.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student=context.getBean(Student.class);
		student.setRollNo(161);
		student.setName("Cat4");
		student.setMarks(78);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> studentList=service.getStudents();
//		service.getStudents();
		for(Student student1: studentList){

			System.out.println(student1);
		}


		List<Student> studentToBeFound=service.getStudent(student.getRollNo());
		System.out.println(studentToBeFound);
	}

}
