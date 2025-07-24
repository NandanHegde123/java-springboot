package com.coordinate.spring_data_jpa.service;

import com.coordinate.spring_data_jpa.model.Student;
import com.coordinate.spring_data_jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    public void addStudent(Student student){
//        System.out.println("Service adding the student to database");
//        studentRepository.save(student);
//    }

    public List<Student> getStudents(){
        System.out.println("Service getting the student list from database");
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(int rollNo){
        System.out.println("Service finding student by roll number");
        return studentRepository.findById(rollNo);
//        return  StudentRepository.findStudent(rollNo);
    }

    public void save(Student student){
        studentRepository.save(student);
    }

    public List<Student> findByName(String name){
        return studentRepository.findByName(name);
    }

    public List<Student> findByMarks(int marks){
        return studentRepository.findByMarks(marks);
    }

    public void delete(Student student){
         studentRepository.delete(student);
    }
}
