package org.coordinate;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//annotation config
@Component("com2")
@Primary
//
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Desktop compile");
    }
}
