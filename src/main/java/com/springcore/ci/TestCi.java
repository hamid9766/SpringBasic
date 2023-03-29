package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ci.xml");
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);
    }
}
