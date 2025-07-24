package org.coordinate;

import org.springframework.stereotype.Component;

//annotation config
@Component
//
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("Laptop compile");
    }


}
