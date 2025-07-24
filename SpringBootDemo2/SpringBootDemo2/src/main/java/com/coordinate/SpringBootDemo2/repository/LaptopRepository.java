package com.coordinate.SpringBootDemo2.repository;

import com.coordinate.SpringBootDemo2.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Saved in database");
    }
}
