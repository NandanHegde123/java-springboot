package com.coordinate.SpringSecurityDemo;

public class Student {

    private int id;
    private String name;
    private String tech;

    public Student(){}

    public Student(int id, String name, String tech){
        this.id=id;
        this.name=name;
        this.tech=tech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
