package org.coordinate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Annotation config
@Component
//
public class Alien {

    //annotation config
    @Value("21")
    //
    private int age;
    //    private int salary;
    //config annotation
//    @Autowired
//    @Qualifier("com2")//bean name is class name but first letter is not capitalised
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object created");
    }

//    public Alien(int age, Computer computer){
//        System.out.println("para const called");
//        this.age=age;
//        this.laptop=laptop;
//    }

    public void code() {
        System.out.println("Coding");
        this.computer.compile();
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        System.out.println("Setter comp called");
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter age called");
        this.age = age;
    }
}
