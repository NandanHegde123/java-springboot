package org.coordinate.config;

import org.coordinate.Alien;
import org.coordinate.Computer;
import org.coordinate.Desktop;
import org.coordinate.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

//replace  xml config
@Configuration
//annotation config
@ComponentScan("org.coordinate")
//
public class AppConfig {
//
//    @Bean(name = {"computer2", "desktop1"})
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean(name = "alien1")
//    public Alien alien(@Qualifier("desktop1") Computer computer) {
//
//        Alien alien = new Alien();
//        alien.setAge(21);
////        alien.setComputer(new Desktop());
////        alien.setComputer(desktop());
//        alien.setComputer(computer);
//        return alien;
//    }
//
//    @Bean(name = "laptop")
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
}
