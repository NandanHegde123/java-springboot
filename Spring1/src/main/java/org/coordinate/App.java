package org.coordinate;

import org.coordinate.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //xml configuration and use
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1=(Alien) context.getBean("alien1");
//        obj1.age=21;
//        System.out.println(obj1.age);
//        obj1.code();
//
//        Alien obj2=(Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();

//        Alien obj1=(Alien) context.getBean("alien1");
//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();
//
//        Desktop obj2= context.getBean("computer", Desktop.class);

        //java configuration and use
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop = context.getBean("computer2", Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1 = context.getBean("desktop1", Desktop.class);
//        desktop1.compile();
//
//        Alien obj1 = context.getBean("alien1", Alien.class);
//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();

        //annotation configuration and use
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();

        Desktop desktop1 = context.getBean(Desktop.class);
        desktop1.compile();

        Alien obj1 = context.getBean(Alien.class);
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

    }

}
