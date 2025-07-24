package com.coordinate.SpringJDBCEx.service;

import com.coordinate.SpringJDBCEx.model.Student;
import com.coordinate.SpringJDBCEx.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student){
        System.out.println("Service adding the student to database");
        repository.save(student);
    }

    public List<Student> getStudents(){
        System.out.println("Service getting the student list from database");
        return repository.findAll();
    }

    public List<Student> getStudent(int rollNo){
        System.out.println("Service finding student by roll number");
        return  repository.findStudent(rollNo);
    }
}
