package com.coordinate.SpringSecurityDemo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students= new ArrayList<>(List.of(
            new Student(1, "cat1", "Java"),
            new Student(2, "cat2", "python"),
            new Student(3, "cat3", "python")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

    @GetMapping("csrftoken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
