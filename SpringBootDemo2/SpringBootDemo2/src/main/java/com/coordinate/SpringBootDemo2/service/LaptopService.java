package com.coordinate.SpringBootDemo2.service;

import com.coordinate.SpringBootDemo2.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private  LaptopRepository repository;

    public void addLaptop(Laptop laptop){
        System.out.println("method called");
        repository.save(laptop);
    }

    public boolean isGoodForProgramming(Laptop laptop){
        return  true;
    }
}
