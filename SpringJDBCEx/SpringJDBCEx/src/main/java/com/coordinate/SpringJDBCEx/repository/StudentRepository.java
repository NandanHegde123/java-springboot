package com.coordinate.SpringJDBCEx.repository;

import com.coordinate.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student){
        System.out.println("Student added to repository");
        String sql="insert into student (rollno, name, marks) values (?, ?, ?)";
        int rows=jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("Number of rows affected:" + rows);
    }


    public List<Student> findAll(){
        System.out.println("Getting student list from repository");

        String sql="select * from student";

        RowMapper<Student> mapper= ( rs,  rowNum) ->{

            Student student = new Student();
            student.setRollNo(rs.getInt("rollno"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));

            return student;
        };


            //Anonymous inner class version
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
//                Student student=new Student();
//                student.setRollNo(rs.getInt("rollno"));
//                student.setName(rs.getString("name"));
//                student.setMarks(rs.getInt("marks"));
//
//                return student;
//            }
          return jdbc.query(sql, mapper);
//        List<Student> studentList= jdbc.query(sql, mapper);
//        for(Student student: studentList){
//            System.out.println(student);

//        List<Student> studentList=new ArrayList<>();
//        return  studentList;
    }

    public List<Student> findStudent(int rollNo){
        System.out.println("Getting a student by roll number from repository");

        String sql="select * from student where rollno=?";

        RowMapper<Student> mapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student=new Student();
                student.setRollNo(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));

                return student;
            }
        };

        return jdbc.query(sql, mapper, rollNo);
    }


}
