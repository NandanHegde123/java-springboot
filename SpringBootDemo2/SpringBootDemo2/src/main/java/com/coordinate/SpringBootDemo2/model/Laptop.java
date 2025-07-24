package com.coordinate.SpringBootDemo2.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop object created");
    }

    public void compile(){
        System.out.println("Laptop Compile");
    }
}
