package com.coordinate.spring_data_jpa.repository;

import com.coordinate.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//import org.springframework.stereotype.Repository;


@org.springframework.stereotype.Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);

    @Query("select s from Student s where s.marks > ?1")
    List<Student> findByMarks(int marks);
}
