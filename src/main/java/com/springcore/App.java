package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        /*Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);*/

        Student student = (Student) context.getBean("student1");
        System.out.println(student);

        Student student1 = (Student) context.getBean("student2");
        System.out.println(student1);
    }
}
