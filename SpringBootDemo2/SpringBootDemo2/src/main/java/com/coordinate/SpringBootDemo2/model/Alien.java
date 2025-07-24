package com.coordinate.SpringBootDemo2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;

//    @Autowired
    private Computer computer;

    public Alien(){
        System.out.println("Alien object created");
    }

    public void code(){
        this.computer.compile();
        System.out.println("coding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        System.out.println("Age setter called");
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        System.out.println("Computer setter called");
        this.computer = computer;
    }
}
