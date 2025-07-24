package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Student s1=new Student();
//        s1.setsName("Cat Nita");
//        s1.setRollNo(66);
//        s1.setsAge(33);

//        Laptop l1=new Laptop();
//        l1.setBrand("ASUS");
//        l1.setModel("strix");
//        l1.setRam(32);
//        l1.setLid(5);

//        Laptop l2=new Laptop();
//        l2.setBrand("ASUS2");
//        l2.setModel("rog2");
//        l2.setRam(15);
//        l2.setLid(2);
//
//        Laptop l3=new Laptop();
//        l3.setBrand("ASUS3");
//        l3.setModel("rog3");
//        l3.setRam(14);
//        l3.setLid(3);
//
//        Tabbble t1=new Tabbble();
//        t1.setTech("Java");
//        t1.setTid(101);
//        t1.setTname("first");
//
//        Tabbble t2=new Tabbble();
//        t2.setTech("Python");
//        t2.setTid(102);
//        t2.setTname("second");
//
////        Tabbble t3=new Tabbble();
////        t3.setTech("javascript");
////        t3.setTid(103);
////        t3.setTname("third");
//
//        t1.setLaptops(Arrays.asList(l1, l2));
//        t2.setLaptops(Arrays.asList(l3));
//        t3.setLaptops(Arrays.asList(l1));

//        l1.setTables(Arrays.asList(t1, t3));
//        l2.setTables(Arrays.asList(t1, t2));
//        l3.setTables(Arrays.asList(t2));


//        Configuration configuration=new Configuration();
//        configuration.addAnnotatedClass(org.example.Student.class);
//        configuration.configure();
        SessionFactory sessionFactory = new Configuration()
                // .addAnnotatedClass(org.example.Tabbble.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure().buildSessionFactory(); // configure.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //HQL
        //sql-select * from table_name where var_name/column_name=x;
        //hql-from class_name where var_name/column_name=x

        String brand="ASUS";
        Query query=session.createQuery("select brand, model from Laptop where brand=?1 ");
        query.setParameter(1, brand);
        List<Object[]> laptops= query.getResultList();

        for(Object[] data: laptops){
                System.out.println((String) data[0]+(String) data[1]);
        }

        //transaction is only required when you are doing manipulation
//        Transaction transaction=session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();

        //to get info from database
//        s2=session.get(Student.class, 33);

        //update info in database
//        Transaction transaction=session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();

        //delete
//        Student s2=session.get(Student.class, 66);
//        Transaction transaction=session.beginTransaction();
//        session.remove(s2);
//        transaction.commit();

//        Transaction transaction=session.beginTransaction();
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//
//        session.persist(t1);
//        session.persist(t2);
//        session.persist(t3);


//        transaction.commit();
//        Laptop l1=session.get(Laptop.class, 3);

        System.out.println(laptops);
        session.close();

//        Session session1=sessionFactory.openSession();
//        Tabbble t5=session1.get(Tabbble.class, 101);
////        System.out.println(t5);
//        session1.close();

        sessionFactory.close();

    }
}