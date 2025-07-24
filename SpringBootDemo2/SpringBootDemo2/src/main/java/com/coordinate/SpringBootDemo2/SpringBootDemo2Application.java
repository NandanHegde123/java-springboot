package com.coordinate.SpringBootDemo2;

import com.coordinate.SpringBootDemo2.model.Alien;
import com.coordinate.SpringBootDemo2.model.Laptop;
import com.coordinate.SpringBootDemo2.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootDemo2Application.class, args);
		//normally we need to create an object to use method
//		Alien obj =new Alien();
//		obj.code();

//		Alien obj =context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

//		Alien obj1=context.getBean(Alien.class);
//		obj1.code();

		LaptopService service=context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);
		service.addLaptop(laptop);

	}

}
