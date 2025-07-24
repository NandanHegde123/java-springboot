package com.coordinate.spring_data_jpa;

import com.coordinate.spring_data_jpa.model.Student;
import com.coordinate.spring_data_jpa.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentService service=context.getBean(StudentService.class);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Cat");
		s1.setMarks(75);

		s2.setRollNo(102);
		s2.setName("cat2");
		s2.setMarks(76);

		s3.setRollNo(103);
		s3.setName("cat3");
		s3.setMarks(77);

		service.save(s1);
		service.save(s2);
		service.save(s3);

		List<Student> studentList=service.getStudents();
		System.out.println(studentList);

		Optional<Student> s=service.getStudent(101);
		System.out.println(s);

		List<Student> studentNameConditionList=service.findByName("cat2");
		System.out.println(studentNameConditionList);

		List<Student> studentMarksConditionList=service.findByMarks(70);
		System.out.println(studentMarksConditionList);

		service.delete(s2);

	}

}
